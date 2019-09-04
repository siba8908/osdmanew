var i=1;
var _tableTeamTaskReports;
var siteCodeOptions;
var workStageOptions;
var stationTypeOptions;
var teamOptions;
var taskOptions;
var projectOptions;
$(document).ready(function() {
	$.ajax({
	      url: "/fetch-site-code",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	              siteCodeOptions += '<option value="' + this.sitecodeId + '">' + this.siteCode + '</option>';
	          });
	    	  $("#siteCode0").append(siteCodeOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
	$.ajax({
	      url: "/fetch-work-stage",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  $.each(data, function (index) {
	    		  workStageOptions += '<option value="' + this.stageId + '">' + this.stageName + '</option>';
	          });
	    	  $("#workStage0").append(workStageOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
	$.ajax({
		url : "/fetch-station-type",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				stationTypeOptions += '<option value="' + this.stationTypeId
						+ '">' + this.stationTypeName + '</option>';
			});
			$("#stationType0").append(stationTypeOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
	$.ajax({
		url : "/fetch-teams",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				teamOptions += '<option value="' + this.teamId
						+ '">' + this.teamName + '</option>';
			});
			$("#teamName0").append(teamOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
	$.ajax({
		url : "fetch-master-task",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				taskOptions += '<option value="' + this.taskId
						+ '">' + this.taskName + '</option>';
			});
			$("#taskName0").append(taskOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
	$.ajax({
		url : "fetch-project",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				projectOptions += '<option value="' + this.projectId
						+ '">' + this.projectName + '</option>';
			});
			$("#projectName0").append(projectOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
	$.ajax({
		url : "/fetch-pm-team-task",
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
	if (_tableTeamTaskReports) {
		_tableTeamTaskReports.destroy();
		$('#pmTeamTaskReportTable tbody').off('click');
	}
	_tableTeamTaskReports = $('#pmTeamTaskReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "sitecode.siteCode"
		}, {
			"data" : "masterStationType.stationTypeName"
		}, {
			"data" : "masterTask.taskName"
		}, {
			"data" : "masterTask.masterWorkStage.stageName"
		}, {
			"data" : "masterTeam.teamName"
		}, {
			"data" : "startDate"
		}, {
			"data" : "endDate"
		}, {
			"data" : "budget"
		}, {
			"data" : "taskStatus"
		} ]
	});
}
$(".btnAdd")
		.click(
				function() {
					var element = "<tr style='color: #06C; text-align: center'>"
							+ "<td><select class='form-control projectName' id='projectName"+i+"'>"
							+ "<option value=''>Select Project</option></select></td>"
							+ "<td><select class='form-control siteCode' id='siteCode"+i+"'>"
							+ "<option value=''>Select Site Code</option></select></td>"
							+ "<td><select class='form-control stationType' id='stationType"+i+"'>"
							+ "<option value=''>Select Station Type</option></select></td>"
							+ "<td><select class='form-control taskName' id='taskName"+i+"'>"
							+ "<option value=''>Select Task</option></select></td>"
							+ "<td><select class='form-control workStage' id='workStage"+i+"'>"
							+ "<option value=''>Select Work Stage</option></select></td>"
							+ "<td><select class='form-control teamName' id='teamName"+i+"'>"
							+ "<option value=''>Select Team</option></select></td>"
							+ "<td><div class='form-group'>"
							+ "<input type='text' class='form-control' placeholder='Select Date' id='startDate"+i+"' data-toggle='datetimepicker' data-target='#startDate"+i+"' />"
							+ "</div></td><td><div class='form-group'>"
							+ "<input type='text' class='form-control' placeholder='Select Date' id='endDate"+i+"' data-toggle='datetimepicker' data-target='#endDate"+i+"' />"
							+ "</div></td><td><input type='number' id='budget"+i+"'></td>"
							+ "<td><button class='fa fa-minus btnMinus' style='height: 30px'></button></td>"
							+ "</tr>";
					$(".body-create-team-task-table").append(element);
					$("#siteCode" + i + "").append(siteCodeOptions);
					$("#workStage" + i + "").append(workStageOptions);
					$("#stationType" + i + "").append(stationTypeOptions);
					$("#teamName" + i + "").append(teamOptions);
					$("#taskName" + i + "").append(taskOptions);
					$("#projectName" + i + "").append(projectOptions);
					i++;
					$(".btnMinus").click(function() {
						$(this).parent().parent().remove();
						i--;
					});
					$('#startDate'+i+'','#endDate'+i+'').datetimepicker({
						format : 'YYYY-DD-MM'
					})
				});
function saveAssignTask(){
	var assignTaskList=[];
	var rowCount=0;
	$('#create-assign-task-table > tbody  > tr').each(function() {
		var assignTask={};
		var masterStationType={};
		var masterTask={};
		var masterTeam={};
		var project={};
		var sitecode={};
		masterStationType.stationTypeId=$("#stationType"+rowCount+"").val();
		assignTask.masterStationType=masterStationType;
		masterTask.taskId=$("#taskName"+rowCount+"").val();
		assignTask.masterTask=masterTask;
		masterTeam.teamId=$("#teamName"+rowCount+"").val();
		assignTask.masterTeam=masterTeam;
		project.projectId=$("#projectName"+rowCount+"").val();
		assignTask.project=project;
		sitecode.sitecodeId=$("#siteCode"+rowCount+"").val();
		assignTask.sitecode=sitecode;
		assignTask.startDate=$("#startDate"+rowCount+"").val();
		assignTask.endDate=$("#endDate"+rowCount+"").val();
		assignTask.budget=$("#budget"+rowCount+"").val();
		assignTask.taskStatus='NOTSTARTED';
		assignTaskList.push(assignTask);
		rowCount++;
	});
	$.ajax({
        url: "save-assign-task",
        data: JSON.stringify(assignTaskList),
        error: function (e) {
        	window.location.reload();
        },
        success: function (data) {
        	console.log(data)
        	window.location.reload();
        },
        dataType: "json",
        contentType: 'application/json; charset=utf-8',
        type: "POST",
        cache: false,
        crossDomain: true
    });
}
