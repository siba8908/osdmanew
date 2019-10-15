<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pc-leftmenu.jsp"></jsp:include>

		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project co-ordinator </strong> <small
						class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header"
							style="background-color: #FFF; color: #FFF">
							<span class="cui-utils-title"> <strong>Site
									Survey</strong>
							</span>
						</div>

						<div class="table-responsive mb-5">

							<table class="table table-hover" id="site-survey-table">
								<thead>

									<tr style="background-color: #09F">
										<th>Site Code</th>
										<th>Date of Survey</th>
										<th>File Upload</th>
										<th>Remark</th>
										<th>Add More</th>
									</tr>
								</thead>
								<tbody class="body-site-survey-table">
									<tr>
										<td><select
											class="form-control form-control-rounded siteCode"
											id="siteCode0">
												<option value="">Select</option>
										</select></td>

										<td><div class="form-group">
												<input type="text" class="form-control surveyDate"
													placeholder="Select Date" id="surveyDate0"
													data-toggle="datetimepicker" data-target="#surveyDate0" />
											</div></td>
										<td><div class="mb-5">
												<div class="form-group">
													<input type="file" name="img[]" class="file"
														id="fileImage0" onchange="imageLoad(this,0)"> <img
														class="image_preview" id="image_preview0" height="40px"
														src="components/dummy-assets/common/img/noimage.png">
													<div class="input-group col-xs-12">
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-picture"></i></span>
													</div>
												</div>
											</div></td>
										<td><input class="form-control form-control-rounded"
											id="remark0" type="text" placeholder=""
											style="margin-left: 5px" /></td>
										<td><button class="fa fa-plus btnAdd"
												style="height: 30px"></button></td>
									</tr>

								</tbody>
							</table>
							<a href="javascript: void(0);" class="btn btn-sm btn-primary"
								style="float: right" onclick="sendSiteSurvey()">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Save
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>
						</div>
					</section>

					<!-- END: forms/selectboxes -->

					<!-- START: page scripts -->
					<script>
						$(document).ready(function() {
							$('.surveyDate').datetimepicker({
								format : 'YYYY-DD-MM'
							})
						});
					</script>
					<!-- END: page scripts -->
				</div>
			</div>
<!-- 			<div class="cui-layout-footer">
				<div class="cui-footer">
					<div class="cui-footer-inner">
						<div class="cui-footer-top">
							<div class="row">
								<div class="col-lg-9 mb-3">
									<div class="mb-3">
										<strong></strong>
									</div>
									<div class="cui-footer-description">
										<p></p>

										<p></p>
									</div>
								</div>
							</div>
						</div>
						<div class="cui-footer-bottom">
							<div class="row">
								<div class="col-md-4"></div>
								<div class="col-md-8">
									<div class="cui-footer-company">

										<span> <br />

										</span>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
 -->		</div>
	</div>
	<script src="../pc/pc-site-servey.js"></script>
</body>
</html>