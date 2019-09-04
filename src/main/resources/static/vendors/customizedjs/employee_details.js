

var table = $('#employeeDetailsTable').DataTable();
 
$(document).ready(function()

{
	employeeDetailsTable();
	
});

function employeeDetailsTable() {

	
table = $('#employeeDetailsTable').DataTable({
		
		"sAjaxSource" : "getemployee_list_ajax",
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
			      {"mData":"designation"},
			      {"mData":"joiningDate"},
			      {"mData":"salary"},
			      {"mData":"contactNo"},
			      {"mData":"email"},
			      /*{"mData":"loan"},
			      {"mData":"calcuSalary"},
			      {"mData":"tds"},
			      {"mData":"caluSalary"},*/
			    
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
