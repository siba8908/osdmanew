var _tableLetterOfClearanceReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-letter-clearance",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serialNo = index + 1;
				this.image="<img id='blah' width='50px;' height='50px'  src='../"+this.surveyDoc+"' alt='' />";
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
	if (_tableLetterOfClearanceReports) {
		_tableLetterOfClearanceReports.destroy();
		$('#pcLetterOfClearanceReportTable tbody').off('click');
	}
	_tableLetterOfClearanceReports = $('#pcLetterOfClearanceReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "siteCode.siteCode"
		}, {
			"data" : "letterType.letterType"
		}, {
			"data" : "submissionDate"
		}, {
			"data" : "image"
		} ]
	});
	 $('#pcLetterOfClearanceReportTable thead tr').clone(true).appendTo( '#pcLetterOfClearanceReportTable thead' );
	    $('#pcLetterOfClearanceReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableLetterOfClearanceReports.column(i).search() !== this.value ) {
	            	_tableLetterOfClearanceReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
