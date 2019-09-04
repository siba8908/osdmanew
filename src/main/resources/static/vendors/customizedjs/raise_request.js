

var table = $('#raiseRequestTable').DataTable();
 
$(document).ready(function()

{
	
	
	raiseRequestTable();
	
});

function raiseRequestTable() {
	
	
table = $('#raiseRequestTable').DataTable({
		
		"sAjaxSource" : "get_all_request_ajax",
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
				  {"mData": "providerId"},
			      { "mData": "billNo"},
			      { "mData": "billDate"},
			      { "mData": "siteCode"},
			      { "mData": "billAmount"},
				
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
