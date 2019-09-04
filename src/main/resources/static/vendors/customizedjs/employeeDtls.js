$(document).ready(
		function() {
			$('#btnSave').click(function(e) {
				//alert("BTN CLICK");
				postEmployee();

			});

			function postEmployee() 
			{

				var data = JSON.stringify($('.empform').serializeJSON());
				//console.log(data);
				console.log(data);
                
				$.ajax({
					url : 'singleEmployee',
					method : 'POST',
					cache : false,
					data : data,
					dataType : "json",
					contentType : "application/json; charset=utf-8",
					success : function() {
						console.log(response);
						

						$('#state').html(' ');

						select = $("#state"), options = '';

						for (var i = 0; i < response.length; i++) {

							options += "<option value='" + response[i].state
									+ "'>" + response[i].dist + "</option>";

						}

					},
					error : function(error) {
						alert(error);
					},
				})
			}
		});

