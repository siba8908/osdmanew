var _tableMaterialListReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-consignment-material-list",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serial = index + 1;
				this.storageLocation="<input type='text' class='form-control' id='storageLocation"+index + 1+"' placeholder='Enter Storage Location'/>";
				this.rackList="<input type='text' class='form-control' id='rackList"+index + 1+"' placeholder='Enter Rack List' />";								
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
	if (_tableMaterialListReports) {
		_tableMaterialListReports.destroy();
		$('#materialListReportTable tbody').off('click');
	}
	_tableMaterialListReports = $('#materialListReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "itemName"
		}, {
			"data" : "serialNo"
		}, {
			"data" : "quantity"
		}, {
			"data" : "storageLocation"
		}, {
			"data" : "rackList"
		} ]
	});

}
function saveWarehouseAmaterialList(){
	var table = $('#materialListReportTable').DataTable();
	var data = table
	    .rows()
	    .data();
	var wareHouseAMaterialList=[];
	$.each(data, function(index) {
		var wareHouseAMaterial={};
		var amConsignmentMateriallist={};
		amConsignmentMateriallist.materialId=this.materialId;
		wareHouseAMaterial.amConsignmentMateriallist=amConsignmentMateriallist;
		wareHouseAMaterial.storageLocation=$("#storageLocation"+index + 1+"").val();
		wareHouseAMaterial.rackList=$("#rackList"+index + 1+"").val();
		wareHouseAMaterialList.push(wareHouseAMaterial);
	});
	$.ajax({
        url: "save-warehouse-a-material-list",
        data: JSON.stringify(wareHouseAMaterialList),
        error: function (e) {
        	window.location.reload();
        },
        success: function (data) {
        	console.log(data)
        	window.location.reload();
        },
        dataType: "json",
        contentType: 'application/json; charset=utf-8',
        type: "POST",
        cache: false,
        crossDomain: true
    });
	
}
