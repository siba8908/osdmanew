var _tableInTransistSummaryReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-in-transit-summary",
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
	if (_tableInTransistSummaryReports) {
		_tableInTransistSummaryReports.destroy();
		$('#inTransistSummaryReportTable tbody').off('click');
	}
	_tableInTransistSummaryReports = $('#inTransistSummaryReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "consignmentNo"
		}, {
			"data" : "materialName"
		}, {
			"data" : "quantity"
		}, {
			"data" : "eWayBillNo"
		}, {
			"data" : "lrNo"
		}, {
			"data" : "vehicleNo"
		}, {
			"data" : "fromLocation"
		} ]
	});
	 $('#inTransistSummaryReportTable thead tr').clone(true).appendTo( '#inTransistSummaryReportTable thead' );
	    $('#inTransistSummaryReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableInTransistSummaryReports.column(i).search() !== this.value ) {
	            	_tableInTransistSummaryReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
