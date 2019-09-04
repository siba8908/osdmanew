var _tableSiteSurveyReports;
$(document).ready(function() {
	$.ajax({
		url : "/pc/fetch-site-survey",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serialNo = index + 1;
			});
			setTableData(data);
			console.log(data)
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
			"data" : "surveyDoc"
		}, {
			"data" : "remark"
		} ]
	});
}
