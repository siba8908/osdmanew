<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOM JS -->
<!-- DataTables -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/customizedjs/raisebill.js"></script>
<script src="../vendors/customizedjs/raisebillList.js"></script>
<script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  				<div class="pull-right"></div>
	   				<span class="font-size-18 d-block">
	    				<span class="text-muted">Home ·</span>
	    				<strong>Account Manager</strong>
	    				<small class="text-muted"></small>
	  				</span>
				</nav>
				<div class="cui-utils-content">
				<!-- START: forms/basic-forms-elements -->
					<p id="message"></p>
					<section class="card">
						<div class="card-header" style="background-color:#CFC;color:#FFF">
						    <span class="cui-utils-title">
					    		<strong>Raise Bill</strong>
					    	</span>
				  		</div>
  				        <!-- Horizontal Form -->
                		<div class="table-responsive mb-5">   
			   				<div class="mb-5">
          						<table class="table table-hover nowrap" id="risebill">
            						<thead>  
            							<tr style="background-color:#FCC;">               
					                 		<th></th>
					                 		<th>Site Name</th>
					                 		<th>SiteDate</th>
					                 		<th>Amount</th>
					                 		<th>Remarks</th>
                 						</tr>
            						</thead>
            						<tbody>
            	                  		<c:forEach items="${Bill}" var="bill">
											<tr>
												<td ><input type="checkbox" id="siteCodeId" value="${bill.siteCodeId}" required></td>
												<td >${bill.siteName}  </td>
												<td><input type="date" class="form-control" id="siteDate" name="siteDate" required></td>
												<td><input type="number"id="amount" name="amount" required></td>
												<td><input type="text" id="remarks" name="remarks" required></td>
											</tr>
										</c:forEach>
          				 			</tbody>
            						<tfoot>
             			            </tfoot>
          						</table>
          					</div>
          				</div>		
   						<div class="pull-right">
	    					<input type="button" name="submit" id="btnraise" class="btn btn-success pull-right"  value="Raise" />
	          				<!-- End Vertical Form -->
	          			</div>
	          			<div class="form-control"></div>
						<div class="card-header" style="background-color:#CFC;color:#FFF">
							<span class="cui-utils-title">
								<strong>List of Raised Bills</strong>
							</span>	
		    			</div>
		    			<div>
		  					<div class="mb-5">
			          			<table class="table table-hover nowrap" id="riseillStatusTable">
			            			<thead>  
				              			<tr style="background-color:#FCC;r;font-weight:bold;">               
						                	<th>SiteName</th>
				                 			<th>SiteDAte</th>
							                <th>Amount</th>  
				                		</tr> 
				                	</thead>
				                </table> 
			            	</div>
			            </div>	            
                	</section>
            	</div>
          	</div>
           	<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>
	</div>
</body>

</html>