var _tableStockOutReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-stock-out-report",
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
	if (_tableStockOutReports) {
		_tableStockOutReports.destroy();
		$('#stockOutReportTable tbody').off('click');
	}
	_tableStockOutReports = $('#stockOutReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "productName"
		}, {
			"data" : "productCode"
		}, {
			"data" : "quantity"
		}, {
			"data" : "outwardDate"
		}, {
			"data" : "fromLocation"
		}, {
			"data" : "toLocation"
		}]
	});
	 $('#stockOutReportTable thead tr').clone(true).appendTo( '#stockOutReportTable thead' );
	    $('#stockOutReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableStockOutReports.column(i).search() !== this.value ) {
	            	_tableStockOutReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
