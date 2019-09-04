

var table = $('#approvedList').DataTable();
 
$(document).ready(function()

{
	
	
	approvedListTable();
	
});

function approvedListTable() {
	
	
table = $('#approvedList').DataTable({
		
		"sAjaxSource" : "get_all_approvedList_ajax",
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
				  {"mData": "date"},
			      { "mData": "raisedFor"},
			      { "mData": "siteCode"},
			      { "mData": "typeOfWork"},
			      { "mData": "amountRequested"},
			      { "mData": "purpose"},
			      { "mData": "approvedAmount"},
			      { "mData": "remark"},
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
