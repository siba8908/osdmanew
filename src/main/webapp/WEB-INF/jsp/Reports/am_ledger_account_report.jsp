<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- customisedjs -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/customizedjs/ledger.js"></script>
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
							<strong>Supplier / Contractor / Logistic</strong>
						</span>
					</div>
					<div class="card-body" style="background-color:#FFF">		  					
						<div class="mb-5">
							<form id="formdata" >
								<div class="form-group row">
									<div class="col-md-3">
										<select class="form-control" id="myselect">
											<option>Select Service Provider Type</option>
											<c:forEach var="providerType" items="${providerDetails}">
												<option value="${providerType.serviceProviderId}">${providerType.serviceProviderType}</option>
											</c:forEach>
										</select>
									</div>
								</div>		
	                        	<table class="table table-hover nowrap" id="ledgerAccountTable" >
									<thead>
				              			<tr style="background-color:#09f;r;font-weight:bold;">               
											<th>Supplier Name</th>
											<th>Bill Date</th>
											<th>Bill Amount</th>
											<th>Payment Date</th>
											<th>Payment Amount</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
									<tfoot>
									</tfoot>
								</table>
							</form>
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