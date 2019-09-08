var _tableProductList;
$(document).ready(function() {
	$.ajax({
		url : "fetch-products",
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
	if (_tableProductList) {
		_tableProductList.destroy();
		$('#productsTable tbody').off('click');
	}
	_tableProductList = $('#productsTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "productName"
		}, {
			"data" : "productCode"
		}, {
			"data" : "quantity"
		}, {
			"data" : "status"
		}]
	});
}


