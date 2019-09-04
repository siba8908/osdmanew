var table = $('#rejectListTable').DataTable();

$(document).ready(function() {
	rejectListTable();
	function rejectListTable() { 	
		table = $('#rejectListTable').DataTable({
			"sAjaxSource" : "rejectList_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "productCode"},
			    {"mData": "barcode"},
			    {"mData": "remarks"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	



