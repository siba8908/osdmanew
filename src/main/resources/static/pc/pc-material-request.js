var stationTypeOptions = "";
var workStageOptions = "";
var siteCodeOptions = "";
var i = 1;
$(document).ready(function() {
	fetchStationType();
	fetchWorkStage();
	fetchSiteCode();
});
function fetchStationType() {
	$.ajax({
		url : "/OSDMA/fetch-station-type",
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
}
function fetchWorkStage() {
	$.ajax({
		url : "/OSDMA/fetch-work-stage",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				workStageOptions += '<option value="' + this.stageId + '">'
						+ this.stageName + '</option>';
			});
			$("#workStage0").append(workStageOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}
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
			$("#siteCode0").append(siteCodeOptions);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
}

$(".btnAdd")
		.click(
				function() {
					var element = "<tr>" + "<td><div class='col-md-9'>"
							+ "<select class='form-control' id='stationType"
							+ i
							+ "'>"
							+ "<option value=''>Select Station Type</option>"
							+ "</select>"
							+ "</div></td>"
							+ "<td><div class='col-md-9'>"
							+ "<select class='form-control' id='workStage"
							+ i
							+ "'>"
							+ "<option value=''>Select Work Stage</option>"
							+ "</select>"
							+ "</div></td>"
							+ "<td><div class='col-md-9'>"
							+ "<select class='form-control' id='siteCode"
							+ i
							+ "'>"
							+ "<option value=''>Select Site Code</option>"
							+ "</select>"
							+ "</div></td>"
							+ "<td>"
							+ "<button type='button' class='btn btn-default mr-2 mb-2' data-toggle='modal' data-target='#example1' onclick='fetchProduct("
							+ i
							+ ")'>Verify</button>"
							+ "</td>"
							+ "<td><button class='fa fa-minus btnMinus' style='height: 30px'></button></td>"
							+ "</tr>";

					$(".body-material-request-table").append(element);
					$("#stationType" + i + "").append(stationTypeOptions);
					$("#workStage" + i + "").append(workStageOptions);
					$("#siteCode" + i + "").append(siteCodeOptions);
					i++;
					$(".btnMinus").click(function() {
						$(this).parent().parent().remove();
						i--;
					});
				});
function sendMaterialRequest() {
	var materialRequestList = [];
	var rowCount = 0;
	$('#material-request-table > tbody  > tr')
			.each(
					function() {
						var materialRequest = {};
						var masterStationType = {};
						var masterWorkStage = {};
						var siteCode = {};
						masterStationType.stationTypeId = $(
								"#stationType" + rowCount + "").val();
						masterWorkStage.stageId = $(
								"#workStage" + rowCount + "").val();
						siteCode.sitecodeId = $("#siteCode" + rowCount + "")
								.val();
						materialRequest.masterStationType = masterStationType;
						materialRequest.masterWorkStage = masterWorkStage;
						materialRequest.siteCode = siteCode;
						materialRequest.status="RAISED";
						materialRequestList.push(materialRequest);
					});
	$.ajax({
		url : "save-material-request",
		data : JSON.stringify(materialRequestList),
		error : function(e) {
			window.location.reload();
		},
		success : function(data) {
			window.location.reload();
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function fetchProduct(index) {
	var projProdMap = {};
	var masterStationType = {};
	var masterWorkStage = {};
	masterStationType.stationTypeId = $("#stationType" + index + "").val();
	masterWorkStage.stageId = $("#workStage" + index + "").val();
	projProdMap.masterStationType = masterStationType;
	projProdMap.masterWorkStage = masterWorkStage;
	$.ajax({
		url : "/OSDMA/fetch-mapped-product",
		data : JSON.stringify(projProdMap),
		error : function(e) {
		},
		success : function(data) {
			setTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		headers : {
			"Authorization" : "Bearer " + window.sessionStorage.token
		},
		type : "POST",
		cache : false,
		crossDomain : true
	});
}
function setTableData(data) {
	var tableRows = "";
	$.each(data, function(index) {
		tableRows += "<tr>" + "<td>" + this.masterWorkStage.stageName + "</td>"
				+ "<td>" + this.masterProduct.productName + "</td>" + "<td>"
				+ this.quantity + "</td>" + "</tr>";
	});
	$(".body-mapped-product-table").empty().append(tableRows);
}