var _tableDashboardReports;
$(document).ready(function() {
	$.ajax({
		url : "/fetch-pm-team-task",
		error : function(e) {
		},
		success : function(data) {
			console.log(data)
			$.each(data, function(index) {
				this.serialNo = index + 1;
				if(this.masterTeam.pmTeamMembers[0].status=="ASSIGNED"){
					this.taskStatus='<button type="button" class="btn btn-info mr-2 mb-2 btn-accept">Accept</button><button type="button" class="btn btn-danger mr-2 mb-2 btn-reject">Reject</button>';
				}else if(this.masterTeam.pmTeamMembers[0].status=="ACCEPTED"){
					this.taskStatus='<button type="button" class="btn btn-success mr-2 mb-2">Accepted</button>';
				}else{
					this.taskStatus='<button type="button" class="btn btn-danger mr-2 mb-2">Rejected</button>';
				}
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
	if (_tableDashboardReports) {
		_tableDashboardReports.destroy();
		$('#pcDashboardReportTable tbody').off('click');
	}
	_tableDashboardReports = $('#pcDashboardReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "sitecode"
		}, {
			"data" : "masterTask.taskName"
		}, {
			"data" : "startDate"
		}, {
			"data" : "endDate"
		}, {
			"data" : "masterTeam.teamName"
		}, {
			"data" : "taskStatus"
		} ]
	});
	
	$('#pcDashboardReportTable tbody').on('click', '.btn-accept', function (e) {
        e.stopPropagation();
        var currentRowData = _tableDashboardReports.row($(this).parents('tr')).data();
        currentRowData.masterTeam.pmTeamMembers[0].status="ACCEPTED";
        updateTask(currentRowData);
    });
	$('#pcDashboardReportTable tbody').on('click', '.btn-reject', function (e) {
        e.stopPropagation();
        var currentRowData = _tableDashboardReports.row($(this).parents('tr')).data();
        currentRowData.masterTeam.pmTeamMembers[0].status="REJECTED";
        swal({
        	  title: "Are you sure you want to reject the task?",
        	  icon: "warning",
        	  buttons: true,
        	  dangerMode: true,
        	})
        	.then((willDelete) => {
        	  if (willDelete) {
        		  updateTask(currentRowData);
        	  }
        	});
    });
}
function updateTask(currentRowData){
	console.log(currentRowData)
	 $.ajax({
	        url: "update-pm-team-task",
	        data: JSON.stringify(currentRowData),
	        error: function (e) {
	        	window.location.reload();
	        },
	        success: function (data) {
	        },
	        dataType: "json",
	        contentType: 'application/json; charset=utf-8',
	        type: "POST",
	        cache: false,
	        crossDomain: true
	    });
}