<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pc-leftmenu.jsp"></jsp:include>

		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project co-ordinator </strong> <small
						class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header"
							style="background-color: #FFF; color: #FFF">
							<span class="cui-utils-title"> <strong>Material
									Request</strong>
							</span>
						</div>

						<div class="table-responsive mb-3">

							<table class="table table-hover" id="material-request-table">
								<thead>

									<tr style="background-color: #09F">
										<th>Station Type</th>
										<th>Work Stage</th>
										<th>Site Code</th>
										<th>Products</th>
										<th>More</th>
									</tr>
								</thead>
								<tbody class="body-material-request-table">
									<tr>
										<td><div class="col-md-9">
												<select class="form-control" id="stationType0">
													<option value="">Select Station Type</option>
												</select>
											</div></td>
										<td><div class="col-md-9">
												<select class="form-control" id="workStage0">
													<option value="">Select Work Stage</option>
												</select>
											</div></td>
										<td><div class="col-md-9">
												<select class="form-control" id="siteCode0">
													<option value="">Select Site Code</option>
												</select>
											</div></td>
										<td>
											<button type="button" class="btn btn-default mr-2 mb-2"
												data-toggle="modal" data-target="#example1"
												onclick="fetchProduct(0)">Verify</button>
										</td>
										<td><button class="fa fa-plus btnAdd"
												style="height: 30px"></button></td>
									</tr>
								</tbody>
							</table>
							<a href="javascript: void(0);" class="btn btn-sm btn-primary"
								style="float: right" onclick="sendMaterialRequest()">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Save
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
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
						</div>
					</section>
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
	<script src="../pc/pc-material-request.js"></script>
</body>
</html>