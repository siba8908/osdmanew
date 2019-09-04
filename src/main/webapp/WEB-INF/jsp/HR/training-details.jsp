<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOMJS -->
<script src="../vendors/customizedjs/training.js"></script> 
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
    					<strong>Human Resource</strong>
   					</span>
				</nav>
				<div class="cui-utils-content">
				<!-- START: tables/editable-tables -->
				<section class="card">
  					<div class="card-header">
  						<p id="message"></p>
    					<span class="cui-utils-title">
      						<strong>Training Details</strong>
     					</span>
  					</div>
  					<div class="card-body">
    					<div class="row">
      						<div class="col-lg-12">
        						<div class="table-responsive mb-5">
          							<table class="table table-hover nowrap" id="tableId">
            							<thead>
								            <tr>
								            	<th>Trainee</th>
												<th>Types of Training</th>
												<th></th>
												<th>Training Date</th>
												<th></th>
											</tr>
										</thead>	
										<tbody>
											<c:forEach items="${trainee}" var="tra">
												<tr>
													<td>${tra.firstName} ${tra.lastName}</td>
													<td><input type="text" class="form-control" placeholder="Select Training Type" id="tOfT" name="typesOfTraining"></td>
													<td></td>
													<td><input type="date" class="form-control" placeholder="Select Date" id="cDt" name="currentDate"></td>
													<td><input type="hidden" class="form-control" id="eId" name="employeeId" value="${tra.employeeId}"></td>
												</tr>
											</c:forEach>
										</tbody>
								    </table>
								</div>
							</div>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary pull-right" id="btnType">Save</button>
						</div>
					</div>
				</section>
				</div>
				<!-- END: tables/editable-tables -->
				<!-- START: page scripts -->
			</div>	
			<jsp:include page="../layout/footer.jsp"></jsp:include>
			<!-- <a href="javascript: void(0);" class="cui-utils-scroll-top" onclick="$('body, html').animate({'scrollTop': 0}, 500)">
				<i class="icmn-arrow-up"></i>
			</a> -->
		</div>
	</div>
</body>
</html>