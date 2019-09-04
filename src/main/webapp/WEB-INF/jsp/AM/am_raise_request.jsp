<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/dataTables.min.js"></script>
<script src="<c:url value='/vendors/customizedjs/raiserequest.js'/>"></script>
<!-- customisedjs -->

<script src="../vendors/customizedjs/raiserequest.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>

<div class="cui-layout"> 
		<jsp:include page="../layout/header.jsp"></jsp:include>
		
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							</span> <strong>Account manager</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/basic-forms-elements -->
					<section class="card">

<div class="card-header"
							style="background-color: #09f; color: #FFF">
							<span class="cui-utils-title"> <strong style="color:white">Supplier / Contractor / Logistic
									</strong>
							</span>
						</div>
<!-- 						<div class="card-header"> -->
<!-- 							<span class="cui-utils-title"> <strong>Supplier/Contracter/Logistic</strong> -->
							
<!-- 							</span> -->
							
<!-- 						</div> -->
						<div id="message" style='margin-left:20%'></div>
						<!-- Horizontal Form -->
						<div class="card-body">
							<form id="formdata" >
								

										<!-- End Sizing -->
										<!-- </div>
										</div> -->
										<div class="form-group row">
										
											<!-- <label class="col-md-3 col-form-label" for="l13">Select
											Type</label>
 -->
											<div class="col-md-3">
											
												<select class="form-control" id="myselect">
												<option>Select Service Provider Type</option>
												<c:forEach var="providerType" items="${providerDetails}">
												<option value="${providerType.serviceProviderId}">${providerType.serviceProviderType}</option>
												</c:forEach>
													
													
												</select>
												
											</div>
												<div class="col-md-3">
								<input type='text' class="pull-right form-control" id='purpose' placeholder='Purpose' />
								<div id="purposevalidation"></div>
										</div>
												
</div>
											<table class="table table-hover nowrap" id="accounManagerTable" >
												<thead>
													<tr style="background-color: #FCC; font-weight: bold">


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