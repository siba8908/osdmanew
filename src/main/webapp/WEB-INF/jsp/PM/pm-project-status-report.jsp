<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pm-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>

			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project co-orinator </strong> <small
						class="text-muted"></small>
					</span>
					<div class="row">
						<div class="col-lg-3 col-xs-3 col-sm-3">
							<span class="font-size-18 d-block">Search By:</span>
						</div>
						<div class="col-lg-3 col-xs-3 col-sm-3">
							<select class="form-control" onchange="fetchReport(this.value)">
								<option value="0" selected>Task Wise</option>
								<option value="1">Sitecode Wise</option>
								<option value="2">Project Wise</option>
							</select>
						</div>
						<div class="col-lg-6 col-xs-3 col-sm-3"></div>

					</div>
				</nav>
				<div class="row">
					<div class="col-lg-6 col-xs-6 col-sm-3">
						<div class="card-deck">
							<div class="card">
								<div class="card-body text-center">
									<div id="projectContainer"
										style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-6 col-xs-6 col-sm-3">
						<div class="card-deck">
							<div class="card">
								<div class="card-body text-center">
									<div id="budgetContainer"
										style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- END: forms/selectboxes -->

	<!-- START: page scripts -->

	<!-- END: page scripts -->

	<div class="cui-layout-footer">
		<div class="cui-footer">
			<div class="cui-footer-inner">
				<div class="cui-footer-top">
					<div class="row">
						<div class="col-lg-9 mb-3">
							<div class="mb-3">
								<strong></strong>
							</div>
							<div class="cui-footer-description"></div>
						</div>
						<div class="cui-footer-bottom">
							<div class="row">
								<div class="col-md-4">
									<img src="../components/dummy-assets/common/img/logo.png"
										width="200" height="auto">
								</div>
								<div class="col-md-8">
									<div class="cui-footer-company">
										<img class="cui-footer-company-logo"
											src="../components/dummy-assets/common/img/N-m.png"
											width="90" height="auto" title="#" /> <span> © 2019
											<a href="#" target="_blank">Powered by Nucigent
												Technology</a>

										</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="../vendors/data-table/datatables.min.js"></script>
	<script src="../vendors/data-table/dataTables.bootstrap.min.js"></script>
	<script src="../vendors/data-table/dataTables.buttons.min.js"></script>
	<script src="../vendors/data-table/buttons.bootstrap.min.js"></script>
	<script src="../vendors/data-table/jszip.min.js"></script>
	<script src="../vendors/data-table/pdfmake.min.js"></script>
	<script src="../vendors/data-table/vfs_fonts.js"></script>
	<script src="../vendors/data-table/buttons.html5.min.js"></script>
	<script src="../vendors/data-table/buttons.print.min.js"></script>
	<script src="../vendors/data-table/buttons.colVis.min.js"></script>
	<script src="../vendors/data-table/datatables-init.js"></script>
	<script src="../vendors/highchart/exporting.js"></script>
	<script src="../vendors/highchart/highcharts.js"></script>
	<script src="../pm/pm-report.js"></script>
	<script type="text/javascript">
		// Make monochrome colors
		var pieColors = (function() {
			var colors = [], base = Highcharts.getOptions().colors[0], i;

			for (i = 0; i < 10; i += 1) {
				// Start out with a darkened base color (negative brighten), and end
				// up with a much brighter color
				colors.push(Highcharts.Color(base).brighten((i - 3) / 7).get());
			}
			return colors;
		}());
		Highcharts
				.chart(
						'projectContainer',
						{
							chart : {
								plotBackgroundColor : null,
								plotBorderWidth : null,
								plotShadow : false,
								type : 'pie'
							},
							title : {
								text : 'Browser market shares at a specific website, 2014'
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
									name : 'Chrome',
									y : 61.41
								}, {
									name : 'Internet Explorer',
									y : 11.84
								}, {
									name : 'Firefox',
									y : 10.85
								}, {
									name : 'Edge',
									y : 4.67
								}, {
									name : 'Safari',
									y : 4.18
								}, {
									name : 'Other',
									y : 7.05
								} ]
							} ]
						});
	</script>
</body>
</html>