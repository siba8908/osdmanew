var _tableMaterialstReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-materials-report",
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
});
function setTableData(dataSet) {
	if (_tableMaterialstReports) {
		_tableMaterialstReports.destroy();
		$('#warehouseAMaterialsReportTable tbody').off('click');
	}
	_tableMaterialstReports = $('#warehouseAMaterialsReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "consignmentNo"
		}, {
			"data" : "partNo"
		}, {
			"data" : "materialName"
		}, {
			"data" : "location"
		} ]
	});
	$('#warehouseAMaterialsReportTable thead tr').clone(true).appendTo( '#warehouseAMaterialsReportTable thead' );
    $('#warehouseAMaterialsReportTable thead tr:eq(1) th').each( function (i) {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
 
        $( 'input', this ).on( 'keyup change', function () {
            if ( _tableMaterialstReports.column(i).search() !== this.value ) {
            	_tableMaterialstReports
                    .column(i)
                    .search( this.value )
                    .draw();
            }
        });
    });

}
