<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- custom js -->
<script src="../vendors/customizedjs/letterOperation.js"></script>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading" style="display: none;"></div>
	<div class="cui-layout cui-layout-has-sider">

		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>

		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>



			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
				<div class="pull-right"></div>
				<span class="font-size-18 d-block"> <span class="text-muted">
				</span> <strong>Human resource</strong> <small class="text-muted"></small>
				</span> </nav>
				<div class="row">
					<div class="col-lg-12">
						<div class="mb-5">
							<form id="letterData">
								<table class="table table-hover nowrap">
									<thead>


									</thead>

									<tbody>
										<tr>
											<td><div class="col-md-9">
													<input type="text" class="form-control" name="recipentName"
														placeholder="Recipent Name" required />
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
											<!-- <td><div class="col-md-9">
												<input type="text" class="form-control" name="senderName"  />
											</div></td> -->
											<td><button type="button" class="btn btn-primary"
													onclick="LetterPreview()">Preview</button></td>
										</tr>
								</table>
							</form>

							<section class="card" id="PrintDiv">
							<div class="card-header">

								<div class="cui-login-block-sidebar-title">
									<img
										src="../components/dummy-assets/common/img/logo - Copy.png"
										width="154" height="82">


									<div class="pull-right">
										<b style="font-weight: 200:"> SUNJRAY INFO SYSTEM Pvt.
											Ltd. </b>
										<p>Address First Floor,1294(P) Gouri Complex</p>
										<p>CRP Square Bhubaneswar, Odisha 751012</p>
										<p>Phone: 0674 256 2506 | www.sunjray.com</p>


									</div>
									<br />




								</div>




							</div>
							<div class="card-header">
								<span class="cui-utils-title">
									<div class="cui-info-card cui-info-card-white-font bg-success">
										<strong>Offer Letter</strong>
									</div>
								</span>
							</div>


							<div class="card-body">
								<div class="row">
									<div class="col-lg-12">
										<!-- Headings -->
										<div class="mb-5">

											<h5 class="text-black">
												<strong>SUBJECT:Offer letter for Post of <b
													class="designation"></b></strong>
											</h5>
											<b class="recipentname"></b>

											<h4></h4>
											<h4></h4>
											<h4></h4>

											<p class="text-muted"></p>
											<h5>
												Dear Mr/Mrs <b class="recipentname"></b> :
												<p>
													We are pleased to offer you employment at <b><c:out
															value="${ol.companydetails.companyName}" /></b> ,We feel
													your skills and background will be valuable assets to our
													team. Per our discussion ,the position is <b
														class="designation"></b>.Your starting date will be <b
														class="doj"></b>.The enclosed employee handbook outline
													the medical and retirment benefit that our company offers.
													If you choose to accept this offer.Please sign the second
													copy of this letter in the space provided and return it to
													us.A stamped self-ad- dressed envelope for your
													convenience. We look forward to Welcome you as a new
													employee at <b><c:out
															value="${ol.companydetails.companyName}" /></b>
												</p>

											</h5>
											<h5>Sincerely</h5>
											<h5>
												<c:out value="${uname}" />
											</h5>
											<h5></h5>
											<h5>Enclose</h5>
										</div>
										<!-- End Headings -->
									</div>
								</div>
								<!-- End Body Copy -->
							</div>

							</section>
						</div>

						<p style="float: right">
							<a href="javascript: void(0);" class="btn btn-primary">Send</a>
							<button type="button" onclick="PrintElem('#PrintDiv')"
								class="btn btn-primary">Print</button>
							<!-- <a href="javascript: void(0);" class="btn btn-primary">Download</a> -->
						</p>
					</div>
				</div>
			</div>
</body>

</html>