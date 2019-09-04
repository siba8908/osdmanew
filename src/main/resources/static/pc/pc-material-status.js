var _tableMaterialStatusReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-material-status",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serialNo = index + 1;
				this.status = "Status";
			});
			setTableData(data);
			console.log(data)
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
});
function setTableData(dataSet) {
	if (_tableMaterialStatusReports) {
		_tableMaterialStatusReports.destroy();
		$('#pcMaterialRequestStatusTable tbody').off('click');
	}
	_tableMaterialStatusReports = $('#pcMaterialRequestStatusTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "masterStationType.stationTypeName"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "masterProduct.productName"
		}, {
			"data" : "quantity"
		}, {
			"data" : "status"
		} ]
	});
}
