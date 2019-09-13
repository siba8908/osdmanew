var _tableStockInReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-wb-stock-in",
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
	if (_tableStockInReports) {
		_tableStockInReports.destroy();
		$('#warehouseBStockInReportTable tbody').off('click');
	}
	_tableStockInReports = $('#warehouseBStockInReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "productCode"
		}, {
			"data" : "masterProduct.productName"
		}, {
			"data" : "storageLocation"
		}, {
			"data" : "productStatus"
		} ]
	});
	
}
