<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- DataTables -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script> 
<!-- CUSTOM JS -->
<script src="../vendors/customizedjs/attendance_report.js"></script>
<!-- <script src="/customizedjs/leavelist.js"></script> -->
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
		<div class="cui-layout"> 
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  					<span class="font-size-18 d-block">
					    <span class="text-muted">Home</span>
					    <strong>Human resource</strong>
					    <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
				<!-- START: forms/basic-forms-elements -->
					<section class="card">
						<div class="card-header" style="background-color:#CCC">
    						<span class="cui-utils-title">
      							<strong>Attendance Report</strong>
						    </span>
  						</div>
  						<div class="card-body">
    						<div class="row">
      							<div class="col-lg-12">
        							<div class="mb-5">
          								<h5 class="text-black"><strong></strong></h5>
          								<div class=" pull-right">
	          								<button type="button"  id="btnday" class="btn btn-primary">Day</button>
											<button type="button"  id="btnmonth" class="btn btn-primary">Month</button>
	          							</div>
       								</div>
      							</div>
    						</div>
						  	<div class="mb-5">
            					<div class="box-body">
            						<section class="content">
										<div>
											<div class="col-xs-12">
												<div class="data-table-container">
	           										<table class="table table-hover nowrap" id="attendanceTable">
	            										<thead>
															<tr style="background-color:#09F;font-weight:bold;">							              	
												                <th>Date</th>
												                <th>EmployeeCode</th>
												                <th>Status</th>
											                </tr>
											            </thead>
											        </table>
	          									</div> 
											</div>
										</div>
							 		</section>
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