<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/utilisationreport.js/"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
		<div class="cui-layout"> 
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
  				<span class="font-size-18 d-block">
    				<span class="text-muted">Home </span>
    				<strong>Human Resourse</strong>
			  	</span>
			  	<div class="cui-utils-content">
				<!-- START: tables/datatables -->
					<section class="card">
						<div class="card-header" style="background-color:#CCC">
 							<span class="cui-utils-title">
								<strong>Utilization of Resources</strong>
							</span>	
		    			</div>
  						<div class="card-body" style="background-color:#FFF">
  							<div class="mb-5">
        						<table class="table table-hover nowrap" id="datatable">
            						<thead>
              							<tr style="background-color:#09f;r;font-weight:bold;">  
                							<th>Project Name</th>
                							<th>Team</th>
                							<th>Resource Name</th>
                							<th>Status</th>
                						</tr>
            						</thead>
            						<tbody>
            						</tbody>
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