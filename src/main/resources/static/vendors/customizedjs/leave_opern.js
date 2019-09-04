$(document)
		.ready(
				function()

				{

					var data;
					alert();
					// $('#cancelText').hide();
					$('#leaveapprovalTable tbody').on('click','#approve',function() {
							
								if ($(this).closest('tr').find("input").is(":checked")) {
										
									data = {"leaveId" : $(this).closest('tr').find('td:eq(1)').html()											
									}

									$('#leaveApprovalModal').modal('show');
								}
								//alert("jquery approve");
							});

					$('#leaveapprovalTable tbody').on('click','#cancel',function() {
	
						if ($(this).closest('tr').find("input").is(":checked")) {
										
									data = {"leaveId" : $(this).closest('tr').find('td:eq(1)').html()			
									}
									$.ajax({
										type : "GET",
										url : "/getApproverList",
										cache : false,
										 dataType : "json", 

										contentType : 'application/json',
										success : function(response) {
												
											$.each(response.leaveapproverlist,function(i,obj) {

																var div_data = "<option value="+ obj.empCode+ ">"+ obj.email+ "</option>";

																$(div_data).appendTo('#selectedApprover');																																																																				

															});
										}
									});
									
									$('#leaveCancelModal').modal('show');
								}
								//alert("jquery cancel");
							});
					/*$('#leaveapprovalTable tbody').on('click','#route',function() {
																													
										if ($(this).closest('tr').find("input").is(":checked")) {
												
											data = {"leaveId" : $(this).closest('tr').find('td:eq(1)').html()
											}

											
											//$('#leaveRouteModal').modal('show');

										}

									});*/

					$("#btnLeaveCancel").click(function()

					{
						data.canceledReason = $('#cancelReason').val();

						$.ajax({
							type : "POST",
							url : "/employeeLeaveCancel_ajax",
							cache : false,
							/* dataType : "json", */
							data : JSON.stringify(data),
							contentType : 'application/json',
							success : function(response) {
								console.log(response);
								prepareTable(response);
								
							}
						});
						$("#btnLeaveCancel").attr("disabled", true);
					});

					$("#btnApprove").click(function()
					{
						data.status = $('#approveReason').val();

						$.ajax({
							type : "POST",
							url : "/employeeLeaveApprove_ajax",
							cache : false,
							/* dataType : "json", */
							data : JSON.stringify(data),

							contentType : 'application/json',
							success : function(response) {
								console.log(response);
								prepareTable(response);
								
							}
						});
						$("#btnApprove").attr("disabled", true);

					});

/*					$("#btnRoute").click(
							function()

							{
								data.empCodeapprover = $('#selectedApprover')
										.find(":selected").val();

								$.ajax({
									type : "POST",
									url : "/employeeLeaveRoute_ajax",
									cache : false,
									 dataType : "json", 
									data : JSON.stringify(data),
									contentType : 'application/json',
									success : function(response) {

										console.log(response);
										prepareTable(response);
									}
								});

							});*/

					function prepareTable(response) {

						// Function for populating table with Ajax JSON response
						$("#leaveapprovalTable tbody").empty();
						$
								.each(response,function(idx, elem) {
								
									var newRowContent = "<tr><td><input type='checkbox'></td><td>"
													+ elem.leaveId
													+ "</td><td>"
													+ elem.isApproved
													+ "</td><td>"
													+ elem.isCanceled
													+ "</td><td>"
													+ elem.canceledReason
													+ "</td><td>"
													+ elem.leavetype
													+"</td><td>"
													//+ elem.status
													//+ "</td><td>"
													+ "<button class='btn btn-success' id='approve'>Approve</button>"
													+ "</td><td>"
													+ "<button class='btn btn-danger' id='cancel'>Cancel</button>"
													+ "</td>"
													/* + "<td>"
													+ "<button class='btn btn-info' id='route'>Route</button>"
													+ "</td>" */
													+
														"</tr>";

											$("#leaveapprovalTable tbody")
													.append(newRowContent);
											 //$("#leaveapprovalTable
											 //tbody").append(newRowContent);

										});
					}

				});