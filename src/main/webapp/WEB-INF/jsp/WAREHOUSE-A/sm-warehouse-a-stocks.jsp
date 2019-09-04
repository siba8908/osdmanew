<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include><body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/warehouse-a-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">

					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Store Manager</strong>

					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: tables/editable-tables -->
					<section class="card">
						<div class="card-header">
							<span class="cui-utils-title"> <strong> WAREHOUSE
									A</strong><br>

								<h3 style="color: #09F; font-family: 'Arial Black', Gadget">
									<strong>STOCKS</strong>
								</h3>
							</span>
						</div>
						<div class="card-body" style="background-color: #CCC">
							<div class="row">
								<div class="col-lg-12">


									<div class="table-responsive mb-5">
										<strong
											style="color: #FFF; font-family: 'Arial Black', Gadget">Stock
											In </strong>
										<table class="table table-hover nowrap editable-table"
											id="stockInReportTable">
											<thead>
												<tr style="background-color: #09F; r; font-weight: bold;">
													<th style=""><strong>Sl No</strong></th>
													<th style=""><strong>Inward Date</strong></th>
													<th><strong>Consigner</strong></th>
													<th><strong>Consignee</strong></th>
													<th><strong>Bar Code</strong></th>
													<th><strong>Serial Number</strong></th>
													<th><strong>Quantity</strong></th>
												</tr>
											</thead>
											<tbody>
											</tbody>

										</table>
									</div>
								</div>
							</div>
						</div>
						<div class="form-control"></div>
<!-- 						<div class="card-body" style="background-color: #CCC"> -->
<!-- 							<div class="row"> -->
<!-- 								<div class="col-lg-12"> -->


<!-- 									<div class="table-responsive mb-5"> -->
<!-- 										<strong -->
<!-- 											style="color: #FFF; font-family: 'Arial Black', Gadget">Stock -->
<!-- 											Out </strong> -->
<!-- 										<table class="table table-hover nowrap editable-table" -->
<!-- 											id="stockOutReportTable"> -->
<!-- 											<thead> -->
<!-- 												<tr style="background-color: #09F; font-weight: bold;"> -->
<!-- 													<th style=""><strong>Sl No</strong></th> -->
<!-- 													<th style=""><strong>Outward Date</strong></th> -->
<!-- 													<th><strong>Consigner</strong></th> -->
<!-- 													<th><strong>Consignee</strong></th> -->
<!-- 													<th><strong>Bar Code</strong></th> -->
<!-- 													<th><strong>Serial Number</strong></th> -->
<!-- 													<th><strong>Storage Location</strong></th> -->
<!-- 													<th><strong>Quantity</strong></th> -->
<!-- 												</tr> -->
<!-- 											</thead> -->
<!-- 											<tbody> -->
<!-- 											</tbody> -->

<!-- 										</table> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="pull-right"> -->
<!-- 								<a href="javascript: void(0);" class="btn btn-sm btn-primary" onclick="saveStockOut()"> -->
<!-- 									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SAVE -->
<!-- 									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a> -->
<!-- 							</div> -->

<!-- 						</div> -->

					</section>



					<!-- END: tables/editable-tables -->

					<!-- START: page scripts -->

					<!-- END: page scripts -->

				</div>
			</div>

			<a href="javascript: void(0);" class="cui-utils-scroll-top"
				onclick="$('body, html').animate({'scrollTop': 0}, 500)"><i
				class="icmn-arrow-up"></i></a>
		</div>
	</div>
	<script src="../vendors/data-table/datatables.min.js"></script>
	<script src="../vendors/data-table/dataTables.bootstrap.min.js"></script>
	<script src="../vendors/data-table/dataTables.buttons.min.js"></script>
	<script src="../vendors/data-table/buttons.bootstrap.min.js"></script>
	<script src="../vendors/data-table/jszip.min.js"></script>
	<script src="../vendors/data-table/pdfmake.min.js"></script>
	<script src="../vendors/data-table/vfs_fonts.js"></script>
	<script src="../vendors/data-table/buttons.html5.min.js"></script>
	<script src="../vendors/data-table/buttons.print.min.js"></script>
	<script src="../vendors/data-table/buttons.colVis.min.js"></script>
	<script src="../vendors/data-table/datatables-init.js"></script>
	<script src="../warehouseA/stocks.js"></script>
</body>


</html>