var rowNumber=1;
var siteCodeOptions="";
var workStageOptions="";
$(document).ready(function() {
	fetchSiteCode();
	fetchWorkStages();
});


function fetchSiteCode() {
	$.ajax({
	      url: "/fetch-site-code",
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



function fetchWorkStages() {
	$.ajax({
	      url: "/fetch-work-stage",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  workStageOptions += '<option value="' + this.stageId + '">' + this.stageName + '</option>';
	          });
	    	  $(".workStage").append(workStageOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
}


function addRow() {
	var	element = "<tr><td><select class='form-control form-control-rounded siteCode' style='margin-left: 5px' required id='siteCode"+rowNumber+"'><option value=''>Select site code</option></select></td>"
		+ "<td><select class='form-control form-control-rounded workStage' style='margin-left: 5px' required id='workStage"+rowNumber+"'><option value=''>Select stage</option></select></td>"
		+ "<td><input class='form-control form-control-rounded' type='text' placeholder='Enter amount' id='amount"+rowNumber+"' style='margin-left: 5px' /></td>"
		+ "<td><input class='form-control form-control-rounded' type='text' placeholder='Enter purpose' id='purpose"+rowNumber+"' style='margin-left: 5px' /></td>"
		+ "<td><input class='form-control form-control-rounded' type='text' placeholder='Enter remark here' id='remark"+rowNumber+"' style='margin-left: 5px' /></td>"
		+ "<td></td><td><button class='fa fa-minus btnMinus' style='height:30px'></button></td></tr>";
	
	$('#fund_request_table').append(element);
	$("#siteCode"+rowNumber+"").append(siteCodeOptions);
	$("#workStage"+rowNumber+"").append(workStageOptions);
	
	rowNumber++;
	
	$(".btnMinus").click(function(){
		$(this).parent().parent().remove();
		rowNumber--;
	});
	
}


function sendFundRequest() {
	
	var fundRequestList = [];
	var rowCount=0;
	$('#fund_request_table > tbody  > tr').each(function() {
		var fundRequest = {};
		var siteCode={};
		var workStage = {};
		siteCode.sitecodeId=$("#siteCode"+rowCount+"").val();
		workStage.stageId = $("#workStage"+rowCount+"").val();
		
		fundRequest.sitecode = siteCode;
		fundRequest.masterWorkStage = workStage;
		fundRequest.amount = $("#amount"+rowCount+"").val();
		fundRequest.purpose = $("#purpose"+rowCount+"").val();
		fundRequest.remark = $("#remark"+rowCount+"").val();
		
		fundRequestList.push(fundRequest);
		rowCount++;
	})
	
	console.log(fundRequestList);
	
	$.ajax({
		url : "save-pm-fund-requests",
		data : JSON.stringify(fundRequestList),
		error : function(e) {
			console.log(e)
			swal({
				position : 'top',
				type : 'error',
				title : '',
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
				text : 'Request submitted successfully.',
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