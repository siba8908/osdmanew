<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>

<!-- CUSTOMJS -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>

<script src="../vendors/customizedjs/recruitmentstatus.js"></script>

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
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Human Resource</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: tables/datatables -->
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title"> <strong>RECRUITMENT
									status</strong>

							</span>
						</div>
						<div class="card-body">
							<div class="row">
								<div class="col-lg-12">


									<div class="mb-5">
										<table class="table table-hover" id="dataTablestatus">
											<thead>
												<tr style="color: #06F">
												<th></th>
													<th>Name</th>
													<th>Email</th>
													<th></th>
													<th></th>
													<th></th>
													<th></th>
												</tr>
											</thead>

											<tfoot>

											</tfoot>
										</table>

										<div class="col-md-9 offset-md-3">
											<button type="button" id="btnAdd" class="btn btn-primary">Send
												link</button>
										</div>
									</div>
								</div>
							</div>
							<div class="mb-5">
								<table class="table table-hover " id="dataTabledisplaystatus">
									<thead>
										<tr style="color: #06F">
											<th>Employee Name</th>
											<th>Sent Status</th>
											<th>Received Status</th>
											<th></th>
											<th></th>
											<th></th>
										</tr>
									</thead>

									<tfoot>

									</tfoot>
								</table>
							</div>
							<div class="row">
								<div class="col-lg-12">
									<div class="mb-5"></div>
								</div>
							</div>
						</div>
					</section>
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
  
  
  $(document).ready(function() {
					var i = 0;
                $('#add').click(function() {
								i++;
								$('#field').append('<tr id="row' + i + '"><td><input type="text"   name="[' + i + '][name]" id="name" placeholder="Name" class="form-control " /></td> <td><input type="text" id="email'+ i +'" name="[' + i + '][email]"   placeholder="Email" class="form-control " /></td><td> <button type="button" name="remove" id="' + i + '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></td></tr>');
											}); 
											
			    								
							$(document).on('click', '.btn_remove', function() {
								var button_id = $(this).attr("id");
								$('#row' + button_id + '').remove();
							});
							
							$('#submit')
							.click(function(e) {
										alert("bibhuuuuu");
										e.preventDefault();
										 var checkstatus= validation();
										alert(checkstatus); 
										if(validation()== true){ 
									
										var date;
										
										
									var	data=JSON.stringify($('#timesheetform').serializeJSON());
										
									console.log(data);
										}
							})
  });
  
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

										<span> <a href="http://mediatec.org/" target="_blank"></a>
											<br />

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