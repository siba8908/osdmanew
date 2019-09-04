$(document).ready( function () {
	alert("hhhhhh");
	debugger;
	 var table = $('#leaveDataTable').DataTable({
			"sAjaxSource": "employeeLeaveDetails_ajax",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			   
		      { "mData": "fromdate"},
		      { "mData": "todate"},
		      { "mData": "leaveType"},
		      { "mData": "noOfDays"},
		      { "mData": "approvedBy"},
			],
			dom: 'Bfrtip',
		    buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            },
	            {
	                extend: 'pdfHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            }
	        ],
	        /*stateSave: true,
	        "bDestroy": true,*/
	 });
	$("#leaveHistory").click(function(){
		alert("modal click");
        // show Modal
        $('#leavedetailsModal').modal('show');
   });
		
});