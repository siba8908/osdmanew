var rowNumber=1;
var siteCodeOptions="";
var letterTypeOptions="";
$(document).ready(function() {
	getSiteCode();
	getLetterType();
});



function getSiteCode() {
	$.ajax({
	      url: "/OSDMA/fetch-site-code",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  siteCodeOptions += '<option value="' + this.sitecodeId + '">' + this.siteCode + '</option>';
	          });
	    	  $(".siteCode").append(siteCodeOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}


function getLetterType() {
	$.ajax({
	      url: "fetch-letter-type-master",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  console.log(data);
	    	  $.each(data, function (index) {
	    		  letterTypeOptions += '<option value="' + this.letterTypeId + '">' + this.letterType + '</option>';
	          });
	    	  $(".letterType").append(letterTypeOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}

function imageLoad(current,index){
    if (current.files && current.files[0]) {
        if (current.files[0].size > 1024000) {
            alert("File Size limit exeeds!!");
            return;
        }
        var reader = new FileReader();
        var parent = current.parentNode.parentNode.parentNode;
        reader.onload = function (e) {
            $('#image_preview'+index+'', parent).attr('src', e.target.result);
        }

        reader.readAsDataURL(current.files[0]);
    }
}


function addRow() {
	var	element = "<tr><td><select class='form-control form-control-rounded siteCode' style='margin-left: 5px' required id='siteCode"+rowNumber+"'><option value=''>Select site code</option></select></td>"
		+ "<td><select class='form-control form-control-rounded letterType' style='margin-left: 5px' required id='letterType"+rowNumber+"'><option value=''>Select letter type</option></select></td>"
		
		+ "<td><div class='form-group'> <input type='text' class='form-control submitDate' placeholder='Select Date' id='submitDate"+rowNumber+"' "
		+ "data-toggle='datetimepicker' data-target='#submitDate"+rowNumber+"' required/> </div></td>"
	
		+"<td><div class='mb-5'><div class='form-group'>"
		+"<input type='file' name='img[]' class='file' id='fileImage"+rowNumber+"' onchange='imageLoad(this,"+rowNumber+")'>"
		+"<img class='image_preview' id='image_preview"+rowNumber+"' height='40px' src='components/dummy-assets/common/img/noimage.png'>"
		+"<div class='input-group col-xs-12'>"
		+"<span class='input-group-addon'><i class='glyphicon glyphicon-picture'></i></span>"
		
		+ "</div></div></div></td><td><button class='fa fa-minus btnMinus' style='height:30px'></button></td></tr>";
	
	
	$('#letter_clearance_table').append(element);
	$("#siteCode"+rowNumber+"").append(siteCodeOptions);
	$("#letterType"+rowNumber+"").append(letterTypeOptions);
	
	rowNumber++;
	
	$(".btnMinus").click(function(){
		$(this).parent().parent().remove();
		rowNumber--;
	});
	
	$('.submitDate').datetimepicker({
		format : 'YYYY-DD-MM'
	})
}


function submitLetterClearance() {
	
	var letterClearanceList = [];
	var rowCount=0;
	$('#letter_clearance_table > tbody  > tr').each(function() {
		var letterClearance = {};
		var siteCode={};
		var letterType = {};
		siteCode.sitecodeId=$("#siteCode"+rowCount+"").val();
		letterType.letterTypeId = $("#letterType"+rowCount+"").val();
		
		letterClearance.siteCode = siteCode;
		letterClearance.letterType = letterType;
		letterClearance.submissionDate = $("#submitDate"+rowCount+"").val();
		var base64ImageContent = $('#image_preview'+rowCount+'').attr('src').replace(/^data:image\/(png|jpg|jpeg);base64,/, "");
	    if (base64ImageContent == "components/dummy-assets/common/img/noimage.png")
	        base64ImageContent = "";
		letterClearance.letterDoc = base64ImageContent
		letterClearanceList.push(letterClearance);
		rowCount++;
	})
	
	console.log(letterClearanceList);
	
	$.ajax({
		url : "save-letter-clearance",
		data : JSON.stringify(letterClearanceList),
		error : function(e) {
			console.log(e)
			swal({
				position : 'top',
				title: '',
				type : 'error',
				text : 'Error in submit.',
				showConfirmButton : false,
				timer : 2500
			})
		},
		success : function(data) {
			console.log(data);
			swal({
				position : 'top',
				type : 'success',
				title : '',
				text : 'Submitted successfully.',
				showConfirmButton : false,
				timer : 2500
			})
			window.setTimeout(function(){
				window.location.reload();
		    }, 2500);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}