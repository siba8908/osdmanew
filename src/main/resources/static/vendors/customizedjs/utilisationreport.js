/**
 * 
 */
$(document).ready(function() {
	//alert("............")
	utilisationReportTable();

	function utilisationReportTable() {
		table = $('#datatable').DataTable({
			"sAjaxSource" :"resourcesUtilisationReport_ajax",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"destroy" : true, 
			"columns": [
				{"mData": "projectDetails.projectName"},
				{"mData": "teamDetails.teamName"},
				{"mData": "employeePersonalDetails.fullName"},
				{"mData": "status"},
			],
			dom: 'Bfrtip',
			buttons: [
				'excel', 'pdf','print'
			]
		});
	}	
});

