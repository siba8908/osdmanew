/**
 * 
 */
var table = $('#leaveTable').DataTable();

$(document).ready(function()

{
	
	leaveStatusTable();
	$("#applyLeaveBtn").click(function()

	{
		applyLeave();
	});
});


function leaveStatusTable() {
	
	table = $('#leaveTable').DataTable({
	"sAjaxSource" : "get_all_details_ajax",
		"sAjaxDataProp" : "",
		"order" : [ [ 0, "asc" ] ],
		"destroy" : true, 
		
		"columns": [
			   
		      { "mData": "employeeCode"},
		      { "mData": "leaveType"},
		      { "mData": "permitedLeave"},
		      { "mData": "leaveTaken"},
		      { "mData": "avaliableLeave"},
		      
			],
			dom: 'Bfrtip',
			
			buttons: [
	             'excel', 'pdf'
	        ]
		    
	});
	

}
