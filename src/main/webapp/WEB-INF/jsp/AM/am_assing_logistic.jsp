<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="<c:url value='/vendors/customizedjs/assignlogistics.js'/>"></script>

<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>

<div class="cui-layout"> 
		<jsp:include page="../layout/header.jsp"></jsp:include>
		
	<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">

					<span class="font-size-18 d-block"> <span class="text-muted">Home
							</span> <strong> Account Management</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
				<div id="message" style='margin-left:20%'></div>
					<!-- START: forms/basic-forms-elements -->
					<section class="card">
						<div class="card-header"
							style="background-color: #09f; color: #FFF">
							<span class="cui-utils-title"> <strong style="color:white">Assign
									Logistic</strong>
							</span>
						</div>
						<div class="card-body">
						<form id="logisticsForm">
							<div class="row">
								<div class="col-lg-12">
									<div class="mb-5">
										<h5 class="text-black">
											<strong></strong>
										</h5>

										<!-- Horizontal Form -->
										

											<div class="form-group row" id="ConsignmentNo">
												<label class="col-md-3 col-form-label" for="l10">Consignment
													No:</label>
												<div class="col-md-3">
													<select class="form-control" id="select">
													<option>Select Consignment No</option>
														<c:forEach var="ConsignmentDetails"
															items="${showConsignmentDetails}">
															<option value="${ConsignmentDetails.consignmentId}">${ConsignmentDetails.consignmentNo}</option>
														</c:forEach>
													</select>

												</div>
											</div>

											<div class="form-group row">
												<label class="col-md-3 col-form-label" for="l10">Logistic
													Id:</label>
												<div class="col-md-3">
													<select class="form-control " id="myselect">
													<option>Select Logistic Id</option>
														<c:forEach var="LogisticsDetails"
															items="${showLogisticsDetails}">
															<option value="${LogisticsDetails.providerId}">${LogisticsDetails.providerName}</option>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-md-3 col-form-label" for="l10">Vechile
													No:</label>
												<div class="col-md-3">
													<input type="text" class="form-control" id="VechileNo" />
												</div>
											</div>
											<div class="form-group row">
												<label class="col-md-3 col-form-label" for="l10">LR
													No:</label>
												<div class="col-md-3">
													<input type="text" class="form-control" id="LRNo" />
												</div>
											</div>

											<div class="form-group row">
												<label class="col-md-3 col-form-label" for="l10">E-Way
													Bill No:</label>
												<div class="col-md-3">
													<input type="text" class="form-control" id="E-WayBillNo" />
												</div>
											</div>


											<div class="form-group row">
												<label class="col-md-3 col-form-label" for="l10">Expected
													Arrival:</label>
												<div class="col-md-3">
													<input type="DATE" class="form-control"
														id="ExpectedArrival" />
														<div>
										<div >
												<button style="margin-left:200px;margin-top:30px" type="button" class="btn btn-primary" id="Save">Save</button>

											</div>
											</div>
									</div>
									
										</div>
									</div>

									<!-- End Horizontal Form -->
								</div>
							</div>
							</form>
						</div>
						</section>
				</div>

				<!-- End Vertical Form -->
			
			</div>
			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>



	
	
</body>

</html>




