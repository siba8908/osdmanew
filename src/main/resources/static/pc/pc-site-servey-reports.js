var _tableSiteSurveyReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-site-survey",
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
	if (_tableSiteSurveyReports) {
		_tableSiteSurveyReports.destroy();
		$('#pcSiteSurveyReportTable tbody').off('click');
	}
	_tableSiteSurveyReports = $('#pcSiteSurveyReportTable').DataTable({
		data : dataSet,
		dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ],
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "siteCode.siteCode"
		}, {
			"data" : "siteCode.siteName"
		}, {
			"data" : "surveyDate"
		}, {
			"data" : "image"
		}, {
			"data" : "remark"
		} ],
		"columnDefs": [
            {"className": "dt-center", "targets": "_all"}
        ]
	});
	 $('#pcSiteSurveyReportTable thead tr').clone(true).appendTo( '#pcSiteSurveyReportTable thead' );
	    $('#pcSiteSurveyReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableSiteSurveyReports.column(i).search() !== this.value ) {
	            	_tableSiteSurveyReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
