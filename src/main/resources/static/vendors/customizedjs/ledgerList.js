var table = $('#ledgerListTable').DataTable();

$(document).ready(function() {
	ledgerListTable();
	function ledgerListTable() { 	
		table = $('#ledgerListTable').DataTable({
			"sAjaxSource" : "ledgerList_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "pro.providerName"},
			    {"mData": "billDate"},
			    {"mData": "billAmount"},
			    {"mData": "paymentDate"},
			    {"mData": "paymentAmount"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		        ]
		});
	}
});	