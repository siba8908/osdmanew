/*function payrollValidation() {
	  var work = document.getElementById("wh").value;
	  var bons = document.getElementById("bon").value;
	  var pfd = document.getElementById("pf").value;
	  var esid = document.getElementById("esi").value;
	  var loa = document.getElementById("loan").value;
	  var td = document.getElementById("tds").value;
	  var bons = document.getElementById("bon").value;

	  
	  if (work.trim() == "") {		             
				
			alert("please fillup the field");
			return false;
		}

} 
*/
//var baseUrl=document.

$(document).ready(function() {
	 
	 $("#btnsubmit").on("click",function(){
     alert("kkk");
				 savePayroll();
			 });
	
	
	 
	/* $("#btnsubmit").on("click",function(){
		 
		
		 savePayroll();
		 });	*/
	
	 function savePayroll() {
		

		 var employee= [];
		 //var values = {};
		 //var rows=$('#payroll tbody tr').length;
		 $("#payroll tbody tr").each(function() {
			 var values = {};
			 $(this).find("input").each(function(){
				   values[$(this).attr('name')] = $(this).val();
				 });
			 employee.push(values);
	            });
		   console.log(employee);
	 
		/*rows.each(function(){
			 
			 console.log(values);
			 employee.push(values);
		});
		*/
		
		
		
			/*var rows=$('#payroll tbody tr').length;
			alert(rows);
			for(i=0;i<=rows;i++)
				{
				var $inputs=$(this).find("input");
				console.log($inputs);
				$inputs.each(function() {
					var values={};
					values["workOnHalidays"]=$(this).val();
					values["bonus"]=$(this).val();
					values["pf"]=$(this).val();
					values["esi"]=$(this).val();
					values["loan"]=$(this).val();
					values["tds"]=$(this).val();
					console.log(values);
					
					
					});
				employee.push(values);
				}*/
			
			
		
			
			
			/*console.log(JSON.stringify(employee));*/
			$.ajax({
				type : "POST",
				url : "save_payroll_ajax",
				cache : false,
				dataType : "json",
				data : JSON.stringify(employee),
				contentType : 'application/json',
				success : function(response) {
					
					$("#statusmsgs").html('<b>'+ "Payroll inserted successfully");
					
					
					
					
					
					
					
					
					
					("#statusmsgs").fadeOut(3000);
					
				},
				error : function(xhr, status, error) {
					alert(xhr);
				}

			});
	 }
});
			

	
 