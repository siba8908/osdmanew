<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>

<!-- Mirrored from cleanuitemplate.com/admin/html/preview/versions/menu-left/forms-selectboxes.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Apr 2019 09:16:51 GMT -->


<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">

		<div id="includedContent"></div>
<jsp:include page="../layout/pc-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
		<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project co-ordinator </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header"
							style="background-color: #FFF; color: #FFF">
							<span class="cui-utils-title"> <strong>Letter of
									clearance/Handover</strong>
							</span>
						</div>

						<div class="table-responsive mb-5">

							<table class="table table-hover" id="letter_clearance_table">
								<thead>
									<tr style="background-color: #09F">
										<th>Site Code</th>
										<th>Type of Letter</th>
										<th>Date</th>
										<th>Upload File</th>
										<th></th>
									</tr>
								</thead>
								<tbody >
									<tr>
										<td><select class="form-control form-control-rounded siteCode" style="margin-left: 5px" required
											id="siteCode0">
											<option value="">Select site code</option>
											</select></td>
										<td><select class="form-control form-control-rounded letterType" style="margin-left: 5px" required
											id="letterType0">
											<option value="">Select letter type</option>
											</select></td>
										<td><div class="form-group">
												<input type="text" class="form-control submitDate"
													placeholder="Select Date" id="submitDate0"
													data-toggle="datetimepicker" data-target="#submitDate0" required/>
											</div></td>
										<td><div class="mb-5">
												<div class="form-group">
													<input type="file" name="img[]" class="file"  id="fileImage0" onchange="imageLoad(this,0)"
														required> <img class="image_preview" height="40px" id="image_preview0"
														src="components/dummy-assets/common/img/noimage.png">
													<div class="input-group col-xs-12">
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-picture"></i></span>
													</div>
												</div>
											</div></td>
										<td>
											<button class="fa fa-plus btnAdd" style="height: 30px" onclick = "addRow()"></button>
										</td>
									</tr>
								</tbody>
								<tfoot>
							</table>
							<div style="float: right; margin-right: 32px;">
								<button type="button" class="btn btn-info mr-2 mb-2"
												onclick="submitLetterClearance()">Submit</button>
								<button type="reset" class="btn btn-danger mr-2 mb-2">Cancel</button>
							</div>
							
						</div>
					</section>

					<!-- END: forms/selectboxes -->

					<!-- START: page scripts -->

					<script>
						$(document).ready(function() {
							$('.submitDate').datetimepicker({
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
	<script src="../osdmajs/common.js"></script>
	<script src="../pc/pc-letter-of-clearance.js"></script>
</body>
</html>