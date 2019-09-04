<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- customisedjs -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/customizedjs/raise_request.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>
		<div class="cui-layout"> 
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> 
						<span class="text-muted">Home</span>
						<strong>Account manager</strong> 
						<small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/basic-forms-elements -->
					<section class="card">
						<div class="card-header" style="background-color: #CCC">
							<span class="cui-utils-title"> 
								<strong>Daily Request Report</strong>
							</span>
						</div>
						<div class="card-body" style="background-color:#FFF">		  	
							<form id="formdata" >
								<table class="table table-hover nowrap" id="raiseRequestTable" >
									<thead>
				              			<tr style="background-color:#09f;r;font-weight:bold;">               
											<th>Supplier ID</th>
											<th>Bill No</th>
											<th>Date</th>
											<th>Site Code</th>
											<th>Amount</th>
											<th></th>
											<th></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
									<tfoot>
									</tfoot>
								</table>
							</form>
						</div>
					<!-- End Vertical Form -->
					</section>
				</div>
			</div>
			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>