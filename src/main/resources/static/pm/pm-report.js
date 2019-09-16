var siteCodeOptions = "";
var taskOptions = "";
var projectOptions = "";
$(document).ready(function() {
	fetchSiteCode();
	fetchTask();
	fetchProject();
});
function fetchSiteCode() {
	$.ajax({
		url : "/OSDMA/fetch-site-code",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				siteCodeOptions += '<option value="' + this.sitecodeId + '">'
						+ this.siteCode + '</option>';
			});
			$("#sitecode").append(siteCodeOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}
function fetchTask() {
	$.ajax({
		url : "fetch-master-task",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				taskOptions += '<option value="' + this.taskId + '">'
						+ this.taskName + '</option>';
			});
			$("#task").append(taskOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}
function fetchProject() {
	$.ajax({
		url : "fetch-project",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				projectOptions += '<option value="' + this.projectId + '">'
						+ this.projectName + '</option>';
			});
			$("#project").append(projectOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}
function fetchReportBySiteCode() {
	fetchBudgetBySiteCode();
	fetchProjetStatusBySiteCode()
}
function fetchReportByTask() {
	fetchBudgetByTask();
	fetchProjetStatusByTask()
}
function fetchReportByProject() {
	fetchBudgetByProject();
	fetchProjetStatusByProject()
}
function fetchBudgetBySiteCode() {
	$.ajax({
		url : "fetchBudgetBySiteCode/" + $("#sitecode").val(),
		error : function(e) {
		},
		success : function(data) {
			console.log(data)
			var type = [];
			var budget = [];
			var actualCost = [];
			var remaining = [];
			$.each(data, function(index) {
				type.push(this.type);
				budget.push(this.budget);
				actualCost.push(this.actualCost);
				remaining.push(this.remaining);

			})
			setBudgetData(type, budget, actualCost, remaining);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function fetchBudgetByTask() {
	$.ajax({
		url : "fetchBudgetByTask/" + $("#task").val(),
		error : function(e) {
		},
		success : function(data) {
			console.log(data)
			var type = [];
			var budget = [];
			var actualCost = [];
			var remaining = [];
			$.each(data, function(index) {
				type.push(this.type);
				budget.push(this.budget);
				actualCost.push(this.actualCost);
				remaining.push(this.remaining);

			})
			setBudgetData(type, budget, actualCost, remaining);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function fetchBudgetByProject() {
	$.ajax({
		url : "fetchBudgetByProject/" + $("#project").val(),
		error : function(e) {
		},
		success : function(data) {
			console.log(data)
			var type = [];
			var budget = [];
			var actualCost = [];
			var remaining = [];
			$.each(data, function(index) {
				type.push(this.type);
				budget.push(this.budget);
				actualCost.push(this.actualCost);
				remaining.push(this.remaining);

			})
			setBudgetData(type, budget, actualCost, remaining);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}

function fetchProjetStatusBySiteCode() {
	$.ajax({
		url : "fetchProjetStatusBySiteCode/" + $("#sitecode").val(),
		error : function(e) {
		},
		success : function(data) {
			setProjectStatusData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}

function fetchProjetStatusByTask() {
	$.ajax({
		url : "fetchProjetStatusByTask/" + $("#task").val(),
		error : function(e) {
		},
		success : function(data) {
			setProjectStatusData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}

function fetchProjetStatusByProject() {
	$.ajax({
		url : "fetchProjetStatusByProject/" + $("#project").val(),
		error : function(e) {
		},
		success : function(data) {
			setProjectStatusData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}

function setBudgetData(type, budget, actualCost, remaining) {
	Highcharts
			.chart(
					'budgetContainer',
					{
						chart : {
							type : 'column'
						},
						title : {
							text : 'Budget'
						},
						xAxis : {
							categories : type
						},
						yAxis : {
							min : 0,
							title : {
								text : 'Total fruit consumption'
							}
						},
						tooltip : {
							pointFormat : '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b> ({point.percentage:.0f}%)<br/>',
							shared : true
						},
						plotOptions : {
							column : {
								stacking : 'percent'
							}
						},
						series : [ {
							name : 'Planned',
							data : budget
						}, {
							name : 'Spent',
							data : actualCost
						}, {
							name : 'Remaining',
							data : remaining
						} ]
					});
}
function setProjectStatusData(projectStatusData) {
	var pieColors = (function() {
		var colors = [], base = Highcharts.getOptions().colors[0], i;

		for (i = 0; i < 10; i += 1) {
			// Start out with a darkened base color (negative brighten), and end
			// up with a much brighter color
			colors.push(Highcharts.Color(base).brighten((i - 3) / 7).get());
		}
		return colors;
	}());
	Highcharts.chart('projectContainer', {
		chart : {
			plotBackgroundColor : null,
			plotBorderWidth : null,
			plotShadow : false,
			type : 'pie'
		},
		title : {
			text : 'Project Progress and Task Status'
		},
		tooltip : {
			pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
		},
		plotOptions : {
			pie : {
				allowPointSelect : true,
				cursor : 'pointer',
				colors : pieColors,
				dataLabels : {
					enabled : true,
					format : '<b>{point.name}</b><br>{point.percentage:.1f} %',
					distance : -50,
					filter : {
						property : 'percentage',
						operator : '>',
						value : 4
					}
				}
			}
		},
		series : [ {
			name : 'Share',
			data : [ {
				name : 'On Track',
				y : projectStatusData.onTrack
			}, {
				name : 'Delayed',
				y : projectStatusData.concern
			}, {
				name : 'Concern',
				y : projectStatusData.delayed
			} ]
		} ]
	});
}