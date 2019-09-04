<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOM JS -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script>

<script src="../vendors/customizedjs/LeaveManagement.js"></script>

<!-- Mirrored from cleanuitemplate.com/admin/html/preview/versions/menu-left/forms-selectboxes.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Apr 2019 09:16:51 GMT -->

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
					<span class="font-size-18 d-block"> <span class="text-muted">Home</span> <strong>Human Resource </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/selectboxes -->
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title"> <strong>Leave
									Management</strong>
							</span>
						</div>
						<h6 style="margin-left: 29px;">
							<STRONG>Planned Leave Status </STRONG>
						</h6>
			
						<form name="leaveform" id="leaveform">
							

								<table class="table table-hover" id="field">
									<thead>
										<tr>
											<td></td>
											<td></td>
											<td></td>


										</tr>
										<tr style="background-color: #FCC">
											<th style="text-align: center">Emp Code</th>

											<th style="text-align: center">From Date</th>
											<th style="text-align: center">To Date</th>
											<th style="text-align: center">Leave Type</th>

											<th></th>


										</tr>

									</thead>
									<tbody>
										<tr>
											<td><input class="form-control" type="number"
												placeholder="" id="empCode" name="[0][emp_code]"
												style="margin-left: 5px;" /></td>
											<td><div class="form-group">
													<input type="date" class="form-control"
														id="datepicker-only-init2" name="[0][from_date]"
														data-target="#datepicker-only-init2" />
												</div></td>
											<td><div class="form-group">
													<input type="date" class="form-control"
														id="datepicker-only-init3" name="[0][to_date]"
														data-target="#datepicker-only-init3" />
												</div></td>
											<td>
												<div class="form-group row">

													<div class="col-md-12" id="leaveType">
														<select class="form-control" name="[0][leave_type]">
															<option>SL</option>
															<option>CL</option>
															<option>PL</option>
															<option>EL</option>
														</select>
													</div>
												</div>
											</td>
											
											<td>
												<button type="button" name="add" id="add"
													class="btn btn-info">
													<i class="fa fa-plus"></i>
												</button>
											</td>
										</tr>



									</tbody>
								
								</table>
								<div class="pull-right">

							<button type="button" class="btn btn-primary" id="btnSave">Save</button>
						</div>
						</form>
						
						</section>
				<!-- </div>
				</div>
				<div> -->
				
				

<section class="card">
					<h5 class="text-black" style="margin-left: 28px">
						<strong>Present Leave Status</strong>
					</h5>
					<br>

					<div class="typeahead__container">
						<div class="typeahead__field">
							<div class="typeahead__query">
								<div class="input-group">
									<label style="color: #06F; margin-left: 25px"><strong>From
											Date:</strong></label>
									<td><div class="form-group">
											<input type="text" class="form-control"
												placeholder="Select Date" id="datepicker-only-init"
												data-toggle="datetimepicker"
												data-target="#datepicker-only-init" />
										</div></td> <label style="color: #06F; margin-left: 15px"><strong>To
											Date:</strong></label>
									<td><div class="form-group">
											<input type="text" class="form-control"
												placeholder="Select Date" id="datepicker-only-init1"
												data-toggle="datetimepicker"
												data-target="#datepicker-only-init1" />

										</div></td>


									<div class="" id="btnEnterEmpCode">
										<a href="javascript: void(0);" class="btn btn-default btn-sm"
											style="margin-left: 10px; background-color: #0CF" /> Enter </a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br />
					<!-- <table class="table table-hover" id="dataTableLeave">
						<thead>
							<tr style="color: #06C">
								<th>Employee Code</th>
								<th>Leave Type</th>
								<th></th>
								<th></th>
							</tr>
						</thead>

					</table> -->
					</section>
				


				<!-- END: forms/selectboxes -->

				<!-- START: page scripts -->
				<script>
  ;(function($) {
    'use strict'
    $(function() {
	$('#datepicker-only-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init1').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init2').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init3').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
      $('#datepicker-only-init4').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	  $('#datepicker-only-init5').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })

    })
  })(jQuery)
</script>
				<!-- END: page scripts -->

			</div>
		</div>
		<!-- <div class="cui-layout-footer">
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
		</div> -->
	</div>
	</div>
</body>


</html>