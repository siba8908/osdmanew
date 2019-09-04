var table = $('#trackingc2pTable').DataTable();

$(document).ready(function() {
	trackingc2pTable();
	function trackingc2pTable() { 	
		table = $('#trackingc2pTable').DataTable({
			"sAjaxSource" : "materialOrderTracking_C2P_report_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "consingement_no"},
			    {"mData": "airwaybill_no"},
			    {"mData": "status"},
			    {"mData": "exp_arrival_date"},
			    {"mData": "act_arrival_date"},
			    {"mData": "updated_on"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});	



