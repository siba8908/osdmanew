var _tableLogisticsStatus;
$(document).ready(function() {
	$.ajax({
		url : "fetch-logistics-status",
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
	if (_tableLogisticsStatus) {
		_tableLogisticsStatus.destroy();
		$('#logisticsStatusTable tbody').off('click');
	}
	_tableLogisticsStatus = $('#logisticsStatusTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "consignmentNo"
		}, {
			"data" : "vechileNo"
		}, {
			"data" : "lrNo"
		}, {
			"data" : "ewayBilNo"
		},{
			"data" : "status"
		},{
			"data" : "pickupDate"
		}]
	});
	
}


