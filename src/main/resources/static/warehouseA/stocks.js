var _tableStockInReports;
var _tableStockOutReports;
$(document)
		.ready(
				function() {
					$.ajax({
						url : "fetch-stock-in",
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
//					$
//							.ajax({
//								url : "fetch-stock-out-material",
//								error : function(e) {
//								},
//								success : function(data) {
//									$
//											.each(
//													data,
//													function(index) {
//														this.serial = index + 1;
//														this.outwardDate = "<input type='text' class='form-control outwardDate'placeholder='Select Date' value='2019-08-08' id='outwardDate"+index + 1+"' data-toggle='datetimepicker' data-target='#outwardDate"+index + 1+"' />";
//														this.storageLocation="<input type='text' class='form-control' placeholder='Enter Storage Location' id='storageLocation"+index + 1+"' />";
//													});
//									setStockOutData(data);
//								},
//								dataType : "json",
//								contentType : 'application/json; charset=utf-8',
//								type : "GET",
//								cache : false,
//								crossDomain : true
//							});
				});
function setTableData(dataSet) {
	if (_tableStockInReports) {
		_tableStockInReports.destroy();
		$('#stockInReportTable tbody').off('click');
	}
	_tableStockInReports = $('#stockInReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "createdDate"
		}, {
			"data" : "createdBy.name"
		}, {
			"data" : "createdBy.name"
		}, {
			"data" : "barcode"
		}, {
			"data" : "amConsignmentMateriallist.serialNo"
		}, {
			"data" : "amConsignmentMateriallist.quantity"
		} ]
	});

}
//function setStockOutData(dataSet) {
//	if (_tableStockOutReports) {
//		_tableStockOutReports.destroy();
//		$('#stockOutReportTable tbody').off('click');
//	}
//	_tableStockOutReports = $('#stockOutReportTable').DataTable({
//		data : dataSet,
//		columns : [ {
//			"data" : "serial"
//		}, {
//			"data" : "outwardDate"
//		}, {
//			"data" : "qaqcItems.createdBy.name"
//		}, {
//			"data" : "qaqcItems.createdBy.name"
//		}, {
//			"data" : "qaqcItems.barcode"
//		}, {
//			"data" : "qaqcItems.amConsignmentMateriallist.serialNo"
//		}, {
//			"data" : "storageLocation"
//		}, {
//			"data" : "qaqcItems.amConsignmentMateriallist.quantity"
//		} ]
//	});
//
//}
//function saveStockOut(){
//	var table = $('#stockOutReportTable').DataTable();
//	var data = table
//	    .rows()
//	    .data();
//	var stockOutItemList=[];
//	$.each(data, function(index) {
//		var stockOutItem={};
//		var qaqcItems={};
//		stockOutItem.consigner=this.qaqcItems.createdBy.name;
//		stockOutItem.consignee=this.qaqcItems.createdBy.name;
//		stockOutItem.storageLocation=$("#storageLocation"+index + 1+"").val();
//		stockOutItem.quantity=this.qaqcItems.amConsignmentMateriallist.quantity
//		stockOutItem.createdDate=$("#outwardDate"+index + 1+"").val();
//		qaqcItems.itemId=this.qaqcItems.itemId
//		stockOutItem.qaqcItems=qaqcItems;
//		stockOutItemList.push(stockOutItem);
//	})
//	$.ajax({
//        url: "save-stock-out-items",
//        data: JSON.stringify(stockOutItemList),
//        error: function (e) {
//        	window.location.reload();
//        },
//        success: function (data) {
//        	window.location.reload();
//        },
//        dataType: "json",
//        contentType: 'application/json; charset=utf-8',
//        type: "POST",
//        cache: false,
//        crossDomain: true
//    });
//}
