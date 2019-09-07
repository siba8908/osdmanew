var _tableFundRequistion;
var _tableMaterialStatusReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-pending-fund-requistion",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serialNo = index + 1;
				this.checkBox="<input type='checkbox' name='fund-requistion' /> <span class='cui-utils-control-indicator'></span>";
				this.date="<input type='text' class='form-control' placeholder='Select Date' id='approvalDate"+index + 1+"' data-toggle='datetimepicker' data-target='#datepicker-only-init2' />";
				this.appAmount="<input type='number' class='form-control' id='approvedAmount"+index + 1+"'>";											
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
		url : "fetch-material-request",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serialNo = index + 1;
				this.viewItemDetails="<button type='button' class='btn btn-default mr-2 mb-2' data-toggle='modal' data-target='#example1' onclick='fetchProduct(this)'>Verify</button>"
			});
			setMaterialRequestTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
});
function setTableData(dataSet) {
	if (_tableFundRequistion) {
		_tableFundRequistion.destroy();
		$('#pendingFundRequistionTable tbody').off('click');
	}
	_tableFundRequistion = $('#pendingFundRequistionTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "checkBox"
		}, {
			"data" : "serialNo"
		}, {
			"data" : "date"
		}, {
			"data" : "sitecode.siteCode"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "amount"
		}, {
			"data" : "raisedFor"
		}, {
			"data" : "appAmount"
		}, {
			"data" : "remark"
		}]
		
	});
	
}
function updatePendindingFundRequistion(){
	var fundRequisitionList=[];
	$.each($("input[name='fund-requistion']:checked"), function() {
		 var currentRowData = _tableFundRequistion.row($(this).parents('tr')).data();
		 currentRowData.approvedAmount=$("#approvedAmount").val();
		 currentRowData.approvalDate=$("#approvalDate").val();
		 currentRowData.status="APPROVED";
		 fundRequisitionList.push(currentRowData);
	});
	console.log(fundRequisitionList)
	$.ajax({
        url: "update-pm-fund-requests",
        data: JSON.stringify(fundRequisitionList),
        error: function (e) {
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
function setMaterialRequestTableData(dataSet) {
	if (_tableMaterialStatusReports) {
		_tableMaterialStatusReports.destroy();
		$('#pmMaterialRequestStatusTable tbody').off('click');
	}
	_tableMaterialStatusReports = $('#pmMaterialRequestStatusTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "createdDate"
		}, {
			"data" : "siteCode.siteCode"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "masterStationType.stationTypeName"
		}, {
			"data" : "viewItemDetails"
		}, {
			"data" : "status"
		} ]
	});
	
}
function fetchProduct(event) {
	var data = _tableMaterialStatusReports.row($(event).parents('tr')).data();
	var projProdMap = {};
	var masterStationType = {};
	var masterWorkStage = {};
	masterStationType.stationTypeId = data.masterStationType.stationTypeId;
	masterWorkStage.stageId = data.masterWorkStage.stageId;
	projProdMap.masterStationType = masterStationType;
	projProdMap.masterWorkStage = masterWorkStage;
	$.ajax({
		url : "/OSDMA/fetch-mapped-product",
		data : JSON.stringify(projProdMap),
		error : function(e) {
		},
		success : function(data) {
			setMappedProdTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function setMappedProdTableData(data) {
	var tableRows = "";
	$.each(data, function(index) {
		tableRows += "<tr>" + "<td>" + this.masterWorkStage.stageName + "</td>"
				+ "<td>" + this.masterProduct.productName + "</td>" + "<td>"
				+ this.quantity + "</td>" + "</tr>";
	});
	$(".body-mapped-product-table").empty().append(tableRows);
}

