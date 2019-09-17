var _tableProductListReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-products-report",
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
	if (_tableProductListReports) {
		_tableProductListReports.destroy();
		$('#productsReportTable tbody').off('click');
	}
	_tableProductListReports = $('#productsReportTable').DataTable({
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
			"data" : "storageLocation"
		}]
	});
	 $('#productsReportTable thead tr').clone(true).appendTo( '#productsReportTable thead' );
	    $('#productsReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableProductListReports.column(i).search() !== this.value ) {
	            	_tableProductListReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
