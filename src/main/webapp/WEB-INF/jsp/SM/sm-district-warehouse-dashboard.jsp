<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/sm-leftmenu.jsp"></jsp:include>

		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Store Manager </strong> <small class="text-muted"></small>
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
										<strong>District Warehouse</strong>
									</h3>
									<br />
									<h5 style="color: #066; font-family: 'Arial Black', Gadget">
										<strong>Dashboard</strong>
									</h5>
									<p class="text-muted">
										<code></code>
									</p>
									<div class="table-responsive mb-6">
										<table class="table table-hover table-bordered">
											<thead>
												<tr
													style="background-color: #09F; text-align: center; font-weight: bold">
													<th>Serial No</th>
													<th>Date</th>
													<th>Product Code</th>
													<th>Description</th>
													<th>Quantity</th>

												</tr>
											</thead>
											<tbody>
												<tr style="color: #06C; text-align: center">
													<td>01</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init" data-toggle="datetimepicker"
														data-target="#datepicker-only-init" /></td>
													<td>001</td>
													<td>Description</td>
													<td>20</td>
												</tr>
												<tr style="color: #06C; text-align: center">
													<td>02</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init1" data-toggle="datetimepicker"
														data-target="#datepicker-only-init1" /></td>
													<td>002</td>
													<td>Description</td>
													<td>30</td>

												</tr>
												<tr style="color: #06C; text-align: center">
													<td>03</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init2" data-toggle="datetimepicker"
														data-target="#datepicker-only-init2" /></td>
													<td>003</td>
													<td>Description</td>
													<td>35</td>
												</tr>
												<tr style="color: #06C; text-align: center">
													<td>04</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init3" data-toggle="datetimepicker"
														data-target="#datepicker-only-init3" /></td>
													<td>004</td>
													<td>Description</td>
													<td>40</td>
												</tr>
											</tbody>

										</table>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- END: tables/basic-tables -->

					<!-- START: page scripts -->
					<script>
						;
						(function($) {
							'use strict'
							$(function() {
								$('#example1').DataTable({
									responsive : true,
								})

								$('#example2').DataTable({
									autoWidth : true,
									scrollX : true,
									fixedColumns : true,
								})

								$('#example3').DataTable({
									autoWidth : true,
									scrollX : true,
									fixedColumns : true,
								})
							})
						})(jQuery)

						;
						(function($) {
							'use strict'
							$(function() {
								$('#datepicker-only-init').datetimepicker({
									icons : {
										time : 'fa fa-clock-o',
										date : 'fa fa-calendar',
										up : 'fa fa-arrow-up',
										down : 'fa fa-arrow-down',
										previous : 'fa fa-arrow-left',
										next : 'fa fa-arrow-right',
									},
									format : 'LL',
								})

								$('#datepicker-only-init1').datetimepicker({
									icons : {
										time : 'fa fa-clock-o',
										date : 'fa fa-calendar',
										up : 'fa fa-arrow-up',
										down : 'fa fa-arrow-down',
										previous : 'fa fa-arrow-left',
										next : 'fa fa-arrow-right',
									},
									format : 'LL',
								})

								$('#datepicker-only-init2').datetimepicker({
									icons : {
										time : 'fa fa-clock-o',
										date : 'fa fa-calendar',
										up : 'fa fa-arrow-up',
										down : 'fa fa-arrow-down',
										previous : 'fa fa-arrow-left',
										next : 'fa fa-arrow-right',
									},
									format : 'LL',
								})

								$('#datepicker-only-init2').datetimepicker({
									icons : {
										time : 'fa fa-clock-o',
										date : 'fa fa-calendar',
										up : 'fa fa-arrow-up',
										down : 'fa fa-arrow-down',
										previous : 'fa fa-arrow-left',
										next : 'fa fa-arrow-right',
									},
									format : 'LL',
								})
								$('#datepicker-only-init3').datetimepicker({
									icons : {
										time : 'fa fa-clock-o',
										date : 'fa fa-calendar',
										up : 'fa fa-arrow-up',
										down : 'fa fa-arrow-down',
										previous : 'fa fa-arrow-left',
										next : 'fa fa-arrow-right',
									},
									format : 'LL',
								})
							})
						})(jQuery)
					</script>
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
	<div class="modal fade" id="modal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header"></div>
				<div class="modal-body">
					<label class="col-md-3 col-form-label" for="l1">Remarks:</label>
					<div class="col-md-7">
						<input type="hidden" class="form-control" id="workStatusId" /> <input
							type="text" class="form-control" id="remark" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-info" onclick="updateRemark()">Submit</button>
					<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
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
	<script src="../pc/pc-daily-work-status.js"></script>
</body>
</html>