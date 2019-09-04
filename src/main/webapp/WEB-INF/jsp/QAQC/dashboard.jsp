<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/qaqc.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
	<jsp:include page="../layout/qaqc-leftmenu.jsp"></jsp:include>	
	<div class="cui-layout"> 
		<jsp:include page="../layout/header.jsp"></jsp:include>
		<div class="cui-layout-content">
			<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
				<div class="pull-right">   
		    	</div>
		    	<span class="font-size-18 d-block">
	   				<span class="text-muted">Home</span>
	   				<strong>QAQC</strong>
    				<small class="text-muted"></small>
				</span>
			</nav>
			<div class="cui-utils-content">
			<p id="message"></p>
			<!-- START: forms/basic-forms-elements -->
				<section class="card">
					<div class="card-header" style="background-color:#CCC">
  						<span class="cui-utils-title">
  							<strong>Qa/Qc  dashboard</strong>
  						</span>	
    				</div>
  					<div class="card-body">
		    			<div class="mb-5">
		          			<table class="table table-hover nowrap" id="itemtable">
		            			<thead>
		               				<tr style="background-color:#09F;font-weight:bold;">
		               					<th></th>
		               					<th></th>
		                				<th>Item Name</th>
		                				<th>Quantity</th>
		                				<th></th>
		              				</tr>
		            			</thead>
		          			</table>
		        		</div>
	        
	       <!-- ---------------------- Model start------------------------------ -->
	        
		        		<div class="modal fade" id="dashboardUpdateId">
				 			<div class="modal-dialog modal-l">
								<div class="modal-content">
									<div class="box box-primary">
										<button type="button" class="close" data-dismiss="modal" aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div id=modalbody>
									<!-- <section class="content"> Small boxes (Stat box) -->
										<input type="hidden" id="materialId">
										<div class="row">
											<div class="col-md-4">Product Code</div>
											<div class="col-md-4"><input type="text" placeholder=" "  id="productCode" name="productCode" class="form-control netEmp  "></div>
										</div>
										<div class="row">
											<div class="col-md-4">Barcode</div>
											<div class="col-md-4"><input type="text" placeholder=""  id="barcode" name="barcode" class="form-control "></div>
										</div>								
										<div class="row"> 
											<div class="col-md-4">Quality</div>
											<div class="col-md-4">
												<select class="form-control select2" id="quality" name="quality" data-placeholder="---Select--" style="width: 100%;">
											<!-- <option value="0">-select-</option> -->
														<option>Ok</option>
														<option>Faulty</option>
												</select>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4">Remark</div>
											<div class="col-md-4"><input type="text" placeholder=""  id="remarks" name="remarks" class="form-control "></div>
										</div>
						 			</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-success pull-right" id="btnSubmit">Submit</button>
										<button type="button" data-dismiss="modal" class="btn btn-danger pull-left" id="btnclose">close</button>
									</div>
								</div>
							</div>
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