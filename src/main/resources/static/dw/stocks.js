var _tableProductList;
var _tableStockOutProductList;
$(document).ready(function() {
	fetchStockInProducts();
	fetchStockOutProducts();
});

function fetchStockInProducts() {
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
}
function setTableData(dataSet) {
	if (_tableProductList) {
		_tableProductList.destroy();
		$('#stockInTable tbody').off('click');
	}
	_tableProductList = $('#stockInTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "productName"
		}, {
			"data" : "productCode"
		}, {
			"data" : "quantity"
		}]
	});
}


function fetchStockOutProducts() {
	$.ajax({
		url : "fetch-stockout-products",
		error : function(e) {
		},
		success : function(data) {
			console.log(data);
			$.each(data, function(index) {
				this.serialNo = index + 1;
			});
			setStockOutTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}

function setStockOutTableData(dataSet) {
	if (_tableStockOutProductList) {
		_tableStockOutProductList.destroy();
		$('#stockOutTable tbody').off('click');
	}
	_tableStockOutProductList = $('#stockOutTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "requestId"
		}, {
			"data" : "productName"
		}, {
			"data" : "productCode"
		}, {
			"data" : "quantity"
		}, {
			"data" : ""
		}],
		columnDefs: [{
			"targets": -1,
            "data": null,
            "orderable": false,
            "render": function ( data, type, row, meta ) {
            	if(row.storageLocation != "") {
            		return row.storageLocation;
            	} else {
            		return "<button type='button' class='btn btn-success mr-2 mb-2' onclick='setStockOutId(this)' data-toggle='modal' data-target='#addLocationModal'> Add Location </button>";
            	}
            }
        },
        {"className": "dt-center", "targets": "_all"}]
	});
}

function setStockOutId(e) {
	$("#stockOutId").val("");
	var data = _tableStockOutProductList.row($(e).parents('tr')).data();
	console.log(data);
	$("#stockOutId").val(data.stockOutId);
}


function updateStorageLocation() {
	var stockOutId = $("#stockOutId").val();
	var storageLocation = $("#storageLocation").val();
	
	if(stockOutId == "" || stockOutId == undefined || stockOutId == null) {
		alert("Please refresh the page and try again !!!")
	}
	
	if(storageLocation == "" || storageLocation == undefined || storageLocation == null) {
		alert("Please add storage location !!!")
	}
	
	
	var data = {
			"stockOutId" : stockOutId,
			"storageLocation" : storageLocation
	}
	
	console.log(data)
	$.ajax({
		url : "add-storage-location",
		data : JSON.stringify(data),
		error : function(e) {
			console.log(e)
			swal({
				position : 'top',
				type : 'error',
				title : '',
				text : 'Error in save.',
				showConfirmButton : false,
				timer : 2500
			})
		},
		success : function(data) {
			$("#addLocationModal").modal("hide");
			$('body').removeClass('modal-open');
			$(".modal-backdrop").remove();
			console.log(data);
			swal({
				position : 'top',
				type : 'success',
				title : '',
				text : 'Location added successfully.',
				showConfirmButton : false,
				timer : 2500
			})
			$("#stockOutId").val("");
			$("#storageLocation").val("");
			
			fetchStockOutProducts();
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}






