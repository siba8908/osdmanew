<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/warehouse-a-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							�</span> <strong>Welcome </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: tables/basic-tables -->
					<section class="card">
						<div class="card-header"></div>
						<div class="card-body">
							<div class="row"></div>
							<div class="row"></div>
							<div class="row"></div>
							<div class="row">
								<div class="col-lg-12">
									<h3 class="text-black">
										<strong>WAREHOUSE-A</strong>
									</h3>
									<br />
									<h4 style="color: 066; font-family: 'Arial Black', Gadget">
										<strong>Stock-In Report</strong>
									</h4>
									<p class="text-muted">
										<code></code>
									</p>
									<div class="table-responsive mb-6">
										<table class="table table-hover table-bordered"
											id="warehouseAStockInReportTable">
											<thead>
												<tr
													style="background-color: #06F; text-align: center; font-weight: bold">
													<th>Serial</th>
													<th>Consignment No</th>
													<th>Part No</th>
													<th>Material Name</th>
													<th>Quantity</th>
													<th>Storage Location</th>
												</tr>
											</thead>
											<tbody>

											</tbody>
											<tfoot>
												<tr>

												</tr>
											</tfoot>
										</table>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- END: tables/basic-tables -->

				</div>
			</div>
			<div class="cui-layout-footer">
				<div class="cui-footer">
					<div class="cui-footer-inner">
						<div class="cui-footer-top">
							<div class="row">
								<div class="col-lg-9 mb-3">
									<div class="mb-3">
										<strong></strong>
									</div>
									<div class="cui-footer-description">
										<p></p>

										<p></p>
									</div>
								</div>
							</div>
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
											width="90" height="auto" title="#" /> <span> � 2019 <a
											href="#" target="_blank">Powered by Nucigent Technology</a>

										</span>
									</div>
								</div>
							</div>
						</div>
						<a href="javascript: void(0);" class="cui-utils-scroll-top"
							onclick="$('body, html').animate({'scrollTop': 0}, 500)"><i
							class="icmn-arrow-up"></i></a>
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
	<script src="../warehouseA/stock_in_report.js"></script>
</body>
</html>