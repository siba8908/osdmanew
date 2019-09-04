<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- DataTables -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<!-- CUSTOM JS -->
<script src="../vendors/customizedjs/consignment.js"></script>
<!-- <script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script> -->
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
								<strong>Material List Consignmentwise</strong>
							</span>	
		    			</div>
		    			<div class="card-body" style="background-color:#FFF">		  					
							<div class="mb-5">
			          			<table class="table table-hover nowrap" id="consignmentTable">
			            			<thead>  
				              			<tr style="background-color:#09f;r;font-weight:bold;">               
						                	<th>Consignment No</th>
				                 			<th>Material Id</th>
							                <th>Item Name</th>
							                <th>Serial No</th>  
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