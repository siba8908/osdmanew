var _tableConsignmentReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-consignment-material-list",
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
		$('#warehouseADashboardReportTable tbody').off('click');
	}
	_tableConsignmentReports = $('#warehouseADashboardReportTable').DataTable({
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
