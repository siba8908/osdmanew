var _tableStockOutReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-stock-out",
		error : function(e) {
		},
		success : function(data) {
			var i=1;
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
	if (_tableStockOutReports) {
		_tableStockOutReports.destroy();
		$('#warehouseBStockOutReportTable tbody').off('click');
	}
	_tableStockOutReports = $('#warehouseBStockOutReportTable').DataTable({
		data : dataSet,
		dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ],
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
		} ],
		"columnDefs": [
            {"className": "dt-center", "targets": "_all"}
        ]
		
	});
	
	$('#warehouseBStockOutReportTable thead tr').clone(true).appendTo( '#warehouseBStockOutReportTable thead' );
    $('#warehouseBStockOutReportTable thead tr:eq(1) th').each( function (i) {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
 
        $( 'input', this ).on( 'keyup change', function () {
            if ( _tableStockOutReports.column(i).search() !== this.value ) {
            	_tableStockOutReports
                    .column(i)
                    .search( this.value )
                    .draw();
            }
        });
    });

}
