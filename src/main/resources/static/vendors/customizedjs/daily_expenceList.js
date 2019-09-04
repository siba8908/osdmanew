var table = $('#dailyStatusTable').DataTable();

$(document).ready(function() {
	dailyStatusTable();
	function dailyStatusTable() { 	
		table = $('#dailyStatusTable').DataTable({
			"sAjaxSource" : "/am/daily_expence_list_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "transactionDate"},
			    {"mData": "amount"},
			    {"mData": "cashFlow"},
			    {"mData": "paymentType"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	