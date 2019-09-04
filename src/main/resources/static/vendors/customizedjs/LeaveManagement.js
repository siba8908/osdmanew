/*var table = $('#dataTableLeave').DataTable();*/
$(document).ready(function () {
	//alert("hgj");
	LeaveList();
	
	$("#btnEnterEmpCode").on("click", function() {
  		//alert("bibhu");
		event.preventDefault();
		getAllDetails();
	});
  	function getAllDetails() { 
  		
  	      
  		var data={FromDate : $('#datepicker-only-init').val(),
  				  ToDate : $('#datepicker-only-init1').val()}
  	
		$.ajax({
					type : "GET",
					url : "get_leave_details_ajax",
					data : JSON.stringify(data),
					dataType : "json",
					contentType : 'application/json',
					success : function(response) {
						console.log(response);
						
				  		$("#emp_code").val(
								response.empName);
						
						$("#leave_type").val(
								response.employeeCode);
						
						/*alert("FromDate:"
								+ response.FromDate);*/
					},
					error : function(xhr, status, error) {
						//debugger;
						/*alert(xhr);*/
					}
			});
	 }
	

				   var i = 0;
					$('#add')
							.click(
									function() {
										debugger;
										// alert("enter");
										i++;
										$('#field')
												.append(
														'<tr id="row'
																+ i
																+ '"><td><input type="number"   name="['
																+ i
																+ '][employeeCode]" id="empCode"  class="form-control" /></td> <td><input type="date" id="datepicker-only-init2" '
																+ i
																+ '" name="['
																+ i
																+ '][fromDate]"   class="form-control " /></td> <td><input type="date" id="datepicker-only-init3" '
																+ i
																+ '" name="['
																+ i
																+ '][toDate]"   class="form-control " /></td> <td><select id="Leaveetype" '
																+ i
																+ '" name="['
																+ i
																+ '][leaveType]"  class="form-control "><option value="1">SL</option><option value="3">CL</option> <option value="2">PL</option> <option value="4">EL</option>/></td>  <td> <button type="button" name="remove" id="'
																+ i
																+ '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></td></tr>');
									}); 
    $(document).on('click', '.btn_remove', function() {
		var button_id = $(this).attr("id");
		$('#row' + button_id + '').remove();
	});
	
	$('#btnSave').click(function (e) {
		e.preventDefault();
		employeeLeaveSave();
		
	});    	

function employeeLeaveSave() {
	
	
    /*	alert("enter");*/
    	
    	
    var	data=JSON.stringify($('#leaveform').serializeJSON());
    console.log(data);
  //   console.log(data);
        //var employeeJSON = JSON.stringify(Employee);
        $.ajax({
            url: 'LeaveManagement_ajax',
            method: 'POST',
            cache:false,
            data :data,
                   	/*{
            	holiday_date : $("#datepicker-only-init").val(),
        	    holiday_day : $("#holidayDay").val(),
        	    holiday_events : $("#holidayEvent").val(),
            }*/
            dataType:"json",
            contentType: "application/json; charset=utf-8",
            success: function () {
                alert('Saved successfully!');
                LeaveManagement();
            },
                                                                                                                                                                                                                                                                                                                                                                                                                                   
            error: function (error) {
                alert(error);
            }
        });
        
    }

function LeaveList() {
	//alert("in");
	
	var table = $('#dataTableLeave').DataTable({
	"sAjaxSource" : "get_leave_details_ajax",
		"sAjaxDataProp" : "",
		"order" : [ [ 0, "asc" ] ],
		"destroy" : true, 
		
		"columns": [
			/*   
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
				},*/
			  {"mData": "employeeCode"},
		      { "mData": "leaveType"},
		    
		      
		      
		      /*{ "mData": "leaveType"},
		      { "mData": "noOfDays"},
		      { "mData": "approvedBy"},*/
			
	],
			/*columnDefs: [
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
		    
		    
		    ],*/
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

}
}); 
