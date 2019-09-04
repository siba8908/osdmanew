var table = $('#trackingp2aTable').DataTable();

$(document).ready(function() {
	trackingp2aTable();
	function trackingp2aTable() { 	
		table = $('#trackingp2aTable').DataTable({
			"sAjaxSource" : "materialOrderTracking_P2A_report_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "consignmentNo"},
			    {"mData": "actArrivalDate"},
			    {"mData": "expArrivalDate"},
			    {"mData": "pickupDate"},
			    {"mData": "godownReciveDate"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	



