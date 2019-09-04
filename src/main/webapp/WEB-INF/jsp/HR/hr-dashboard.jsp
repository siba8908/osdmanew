<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>

<!-- CUSTOMJS -->

<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>


<div class="cui-layout"> 
		<jsp:include page="../layout/header.jsp"></jsp:include>
		
			<div class="cui-layout-content">

				<span class="font-size-18 d-block"> <span class="text-muted">Home
					</span> <strong>Human Resource</strong>

				</span>
			
				<div class="cui-utils-content">
					<!-- START: tables/datatables -->
					<div class="row">
						<div class="col-lg-6">
							<div class="cui-utils-sortable" id="left-col">
								<div class="card" data-order-id="card-3">
									<div class="card-header">
										<div class="pull-right cui-utils-sortable-control">
											<i class="icmn-minus mr-2 cui-utils-sortable-collapse"
												data-toggle="tooltip" data-placement="left" title=""
												data-original-title="Collapse"></i> <i
												class="icmn-plus mr-2 cui-utils-sortable-uncollapse"
												data-toggle="tooltip" data-placement="left" title=""
												data-original-title="Uncollapse"></i> <i
												class="icmn-cross cui-utils-sortable__close"
												data-toggle="tooltip" data-placement="left" title=""
												data-original-title="Remove"></i>
										</div>
										<div class="cui-utils-title">
											<strong>HR Management</strong>
										</div>
									</div>
									<div class="card-body">
										<div class="row">
											<div class="col-xl-6">
												<div class="cui-user-card px-3 py-5 mb-4">

													<a href="javascript: void(0);">
														<center>
															<img
																src="../components/dummy-assets/common/img/avatars/mix.jpg"
																alt="Alternative text to the image" />
														</center>
													</a>
													<div class="my-3 text-center">
														<div class="cui-user-card-user-name font-size-18"
															style="color: #FFF">Human Resource</div>
														<div class="cui-user-card-post" style="color: #FFF">Management</div>
													</div>

												</div>
											</div>
											<div class="col-xl-6">
												<div
													class="cui-info-card cui-info-card-white-font bg-default">
													<span class="cui-info-card-digit"> <i
														class="icmn-users"></i>
													</span>
													<div class="cui-info-card-desc">
														<a href="hr-add-employee"> <span
															class="cui-info-card-title" style="color: #FFF">Manage
																Employee</span>
															<p style="color: #FFF">Employee Management System</p>
														</a>
													</div>
												</div>
												<div
													class="cui-info-card cui-info-card-white-font bg-danger">
													<span class="cui-info-card-digit"> <i
														class="icmn-user"></i>
													</span>
													<div class="cui-info-card-desc">

														<a href="hr-show-employee-details"> <span
															class="cui-info-card-title" style="color: #FFF">Employee
																Details</span>
															<p style="color: #FFF">View all details about
																Employee</p>
														</a>
													</div>
												</div>
											</div>

										</div>
										<div class="cui-utils-margin-fix">
											<!-- -->
										</div>
									</div>
								</div>


							</div>
						</div>
						<div class="col-lg-6">
							<div class="cui-utils-sortable" id="right-col">


								<div class="card" data-order-id="card-1">
									<div class="card-header">
										<div class="pull-right cui-utils-sortable-control">
											<i class="icmn-minus mr-2 cui-utils-sortable-collapse"
												data-toggle="tooltip" data-placement="left" title=""
												data-original-title="Collapse"></i> <i
												class="icmn-cross cui-utils-sortable__close"
												data-toggle="tooltip" data-placement="left" title=""
												data-original-title="Remove"></i>
										</div>
										<div class="cui-utils-title">
											<strong>HR Key Features</strong>
										</div>

									</div>
									<div class="card-body">
										<div class="row">
											<div class="col-xl-6">
												<div
													class="cui-info-card cui-info-card-white-font bg-success">
													<span class="cui-info-card-digit"> <i
														class="icmn-star-empty"></i>
													</span>
													<div class="cui-info-card-desc">

														<a href="hr-appraisal"> <span
															class="cui-info-card-title" style="color: #FFF">Employee
																Appraisal</span>
															<p style="color: #FFF">Get your reward</p>
														</a>
													</div>
												</div>
											</div>
											<div class="col-xl-6">
												<div
													class="cui-info-card cui-info-card-white-font bg-primary">
													<span class="cui-info-card-digit"> <i
														class="icmn-credit-card"></i>
													</span>
													<div class="cui-info-card-desc">

														<a href="payrollSheet"> <span
															class="cui-info-card-title" style="color: #FFF">Salary
																Management</span>
															<p style="color: #FFF">All details about salary</p>
														</a>
													</div>
												</div>
											</div>

										</div>
										<div class="cui-utils-margin-fix">
											<!-- -->
										</div>
									</div>
								</div>




							</div>
						</div>
					</div>
					<!-- END: tables/datatables -->

					<!-- START: page scripts -->
					<script>
  ;(function($) {
    'use strict'
    $(function() {
      $('#example1').DataTable({
        responsive: true,
      })

      $('#example2').DataTable({
        autoWidth: true,
        scrollX: true,
        fixedColumns: true,
      })

      $('#example3').DataTable({
        autoWidth: true,
        scrollX: true,
        fixedColumns: true,
      })
    })
  })(jQuery)
</script>
					<!-- END: page scripts -->

				</div>
			</div>
			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>
</body>

</html>