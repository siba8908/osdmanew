
<html lang="en">
  <jsp:include page="../layout/links.jsp"></jsp:include>
<!-- customizedJs -->
<style>

input.ex1 {
  background-color: lightblue;
  width: 110px;
  height: 110px;
  overflow: scroll;
}
</style>
<script src="../vendors/customizedjs/payroll.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>

			<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
				<div class="pull-right"></div>
				<span class="font-size-18 d-block"> <span class="text-muted">Home</span>
					<strong>Human Resource</strong> <small class="text-muted"></small>
				</span>
			</nav>
			<div class="cui-utils-content">
				<section class="card">
					<div class="card-header" style="background-color: #CCC;">
						<strong>PAYROLL</strong>
					</div>
  					<div class="card-body">
    					<div class="row">
      						<div class="col-lg-15">
        						<p id="message"></p>
          						<form name="payrollform" id="payrollform" onsubmit="validateAllInputBoxes(ffevent)">
              						<table class="table table-bordered" id="payroll" style="overflow-x:auto;">
            						<thead>
              							<tr align="center" style="background-color:#09F;">
              								<th style="padding:2.5px; width: 2%;" rowspan="2">Employee Code</th>
              								<th style="padding:2.5px; width: 2%;" rowspan="2">Employee Name</th>
							                <th style="padding:2.5px; width: 1%;" rowspan="2">Designation</th>
							                <th style="padding:2.5px; width: 1%;" rowspan="2">Department</th>
							                <th style="padding:2.5px; width: 1%;" rowspan="2">Total No Of Days</th>
							                <th style="padding:2.5px; width: 1%;" rowspan="2">No Of Working Days</th>
							                <th style="padding:2.5px; width: 1%;" rowspan="2">Gross Salary</th>
							                <th colspan="2">Addition</th>
              								<th colspan="5">Deduction</th>
							                
							            </tr>
							            <tr align="center" style="background-color:#06F;color:#FFF">
							            	
							               	<th>Work on Holidays</th>
							                <th>Bonus</th>
							                <th>PF</th>
							                <th>ESI</th>
							                <th>Loan</th>
							                <th>TDS</th>
							                <th style="display: none;"></th>
							            </tr>
            						</thead>
            		                <tbody>
            	                  		<c:forEach items="${EmpPayroll}" var="payroll">
											<tr>
												<td>${payroll.employeeCode}</td>
												<td>${payroll.firstName} ${payroll.lastName}</td>
												<td>${payroll.designation}</td>
												<td>${payroll.department}</td>
												<td>${payroll.totalNoOfDays}</td>
												<td>${payroll.noOfDays}</td> 
												<td>${payroll.salary}</td>
												<td><input type="number" class="form-control"  id="wh" name="workOnHolidays" class="scrollabletextbox"/></td>
												<td><input type="number" class="form-control" id="bon" name="bonus"/></td>
												<td><input type="number" class="form-control" id="pf" name="pf"/></td>
												<td><input type="number" class="form-control" id="esi" name="esi"/></td>
												<td><input type="number" class="form-control" id="loan" name="loan"/></td>
												<td><input type="number" class="form-control" id="tds" name="tds"/></td>
												<td style="display: none;"><input type="hidden" class="form-control" id="employeeId" name="employeeId" value="${payroll.employeeId}"></td>
											</tr>
										</c:forEach>
          							</tbody>
          						</table>
          						
          						<button type="button"  id="btnsubmit" class="btn btn-primary pull-right">Send</button>
          					</form>
       					</div>
      				</div>
    			</div>
    		</section>
    		</div>
   		    <jsp:include page="../layout/footer.jsp"></jsp:include>
   		</div>
   	</div>
    <script type="text/javascript">
    function validateAllInputBoxes(ffevent)
{
   var inputs = document.getElementsByTagName('input');
   for(var i = 0; i < inputs.length; ++i)
      if(inputs[i].type === 'text')
         //@Satish, maybe below you wrote by mistake if(inputs[i].value = '') thus all input elements values get cleared out.
         if(inputs[i].value === '') 
         {
            alert("form could not be sent one input text field is empty");
            stopEvent(ffevent);
         }
}
</script>
<!-- END: tables/datatables -->

<!-- START: page scripts -->


<!-- END: page scripts -->

</body>

</html>