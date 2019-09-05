<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/logistics-leftmenu.jsp"></jsp:include>

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
										<strong>Logistics</strong>
									</h3>
									<br />
									<h5 style="color: #066; font-family: 'Arial Black', Gadget">
										<strong>Order Tracking Details</strong>
									</h5>
									<p class="text-muted">
										<code></code>
									</p>
									<div class="table-responsive mb-5">

										<table
											class="table table-hover nowrap editable-table table-bordered "
											id="trackDetailstable">
											<thead>
												<tr style="background-color: #09F">
													<th>Sl No</th>
													<th style="text-align: center">Consignment No</th>
													<th style="">Item Names</th>
													<th>Quantity</th>
													<th>Vehicle No</th>
													<th>E-Way Bill</th>
													<th>Lr Details</th>
													<th>Expected Delivery Date</th>
													<th>Actual Delivery Date</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td class="txt1">32564</td>
													<td>Material Description</td>
													<td class="txt1">5</td>
													<td>oD02AB0000</td>
													<td class="txt1">321064</td>
													<td>Lr Details</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init" data-toggle="datetimepicker"
														data-target="#datepicker-only-init" /></td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init1" data-toggle="datetimepicker"
														data-target="#datepicker-only-init1" /></td>
													<td>11:00AM</td>
												</tr>
												<tr>
													<td class="txt1">32587</td>
													<td>Material Description</td>
													<td class="txt1">5</td>
													<td>oD02AB0001</td>
													<td class="txt1">321065</td>
													<td>Lr Details</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init3" data-toggle="datetimepicker"
														data-target="#datepicker-only-init3" /></td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init4" data-toggle="datetimepicker"
														data-target="#datepicker-only-init4" /></td>
													<td>11:00AM</td>
												</tr>
												<tr>
													<td class="txt1">54879</td>
													<td>Material Description</td>
													<td class="txt1">7</td>
													<td>oD02AB0002</td>
													<td class="txt1">32548</td>
													<td>Lr Details</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init5" data-toggle="datetimepicker"
														data-target="#datepicker-only-init5" /></td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init6" data-toggle="datetimepicker"
														data-target="#datepicker-only-init6" /></td>
													<td>11:00AM</td>
												</tr>
												<tr>
													<td class="txt1">32569</td>
													<td>Material Description</td>
													<td class="txt1">8</td>
													<td>oD02AB003</td>
													<td class="txt1">321546</td>
													<td>Lr Details</td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init7" data-toggle="datetimepicker"
														data-target="#datepicker-only-init7" /></td>
													<td class="txt1"><input type="text"
														class="form-control" placeholder="Select Date"
														id="datepicker-only-init8" data-toggle="datetimepicker"
														data-target="#datepicker-only-init8" /></td>
													<td>11:00AM</td>
												</tr>
											</tbody>

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
	<script src="vendors/data-table/datatables.min.js"></script>
	<script src="vendors/data-table/dataTables.bootstrap.min.js"></script>
	<script src="vendors/data-table/dataTables.buttons.min.js"></script>
	<script src="vendors/data-table/buttons.bootstrap.min.js"></script>
	<script src="vendors/data-table/jszip.min.js"></script>
	<script src="vendors/data-table/pdfmake.min.js"></script>
	<script src="vendors/data-table/vfs_fonts.js"></script>
	<script src="vendors/data-table/buttons.html5.min.js"></script>
	<script src="vendors/data-table/buttons.print.min.js"></script>
	<script src="vendors/data-table/buttons.colVis.min.js"></script>
	<script src="vendors/data-table/datatables-init.js"></script>
	<script src="logistics/logistics-order-track.js"></script>
</body>
</html>