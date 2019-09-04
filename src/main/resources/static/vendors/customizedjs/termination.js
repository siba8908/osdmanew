
$(document).ready(function() {
	console.log(moment().format('MMM D, YYYY') );
	$("#todaydate").html( moment().format('MMM D, YYYY') );
	$("#search").on('click',function(){ 
		getTerminationDetails(); 
	}); 
}); 
 function getTerminationDetails() { 
	 var data={employeeId:$("#empCode").val()} ;
	 //alert(JSON.stringify(data));
	 $.ajax({ 
		 		type : "POST", 
		 		url : "termination", 
		 		data : JSON.stringify(data),
		 		contentType : 'application/json', 
		 		success : function(response) { 
		 			var responseContent=response;
		 			var firstName= responseContent.firstName;
		 			var lastName= responseContent.lastName;
		 			var recipientName=firstName.concat(" "+lastName+"  ");
		 			$(".recipientName").html(" "+recipientName);
		 			$(".companyname").html(responseContent.companyDetails.companyName);
		 			var presentVillage=responseContent.presentVillage;		 			
		 			var districtName=responseContent.districtName;
		 			var presentPin=responseContent.presentPin;
		 			var stateName=responseContent.stateName;
		 			var address=presentVillage.concat(","+districtName+","+stateName+","+presentPin);
		 			$(".allAddress").html(address); 			
 		} 
 	});
 } 
function PreviewLetter() {

	var $inputs = $('#letterData :input');
	var values = {};
	$inputs.each(function() {
		values[this.name] = $(this).val();
    });
    $(".terminationDate").html(values.terminationDate);
    $(".reason").html(values.reason)
    $(".propertyReturnDate").html(values.propertyReturnDate);
    console.log(values);
}
