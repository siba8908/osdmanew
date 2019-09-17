var _tableStockOutReports;
var siteLocationOptions;
var serviceProviderOptions;
var stockOutData="";
$(document).ready(function() {
	$.ajax({
		url : "fetch-stock-out",
		error : function(e) {
		},
		success : function(data) {
			var i=1;
			$.each(data, function(index) {
				this.serial = index + 1;
				this.action="<button type='button' class='btn btn-default mr-2 mb-2' data-toggle='modal' data-target='#example1' onclick='updateStockOut(this)'>Update</button>";
			});
			setTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
	
	$.ajax({
	      url: "fetch-site-location",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  siteLocationOptions += '<option value="' + this.siteLocationId + '">' + this.sitecode.siteCode + '</option>';
	          });
	    	  $("#storageLocation").append(siteLocationOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
	
	$.ajax({
	      url: "fetch-service-provider",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  serviceProviderOptions += '<option value="' + this.providerId + '">' + this.providerName + '</option>';
	          });
	    	  $("#logistics").append(serviceProviderOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
});
function setTableData(dataSet) {
	if (_tableStockOutReports) {
		_tableStockOutReports.destroy();
		$('#warehouseBStockOutReportTable tbody').off('click');
	}
	_tableStockOutReports = $('#warehouseBStockOutReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "matRequestId.materialReqId"
		}, {
			"data" : "productCodeId.productCode"
		}, {
			"data" : "quantity"
		}, {
			"data" : "status"
		}, {
			"data" : "action"
		} ]
	});
}
function saveStockOut(){
	var consignmentLogistic={};
	var materialRequest={};
	consignmentLogistic.logisticId=$("#logistics").val();
	consignmentLogistic.vechileNo=$("#vehicleNo").val();
	consignmentLogistic.lrNo=$("#irNo").val();
	consignmentLogistic.ewayBilNo=$("#waybillNo").val();
	consignmentLogistic.expArrival=$("#waybillNo").val();
	consignmentLogistic.status='ARRIVED';
	materialRequest.materialReqId=stockOutData.matRequestId.materialReqId;
	consignmentLogistic.materialRequest=materialRequest
	 $.ajax({
	        url: "save-stock-out-logistics",
	        data: JSON.stringify(consignmentLogistic),
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
function updateStockOut(e){
	 stockOutData = _tableStockOutReports.row($(e).parents('tr')).data();
}