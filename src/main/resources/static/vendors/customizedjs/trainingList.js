var table = $('#trainingDetailsTable').DataTable();

$(document).ready(function() {
	trainingDetailsTable();
	function trainingDetailsTable() { 	
		table = $('#trainingDetailsTable').DataTable({
			"sAjaxSource" : "hr-view-training-details_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "empName"},
			    {"mData": "typesOfTraining"},
			    {"mData": "currentDate"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	

	
	 	
	