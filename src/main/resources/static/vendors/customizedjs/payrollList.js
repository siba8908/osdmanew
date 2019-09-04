

var table = $('#payrollStatusTable').DataTable();
 
$(document).ready(function()

{
	payrollStatusTable();
	
});

function payrollStatusTable() {
	
	
table = $('#payrollStatusTable').DataTable({
		
		"sAjaxSource" : "getpayroll_list_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			
			"columns": [
				   
				/* {
						targets : 0,
						data : 'Checked',
						searchable : false,
						orderable : false,
						width : '1%',
						className : 'dt-center',
						render : function(data, type, full, meta) {
							if (data) {
								return '<input type="checkbox" checked>';
							} else {
								return '<input type="checkbox">';
							}
						}
					},*/
				  {"mData": "employeeCode"},
			      { "mData": "fullName"},
			      { "mData": "departmentName"},
			      {"mData":"salary"},
			      {"mData":"workOnHolidays"},
			      {"mData":"bonus"},
			      {"mData":"pf"},
			      {"mData":"esi"},
			      {"mData":"loan"},
			      /*{"mData":"calcuSalary"},*/
			      {"mData":"tds"},
			      {"mData":"caluSalary"},
			    
			      /*{ "mData": "leaveType"},
			      { "mData": "noOfDays"},
			      { "mData": "approvedBy"},*/
				
		],
				
				dom: 'Bfrtip',
				
				buttons: [
		             'excel', 'pdf','print'
		             
		        ]
		
		
			    
		});
	

	
	///Edit user

	
	
	
	
	//Delete User

	
	/////Update user

	
	

}
