
/***********Save consinment details**********************/


function saveConsinment() {
	//alert("jjjj");
	 var $inputs = $('#consinmentadd :input');
	 var values = {};
	    $inputs.each(function() {
	        values[this.name] = $(this).val();
	    });
				$.ajax({
					type : "POST",
					url : "saveconsinment",
					cache : false,
					dataType : "json",
					data : JSON.stringify(values),
					contentType : 'application/json',
					success: function(response){
			                console.log(response)
			                $('#success').text(response.message);
			            },
			            error: function(data){
			                console.log(data.responseJSON.message);
			            }
					
				});

			}//end

