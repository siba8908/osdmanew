var _tableProductListReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-product-list",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serial = index + 1;
				this.action='<button type="button" class="btn btn-info mr-2 mb-2 btn-recv">Receive</button>';
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
	if (_tableProductListReports) {
		_tableProductListReports.destroy();
		$('#warehouseBProductListReportTable tbody').off('click');
	}
	_tableProductListReports = $('#warehouseBProductListReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "productCode"
		}, {
			"data" : "masterProduct.productName"
		}, {
			"data" : "productStatus"
		}, {
			"data" : "action"
		} ]
	});
	
	$('#warehouseBProductListReportTable tbody').on('click', '.btn-recv', function (e) {
        e.stopPropagation();
        var currentRowData = _tableProductListReports.row($(this).parents('tr')).data();
        currentRowData.productStatus="RECEIVED";
        updateProduct(currentRowData);
    });

}
function updateProduct(currentRowData){
	 $.ajax({
	        url: "update-product-stock",
	        data: JSON.stringify(currentRowData),
	        error: function (e) {
	        	//window.location.reload();
	        },
	        success: function (data) {
	        	window.location.reload();
	        },
	        dataType: "json",
	        contentType: 'application/json; charset=utf-8',
	        type: "POST",
	        cache: false,
	        crossDomain: true
	    });
}