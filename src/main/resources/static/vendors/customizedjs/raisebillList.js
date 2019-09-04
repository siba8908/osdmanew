

var table = $('#riseillStatusTable').DataTable();
 
$(document).ready(function()

{
	//alert("hapu");
	
	riseillStatusTable();
	
});

function riseillStatusTable() {
	
	
table = $('#riseillStatusTable').DataTable({
		
		"sAjaxSource" : "getrisebill_list_ajax",
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
				  {"mData": "siteName"},
			      { "mData": "siteDate"},
			      { "mData": "amount"},
				
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
