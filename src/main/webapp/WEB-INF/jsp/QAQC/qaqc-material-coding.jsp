<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/customizedjs/Qaqcmaterial.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script> 
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
			<!-- START: tables/basic-tables -->
				<section class="card">
					<div class="card-header" style="background-color:#CCC">
  						<span class="cui-utils-title">
  							<strong>Qa/Qc  Material Coding</strong>
  						</span>	
    				</div>
  					<div class="card-body">
				  		<div class="row">
				    		<div class="col-lg-12">
				        		<p class="text-muted"><code></code></p>
				         			<form name="materialSave" id="materialSave">
					        			<div class="form-group row">
						        			<label class="col-md-3 col-form-label" for="l0"><strong>Product Name:</strong></label>
									        <td>
								        		<div>
								                	<select class="form-control first-select " id="product" name="[0][productId]">
														<option>Select ProductName</option>
														<c:forEach var="showProductName" items="${showProductName}">
															<option value="${showProductName.productId}">${showProductName.productName}</option>
														</c:forEach>
													</select>
												</div>
								         	</td>
								         </div>
					        			<div class="form-group row">
								        	<label class="col-md-3 col-form-label" for="l0"><strong>Sim Details:</strong></label>
								        	<td>
								         		<div>
								         			<label class="col-md-8 col-form-label" for="l8">Provider:</label>
								         			<input type="text" class="form-control" placeholder="" id="sim_provider" name="[0][simProvider]" />
									        	</div>
									        	<br/>
								         		<div>
								         			<label class="col-md-8 col-form-label" for="l8">Phone No:</label>
								         			<input type="number" class="form-control" placeholder="" id="phone_no" name="[0][phoneNo]" />
									        	</div>
									        	<br/>
									        	<div>
								         			<label class="col-md-8 col-form-label" for="l8">IMEI No:</label>
								         			<input type="text" class="form-control" placeholder="" id="imei_no" name="[0][imeiNo]" />
									        	</div>
									        </td>
								         </div>		          			
								         <table class="table table-hover nowrap" id="field">
					            			<thead>
					            				<tr style="background-color:#09F;text-align:center;font-weight:bold;">
							                 		<th>Component</th>
							                 		<th>Quantity</th>
							                 		<th>Product Code</th>
							              		</tr>
					            			</thead>
					            			<tbody>
						            			<tr><!--  style="color:#06C;text-align:center"> -->
							        				<td></td>
							            			<td></td>
							            			<td></td>
						            			</tr>
												<tr><!--  style="color:#06C;text-align:center"> -->
													<td>
							            				<div>
							            					<select class="form-control " id="ComponentName" placeholder="Component" name="[0][componentId]">
							                					<option>Select ComponentName</option>
							                				</select>
							              				</div>
							                  		</td>
							              			<td>
							              				<div>
							                   		    	<select class="form-control" id="Quantity" placeholder="Component" name="[0][quantity]">
							                 					<option>Select Quantity</option>
							                 				</select>
							              				</div>
							              			</td>
							               			<td> 
							               				<div>
							                   				<select class="form-control " id="myselect" name="[0][itemId]">
																<option>Select ProductCode</option>
																<c:forEach var="showProductCode" items="${showProductCode}">
																	<option value="${showProductCode.itemId}">${showProductCode.productCode}</option>
																</c:forEach>
															</select>
														</div>
							                  		</td>
							              		</tr>
							              	</tbody>	
						              </table>
				        		</form>
				         		<div class="pull-right">   
				    				<a href="javascript: void(0);" id="btnSave" class="btn btn-sm btn-primary ml-10">Save</a>
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