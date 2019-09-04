var table = $('#userStatusTable').DataTable();
 alert("osdma");
$(document).ready(function()

{
	
	userStatusTable();
	/*$("#applyLeaveBtn").click(function()

	{
		applyLeave();
	});*/
});

/*function applyLeave() {
	 alert("bibhu");
	reqdata = {
		"fromDate" : $('#datepickerfrom').val(),
		"toDate" : $('#datepickerto').val(),
		"type" : $('#leaveTypeId').val(),
		"empCodeapprover" : $('#selectedApprover').val(),
		"leaveReason" : $('#leaveReason').val(),
		
	};

	$.ajax({
		type : "POST",
		url : "employeeLeaveApply_ajax",
		cache : false,
		dataType : "json",
		data : JSON.stringify(reqdata),
		contentType : 'application/json',
		success : function(response) {

			//alert("response===" response)
			leaveStatusTable();
			$("#msg").html("<b>Application 	Submitted Sucessfully");
			$("#msg").fadeOut(8000);
		},
	 error: function(xhr, textStatus, error) { 
		 alert(xhr.responseText);		 
	 console.log(xhr.statusText);
	 console.log(textStatus); 
	 console.log(error); 
	 }

	});

}*/
function userStatusTable() {
	alert("bbbbbbbbbb");
	
	table = $('#userStatusTable').DataTable({
	"sAjaxSource" : "getuser_ajax",
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
			  {"mData": "user_id"},
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
	             'excel', 'pdf'
	             
	        ]
	
	
		    /*buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            },
	            {
	                extend: 'pdfHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            }
	        ],
	    dom: 'Bfrtip',
	    buttons: [
            {
                extend: 'excelHtml5',
                title: 'Leave Report',
                exportOptions: {
                	columns: ':not(:last-child)',
                	}
            },
            {
                extend: 'pdfHtml5',
                title: 'Leave Report',
                exportOptions: {
                	columns: ':not(:last-child)',
                	}
            }
        ]
*/	});
	function infoModal() {
		$('#userStatusTable tbody ').on('click', 'tr', function() {

			debugger;
			var data = table.row(this).data();
			$('#divfrom').html(data.fromdate);
			$('#divto').html(data.todate);
			$('#leavedataModal').modal('show');

		});
	}

	
	///Edit user

	$('#userStatusTable tbody ').on('click', '#btnEdit', function() {

		var data = table.row($(this).parents('tr')).data();
		// var data = table.row(this).data();
		var node = table.row($(this).parents('tr')).node();
		alert(data.name);
		alert(data.user_id);
		if ($(node).find('input').prop('checked')) {
			$('#user_id').val(data.user_id);
			$('#nameedit').val(data.name);
			$('#emailedit').val(data.email);
			$('#userEditId').modal('show');
			
			$('#btnCancel').on('click',function()
			{
				
			data.canceledReason=$('#cancelReason').val();
			$.ajax({
				type : "POST",
				url : "/employeeLeaveCancel_ajax",
				cache : false,
				/* dataType : "json", */
				data : JSON.stringify(data),
				contentType : 'application/json',
				success : function(response) 
				{

					leaveStatusTable();				
				}
			});
			
					});						
		}

	});
	
	
	
	//Delete User

	$('#userStatusTable tbody ').on('click', '#btnDelete', function() {
		//alert("deleteclick");

		var data = table.row($(this).parents('tr')).data();
		
		// var data = table.row(this).data();
		var node = table.row($(this).parents('tr')).node();
		if ($(node).find('input').prop('checked')) {
				//alert(data);		
			$.ajax({
				type : "POST",
				url : "/deleteUser",
				cache : false,
				/* dataType : "json", */
				data : JSON.stringify(data),
				contentType : 'application/json',
				success : function(response) 
				{
					//alert(response);
					userStatusTable();					
				}

			});													
		}

	});
	
	
	/////Update user

		$("#btnUpdate").click(function(){
		//alert("update");
		 
			var data = {name: $('#nameedit').val(),email: $('#emailedit').val(),user_id :$('#user_id').val()};
			alert(data);
			$.ajax({
				type : "POST",
				url : "/updateUser",
				cache : false,
				/* dataType : "json", */
				data : JSON.stringify(data),
				contentType : 'application/json',
				success : function(response) 
				{
					//alert(response);
					userStatusTable();					
				}

			});													
		

	});
	

}
