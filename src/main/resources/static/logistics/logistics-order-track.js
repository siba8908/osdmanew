var _tableLogisticsOrderTrack;
$(document).ready(function() {
	$.ajax({
		url : "fetch-track-details",
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
	if (_tableLogisticsOrderTrack) {
		_tableLogisticsOrderTrack.destroy();
		$('#trackDetailstable tbody').off('click');
	}
	_tableLogisticsOrderTrack = $('#trackDetailstable').DataTable({
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
			"data" : "vechileNo"
		}, {
			"data" : "lrNo"
		}, {
			"data" : "ewayBilNo"
		}, {
			"data" : "expArrival"
		}, {
			"data" : "actualArrival"
		}]
	});
	
}


