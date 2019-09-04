$(document).ready(function (){
$('#btnSave').click(function (e) {
		//alert("BTN CLICK");
		postEmployee();
	
	});
});

function postEmployee() {
	alert("employeee");
	

	//var emp=[];
	var empDetails={};
	empDetails["firstName"]= $("#FName").val();
	empDetails["lastName"]= $("#LName").val();
	empDetails["fatherName"]= $("#FatherName").val();
	empDetails["dob"]= $("#dob").val();
	empDetails["gender"]= $("#gender").val();
	empDetails["email"]= $("#mail").val();
	empDetails["contactNo"]= $("#contactNo").val();
	empDetails["religion"]= $("#religion").val();
	empDetails["adharNo"]= $("#adharNo").val();
	empDetails["maritalStatus"]= $("#MaritalStatus").val();
	empDetails["insurancePolicyNo"]= $("#InsurancePolicy").val();
	
	//employee emergengy
	empDetails["insurancePolicyNo"]= $("#InsurancePolicy").val();
	
	alert(empDetails);
	alert("eeeee"+JSON.stringify(empDetails));
	 $.ajax({
	        url: '/singleEmployee',
	        method: 'POST',
	        cache:false,
	        data :JSON.stringify(empDetails),
	        dataType:"json",
	        contentType: "application/json; charset=utf-8",
	        success: function () {
	            
	        },
	        error: function (error) {
	            alert(error);
	        },
	    })
}
