<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<!--Customisedjs -->
<script src="../vendors/customizedjs/expences.js"></script>
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
	            	<div class="card-header" style="background-color:#CCC">
						<span class="cui-utils-title"> 
							<strong>Expences Details each Site code</strong>
						</span>
					</div>	
					<div class="card-body" style="background-color:#FFF">		  					
						<div class="mb-5">
							<div class="form-group row">
			                    <label class="col-md-3 col-form-label" for="l0">Site code:</label>
								<div>
									<select class="form-control" id="sitecode">
										<option>Select SiteCode</option>
										<c:forEach var="Code" items="${siteCode}">
											<option value="${Code.siteCodeId}">${Code.siteCode}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<table class="table table-hover nowrap" id="expenceTable" >
								<thead>
									<tr style="background-color: #09f; font-weight: bold">
										<th>Site Code</th>					
										<th>Site Survey</th>
										<th>Civil Stage</th>
										<th>Electrical Stage</th>
										<th>Installation & Commissioning Stage</th>
										<th>Performance Stage</th>	
										<th>Hand over Stage </th>
										<th>TOTAL</th>
									</tr>
								</thead>
								<tbody>
								</tbody>
								<tfoot>
								</tfoot>
							</table>
						</div>
					</div>	
					<!-- End Vertical Form -->
				</section>
			</div>
		</div>
		<jsp:include page="../layout/footer.jsp"></jsp:include>
	</div>
</div>
<body>
</html>