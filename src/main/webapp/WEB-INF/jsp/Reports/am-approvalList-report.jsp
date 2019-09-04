<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOM JS -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/customizedjs/paydashboard.js"></script>	
<script src="../vendors/customizedjs/approveList.js"></script>	
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>	
		<div class="cui-layout"> 
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right">   
				    </div>
					<span class="font-size-18 d-block">
		    		<span class="text-muted">Home</span>
			    		<strong>Account Manager</strong>
			    		<small class="text-muted"></small>
		  			</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: forms/basic-forms-elements -->
					<section class="card">
						<div class="card-header" style="background-color:#CCC">
						    <span class="cui-utils-title">
						    	<strong>Approved Requisition List</strong> 
						    </span>
		  				</div>
						<div class="card-body" style="background-color:#FFF">		  					
		  			       	<div class="mb-5">
					    		<table class="table table-hover nowrap" id="approvedList">
		            				<thead>
										<tr style="background-color:#09F;font-weight:bold;">							              	
											<th>Date</th>
							                <th>Employee/Supplier</th>
							                <th>SiteCode</th>
							                <th>Type of Work</th>
							                <th>Amount(Rs) Requested</th>
							                <th>Description/Purpose</th>
							                <th>Approved Amount</th>
							                <th>Remark</th>
						              	</tr>
						            </thead>
						            <tbody>
								    </tbody>
							        <tfoot>   
							        </tfoot>
							   	</table>
							</div>
		                   <!-- End Vertical Form -->
		        		</div>
		      		</section>
		    	</div>
	   		</div>
  			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>