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
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="tab" role="tabpanel">
							<!-- Nav tabs -->
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active"><a href="#Section1"
									aria-controls="home" role="tab" data-toggle="tab" onclick = "fetchAllTeams()">View Team</a></li>
								<li role="presentation"><a href="#Section2"
									aria-controls="profile" role="tab" data-toggle="tab"  onclick = "fetchDetailsForCreateTeam()">Create
										Team </a></li>
							</ul>
							<div class="tab-content tabs">
								<div role="tabpanel" class="tab-pane active" id="Section1">
									<div class="card-header"
										style="background-color: #FFF; color: #FFF">
										<span class="cui-utils-title"> <strong>View
												Teams :</strong>
										</span>
									</div>
									<table class="table table-hover" id="pmTeamTable">
										<thead>
											<tr style="background-color: #09F">
												<th>Sl No.</th>
												<th>Team Name</th>
												<th>Action</th>
											</tr>
										</thead>
										<tbody>
											<!-- <tr>
												<td>1</td>
												<td>xxx</td>
												<td></td>
											</tr>
											<tr>
												<td>2</td>
												<td><a href ="#" data-toggle='modal' data-target='#modal'>yyy </a></td>
												<td><button type="button" class="btn btn-info mr-2 mb-2">Update</button></td>
											</tr> -->
										</tbody>
									</table>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="Section2">
									<div class="card-header"
										style="background-color: #FFF; color: #FFF">
										<span class="cui-utils-title"> <strong>Create
												Team :</strong>
										</span>
									</div>

									<div class="table-responsive mb-3">
										<table class="table table-hover table-bordered" >
											<thead>
												<tr style="background-color: #09F; font-weight: bold">

													<th>Create Team</th>
													<th colspan="4" style="text-align: center">Resources</th>


												</tr>
											</thead>
											<tbody>
												<tr style="background-color: #CCC; font-weight: bold">
													<td></td>
													<td>Project co-ordinator</td>
													<td>Site engineer</td>
													<td>Site Manager</td>
													<td>Site Assistant</td>
												</tr>
												<tr>
													<td><input class="form-control form-control-rounded"
														type="text" placeholder="Enter team name" id="teamName"
														style="height: auto;" /></td>
													<td><select
														class="form-control form-control-rounded pc"
														style="margin-left: 5px" required id="projectCoordinator">
															<option value="">Select PC</option>
													</select></td>
													<td><select
														class="form-control form-control-rounded se"
														style="margin-left: 5px" required id="siteEngineer">
															<option value="">Select site engineer</option>
													</select></td>
													<td><select
														class="form-control form-control-rounded sm"
														style="margin-left: 5px" required id="siteManager1">
															<option value="">Select site manager</option>
													</select></td>
													<td><select
														class="form-control form-control-rounded sa"
														style="margin-left: 5px" required id="siteAssistance1">
															<option value="">Select site assistance</option>
													</select></td>
												</tr>
												<tr>
													<td></td>
													<td></td>
													<td></td>
													<td><select
														class="form-control form-control-rounded sm"
														style="margin-left: 5px" required id="siteManager2">
															<option value="">Select site manager</option>
													</select></td>
													<td><select
														class="form-control form-control-rounded sa"
														style="margin-left: 5px" required id="siteAssistance2">
															<option value="">Select site assistance</option>
													</select></td>
												</tr>
											</tbody>
										</table>

										<div style="float: right; margin-right: 15px;">
											<button type="button" class="btn btn-info mr-2 mb-2"
												onclick="createTeam()">Save</button>
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
	<div class="modal fade" id="modal" tabindex="-1"
		role="dialog" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content" style="width: 650px; margin-left: -80px;">
				<div class="modal-header">
					<h4> Team : <span id="selectedTeamName"></span></h4>
				</div>
				<div class="modal-body">
					<table class="table table-hover" id="teamMembersTable">
						<thead>
							<tr style="background-color: #09F">
								<th>Sl No.</th>
								<th>Employee Name</th>
								<th>Employee Code</th>
								<th>Designation</th>
							</tr>
						</thead>
						<tbody>
							<!-- <tr>
								<td>1</td>
								<td>xxx</td>
								<td>Accepted</td>
								<td></td>
							</tr>
							<tr>
								<td>2</td>
								<td>yyy</td>
								<td>Rejected</td>
								<td><button type="button" class="btn btn-info mr-2 mb-2">Update</button></td>
							</tr> -->
						</tbody>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="projectMemberModal" tabindex="-1"
		role="dialog" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content" style="background-color: #7ed5d5;">
				<div class="modal-header">
					<Strong>Assign employee from project:</Strong>
				</div>
				<div class="modal-body">
					<div class="row">
						<input type="hidden" class="form-control" id="currentEmployeeId" />
						<input type="hidden" class="form-control" id="assignmentId" /> <select
							class="form-control form-control employeeList"
							style="margin: 20px" id="employeeId">
							<option value="">Select Employee</option>
						</select>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-info"
						onclick="updateTeamEmployee()">Save</button>
					<button id="projectMemberModalCloseButton" type="button"
						class="btn btn-danger" data-dismiss="modal">Close</button>
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
	<script src="../pm/pm-create-team.js"></script>
</body>
</html>