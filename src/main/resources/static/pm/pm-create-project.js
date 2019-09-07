var i = 1;
var stationTypeOptions;
$(document).ready(
		function() {
			$.ajax({
				url : "/OSDMA/fetch-station-type",
				error : function(e) {
				},
				success : function(data) {
					$.each(data, function(index) {
						stationTypeOptions += '<option value="'
								+ this.stationTypeId + '">'
								+ this.stationTypeName + '</option>';
					});
					$("#stationType0").append(stationTypeOptions);
				},
				dataType : "json",
				contentType : 'application/json; charset=utf-8',
				type : "GET",
				cache : false,
				crossDomain : true
			});
		});
$(".btnAdd")
		.click(
				function() {
					var element = "<tr style='color: #06C; text-align: center'>"
							+ "<td></td><td></td><td></td><td></td>"
							+ "<td><div class='form-group'>"
							+ "<select class='form-control' id='stationType"+i+"'>"
							+ "<option value=''>Select Station Type</option>"
							+ "</select></div></td><td><div class='form-group'>"
							+ "<input type='text' class='form-control' placeholder='Enter No. Of Station' id='noOfStation"+i+"' />"
							+ "</div></td><td><div class='form-group'>"
							+ "<button class='fa fa-minus btnMinus' style='height: 30px'></button>"
							+ "</div></td></tr>";
					$(".body-create-project-table").append(element);
					$("#stationType" + i + "").append(stationTypeOptions);
					i++;
					$(".btnMinus").click(function() {
						$(this).parent().parent().parent().remove();
						i--;
					});
				});
function saveProject(){

	var project={};
	var projStationMaps=[];
	project.projectName=$("#projectName0").val();
	project.projectCode=$("#projectCode0").val();
	project.startDate=$("#satrtDate0").val();
	project.endDate=$("#endDate0").val();
	var rowCount=0;
	$('#site-survey-table > tbody  > tr').each(function() {
		var projStationMap={};
		var masterStationType={};
		masterStationType.stationTypeId=$("#stationType"+rowCount+"").val();
		projStationMap.masterStationType=masterStationType;
		projStationMap.noOfStation=$("#noOfStation"+rowCount+"").val();
		projStationMaps.push(projStationMap);
		rowCount++;
	});
	project.projStationMaps=projStationMaps;
	$.ajax({
        url: "save-project",
        data: JSON.stringify(project),
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

