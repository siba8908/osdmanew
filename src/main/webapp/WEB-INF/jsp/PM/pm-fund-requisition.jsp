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
							·</span> <strong>Project Management</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header"
							style="background-color: #FFF; color: #FFF">
							<span class="cui-utils-title"> <strong>Daily Work
									Status</strong>
							</span>
						</div>

						<div class="table-responsive mb-3">

							<table class="table table-hover" id="pendingFundRequistionTable">
								<thead>

									<tr style="background-color: #09F">
										<th></th>
										<th>Sl No.</th>
										<th>Date</th>
										<th>Site Code</th>
										<th>Type of Work</th>
										<th>Amount Raised</th>
										<th>Description/Purpose</th>
										<th>Approved Amount</th>
										<th>Remarks</th>
									</tr>
								</thead>
								<tbody>
								</tbody>
							</table>
							<p>Note:After Paymentfrom AM,Notification will come on click
								Details page will be Display.</p>
							<div class="pull-right">

								<a href="javascript: void(0);"
									class="btn btn-sm btn-primary ml-10"
									onclick="updatePendindingFundRequistion()"> Save </a>
							</div>
						</div>


						<table class="table table-hover" id="pmMaterialRequestStatusTable">
							<thead>

								<tr style="background-color: #09F">
									<th>Sl No.</th>
									<th>Date</th>
									<th>Site Code</th>
									<th>Type of Work</th>
									<th>Project Type</th>
									<th>Description/Purpose</th>
									<th>Status</th>
								</tr>
							</thead>
							<tbody>
							</tbody>
						</table>
						<div class="modal fade" id="example1" tabindex="-1" role="dialog"
								aria-hidden="true">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header"></div>
										<div class="modal-body">
											<table class="table table-hover">
												<thead>

													<tr style="background-color: #09F">
														<th>Material For</th>
														<th>Item Name</th>
														<th>Quantity</th>
													</tr>
												</thead>
												<tbody class="body-mapped-product-table">

												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
						<p>Note:From Dispatch to Dispaly of Districtstore PM will
							track the Status of materials.</p>
					</section>
				</div>








				<!-- END: forms/selectboxes -->

				<!-- START: page scripts -->

				<!-- END: page scripts -->

			</div>
		</div>

		<div class="cui-footer-description">
			<p></p>

			<p></p>
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
	<script src="../pm/pm-fund-requisition.js"></script>
</body>

</html>