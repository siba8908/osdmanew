var i=1;
var options="";
$(document).ready(function() {
	$.ajax({
      url: "/fetch-site-code",
      error: function (e) {
      },
      success: function (data) {
    	  $.each(data, function (index) {
              options += '<option value="' + this.sitecodeId + '">' + this.siteCode + '</option>';
          });
    	  $(".siteCode").append(options);
      },
      dataType: "json",
      contentType: 'application/json; charset=utf-8',
      type: "GET",
      cache: false,
      crossDomain: true
  });
});
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
function sendSiteSurvey(){
	var siteSurveyList=[];
	var rowCount=0;
	$('#site-survey-table > tbody  > tr').each(function() {
		var siteSurvey={};
		var siteCode={};
		siteCode.sitecodeId=$("#siteCode"+rowCount+"").val();
		siteSurvey.siteCode=siteCode;
		siteSurvey.surveyDate=$("#surveyDate"+rowCount+"").val();
		var base64ImageContent = $('#image_preview'+rowCount+'').attr('src').replace(/^data:image\/(png|jpg|jpeg);base64,/, "");
	    if (base64ImageContent == "components/dummy-assets/common/img/noimage.png")
	        base64ImageContent = "";
		siteSurvey.surveyDoc=base64ImageContent
		siteSurvey.remark=$("#remark"+rowCount+"").val();
		siteSurveyList.push(siteSurvey);
		rowCount++;
	});
	$.ajax({
        url: "save-site-survey",
        data: JSON.stringify(siteSurveyList),
        error: function (e) {
        },
        success: function (data) {
        	window.location.reload();
        },
        dataType: "json",
        contentType: 'application/json; charset=utf-8',
        type: "POST",
        cache: false,
        crossDomain: true
    });
}
$(".btnAdd").click(function(){
	
	var element="<tr>"
				+"<td> <select class='form-control form-control-rounded siteCode' id='siteCode"+i+"'><option value=''>Select</option></select></td>"
				+"<td><div class='form-group'>"
				+"<input type='text' class='form-control surveyDate' placeholder='Select Date' id='surveyDate"+i+"' data-toggle='datetimepicker' data-target='#surveyDate"+i+"'/>"
				+"</div></td><td><div class='mb-5'><div class='form-group'>"
				+"<input type='file' name='img[]' class='file' id='fileImage"+i+"' onchange='imageLoad(this,"+i+")'>"
				+"<img class='image_preview' id='image_preview"+i+"' height='40px' src='components/dummy-assets/common/img/noimage.png'>"
				+"<div class='input-group col-xs-12'>"
				+"<span class='input-group-addon'><i class='glyphicon glyphicon-picture'></i></span>"
				+"</div></div></td>"
				+"<td> <input  class='form-control form-control-rounded' id='remark"+i+"' type='text' placeholder='' style='margin-left:5px' /></td>"
				+"<td><button class='fa fa-minus btnMinus' style='height:30px'></button></td>"
				+"</tr>";
	
	$(".body-site-survey-table").append(element);
    $("#siteCode"+i+"").append(options);
	i++;
	$(".btnMinus").click(function(){
		$(this).parent().parent().remove();
		i--;
	});
	$('.surveyDate').datetimepicker({
		format : 'YYYY-DD-MM'
	})
});
