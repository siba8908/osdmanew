/**
 * 
 */
$(document).ready( function () {
	$("#btnEnterEmpCode").on("click", function() {
		event.preventDefault();
		getAllDetails();
	});
  	
	function getAllDetails() {
  		var data={employeeId : $('#empId').val()};
  		console.log(data);
  		$.ajax({
					type : "POST",
					url : "hr-appraisal_ajax",
					data : JSON.stringify(data),
					dataType : "json",
					contentType : 'application/json',
					success : function(response) {
						console.log(response);

			 			$("#empName").text(response.empName);
						
						$("#empCode").text(response.employeeCode);
						
						$("#empDesg").text(response.designation);
						
						$("#empSec").text(response.departmentName);
						
						$("#empDOE").text(response.joiningDate);
						
						$("#empSalary").text(response.salary);
					},
					error : function(xhr, status, error) {
						alert(xhr);
					}
		});
	} 
	
});
function PreviewLetter() {
	
	var $inputs = $('#letterData :input');
	var values = {};

	$inputs.each(function() {
		values[this.name] = $(this).val();
    });
	
    $(".remarks").html(values.remarks);
    $(".reviewDateFrom").html(values.reviewDateFrom)
    $(".reviewDateTo").html(values.reviewDateTo);
    
    $(".enterName").html(values.enterName);
    $(".file").html(values.file);
        
    $(".present").html(values.present);
    $(".team").html(values.team)
    $(".job").html(values.job);
    $(".gc").html(values.gc);
    $(".work").html(values.work)
    $(".disc").html(values.disc);
    $(".init").html(values.init);
    
    $(".rate").html(values.rate);
    
    console.log(values);
    

    
    
    
    
}
