/**
 * @priyanka
 * Experience Details JS
 */
 $(document).ready(function() {
	// var responseContent;
	// $(".recipentname").html(responseContent.recipientFirstName);
	
	 alert("data");
 	$("#search").on('click',function(){ 
 		//alert("data");
	experienceDetails(); 
	todayDate();
	}); 
}); 
 function experienceDetails() 
 { 
	 
	var data={empCode:$("#empCode").val()} 
	      var employeeCode={addEmployeeDetails:data}
	alert(JSON.stringify(employeeCode));
	//alert(data); 
	$ 
 	.ajax({ 
		type : "POST", 
		url : "search_empCode_ajax", 
 		data : JSON.stringify(employeeCode),
 		contentType : 'application/json', 
 		success : function(response) { 
 			 var responseContent=response;
 			
 			var recipientFirstName= responseContent.employeePersonalDetails.firstName;
 			var recipientLastName= responseContent.employeePersonalDetails.lastName;
 			var recipientName=recipientFirstName.concat(" "+recipientLastName+"  ");
 			
 			alert(responseContent.companyDetails.companyName);
 			 $(".recipentname").html(" "+recipientName);
 			 $(".companyName").html(responseContent.companyDetails.companyName);
 			var presentVillage=responseContent.addressDetails.presentVillage;
 			var presentDistrict=responseContent.districtDetails.presentDistrict;
 			var pincode=responseContent.addressDetails.presentPincode;
 			var presentState=responseContent.stateDetails.presentState;
 			var address=presentVillage.concat(","+presentDistrict+","+pincode+","+presentState);
 			 $(".allAddress").html(address);
 			 $(".joiningdate").html(responseContent.addEmployeeDetails.joinDate);
 			 $(".employeecode").html(responseContent.addEmployeeDetails.empCode);
 		//	alert(address);
 			 
 		} 
 	
 	
 	});
 } 
 function todayDate() {
	  var d = new Date();
	  var n = d.toLocaleDateString();
//		 alert ("Date:"+n);
	 $(".date").html("Date:"+n);
	 alert(n);
	}