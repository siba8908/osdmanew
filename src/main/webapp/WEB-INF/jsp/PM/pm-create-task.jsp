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
						<div class="tab" role="tabpanel">
							<!-- Nav tabs -->
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active"><a href="#Section1"
									aria-controls="home" role="tab" data-toggle="tab">Create
										Task</a></li>
								<li role="presentation"><a href="#Section2"
									aria-controls="profile" role="tab" data-toggle="tab">View
										Task </a></li>
							</ul>
							<div class="tab-content tabs">
								<div role="tabpanel" class="tab-pane active" id="Section1">
									<div class="card-header"
										style="background-color: #FFF; color: #FFF">
										<span class="cui-utils-title"> <strong>Create
												Task :</strong>
										</span>
									</div>
									<table class="table table-hover table-bordered"
										id="create-task-table">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th><strong>Task Name</strong></th>
												<th><strong>Work Stage</strong></th>
												<th>Duration</th>
												<th>Add More</th>
											</tr>
										</thead>
										<tbody class="body-create-task">
											<tr>
												<td><input type="text" class="form-control"
													id="taskName0"></td>
												<td><select class="form-control workStage"
													id="workStage0">
														<option value="">Select Work Stage</option>
												</select></td>
												<td><input type="number" class="form-control"
													id="duration0"></td>
												<td><button class="fa fa-plus btnAdd"
														style="height: 30px"></button></td>
											</tr>
										</tbody>

									</table>
									<a href="javascript: void(0);" class="btn btn-sm btn-primary"
										style="float: right" onclick="saveTask()">
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Save
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="Section2">
									<div class="card-header"
										style="background-color: #FFF; color: #FFF">
										<span class="cui-utils-title"> <strong>View
												Task :</strong>
										</span>
									</div>
									<div class="table-responsive mb-3">
										<table class="table table-hover table-bordered"
											id="masterTaskReportTable">
											<thead>
												<tr style="background-color: #06F; font-weight: bold">
													<th><strong>Sl No</strong></th>
													<th><strong>Task Name</strong></th>
													<th><strong>Work Stage</strong></th>
													<th>Duration</th>
													<th>Add More</th>
												</tr>
											</thead>
											<tbody>
											</tbody>

										</table>

									</div>
								</div>
							</div>
							<div class="modal fade" id="updateTaskModal" role="dialog">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header"></div>
										<div class="modal-body">
											<table class="table table-hover">
												<thead>
													<tr>
														<th>Task Name</th>
														<th>Work Stage</th>
														<th>Duration</th>
													</tr>
												</thead>
												<tbody class="body-update-task-table">
													<tr>
														<td><input type="text" class="form-control"
															id="taskName">
															<input type="hidden" class="form-control"
															id="taskId">
															</td>
														<td><select class="form-control workStage"
															id="workStage">
																<option value="">Select Work Stage</option>
														</select></td>
														<td><input type="number" class="form-control"
															id="duration"></td>
													</tr>
												</tbody>
											</table>
											<a href="javascript: void(0);" class="btn btn-sm btn-primary"
										style="float: right" onclick="updateTask()">
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Update
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- END: tables/basic-tables -->

					<!-- START: page scripts -->

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
													width="90" height="auto" title="#" /> <span> ©
													2019 <a href="#" target="_blank">Powered by Nucigent
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
	<script src="../pm/pm-create-task.js"></script>
</body>

</html>