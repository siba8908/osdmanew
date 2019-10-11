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
							·</span> <strong>Project Management </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: tables/basic-tables -->
					<section class="card">
						<div class="card-header"></div>
						<div class="row">
							<div class="col-lg-12">
								<h3 class="text-black">
									<strong>Create Site Code</strong>
								</h3>
								<p class="text-muted">
									<code></code>
								</p>
								<div class="table-responsive mb-6">
									<table class="table table-hover table-bordered" id="site-code-table">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><strong>Project Name</strong></th>
												<th><strong>Type of Station</strong></th>
												<th>Site Code</th>
												<th>Site Name(District:Block:Panchayat)</th>
												<th>Add More</th>
											</tr>
										</thead>
										<tbody class="body-site-code-table">

											<tr style="color: #06C; text-align: center">
												<td>
													<div>
														<select class="form-control" id="projectName0">
															<option value="">Select Project Name</option>
														</select>
													</div>
												</td>
												<td>
													<div>
														<select class="form-control" id="stationType0">
															<option value="">Select Station Type</option>
														</select>
													</div>
												</td>
												<td><input type="text" placeholder="Enter Site Code"
													class="form-control siteCode" id="siteCode0"></td>
												<td><input type="text" placeholder="Enter Site Name"
													class="form-control" id="siteName0"></td>
												<td><button class="fa fa-plus btnAdd"
														style="height: 30px"></button></td>
											</tr>

										</tbody>

									</table>
									<a href="javascript: void(0);" class="btn btn-sm btn-primary"
										style="float: right" onclick="saveSiteCode()">
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Save
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
								</div>

							</div>
						</div>
					</section>
					<!-- END: tables/basic-tables -->

					<!-- START: page scripts -->

					<!-- END: page scripts -->

				</div>
			</div>
		</div>
	</div>
	<script src="../pm/pm-create-site-code.js"></script>
</body>
</html>