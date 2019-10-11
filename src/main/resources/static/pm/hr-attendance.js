var _tableAttendanceReports;
var table_columns = [];
function fetchAttendance() {
	var json = {};
	json.month = $("#month").val();
	json.year = $("#year").val();
	$.ajax({
		url : "showAttendance",
		data : JSON.stringify(json),
		error : function(e) {
		},
		success : function(data) {
			setAttendanceTableData(data, json.month, json.year);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function setAttendanceTableData(data, month, year) {
	var tableHead = "<thead><tr><th>S No.</th><th>Employee Code</th>";
	var tableData = "<tbody>";
	for (var i = 1; i <= daysInMonth(month, year); i++) {
		tableHead += "<th>" + i + "-" + month + "-" + year + "</th>";
	}
	tableHead += "<tr></thead>";
	$.each(data, function(index, val) {
		tableData += "<tr><td>" + index + 1 + "</td><td>" + val.employeeCode
				+ "</td>" + "<td>" + val.day1 + "</td><td>" + val.day2
				+ "</td><td>" + val.day3 + "</td>" + "<td>" + val.day4
				+ "</td><td>" + val.day5 + "</td><td>" + val.day6 + "</td>"
				+ "<td>" + val.day7 + "</td><td>" + val.day8 + "</td><td>"
				+ val.day9 + "</td>" + "<td>" + val.day10 + "</td><td>"
				+ val.day11 + "</td><td>" + val.day12 + "</td>" + "<td>"
				+ val.day13 + "</td><td>" + val.day14 + "</td><td>" + val.day15
				+ "</td>" + "<td>" + val.day16 + "</td><td>" + val.day17
				+ "</td><td>" + val.day18 + "</td>" + "<td>" + val.day19
				+ "</td><td>" + val.day20 + "</td><td>" + val.day21 + "</td>"
				+ "<td>" + val.day22 + "</td><td>" + val.day23 + "</td><td>"
				+ val.day24 + "</td>" + "<td>" + val.day25 + "</td><td>"
				+ val.day26 + "</td><td>" + val.day27 + "</td>" + "<td>"
				+ val.day28 + "</td><td>" + val.day29 + "</td><td>" + val.day30
				+ "</td>" + "<td>" + val.day31 + "</td></tr>";

	});
	tableData += "</tbody>";
	$("#attendanceReportTable").empty().append(tableHead + tableData);
	if (daysInMonth(month, year) == 30) {
		$('table tr td:last-child').hide();
		$('table tr th:last-child').hide();
	}
}
function daysInMonth(month, year) {
	return new Date(year, month, 0).getDate();
}
