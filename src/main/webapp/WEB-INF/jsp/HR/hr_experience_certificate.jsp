
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="<c:url value='/vendors/customizedjs/letterOperation.js'/>"></script>
<script src="<c:url value='/vendors/customizedjs/appoinmentLetter.js'/>"></script>

<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>

		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted"></span>
						<strong>Human resource</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: layout/typography -->
					<form id="letterData">
						<table class="table table-hover nowrap">
							<thead>


							</thead>

							<tbody>
								<tr>
									<td><div class="col-md-9">
											<input type="text" class="form-control" name="recipentName"
												placeholder="Recipent Name" />
										</div></td>

									<td>
										<div class="col-md-9">

											<select class="form-control" name="designation">
												<option>Select Designation</option>
												<c:forEach items="${ol.designationlist}" var="designation">

													<option>${designation.designationName}</option>
												</c:forEach>
											</select>
										</div>
									</td>
									<th>Select DOJ:</th>
									<td><input type="date" class="form-control"
										placeholder="Select Date" name="doj" /></td>

									<td><button type="button" class="btn btn-primary"
											onclick="letterPreviewData()">Preview</button></td>
								</tr>
							</tbody>
						</table>
					</form>
					<section class="card" id="PrintDiv">


						<div class="card-header">

							<div class="cui-login-block-sidebar-title">
								<img src="../components/dummy-assets/common/img/logo - Copy.png"
									width="154" height="82"> <strong> </strong>

								<div class="pull-right">
									<p style="font-weight: 200:">SUNJRAY INFO SYSTEM Pvt. Lmt.
									</p>
									<p>Address First Floor,1294(P) Gouri Complex</p>
									<p>CRP Square Bhubaneswar, Odisha 751012</p>
									<p>Phone: 0674 256 2506 | www.sunjray.com</p>


								</div>
								<br />




							</div>




						</div>

						<!-- <section class="card"> -->


						<div class="card-header">
							<span class="cui-utils-title">
								<div class="cui-info-card cui-info-card-white-font bg-success">
									<strong>Experience Certificate</strong>
								</div>
							</span>
						</div>
						<div class="card-body">
							<div class="row">
								<div class="col-lg-12">
									<!-- Headings -->
									<div class="mb-5">

										<h5 class="text-black">
											<strong>SUBJECT:Experience Certificate</strong>
										</h5>
										<h4 class="recipentname"></h4>
									</div>
									<div>
										<p>
											<strong><h4>To whomsoever it may Concern:</h4></strong>
										</p>
									</div>


									<p>
										This is to certify that Mr./Mrs <b class="recipentname"></b>is
										employed in our company(<b class="companyName">${ol.companydetails.companyName}</b>)
										since(<b class="doj"></b>) up to present .He/She has requested
										this experience letter. Mr./Ms.<b class="recipentname"></b>was
										a great employee in our company. We were very proud of
										him/her.For further inquiry and verification.feel free to
										contact our office.I have given all of our contact and emailId
										so you can contact us in any way you are comfortable with.
									</p>

									<h5>Sincerely</h5>
									<h5>
										<c:out value="${uname}" />
									</h5>

									<h5>Enclose</h5>
								</div>
							</div>
						</div>
					</section>

					<p style="float: right">
						<button class="btn btn-primary">Send</button>
						<button type="button" onclick="PrintElem('#PrintDiv')"
							class="btn btn-primary">Print</button>
<!-- 						<a href="javascript: void(0);" class="btn btn-primary">Download</a> -->
					</p>

				</div>


			</div>
		</div>
	</div>
</body>
</html>