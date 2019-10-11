var _tableMaterialRequestReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-material-request",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serialNo = index + 1;
			});
			setTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
});
function setTableData(dataSet) {
	if (_tableMaterialRequestReports) {
		_tableMaterialRequestReports.destroy();
		$('#pcMaterialRequestTable tbody').off('click');
	}
	_tableMaterialRequestReports = $('#pcMaterialRequestTable').DataTable({
		data : dataSet,
		dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ],
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "masterStationType.stationTypeName"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "siteCode.siteCode"
		}, {
			"data" : "status"
		} ],
		"columnDefs": [
            {"className": "dt-center", "targets": "_all"}
        ]
	});
}
