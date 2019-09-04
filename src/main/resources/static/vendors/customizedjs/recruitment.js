

$(document)
		.ready(
				function() {
					var i = 0;
					$('#add')
							.click(
									function() {
										i++;
										$('#field')
												.append(
														'<tr id="row'
																+ i
																+ '"><td><input type="text"   name="['
																+ i
																+ '][name]" id="name" placeholder="Name" class="form-control empName " /></td> <td><input type="text" id="email'
																+ i
																+ '" name="['
																+ i
																+ '][email]"   placeholder="Email" class="form-control " /></td><td> <button type="button" name="remove" id="'
																+ i
																+ '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></td></tr>');
									});
					/*
					 * $('.netEmp').each(function () { $(this).rules("add", {
					 * required: true }); });
					 */
					
					
					
					$(document).on('click', '.btn_remove', function() {
						var button_id = $(this).attr("id");
						$('#row' + button_id + '').remove();
					});

					$('#submit')
							.click(
									function(e) {

										e.preventDefault();
										if($('form.timesheetform').validate().form()) {
							                console.log("validates");
							            } else {
							                console.log("does not validate");
							            }	
										

											var date;

											var data = JSON.stringify($(
													'.timesheetform')
													.serializeJSON());

											console.log(data);
											

											$
													.ajax({
														type : 'POST',
														url : 'postformdata',
														contentType : 'application/json; charset=utf-8',
														dataType : 'json',
														// data:
														// JSON.stringify(timesheetform),
														data : data,
														success : function(
																response) {
															console
																	.log(response)
															$('#message')
																	.html(
																			response).fadeOut(3000);
															window.setTimeout(function(){location.reload()},5500)

															
														},
														error : function(response) {
															$('#message')
															.html(response).fadeOut(3000);
															window.setTimeout(function(){location.reload()},5500)
														}
													})

									});
					/*$('form.timesheetform').validate();*/
				});