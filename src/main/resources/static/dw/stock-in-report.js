var _tableStockInReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-stock-in-report",
		error : function(e) {
		},
		success : function(data) {
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
});
function setTableData(dataSet) {
	if (_tableStockInReports) {
		_tableStockInReports.destroy();
		$('#stockInReportTable tbody').off('click');
	}
	_tableStockInReports = $('#stockInReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "productName"
		}, {
			"data" : "productCode"
		}, {
			"data" : "storageLocation"
		}, {
			"data" : "createdDate"
		}]
	});
	 $('#stockInReportTable thead tr').clone(true).appendTo( '#stockInReportTable thead' );
	    $('#stockInReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableStockInReports.column(i).search() !== this.value ) {
	            	_tableStockInReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
