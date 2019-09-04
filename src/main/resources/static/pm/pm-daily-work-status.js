var _tableWorkStatus;
$(document).ready(function() {
	$.ajax({
		url : "/fetch-work-status",
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
	if (_tableWorkStatus) {
		_tableWorkStatus.destroy();
		$('#pmDailyWorkStatusTableTable tbody').off('click');
	}
	_tableWorkStatus = $('#pmDailyWorkStatusTableTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "pmTeamTaskMap.sitecode.siteCode"
		}, {
			"data" : "pmTeamTaskMap.masterTask.taskName"
		}, {
			"data" : "workStatus"
		}, {
			"data" : "remark"
		}, {
            "render": function (data, type, row, meta) {
                return "<img src = 'workImage' height='40px'>";
            }
        }, {
			"data" : "verifiedBy.name"
		}]
		
	});
	
}
