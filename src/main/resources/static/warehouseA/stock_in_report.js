var _tableStockInReports;
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
	if (_tableStockInReports) {
		_tableStockInReports.destroy();
		$('#warehouseAStockInReportTable tbody').off('click');
	}
	_tableStockInReports = $('#warehouseAStockInReportTable').DataTable({
		data : dataSet,
		dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ],
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "consignmentNo"
		}, {
			"data" : "partNo"
		}, {
			"data" : "materialName"
		}, {
			"data" : "quantity"
		}, {
			"data" : "location"
		} ]
	});
	$('#warehouseAStockInReportTable thead tr').clone(true).appendTo( '#warehouseAStockInReportTable thead' );
    $('#warehouseAStockInReportTable thead tr:eq(1) th').each( function (i) {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
 
        $( 'input', this ).on( 'keyup change', function () {
            if ( _tableStockInReports.column(i).search() !== this.value ) {
            	_tableStockInReports
                    .column(i)
                    .search( this.value )
                    .draw();
            }
        });
    });

}
