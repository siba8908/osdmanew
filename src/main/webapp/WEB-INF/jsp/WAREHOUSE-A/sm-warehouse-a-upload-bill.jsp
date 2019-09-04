<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include><body
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
							<strong>WAREHOUSE-A</strong>
						</h3>
						<br />
						<h4 style="color: 066; font-family: 'Arial Black', Gadget">
							<strong>Bill Upload</strong>
						</h4>
						<p class="text-muted">
							<code></code>
						</p>
						<div class="mb-8">
							<table class="table table-hover nowrap table-bordered"
								id="example1">
								<thead>
									<tr
										style="background-color: FCC; text-align: center; font-weight: bold">
										<th>Invoice No</th>
										<th>Consignment Number</th>
										<th>Logistics</th>
										<th>Bill Amount</th>
										<th>Invoice Date</th>
										<th>Site Code</th>
										<th>Upload Link</th>

									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="text" class="form-control"
											placeholder="" id="invoiceNumber" /></td>
										<td><select class="form-control" id="consignmentNumber"><option value="">Select</option></select></td>
										<td><select class="form-control" id="logistics"><option value="">Select</option></select></td>
										<td><input type="text" class="form-control"
											placeholder="" id="billAmount" /></td>
										<td><input type="text" class="form-control"
											placeholder="Select Date" id="invoiceDate"
											data-toggle="datetimepicker"
											data-target="#invoiceDate" /></td>
									    <td><select class="form-control" id="siteCode"><option value="">Select</option></select></td>
										<td><input type="file"id="fileImage" onchange="imageLoad(this)"> <img
														class="image_preview" id="image_preview" height="40px"
														src="components/dummy-assets/common/img/noimage.png">
													<div class="input-group col-xs-12">
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-picture"></i></span>
													</div></td>

									</tr>
								</tbody>
								<tfoot>

								</tfoot>
							</table>
							<a href="javascript: void(0);" class="btn btn-sm btn-primary"
								style="float: right" onclick="uploadBill()">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
						</div>
						<div class="row">
							<div class="col-lg-12">
								<div class="mb-5"></div>
							</div>
						</div>
					</div>
					<!-- END: tables/datatables -->

					<!-- START: page scripts -->
					<script>
						$(document).ready(function() {
							$('#invoiceDate').datetimepicker({
								format : 'YYYY-DD-MM'
							})
						});
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
						<a href="javascript: void(0);" class="cui-utils-scroll-top"
							onclick="$('body, html').animate({'scrollTop': 0}, 500)"><i
							class="icmn-arrow-up"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="../warehouseA/uploadBill.js"></script>
</body>
</html>