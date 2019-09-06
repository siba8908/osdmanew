<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/warehouse-b-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Store Manager </strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/form-validation -->
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title">

								<h3 class="text-black">
									<strong>WAREHOUSE-B</strong>
								</h3>
							</span>
							<h5 style="color: #066; font-family: 'Arial Black', Gadget">Material
								Coding</h5>
						</div>

						<div class="table-responsive mb-6">
							<table class="table table-hover table-bordered">
								<thead>
									<tr
										style="background-color: #09F; text-align: center; font-weight: bold;">
										<th>Panchayat Code</th>
										<th>Product Code</th>

										<th>Quantity</th>


									</tr>
								</thead>
								<tbody>
									<tr>
										<td style="text-align: center">1</td>
										<td style="text-align: center">001</td>
										<td style="text-align: center">10</td>

									</tr>
									<tr>
										<td style="text-align: center">2</td>
										<td style="text-align: center">002</td>
										<td style="text-align: center">10</td>

									</tr>
									<tr>
										<td style="text-align: center">3</td>
										<td style="text-align: center">003</td>
										<td style="text-align: center">58</td>
									</tr>
									<tr>
										<td style="text-align: center">4</td>
										<td style="text-align: center">004</td>
										<td style="text-align: center">58</td>
									</tr>
								</tbody>
								<tfoot>

								</tfoot>
							</table>

						</div>
				</div>
				<a href="javascript: void(0);" class="btn btn-sm btn-primary"
					style="float: right; margin-right: 50px">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>

			</div>




			<!-- END: forms/form-validation -->

			<!-- START: page scripts -->
			<script>
				;
				(function($) {
					'use strict'
					$(function() {
						$('#form-validation').validate({
							submit : {
								settings : {
									inputContainer : '.form-group',
									errorListClass : 'form-control-error',
									errorClass : 'has-danger',
								},
							},
						})

						$('#form-validation .remove-error').on('click',
								function() {
									$('#form-validation').removeError()
								})

						$('#form-validation-simple').validate({
							submit : {
								settings : {
									inputContainer : '.form-group',
									errorListClass : 'form-control-error-list',
									errorClass : 'has-danger',
								},
							},
						})

						$('#form-validation-simple .remove-error').on('click',
								function() {
									$('#form-validation-simple').removeError()
								})

						$('.select2').select2()
						$('.select2-tags').select2({
							tags : true,
							tokenSeparators : [ ',', ' ' ],
						})
					})
				})(jQuery)

				;
				(function($) {
					'use strict'
					$(function() {
						$('#example1').editableTableWidget()

						$('#example2').editableTableWidget()
					})
				})(jQuery)

				;
				(function($) {
					'use strict'
					$(function() {
						$('#timepicker-init').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LT',
						})

						$('#datepicker-only-init').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LL',
						})

						$('#datetimepicker-init').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
						})

						$('#datepicker-inline-init').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							inline : true,
							sideBySide : false,
						})

						$('#timepicker-inline-init').datetimepicker({
							icons : {
								time : 'fa fa-clock-o',
								date : 'fa fa-calendar',
								up : 'fa fa-arrow-up',
								down : 'fa fa-arrow-down',
								previous : 'fa fa-arrow-left',
								next : 'fa fa-arrow-right',
							},
							format : 'LT',
							inline : true,
							sideBySide : false,
						})
					})
				})(jQuery)
			</script>
			<!-- END: page scripts -->

		</div>
	</div>
	<div class="cui-layout-footer">
		<div class="cui-footer">
			<div class="cui-footer-inner">
				<div class="cui-footer-top">
					<div class="row">
						<div class="col-lg-9 mb-3">
							<div class="mb-3">
								<strong></strong>
							</div>

						</div>
					</div>

					<p></p>
				</div>
			</div>
		</div>
	</div>
	<div class="cui-footer-bottom">
		<div class="row">
			<div class="col-md-4">
				<img src="components/dummy-assets/common/img/logo.png" width="200"
					height="auto">
			</div>
			<div class="col-md-8">
				<div class="cui-footer-company">
					<img class="cui-footer-company-logo"
						src="components/dummy-assets/common/img/N-m.png" width="90"
						height="auto" title="#" /> <span> © 2019 <a
						href="#" target="_blank">Powered by Nucigent Technology</a>

					</span>
				</div>
			</div>
		</div>
	</div>
	<a href="javascript: void(0);" class="cui-utils-scroll-top"
		onclick="$('body, html').animate({'scrollTop': 0}, 500)"><i
		class="icmn-arrow-up"></i></a>
	</div>
	</div>
	</div>
	</div>
	</div>
</body>

</html>