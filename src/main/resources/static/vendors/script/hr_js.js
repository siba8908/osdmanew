 $(document).ready(function() {
					var i = 0;
                $('#add').click(function() {
								i++;
								$('#field').append('<tr id="row' + i + '"><td><input type="text"   name="[' + i + '][name]" id="name" placeholder="Name" class="form-control netEmp " /></td> <td><input type="text" id="email'+ i +'" name="[' + i + '][email]"   placeholder="Email" class="form-control " /></td><td> <button type="button" name="remove" id="' + i + '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></td></tr>');
											}); 
                /*$('.netEmp').each(function () {
                    $(this).rules("add", {
                        required: true
                    });			
                });		*/					
							$(document).on('click', '.btn_remove', function() {
								var button_id = $(this).attr("id");
								$('#row' + button_id + '').remove();
							});
							
							$('#submit')
							.click(function(e) {
										alert("bibhuuuuu");
										e.preventDefault();
										 var checkstatus= validation();
										alert(checkstatus); 
										if(validation()== true){ 
										//alert("hhhh");
										/* var date=  $('#datepickerrange').val(); */
										var date;
								
										//console.log($('#timesheetform').serialize().split('&')); //alerts all values           

										
									var	data=JSON.stringify($('#timesheetform').serializeJSON());
										
									console.log(data);
										/* date=$('#timesheetform').serializeJSON(); */
$.ajax({
            type: 'POST',
            url: '/postformdata',
            contentType : 'application/json; charset=utf-8',
            dataType: 'json',
           // data: JSON.stringify(timesheetform),
            data:data,
            success: function(response){
                console.log(response)
                $('#success').text(response.message);
            },
            error: function(data){
                console.log(data.responseJSON.message);
            }
        })
										
										 } 			 								/* $.ajax({
													url : "/postformdata",
													method : "POST",
													data : $('#timesheetform').serializeJSON(),
													contentType : "application/json",
													success : function(data) {
														//alert("ssss");
														$('#timesheetform')[0]
																.reset();
													}
												}); */
									});
					});