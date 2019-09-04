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
							·</span> <strong>Project co-ordinator </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header"
							style="background-color: #FFF; color: #FFF">
							<span class="cui-utils-title"> <strong>Fund
									Request</strong>
							</span>
						</div>

						<div class="table-responsive mb-5">

							<table class="table table-hover" id = "fund_request_table">
								<thead>

									<tr style="background-color: #09F">
										<th>Site Code</th>
										<th>Stage of Work</th>
										<th>Amount</th>
										<th>Purpose</th>
										<th>Remark</th>
										<th></th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><select class="form-control form-control-rounded siteCode" style="margin-left: 5px" required
											id="siteCode0">
											<option value="">Select site code</option>
											</select>
											</td>

										<td><select class="form-control form-control-rounded workStage" style="margin-left: 5px" required
											id="workStage0">
											<option value="">Select stage</option>
											</select></td>
											
										<td><input class="form-control form-control-rounded"
											type="text" placeholder="Enter amount" id="amount0" style="margin-left: 5px" /></td>
										<td><input class="form-control form-control-rounded"
											type="text" placeholder="Enter purpose" id="purpose0" style="margin-left: 5px" /></td>
										<td><input class="form-control form-control-rounded"
											type="text" placeholder="Enter remark here" id="remark0" style="margin-left: 5px" /></td>
										<td></td>
										<td>
											<button class="fa fa-plus btnAdd" style="height: 30px" onclick = "addRow()"></button>
										</td>
									</tr>
								</tbody>
							</table>
							<div style="float: right; margin-right: 32px;">
								<button type="button" class="btn btn-info mr-2 mb-2"
												onclick="sendFundRequest()">Save</button>
							</div>
						</div>
					</section>
						<!-- END: forms/selectboxes -->

						
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
	<script src="../pc/pc-fund-request.js"></script>
</body>
</html>