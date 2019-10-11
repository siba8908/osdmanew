var _tableProductListReports;
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
	if (_tableProductListReports) {
		_tableProductListReports.destroy();
		$('#warehouseBProductListReportTable tbody').off('click');
	}
	_tableProductListReports = $('#warehouseBProductListReportTable').DataTable({
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
	
	$('#warehouseBProductListReportTable thead tr').clone(true).appendTo( '#warehouseBProductListReportTable thead' );
    $('#warehouseBProductListReportTable thead tr:eq(1) th').each( function (i) {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
 
        $( 'input', this ).on( 'keyup change', function () {
            if ( _tableProductListReports.column(i).search() !== this.value ) {
            	_tableProductListReports
                    .column(i)
                    .search( this.value )
                    .draw();
            }
        });
    });

}
