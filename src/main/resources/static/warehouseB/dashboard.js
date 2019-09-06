var _tableConsignmentReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-warehouseB-material-list",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serial = index + 1;
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
	if (_tableConsignmentReports) {
		_tableConsignmentReports.destroy();
		$('#warehouseBDashboardReportTable tbody').off('click');
	}
	_tableConsignmentReports = $('#warehouseyDashboardReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "itemName"
		}, {
			"data" : "serialNo"
		}, {
			"data" : "quantity"
		}, {
			"data" : "amConsingementTrackC2p.consingementNo"
		}, {
			"data" : "amConsingementTrackC2p.actArrivalDate"
		} ]
	});

}
