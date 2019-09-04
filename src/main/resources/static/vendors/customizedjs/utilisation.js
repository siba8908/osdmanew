$(document)
		.ready(
				function() {

					utilisationResources();
					var selectedStatus;

					var arr = [];
					$("select.Status").change(
							function() {

								selectedStatus = $(this).children(
										"option:selected").val();

							});
					$("#btnSave")
							.click(
									function() {

										var array = [];

										$
												.each(
														$("#datatable tbody input[type='checkbox']:checked"),
														function() {
															
															var obj = {};

															obj["utilID"] = $(
																	this).val();
															obj["status"] = selectedStatus;

															array.push(obj);

														});

										
										$.ajax({
											type : "POST",
											url : "assign_Status_ajax",
											cache : false,
											dataType : "json",
											data : JSON.stringify(array),
											contentType : 'application/json',
											success : function(response) {
												$("statusMessage").fadeOut(100).html(response).fadeIn(100);
												
												
												$("#message").html(response).fadeOut(3000);
												$('#message').css('color','green');
												 window.setTimeout(function(){location.reload()},4000)

											}
										});
										  $.each($("#datatable tbody input[type='checkbox']:checked"), function(){     
											  
								            	$(this).parent().parent().remove();

									});
					
			            });

				});

function utilisationResources() {

	$.ajax({
		type : "POST",
		url : "show_hrUtilisationResources_ajax",
		cache : false,

		contentType : 'application/json',
		success : function(response) {
			prepareTable(response);
		}
	});

}
function prepareTable(response) {

	// Function for populating table with Ajax JSON response
	$("#datatable tbody").empty();
	$.each(response, function(idx, elem) {

		var newRowContent = "<tr><td>" + elem.projectDetails.projectName
				+ "</td><td>" + elem.teamDetails.teamName + "</td><td>"
				+ elem.employeePersonalDetails.firstName + " "
				+ elem.employeePersonalDetails.lastName
				+ "</td><td><input type='checkbox' value=" + elem.utilID + ">"
				+ "</td></tr>"

		$("#datatable tbody").append(newRowContent);

	});

}
