$(document).ready(function() {
	fetchBudget(0);
});
function fetchReport(filterType) {
	fetchBudget(filterType);
	//fetchProjetStatus(filterType)
}
function fetchBudget(filterType) {
	$.ajax({
		url : "fetchBudget/" + filterType,
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
function fetchProjetStatus(filterType) {
	$.ajax({
		url : "fetchProjetProgress/" + filterType,
		error : function(e) {
		},
		success : function(data) {
			// setProjectProgressData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
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