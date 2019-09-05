var _tableLogisticsDashboard;
$(document).ready(function() {
	$.ajax({
		url : "fetch-dashboard-details",
		error : function(e) {
		},
		success : function(data) {
			console.log(data);
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
	if (_tableLogisticsDashboard) {
		_tableLogisticsDashboard.destroy();
		$('#logisticsDashboardTable tbody').off('click');
	}
	_tableLogisticsDashboard = $('#logisticsDashboardTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "consignmentNo"
		}, {
			"data" : "itemNames"
		}, {
			"data" : "quantity"
		},{
			"data" : "status"
		}]
	});
	
}


