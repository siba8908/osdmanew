$(document).ready(function() {	
		
	$("#btnType").on("click", function() {
		saveType();
	});
	function saveType() {
		
		var tdata=[];
		$("#tableId tbody tr ").each(function(){
			var values={};
			var dt;
			var app;
			$(this).find("td").each(function(){
				dt = $('#date').text();
				app = $('#approvedAmount').text();
			});
			tdata.push({ date: dt,approvedAmount: app});
		});
		console.log(tdata);
		
		$.ajax({
				type : "POST",
				url : "dashboard_ajax",
				data : JSON.stringify(tdata),
				dataType : "json",
				contentType : 'application/json',
				success : function(response) {
				},
				error : function(xhr, status, error) {
				}
         });
	}
});