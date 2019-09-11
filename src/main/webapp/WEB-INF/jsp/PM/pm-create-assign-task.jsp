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
									<strong>Create Project</strong>
								</h3>
								<p class="text-muted">
									<code></code>
								</p>
								<div class="table-responsive mb-6">
									<div class="form-group row"></div>
									<table class="table table-hover table-bordered" id="create-assign-task-table">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><strong>Project Name</strong></th>
												<th><strong>Site code</strong></th>
												<th><strong>Type of Station</strong></th>
												<th><strong>Task Name</strong></th>
												<th><strong>Work Stage</strong></th>
												<th><strong>Team Name</strong></th>
												<th><strong>Start Date</strong></th>
												<th><strong>End Date</strong></th>
												<th><strong>Budget</strong></th>
												<th>Add More</th>
											</tr>
										</thead>
										<tbody class="body-create-team-task-table">
											<tr style="color: #06C; text-align: center">
												<td><select class="form-control projectName"
													id="projectName0">
														<option value="">Select Project</option>
												</select></td>
												<td><select class="form-control siteCode"
													id="siteCode0">
														<option value="">Select Site Code</option>
												</select></td>
												<td><select class="form-control stationType"
													id="stationType0">
														<option value="">Select Station Type</option>
												</select></td>
												<td><select class="form-control taskName"
													id="taskName0">
														<option value="">Select Task</option>
												</select></td>
												<td><select class="form-control workStage"
													id="workStage0">
														<option value="">Select Work Stage</option>
												</select></td>
												<td><select class="form-control teamName"
													id="teamName0">
														<option value="">Select Team</option>
												</select></td>
												<td><div class="form-group">
														<input type="text" class="form-control startDate"
															placeholder="Start Date" id="startDate0"
															data-toggle="datetimepicker" data-target="#startDate0" />
													</div></td>

												<td><div class="form-group">
														<input type="text" class="form-control endDate"
															placeholder="End Date" id="endDate0"
															data-toggle="datetimepicker" data-target="#endDate0" />
													</div></td>

												<td><input type="number" id="budget0"></td>
												<td><button class="fa fa-plus btnAdd"
														style="height: 30px"></button></td>
											</tr>
										</tbody>

									</table>

									<div class="pull-right">

										<a href="javascript: void(0);"
											class="btn btn-sm btn-primary ml-10" onclick="saveAssignTask()"> Save </a>
									</div>
									<p>
										<strong>Note:Notification Will go to team members.</strong>
									</p>
								</div>
								<h3>
									<strong>Display Task Search Site Code</strong>
								</h3>
								<table class="table table-hover table-bordered"
									id="pmTeamTaskReportTable">
									<thead>
										<tr style="background-color: #06F; font-weight: bold">
											<th><strong>Sl No.</strong></th>
											<th><strong>Site code</strong></th>
											<th><strong>Type of Station</strong></th>
											<th><strong>Task Name</strong></th>
											<th><strong>Work Stage</strong></th>
											<th><strong>Team Name</strong></th>

											<th><strong>Start Date</strong></th>
											<th>End Date</th>
											<th><strong>Budget</strong></th>
											<th><strong>Status</strong></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
						</div>
					</section>
					<!-- END: tables/basic-tables -->

					<!-- START: page scripts -->
					<script>
						$(document).ready(function() {
							$('.startDate,.endDate').datetimepicker({
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
									<div class="cui-footer-description"></div>
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
	<script src="../pm/pm-create-assign-task.js"></script>
</body>

</html>