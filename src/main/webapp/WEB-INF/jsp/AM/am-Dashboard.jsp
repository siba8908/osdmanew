
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOM JS -->
<script src="../vendors/customizedjs/paydashboard.js"></script>	
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
				<p id="message"></p>
				<!-- START: forms/basic-forms-elements -->
				<section class="card">
		  			<div class="card-header">
					    <span class="cui-utils-title">
					      <strong>Approved Requisition List</strong> 
					    </span>
		  			</div>
		  			<div class="card-body">
		  			    <div class="row">
					    	<div class="col-lg-12">
					        	<div class="mb-5">
					          		<h5 class="text-black"><strong></strong></h5>   
		          					<!-- Horizontal Form -->
		     						<div class="mb-5">
		         						<table class="table table-hover nowrap" id="tableId">
		            						<thead>
								              	<tr style="background-color:#FCC">               
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
								            	<c:forEach items="${dashboard}" var="db">
								            		<tr>
									             		<td id="date">${db.date}</td>
														<td>${db.raisedFor}</td>
														<td>${db.siteCode}</td>
														<td>${db.typeOfWork}</td>
														<td>${db.amountRequested}</td>
														<td>${db.purpose}</td>
										                <td id="approvedAmount">${db.approvedAmount}</td>
										                <td>${db.remark}</td> 
								             		</tr>
								             	</c:forEach>
								            </tbody>
							            <tfoot>   
							            </tfoot>
							          </table>
							        </div>
		                   
		          <!-- End Vertical Form -->
		        				</div>
		      				</div>
		      			</div>
		      		</div>
		    		<div class="form-group">	   
				   		<div class="pull-right">
				     		<button type="submit" class="btn btn-primary" id="btnType">Pay</button>
						</div>
			  		</div>
		    	</section>
		    </div>
	   	</div>
  		<jsp:include page="../layout/footer.jsp"></jsp:include>
	</div>
</div>
<script>
  ;(function($) {
    'use strict'
    $(function() {
	$('#datepicker-only-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init1').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init2').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init3').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
      $('#datepicker-only-init4').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })

    })
  })(jQuery)
</script>
</body>
</html>