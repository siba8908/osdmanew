/**
 * 
 */
var table = $('#attendanceTable').DataTable();
 
$(document).ready(function()

{
	$('#btnday').click(function(e) {
	attendanceStatusTable();
	});
	
	$('#btnmonth').click(function(e) {
		attendanceMonthStatusTable();
		});
	
});


function attendanceStatusTable() {
	
	
table = $('#attendanceTable').DataTable({
		
		"sAjaxSource" : "getattendance_list_ajax",
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
				 { "mData": "attendeeDate",
					 
					 "searchable" : false,
				 
				 },
			      {"mData": "employeeCode"},
			      { "mData": "status",
			    	  "searchable" : false,
			    	  
			      },
			     
			    
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



function attendanceMonthStatusTable() {
	
	
	table = $('#attendanceTable').DataTable({
			
			"sAjaxSource" : "getattendance_list_month_ajax",
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
					 
					 { "mData": "attendeeDate",
						 
						 "searchable" : false,
					 
					 },
				      {"mData": "employeeCode"},
				      { "mData": "status",
				    	  "searchable" : false,
				    	  
				      },
				    
				      /*{ "mData": "leaveType"},
				      { "mData": "noOfDays"},
				      { "mData": "approvedBy"},*/
					
			],
			
			
			      
					dom: 'Bfrtip',
					 
					buttons: [
			             'excel', 'pdf',
			             {
			            	  paging: false,
			            	  'margin-top': '50px 0',
			             extend: 'print',
			             text: '<i class="fa fa-print"></i> Print',
			             title: $('h1').text(),
			             exportOptions: {
			               columns: ':not(.no-print)'
			             },
			             }
			            /* {
			            	 extend: 'print',
			                 customize: function ( win ) {
			                     $(win.document.body)
			                         .css( 'font-size', '10pt', 'margin': '20px 0' )
			                         .prepend(
			                             '<img src="http://datatables.net/media/images/logo-fade.png" style="position:absolute; top:0; left:0;" />'
			                         );
			  
			                     $(win.document.body).find( 'table' )
			                         .addClass( 'compact' )
			                         .css( 'font-size', 'inherit' );
			                 }
			             },
*/
			             
			        ]
			
			
				    
			});
		

		
		///Edit user

		
		
		
		
		//Delete User

		
		/////Update user

		
		

	}