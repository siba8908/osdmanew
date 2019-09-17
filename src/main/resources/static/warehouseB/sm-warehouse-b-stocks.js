var _tableStockInReports;
var _tableMaterialRequestReports;
var materialRequest="";
$(document)
		.ready(
				function() {
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

					$
							.ajax({
								url : "fetch-wb-material-request",
								error : function(e) {
								},
								success : function(data) {
									$
											.each(
													data,
													function(index) {
														this.serialNo = index + 1;
														this.action = "<button type='button' class='btn btn-default mr-2 mb-2' data-toggle='modal' data-target='#example1' onclick='fetchProduct(this)'>View Products</button>";
													});
									setMaterialRequestData(data);
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

function setMaterialRequestData(dataSet) {
	if (_tableMaterialRequestReports) {
		_tableMaterialRequestReports.destroy();
		$('#wbMaterialRequestTable tbody').off('click');
	}
	_tableMaterialRequestReports = $('#wbMaterialRequestTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "masterStationType.stationTypeName"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "siteCode.siteCode"
		}, {
			"data" : "status"
		}, {
			"data" : "action"
		} ]
	});
}
function fetchProduct(e) {
	var data = _tableMaterialRequestReports.row($(e).parents('tr')).data();
    materialRequest=data;
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
			setMappedProductData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		headers : {
			"Authorization" : "Bearer " + window.sessionStorage.token
		},
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function setMappedProductData(data) {
	var tableRows = "";
	$.each(data, function(index,value) {
		var productCodeOptions = "";
		$.ajax({
			url : "fetch-product-list/"+this.masterProduct.productId,
			error : function(e) {
			},
			success : function(prodMapData) {
				$.each(prodMapData, function(index) {
					productCodeOptions += "<option value=" + this.productCodeId
							+ ">" + this.productCode + "</option>"
				});
				tableRows += "<tr>"
					+ "<td><input type='checkbox' name='product' value='"
					+ value.masterProduct.productId + "' ><input type='hidden' id='quantity"+value.masterProduct.productId+"' value='"+value.quantity+"'></td>" + "<td>"
					+ value.masterProduct.productName + "</td>" + "<td>"
					+ value.quantity + "</td>"
					+ "<td><select class='form-control' id='productCode"
					+ value.masterProduct.productId + "'>" + productCodeOptions
					+ "</select></td>" + "</tr>";
				$(".body-mapped-product-table").empty().append(tableRows);
			},
			dataType : "json",
			contentType : 'application/json; charset=utf-8',
			type : "GET",
			cache : false,
			crossDomain : true
		});
		
	});
}
function saveStockOut(){
	var warhousebStockOutList=[];
	var matRequestId={};
	matRequestId.materialReqId=materialRequest.materialReqId;
	$.each($("input[name='product']:checked"), function() { 
		var warhousebStockOut={};
		var productCodeId={};
		warhousebStockOut.createdDate=new Date();
		warhousebStockOut.matRequestId=matRequestId;
		var id=$(this).val();
		productCodeId.productCodeId=$("#productCode"+id+" :selected").val();
		warhousebStockOut.productCodeId=productCodeId;
		warhousebStockOut.quantity=$("#quantity"+id+"").val();
		warhousebStockOut.status="INTRANSIT";
		warhousebStockOutList.push(warhousebStockOut);
	});
	 $.ajax({
	        url: "save-stock-out",
	        data: JSON.stringify(warhousebStockOutList),
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
