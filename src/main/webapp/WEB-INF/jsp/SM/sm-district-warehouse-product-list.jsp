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
							·</span> <strong>Store Manager</strong> <small class="text-muted"></small>
					</span>
				</nav>

				<div class="row"></div>
				<div class="row"></div>
				<!-- START: tables/datatables -->
				<br>
				<div class="row">
					<div class="col-lg-10" style="margin-left: 80px;">
						<h3 class="text-black">
							<strong>District Warehouse</strong>
						</h3>
						<br />
						<h5 style="color: #066; font-family: 'Arial Black', Gadget">
							<strong>Product List</strong>
						</h5>
						<p class="text-muted">
							<code></code>
						</p>
						<div class="table-responsive mb-6">
							<table class="table table-hover table-bordered ">
								<thead>
									<tr
										style="background-color: #09F; text-align: center; font-weight: bold;">
										<th>Serial No</th>
										<th>Issuing Date</th>
										<th>Product Code</th>
										<th>Description</th>
										<th>Quantity</th>
										<th>Panchayat Code</th>
										<th>Vehicle No</th>
										<th>LR No</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="txt1">01</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init" /></td>
										<td>pumim001</td>
										<td>Description</td>
										<td class="txt1">5</td>
										<td class="txt1">2233</td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
									</tr>
									<tr>
										<td class="txt1">02</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init1"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init1" /></td>
										<td>pumim002</td>
										<td>Description</td>
										<td class="txt1">5</td>
										<td class="txt1">2733</td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
									</tr>
									<tr>
										<td class="txt1">03</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init2"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init2" /></td>
										<td>pumim003</td>
										<td>Description</td>
										<td class="txt1">15</td>
										<td class="txt1">7865</td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
									</tr>
									<tr>
										<td class="txt1">04</td>
										<td class="txt1"><input type="text" class="form-control"
											placeholder="Select Date" id="datepicker-only-init3"
											data-toggle="datetimepicker"
											data-target="#datepicker-only-init3" /></td>
										<td>pumim004</td>
										<td>Description</td>
										<td class="txt1">12</td>
										<td class="txt1">4233</td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>
										<td><input type="text" class="form-control"
											placeholder="" id="l1" class="txt1" /></td>

									</tr>


								</tbody>
								<tfoot>

								</tfoot>
							</table>
							<a href="javascript: void(0);" class="btn btn-sm btn-primary"
								style="float: right">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-12">
						<div class="mb-5"></div>
					</div>
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