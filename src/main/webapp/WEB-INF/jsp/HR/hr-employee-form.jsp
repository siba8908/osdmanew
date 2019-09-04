
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOMJS -->
<script src="<c:url value='/vendors/customizedjs/employeeDetails.js'/>"></script>
<script
	src="<c:url value='/vendors/jquery.serilization/jquery.serializejson.min.js'/>"></script>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<%-- <jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include> --%>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<span class="font-size-18 d-block"> <span class="text-muted">Home</span>
						<strong>Single Employee Details </strong> <small
						class="text-muted"></small>
					</span>
				</nav>


				<div class="cui-utils-content">
					<!-- START: tables/basic-tables -->
					<section class="card">
						<div class="card-body">
							<div class="row">
								<div class="col-lg-12">
									<form name="empform" class="empform"
										enctype="multipart/form-data">
										<h5 class="text-black">
											<strong>EMPLOYEE DETAILS</strong>
										</h5>
										<div class="mb-5">
											<div class="accordion" id="accordion" role="tablist">
												<div class="card">
													<div class="card-header collapsed" role="tab"
														id="headingOne" data-toggle="collapse"
														data-parent="#accordion" data-target="#collapseOne"
														aria-expanded="true" aria-controls="collapseOne"
														style="background-color: #2188d1; padding: 20px;">
														<div class="card-title">
															<span class="accordion-indicator pull-right"> <i
																class="plus fa fa-plus"
																style="color: #fff; padding: 20px;"></i> <i
																class="minus fa fa-minus"
																style="color: #fff; padding: 20px;"></i>
															</span> <a> <span style="color: #FFF; margin-bottom: 10px;">Employee
																	Personal Information</span>
															</a>
														</div>
													</div>

													<div id="collapseOne" class="card-collapse collapse"
														aria-labelledby="headingOne">
														<br>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l0">First
																Name:</label>
															<div class="col-md-9">
																<input type="text" class="form-control" id="FName"
																	name="firstName" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l0">Last
																Name:</label>
															<div class="col-md-9">
																<input type="text" class="form-control" id="LName"
																	name="lastName" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Father's
																Name:</label>
															<div class="col-md-9">
																<input type="text" class="form-control" id="FatherName"
																	name="fatherName" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Date
																Of Birth:</label>
															<div class="col-md-9">
																<input type="date" class="form-control" id="dob"
																	name="dob" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Gender:</label>
															<div class="col-md-9">
																<input type="radio" name="gender" value="male">
																Male <input type="radio" name="gender" value="female">
																Female <input type="radio" name="gender" value="other">
																Other<br>
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Contact
																No</label>
															<div class="col-md-9">
																<input type="number" class="form-control" id="contactNo"
																	name="contactNo" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Marital
																Status:</label>
															<div class="col-md-9">
																<input type="radio" name="MaritalStatus" value="Married">
																Married <input type="radio" name="MaritalStatus"
																	value="Unmarried"> Unmarried <br>
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Religion:</label>

															<div class="col-md-9">
																<select class="form-control" name="Religion"
																	id="religion">
																	<option>Select Religion...</option>
																	<option value="Hinduism">Hinduism</option>
																	<option value="Islam">Islam</option>
																	<option value="Christianity">Christianity</option>
																	<option value="Sikhism">Sikhism</option>
																	<option value="Buddhism">Buddhism</option>
																	<option value="Jainism">Jainism</option>
																	<option value="Zoroastrianism">Zoroastrianism</option>
																	<option value="Others">Others</option>
																</select>
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Adhar
																No</label>
															<div class="col-md-9">
																<input type="text" class="form-control" id="adharNo"
																	name="adharNo" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Insurance
																policy</label>
															<div class="col-md-9">
																<input type="text" class="form-control"
																	id="InsurancePolicy" name="insurancePolicyNo" />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Salary</label>
															<div class="col-md-9">
																<input type="text" class="form-control" id="l0" disabled />
															</div>
														</div>
														<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Designation</label>
															<div class="col-md-9">
																<input type="text" class="form-control" id="l0" disabled />
															</div>
														</div>

													</div>

													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingTwo" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseTwo"
															aria-expanded="false" aria-controls="collapseTwo"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">Incase
																		of Emergency</span>
																</a>
															</div>
														</div>
														<div id="collapseTwo" class="card-collapse collapse"
															aria-labelledby="headingTwo">
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Contact
																	Person</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" id="ConPerson"
																		name="contactPerson" />
																</div>
															</div>
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Relationship</label>
																<div class="col-md-9">
																	<input type="text" class="form-control"
																		id="relationship" name="relationship" />
																</div>
															</div>
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Contact
																	No</label>
																<div class="col-md-9">
																	<input type="number" class="form-control" id="ContactNo"
																		name="relContactNo" />
																</div>
															</div>
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Blood
																	Group:</label>

																<div class="col-md-9">
																	<select class="form-control" name="BloodGroup"
																		id="BGroup">
																		<option>Select Blood Group...</option>
																		<option value="A+">A+</option>
																		<option value="A-">A-</option>
																		<option value="B+">B+</option>
																		<option value="B-">B-</option>
																		<option value="O+">O+</option>
																		<option value="O-">O-</option>
																		<option value="AB+">AB+</option>
																		<option value="AB-">AB-</option>
																	</select>
																</div>
															</div>
														</div>
													</div>

													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingThree" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseThree"
															aria-expanded="false" aria-controls="collapseThree"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">
																		Employee Address Information</span>
																</a>
															</div>
														</div>
														<div id="collapseThree" class="card-collapse collapse"
															aria-labelledby="headingThree">
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Village/at:</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" id="village"
																		name="village" />
																</div>
															</div>
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Post:</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" id="post"
																		name="post" />
																</div>
															</div>
															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Police
																	Station:</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" id="Pstation"
																		name="station" />
																</div>
															</div>
																<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">State:</label>
															<div class="col-md-9">
															<select class="form-control " id="state"
																>
																<option>Select State</option>
																<c:forEach var="showState" items="${showState}">
																	<option value="${showState.state}">${showState.stateName}</option>
																</c:forEach>
															</select>
															</div>
															</div>
															
															<div class="form-group row">
															<label class="col-md-3 col-form-label" for="l10">Dist:</label>
															<div class="col-md-9">
															<select class="form-control " id="dist"
																>
																<option>Select District</option>
																<c:forEach var="showDist" items="${showDist}">
																	<option value="${showDist.dist}">${showDist.distName}</option>
																</c:forEach>
															</select>
															</div>
															</div>

															<div class="form-group row">
																<label class="col-md-3 col-form-label" for="l10">Pin:</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" id="pin"
																		name="pin" />
																</div>
															</div>
														</div>
													</div>



													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingThree" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseFour"
															aria-expanded="false" aria-controls="collapseFour"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">
																		Employee Education Details</span>
																</a>
															</div>
														</div>


														<div id="collapseFour" class="card-collapse collapse"
															aria-labelledby="headingThree">

															<table class="table table-hover nowrap" id="example1">
																<thead>
																	<tr>
																		<th>Education</th>
																		<th>Name of board/University</th>
																		<th>Passing year</th>
																		<th>Percentage</th>
																		<th>Upload Document</th>
																	<tr>
																</thead>
																<tbody>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					id="1steducation" name="empEducation[][education]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					id="1stuniversity"
																					name="empEducation[][educationUniversity]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					id="1stPyear" name="empEducation[][passingYear]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					name="empEducation[][percent]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" class="dropify"
																					name="empEducation[][docFile]" />
																			</div></td>
																	</tr>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					id="2ndeducation" name="empEducation[][education]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					id="2nduniversity"
																					name="empEducation[][educationUniversity]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					id="2ndPyear" name="empEducation[][passingYear]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					name="empEducation[][percent]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" class="dropify"
																					name="empEducation[][docFile]" />
																			</div></td>
																	</tr>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empEducation[][education]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empEducation[][educationUniversity]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empEducation[][passingYear]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empEducation[][percent]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" class="dropify"
																					name="empEducation[][docFile]" />
																			</div></td>
																	</tr>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					name="empEducation[][education]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					name="empEducation[][educationUniversity]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					name="empEducation[][passingYear]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control"
																					name="empEducation[][percent]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" name="empEducation[][docFile]"
																					class="dropify" />
																			</div></td>
																	</tr>
																</tbody>
															</table>
														</div>

													</div>
													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingThree" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseFive"
															aria-expanded="false" aria-controls="collapseFive"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">
																		Employee Experience Information</span>
																</a>
															</div>
														</div>
														<div id="collapseFive" class="card-collapse collapse"
															aria-labelledby="headingThree">
															<h5 class="text-black">
																<strong>Experience</strong>
															</h5>

															<td><strong>Years</strong></td>
															<th>
															<td><input type="text" id="Year" /></td>
															</th>

															<td><strong>Months</strong></td>
															<th>
															<td><input type="text" id="Months" /></td>
															</th>


															<table class="table table-hover nowrap" id="example1">
																<thead>
																	<tr>
																		<th>Name of Organization</th>
																		<th>Designation</th>
																		<th>Joining Date</th>
																		<th>Relieving Date</th>
																		<th>Contact No</th>
																		<th>Upload Document</th>
																	<tr>
																</thead>
																<tbody>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empExperience[][organisationName]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empExperience[][designation]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="date" class="form-control" id="l0"
																					name="empExperience[][joiningDate]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="date" class="form-control" id="l0"
																					name="empExperience[][relievingDate]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="number" class="form-control" id="l0"
																					name="empExperience[][orgContactNo]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" class="dropify" />
																			</div></td>

																	</tr>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empExperience[][organisationName]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empExperience[][designation]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="date" class="form-control" id="l0"
																					name="empExperience[][joiningDate]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="date" class="form-control" id="l0"
																					name="empExperience[][relievingDate]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="number" class="form-control" id="l0"
																					name="empExperience[][orgContactNo]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" class="dropify" />
																			</div></td>

																	</tr>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empExperience[][organisationName]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" id="l0"
																					name="empExperience[][designation]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="date" class="form-control" id="l0"
																					name="empExperience[][joiningDate]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="date" class="form-control" id="l0"
																					name="empExperience[][relievingDate]" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="number" class="form-control" id="l0"
																					name="empExperience[][orgContactNo]" />
																			</div></td>
																		<td><div class="mb-3">
																				<input type="file" class="dropify" />
																			</div></td>

																	</tr>

																</tbody>

															</table>
														</div>
													</div>
													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingTwo" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseSix"
															aria-expanded="false" aria-controls="#collapseSix"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">Last
																		Job Document</span>
																</a>
															</div>
														</div>
														<div id="collapseSix" class="card-collapse collapse"
															aria-labelledby="headingTwo">
															<table class="table table-hover nowrap" id="example1">
																<thead>
																	<tr>
																		<td><strong>Offer Letter</strong></td>
																		<th>
																		<td><div class="mb-1">
																				<input type="file" class="dropify" />
																			</div></td>
																		</th>
																	</tr>

																	<td><strong>Payslip</strong></td>
																	<th>
																	<td><div class="mb-1">
																			<input type="file" class="dropify" />
																		</div></td>
																	</th>
															</table>
														</div>
													</div>







													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingTwo" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseSeven"
															aria-expanded="false" aria-controls="#collapseSeven"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">Employee
																		Document to upload</span>
																</a>
															</div>
														</div>
														<div id="collapseSeven" class="card-collapse collapse"
															aria-labelledby="headingTwo">
															<table class="table table-hover nowrap" id="example1">

																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">Update
																		CV/Reume</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																		1
																	</div>
																</div>
															</table>

															<table class="table table-hover nowrap" id="example1">
																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">Recent
																		Passport Copy</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																	</div>
																</div>
															</table>
															<table class="table table-hover nowrap" id="example1">
																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">ID
																		Proofs Document</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																	</div>
																</div>
															</table>
															<table class="table table-hover nowrap" id="example1">
																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">Adhar
																		Card</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																	</div>
																</div>
															</table>
															<table class="table table-hover nowrap" id="example1">
																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">Driving
																		Licence</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																	</div>
																</div>
															</table>
															<table class="table table-hover nowrap" id="example1">
																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">Voter
																		ID Card</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																	</div>
																</div>
															</table>
															<table class="table table-hover nowrap" id="example1">
																<div class="form-group row">
																	<label class="col-md-3 col-form-label" for="l10">PAN
																		Card</label>
																	<div class="col-md-2">
																		<div class="mb-1">
																			<input type="file" class="dropify" />
																		</div>
																	</div>

																</div>

															</table>
														</div>
													</div>


													<div class="card">
														<div class="card-header collapsed" role="tab"
															id="headingTwo" data-toggle="collapse"
															data-parent="#accordion" data-target="#collapseEight"
															aria-expanded="false" aria-controls="#collapseEight"
															style="background-color: #2188d1; padding: 20px;">
															<div class="card-title">
																<span class="accordion-indicator pull-right"> <i
																	class="plus fa fa-plus"
																	style="color: #fff; padding: 20px;"></i> <i
																	class="minus fa fa-minus"
																	style="color: #fff; padding: 20px;"></i>
																</span> <a> <span style="color: #FFF; margin-bottom: 10px;">Employee
																		Account Details</span>
																</a>
															</div>
														</div>
														<div id="collapseEight" class="card-collapse collapse"
															aria-labelledby="headingTwo">
															<table class="table table-hover nowrap" id="example1">
																<thead>
																	<tr>
																		<th>Account Holder Name</th>
																		<th>AccountNo</th>
																		<th>Bank Name</th>
																		<th>IFSC Code</th>
																	</tr>
																</thead>
																<tbody>
																	<tr>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" name="holderName" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" name="accountNo" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" name="bankName" />
																			</div></td>
																		<td><div class="col-md-9">
																				<input type="text" class="form-control" name="ifscCode" />
																			</div></td>
																	</tr>
															</table>
														</div>
													</div>
													<br>
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="form-controler">
							<div class="pull-right">
								<button type="button" class="btn btn-primary" id="btnSave">Send</button>
							</div>
						</div>
					</section>
				</div>
			</div>
			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>
