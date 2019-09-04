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
							<span class="cui-utils-title"> <strong>Daily Work
									Status</strong>
							</span>
						</div>

						<div class="table-responsive mb-5">
							<table class="table table-hover" id="pcDailyWorkStatusTable">
								<thead>
									<tr style="background-color: #09F">
										<th>Sl No.</th>
										<th>Site Code</th>
										<th>Uploaded By</th>
										<th>Assigned Work</th>
										<th>Work Status</th>
										<th>Image</th>
										<th>Remark</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<!-- <tr>
										<td>1</td>
										<td>1234</td>
										<td>Lipirekha</td>
										<td>Work Type</td>
										<td>Work Status</td>
										<td>Image0</td>
										<td>
											<button type="button" class="btn btn-success mr-2 mb-2"
												data-toggle="modal" data-target="#example1">Verify</button>
										</td>
									</tr> -->
								</tbody>
							</table>
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
	<div class="modal fade" id="modal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header"></div>
				<div class="modal-body">
					<label class="col-md-3 col-form-label" for="l1">Remarks:</label>
					<div class="col-md-7">
						<input type="hidden" class="form-control" id="workStatusId" />
						<input type="text" class="form-control" id="remark" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-info" onclick="updateRemark()">Submit</button>
					<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
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