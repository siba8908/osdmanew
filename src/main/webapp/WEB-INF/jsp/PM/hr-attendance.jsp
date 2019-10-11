<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- Mirrored from cleanuitemplate.com/admin/html/preview/versions/menu-left/forms-selectboxes.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Apr 2019 09:16:51 GMT -->
<!-- CUSTOM JS -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script>
<script src="../vendors/customizedjs/attendance.js"></script>

<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pm-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<span class="font-size-18 d-block"> <span class="text-muted">Home</span>
						<strong>Human Resource </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title"> <strong>Attendance</strong>
							</span>
						</div>
						<div class="row" style="margin: 10px">
							<div class="col-lg-4">
								<div class="row">
									<div class="col-lg-5">
										<select class="form-control" id="year">
											<option value="" selected>Select Year</option>
											<option value="2019">2019</option>
											<option value="2018">2018</option>
											<option value="2017">2017</option>
											<option value="2016">2016</option>
											<option value="2015">2015</option>
										</select>
									</div>
									<div class="col-lg-5">
										<select class="form-control" id="month">
											<option value="" selected>Select Month</option>
											<option value="1">January</option>
											<option value="2">February</option>
											<option value="3">March</option>
											<option value="4">April</option>
											<option value="5">May</option>
											<option value="6">June</option>
											<option value="7">July</option>
											<option value="8">August</option>
											<option value="9">September</option>
											<option value="10">October</option>
											<option value="11">November</option>
											<option value="12">December</option>
										</select>
									</div>
									<div class="col-lg-2">
										<button class="btn btn-primary" onclick="fetchAttendance()">Search</button>
									</div>
								</div>
							</div>
						</div>
						<div class="table-responsive mb-5">
							<div class="row">
								<table class="table table-hover" id="attendanceReportTable">
								</table>
							</div>
						</div>
					</section>
				</div>
			</div>
			<jsp:include page="../layout/footer.jsp"></jsp:include>
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
	<script src="../pm/hr-attendance.js"></script>
</body>
</html>