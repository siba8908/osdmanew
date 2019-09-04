var table = $('#dataTableemp').DataTable();
var	cbChecked;
$(document).ready(function () {
	$('#btnSave').click(function (e) {
		
		postAtten();
	});
});

function postAtten() {
	
	
cbChecked=JSON.stringify($('#attendance').serializeJSON());


 var a=JSON.parse(cbChecked);

 
	var atten=[];
	
	
	$.each($("#emptable  tbody  input[type='checkbox']:checked"),function(){
		 
		var cal={};
		cal["employeeCode"]=$(this).val();
		
		cal["attendeeDate"]=a["attendeeDate"];
	
		cal["attendeeDay"]=a["attendeeDay"];
	
		cal["status"]=a["status"];
		atten.push(cal);
		console.log(atten);
	});
	

    
    $.ajax({
        url: 'postattendance',
        method: 'POST',
        cache:false,
        data :JSON.stringify(atten),
        dataType:"json",
        contentType: "application/json; charset=utf-8",
        success: function () {
            
        },
        error: function (error) {
            alert(error);
        }
    })
        
}


