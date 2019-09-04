var _tableSiteSurveyReports;
$(document).ready(function() {
	$.ajax({
		url : "/pc/fetch-site-survey",
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
		} ]
	});
}
