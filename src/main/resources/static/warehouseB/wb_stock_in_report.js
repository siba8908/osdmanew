var _tableStockInReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-wb-stock-in",
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
	if (_tableStockInReports) {
		_tableStockInReports.destroy();
		$('#warehouseBStockInReportTable tbody').off('click');
	}
	_tableStockInReports = $('#warehouseBStockInReportTable').DataTable({
		data : dataSet,
		dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ],
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "productCode"
		}, {
			"data" : "masterProduct.productName"
		}, {
			"data" : "createdDate"
		}, {
			"data" : "storageLocation"
		} ],
		"columnDefs": [
            {"className": "dt-center", "targets": "_all"}
        ]
	});
	
	$('#warehouseBStockInReportTable thead tr').clone(true).appendTo( '#warehouseBStockInReportTable thead' );
    $('#warehouseBStockInReportTable thead tr:eq(1) th').each( function (i) {
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
