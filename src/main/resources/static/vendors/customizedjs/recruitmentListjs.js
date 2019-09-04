/**
 * 
 */
/*var getUrl = window.location.origin;
;*/
var table = $('#userStatusTable').DataTable();

$(document).ready(function()

{
	
	userStatusTable();
	
});

function userStatusTable() {
	
	
	table = $('#userStatusTable').DataTable({
	"sAjaxSource" :"getuser_ajax",
		"sAjaxDataProp" : "",
		"order" : [ [ 0, "asc" ] ],
		"destroy" : true, 
		
		"columns": [
			   
			 {
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
			 
				},
				
			   {"mData": "userId"},
		       { "mData": "name"},
		       { "mData": "email"},
		      
		      
		      /*{ "mData": "leaveType"},
		      { "mData": "noOfDays"},
		      { "mData": "approvedBy"},*/
			
	],
			columnDefs: [
				{ "visible": false, "targets": 1 },
				
				{
		        	        targets: [5], render: function (a, b, data, d) {
		            
		            return "<button id='btnDelete'  class='btn btn-danger btn-xs dt-delete'>Delete</button>";
		        }},
		        {
		        	targets: [4], render: function (a, b, data, d) {
		        
		            
		            return "<a id='btnEdit' class='btn btn-primary btn-xs '>Edit</a>";
		        }
		    },
		    
		    
		    ],
			dom: 'Bfrtip',
			
			buttons: [
	             /*'excel', 'pdf',*/
				
	             {
	                 extend: 'excelHtml5',
	                 title: 'Recuirement Report',
	                 exportOptions: {
	                     columns: [ 2, 3 ]
	                   }
	             },
	             {
	                 extend: 'pdfHtml5',
	                 title: 'Recuirement Report',
	                 exportOptions: {
	                     columns: [ 2, 3 ]
	                   }
	             }
	             
	        ]
	
	
	});
	/*function infoModal() {
		$('#userStatusTable tbody ').on('click', 'tr', function() {

			debugger;
			var data = table.row(this).data();
			$('#divfrom').html(data.fromdate);
			$('#divto').html(data.todate);
			$('#leavedataModal').modal('show');

		});
	}
*/
	
	///Edit user

	$('#userStatusTable tbody ').on('click', '#btnEdit', function() {

		var data = table.row($(this).parents('tr')).data();
		// var data = table.row(this).data();
		var node = table.row($(this).parents('tr')).node();
		
		if ($(node).find('input').prop('checked')) {
			$('#user_id').val(data.userId);
			$('#nameedit').val(data.name);
			$('#emailedit').val(data.email);
			$('#userEditId').modal('show');
			/*
			$('#btnCancel').on('click',function()
			{
				
			data.canceledReason=$('#cancelReason').val();
			$.ajax({
				type : "POST",
				url : getUrl+"hr/employeeLeaveCancel_ajax",
				cache : false,
				 dataType : "json", 
				data : JSON.stringify(data),
				contentType : 'application/json',
				success : function(response) 
				{

					userStatusTable();			
				}
			});
			
					});			*/			
		}

	});
	
	
	
	//Delete User

	$('#userStatusTable tbody ').on('click', '#btnDelete', function() {
		

		var data = table.row($(this).parents('tr')).data();
		
		
		var node = table.row($(this).parents('tr')).node();
		if ($(node).find('input').prop('checked')) {
					
			$.ajax({
				type : "POST",
				url : "deleteUser",
				cache : false,
				
				data : JSON.stringify(data),
				contentType : 'application/json',
				success : function(response) 
				{
					
					userStatusTable();
					
					$("#message").html(response).fadeOut(4000);
					 window.setTimeout(function(){location.reload()},4000)
						
					
				},
				error : function(response) {
					$("#message").html(response).fadeOut(4000);
					 window.setTimeout(function(){location.reload()},4000)
						
				}

			});													
		}

	});
	
	
	//Update user

		$("#btnUpdate").click(function(){
		
			var data = {name: $('#nameedit').val(),email: $('#emailedit').val(),userId :$('#user_id').val()};
			//alert(data);
			$.ajax({
				type : "POST",
				url :"updateUser",
				cache : false,
				/* dataType : "json", */
				data : JSON.stringify(data),
				contentType : 'application/json',
				success : function(response) 
				{
					
					userStatusTable();	
					
					$("#message").html(response).fadeOut(3000);
					 window.setTimeout(function(){location.reload()},4000)
						
					
				},
				error : function(response) {
					$("#message").html(response).fadeOut(3000);
					 window.setTimeout(function(){location.reload()},4000)
						
				}

			});													
		

	});
	

}
