var _tableResourceUtilisationReports;
$(document).ready(function() {
	$.ajax({
		url : "fetch-resource-utilisation",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serial = index + 1;
			});
			console.log(data)
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
	if (_tableResourceUtilisationReports) {
		_tableResourceUtilisationReports.destroy();
		$('#resourceUtilisationReportTable tbody').off('click');
	}
	_tableResourceUtilisationReports = $('#resourceUtilisationReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "employeePersonalDetails.hrEmpAddEmployee[0].masterDepartment.departmentName"
		}, {
			"data" : "employeePersonalDetails.firstName"
		}, {
			"data" : "employeePersonalDetails.firstName"
		}, {
			"data" : "employeePersonalDetails.firstName"
		}, {
			"data" : "employeePersonalDetails.firstName"
		} ]
	});

}
