<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- customizedJs -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/customizedjs/trainingList.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
	  				<div class="pull-right">
	    			</div>
	  				<span class="font-size-18 d-block">
	    				<span class="text-muted">Home</span>
	    				<strong>Human Resource </strong>
	    				<small class="text-muted"></small>
	  				</span>
				</nav>
				<div class="cui-utils-content">
				<!-- START: tables/basic-tables -->
 					<section class="card">
  						<div class="card-header" style="background-color:#0F;color:#FFF">
    						<span class="cui-utils-title">
      							<strong>View Training Details</strong>
    						</span>
  	    				</div>
    					<div class="table-responsive mb-5">
    				 		<table class="table table-hover" id="trainingDetailsTable">
            					<thead>
             						<tr style="background-color:#09F">
              							<th>Trainee</th>
            							<th>Types of Training</th>
										<th>Training Date</th>
										<th></th>
									</tr>
            					</thead>
            					<tbody>
									<c:forEach items="${tdetails}" var="td">
										<tr>
											<td>${td.empName}</td>
											<td></td>
											<td>${td.typesOfTraining}</td>
											<td></td>
											<td>${td.currentDate}</td>
											<td><input type="hidden" class="form-control" id="eId" name="employeeId" value="${td.employeeId}"></td>
										</tr>
									</c:forEach>
								</tbody>
            					<tfoot>
              						<tr>
					                </tr>
            					</tfoot>
          					</table>
        				</div>
      				</section>
<!-- END: tables/basic-tables -->

<!-- START: page scripts -->
<script>
  ;(function($) {
    'use strict'
    $(function() {
      $('[data-toggle=tooltip]').tooltip()
    })
  })(jQuery)
</script>
<!-- END: page scripts -->

</div>
</div>

	<jsp:include page="../layout/footer.jsp"></jsp:include>
</div>
</div>
</body>

<!-- Mirrored from cleanuitemplate.com/admin/html/preview/versions/menu-left/tables-basic-tables.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Apr 2019 09:16:52 GMT -->
</html>