$(document).ready(function() {		
	$("#btnType").on("click", function() {
		saveType();
	});
	function saveType() {
		var tdata=[];
		$("#tableId tbody tr").each(function(){
			var values={};
			$(this).find("input").each(function(){
				values[$(this).attr('name')] = $(this).val();
			});
			tdata.push(values);
		});
		console.log(tdata);
		$.ajax({
				type : "POST",
				url : "training_details_ajax",
				data : JSON.stringify(tdata),
				dataType : "json",
				contentType : 'application/json',
				success : function(response) {
					console.log(response);
					$('#message').html(response).fadeOut(5000);
					window.setTimeout(function(){location.reload()},5500)
				},
				error : function(response) {
					$('#message').html(response).fadeOut(5000);
				}	
         });
	}
});