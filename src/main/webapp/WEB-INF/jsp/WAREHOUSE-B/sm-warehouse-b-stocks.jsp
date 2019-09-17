<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/warehouse-b-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Store Manager</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title"> <strong> WAREHOUSE
									B</strong><br>
								<h3 style="color: #09F; font-family: 'Arial Black', Gadget">
									<strong>STOCKS</strong>
								</h3>
							</span>
						</div>
						<div class="card-body" style="background-color: #CCC">
							<div class="row">
								<div class="col-lg-12" style="margin-left: 80px;">

									<div class="table-responsive mb-6">
										<table id="warehouseBStockInReportTable"
											class="table table-hover table-bordered ">
											<thead>
												<tr
													style="background-color: #06F; text-align: center; font-weight: bold;">


													<th>S No.</th>
													<th>Product Code</th>
													<th>Product Name</th>
													<th>Location</th>
													<th>Status</th>

												</tr>
											</thead>
											<tbody>
											</tbody>
											<tfoot>

											</tfoot>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div class="card-body" style="background-color: #CCC">
							<h3 style="color: #09F; font-family: 'Arial Black', Gadget">Stock
								Out</h3>
							<div class="row">
								<div class="col-lg-12" style="margin-left: 80px;">

									<div class="table-responsive mb-6">
										<table class="table table-hover" id="wbMaterialRequestTable">
											<thead>

												<tr style="background-color: #09F">
													<th>Serial</th>
													<th>Station Type</th>
													<th>Material For</th>
													<th>Site Code</th>
													<th>Status</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody>
											</tbody>
											<tfoot>
										</table>
									</div>
								</div>
							</div>
						</div>
					</section>
				</div>
				<div class="modal fade" id="example1" tabindex="-1" role="dialog"
					aria-hidden="true">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header"></div>
							<div class="modal-body">
								<table class="table table-hover">
									<thead>

										<tr style="background-color: #09F">
											<th>Select</th>
											<th>Item Name</th>
											<th>Quantity</th>
											<th>Product Code</th>
										</tr>
									</thead>
									<tbody class="body-mapped-product-table">

									</tbody>
								</table>
							</div>
							<div class="modal-footer">
								<a href="javascript: void(0);" class="btn btn-sm btn-primary"
									style="float: right" onclick="saveStockOut()">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Save
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- END: tables/datatables -->

			<!-- START: page scripts -->

			<!-- END: page scripts -->
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
						<div class="col-md-4"></div>
						<div class="col-md-8">
							<div class="cui-footer-company">

								© 2019 <a href="#" target="_blank">Powered by Nucigent
									Technology</a>
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
	<script src="../warehouseB/sm-warehouse-b-stocks.js"></script>
</body>

</html>