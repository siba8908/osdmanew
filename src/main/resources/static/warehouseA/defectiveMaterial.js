var _tableDefectiveMaterialReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-defective-items",
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
	if (_tableDefectiveMaterialReports) {
		_tableDefectiveMaterialReports.destroy();
		$('#defectiveMaterialReportTable tbody').off('click');
	}
	_tableDefectiveMaterialReports = $('#defectiveMaterialReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "amConsignmentMateriallist.serialNo"
		}, {
			"data" : "productCode"
		}, {
			"data" : "barcode"
		}, {
			"data" : "amConsignmentMateriallist.quantity"
		}, {
			"data" : "amConsignmentMateriallist.amConsingementTrackC2p.actArrivalDate"
		}, {
			"data" : "remarks"
		} ]
	});

}
