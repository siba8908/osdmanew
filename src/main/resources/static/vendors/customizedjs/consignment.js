var table = $('#consignmentTable').DataTable();

$(document).ready(function() {
	consignmentTable();
	function consignmentTable() { 	
		table = $('#consignmentTable').DataTable({
			"sAjaxSource" : "consignmentwise_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "cong.consignmentNo"},
			    {"mData": "materialId"},
			    {"mData": "itemName"},
			    {"mData": "serialNo"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	



