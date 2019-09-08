<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/district-warehouse-leftmenu.jsp"></jsp:include>

		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">

					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Store Manager</strong>

					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: tables/editable-tables -->


					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title"> <strong>DISTRICT
									WAREHOUSE</strong><br>
							</span>
							<h4 style="color: #09F; font-family: 'Arial Black', Gadget">
									<strong>STOCKS</strong>
								</h4>
						</div>
						<div class="card-body" style="background-color: #CCC">
							<div class="row">
								<div class="col-lg-12">
									<div class="table-responsive mb-5">
										<h4
											style="color: #FFF; font-family: 'Arial Black', Gadget">Stock
											In </h4>
										<table class="table table-hover table-bordered"
											id="stockInTable">
											<thead>
												<tr
													style="background-color: #09F; font-weight: bold;">
													<th style=""><strong>Sl No</strong></th>
													<th><strong>Product Name</strong></th>
													<th><strong>Product Code</strong></th>
													<th><strong>Quantity</strong></th>
												</tr>
											</thead>
											<tbody>
												
											</tbody>

										</table>
									</div>
								</div>
							</div>
						</div>
						<div class="form-control"></div>
						<div class="card-body" style="background-color: #CCC">
							<div class="row">
								<div class="col-lg-12">
									<div class="table-responsive mb-5">
										<h4
											style="color: #FFF; font-family: 'Arial Black', Gadget">Stock
											Out </h4>
										<table class="table table-hover nowrap table-bordered"
											id="stockOutTable">
											<thead>
												<tr
													style="background-color: #09F; text-align: center; font-weight: bold;">
													<th style=""><strong>Sl No</strong></th>
													<th><strong>Request ID</strong></th>
													<th><strong>Product Name</strong></th>
													<th><strong>Product Code</strong></th>
													<th><strong>Quantity</strong></th>
													<th><strong>Location</strong></th>
												</tr>
											</thead>
											<tbody>
												
											</tbody>

										</table>
									</div>
								</div>
							</div>
						</div>

					</section>
					<!-- END: tables/editable-tables -->

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

										<span> <br />

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
	<div class="modal fade" id="addLocationModal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<Strong>Add storage location:</Strong>
				</div>
				<div class="modal-body">
					<div class="col-md-12">
						<input type="hidden" class="form-control" id="stockOutId" />
						<input type="text" class="form-control" id="storageLocation" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-info" onclick="updateStorageLocation()">Save</button>
					<button id ="modalCloseButton" type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
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
	<script src="../dw/stocks.js"></script>
</body>
</html>