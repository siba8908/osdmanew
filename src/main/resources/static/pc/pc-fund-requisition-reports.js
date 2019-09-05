var _tableFundRequisitionReports;
$(document).ready(function() {
	$.ajax({
		url : "/pc/fetch-all-fund-request-for-requisition",
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
	if (_tableFundRequisitionReports) {
		_tableFundRequisitionReports.destroy();
		$('#pcFundRequisitionReportTable tbody').off('click');
	}
	_tableFundRequisitionReports = $('#pcFundRequisitionReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "sitecode.siteCode"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "amount"
		}, {
			"data" : "purpose"
		}, {
			"data" : "remark"
		} ]
	});
	 $('#pcFundRequisitionReportTable thead tr').clone(true).appendTo( '#pcFundRequisitionReportTable thead' );
	    $('#pcFundRequisitionReportTable thead tr:eq(1) th').each( function (i) {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	 
	        $( 'input', this ).on( 'keyup change', function () {
	            if ( _tableFundRequisitionReports.column(i).search() !== this.value ) {
	            	_tableFundRequisitionReports
	                    .column(i)
	                    .search( this.value )
	                    .draw();
	            }
	        } );
	    } );
}
