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
									<table class="table table-hover table-bordered" id="siteLocationReportTable">
										<thead>
											<tr style="background-color: #06F; font-weight: bold">
												<th>Sl No.</th>
												<th><strong>Site Code</strong></th>
												<th><strong>Site
														Name(Disteict:Block:Panchayat)</strong></th>
												<th><strong>Longitude</strong></th>
												<th>Latitude</th>
												<th>Action</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
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
	<script src="../pm/pm-site-location.js"></script>
</body>

</html>