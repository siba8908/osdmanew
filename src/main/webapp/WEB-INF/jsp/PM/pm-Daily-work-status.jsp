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
							·</span> <strong>Project co-orinator </strong> <small
						class="text-muted"></small>
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

						<div class="table-responsive mb-3">

							<table class="table table-hover" id="pmDailyWorkStatusTableTable">
								<thead>

									<tr style="background-color: #09F">
										<th>Sl No.</th>
										<th>Site Code</th>
										<th>Task Work</th>
										<th>Work Status</th>
										<th>Remarks</th>
										<th>Image</th>
										<th>Verified by</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>
						</div>
					</section>
				</div>
			</div>
		</div>
	</div>

	<!-- END: forms/selectboxes -->

	<!-- START: page scripts -->

	<!-- END: page scripts -->

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
	<script src="../pm/pm-daily-work-status.js"></script>
</body>
</html>