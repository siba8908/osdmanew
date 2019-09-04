<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/reject_list.js"></script>
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
			<!-- START: forms/basic-forms-elements -->
				<section class="card">
					<div class="card-header" style="background-color:#CCC">
						<span class="cui-utils-title">
	   						<strong>Qa/Qc Material Checked Report</strong>
						</span>	
		    		</div>
		    		<div class="card-body">
	    				<div class="mb-5">
	    					<table class="table table-hover nowrap" id="rejectListTable">
	            				<thead>
	               					<tr style="background-color:#09F;font-weight:bold;">
	               						<th>Product Code</th>
	               						<th>Bar Code</th>
		                				<th>Quality</th>
		                				<th>Created Date</th>
		                				<th>Created By</th>
		                				<th>Remark</th>
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
</body>
</html>