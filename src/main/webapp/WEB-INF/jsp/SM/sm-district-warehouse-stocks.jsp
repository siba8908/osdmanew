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

								<h4 style="color: #09F; font-family: 'Arial Black', Gadget">
									<strong>STOCKS</strong>
								</h4>
							</span>
						</div>
						<div class="card-body" style="background-color: #CCC">
							<div class="row">
								<div class="col-lg-12">


									<div class="table-responsive mb-5">
										<strong
											style="color: #FFF; font-family: 'Arial Black', Gadget">Stock
											In </strong>
										<table class="table table-hover nowrap editable-table"
											id="example1">
											<thead>
												<tr
													style="background-color: #09F; text-align: center; font-weight: bold;">
													<th style=""><strong>Sl No</strong></th>
													<th style=""><strong>Inward Date</strong></th>
													<th><strong>Consigner</strong></th>
													<th><strong>Consignee</strong></th>
													<th><strong>Material Manufacture Code</strong></th>
													<th><strong>Material Description</strong></th>
													<th><strong>Storage Location</strong></th>
													<th><strong>Quantity</strong></th>
												</tr>
											</thead>
											<tbody>
												<tr>


													<td class="txt1">01</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">10001</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">18</td>
												</tr>
												<tr>
													<td class="txt1">02</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init1"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">10002</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">12</td>
												</tr>
												<tr>
													<td class="txt1">03</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init2"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init2" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">10003</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">11</td>
												</tr>
												<tr>
													<td class="txt1">04</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init3"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init3" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">10004</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td class="txt1">4</td>
												</tr>
											</tbody>

										</table>
									</div>
								</div>
							</div>
							<div class="pull-right">
								<a href="javascript: void(0);" class="btn btn-sm btn-primary">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
							</div>

						</div>
						<div class="form-control"></div>
						<div class="card-body" style="background-color: #CCC">
							<div class="row">
								<div class="col-lg-12">


									<div class="table-responsive mb-5">
										<strong
											style="color: #FFF; font-family: 'Arial Black', Gadget">Stock
											Out </strong>
										<table class="table table-hover nowrap editable-table"
											id="example1">
											<thead>
												<tr
													style="background-color: #09F; text-align: center; font-weight: bold;">
													<th style=""><strong>Sl No</strong></th>
													<th style=""><strong>Outward Date</strong></th>
													<th><strong>Consigner</strong></th>
													<th><strong>Consignee</strong></th>
													<th><strong>Material Manufacture Code</strong></th>
													<th><strong>Material Description</strong></th>
													<th><strong>Storage Location</strong></th>
													<th><strong>Quantity</strong></th>
												</tr>
											</thead>
											<tbody>
												<tr>


													<td class="txt1">01</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init4"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init4" /></td>
													<td class="txt1">Consigner</td>
													<td class="txt1">Consignee</td>
													<td class="txt1">10001</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
												</tr>
												<tr>
													<td class="txt1">02</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init5"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init5" /></td>
													<td class="txt1">Consigner</td>
													<td class="txt1">Consignee</td>
													<td class="txt1">10002</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
												</tr>
												<tr>
													<td class="txt1">03</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init6"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init6" /></td>
													<td class="txt1">Consigner</td>
													<td class="txt1">Consignee</td>
													<td class="txt1">10003</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
												</tr>
												<tr>
													<td class="txt1">04</td>
													<td><input type="text" class="form-control"
														placeholder="Select Date" id="datepicker-only-init7"
														data-toggle="datetimepicker"
														data-target="#datepicker-only-init7" /></td>
													<td class="txt1">Consigner</td>
													<td class="txt1">Consignee</td>
													<td class="txt1">10004</td>
													<td class="txt1">Mat Desc</td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
													<td><input type="text" class="form-control"
														placeholder="" id="l1" /></td>
												</tr>
											</tbody>

										</table>
									</div>
								</div>
							</div>
							<div class="pull-right">
								<a href="javascript: void(0);" class="btn btn-sm btn-primary">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
							</div>

						</div>

					</section>



					<!-- END: tables/editable-tables -->

					<!-- START: page scripts -->
					<script>
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

							$('#datepicker-only-init4').datetimepicker({
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

						$('#datepicker-only-init5').datetimepicker({
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

						$('#datepicker-only-init6').datetimepicker({
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

						$('#datepicker-only-init7').datetimepicker({
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

						(jQuery)
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