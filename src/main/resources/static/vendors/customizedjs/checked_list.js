var table = $('#rejectListTable').DataTable();

$(document).ready(function() {
	rejectListTable();
	function rejectListTable() { 	
		table = $('#rejectListTable').DataTable({
			"sAjaxSource" : "material-checked-report_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "productCode"},
			    {"mData": "barcode"},
			    {"mData": "quality"},
			    {"mData": "createdDate"},
			    {"mData": "createdBy"},
			    {"mData": "remarks"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	



