<!DOCTYPE html>

<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- customizedJs -->

<script
	src="../vendors/datatables.net/js/datatables.min.js"></script> 

	<script src="../vendors/customizedjs/payrollList.js"></script>

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
    <span class="text-muted"> ·</span>
    <strong>Human Resource</strong>
    <small class="text-muted"></small>
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: tables/datatables -->
<section class="card">
  <div class="card-header">
   
  </div>
  <div class="card-body">
    <div class="row">
      <div class="col-lg-12">
        <h5 class="text-black"><strong>Payroll Summary Sheet Report</strong></h5>
        
        
        
        <div class="mb-5">
          <table class="table table-hover nowrap" id="payrollStatusTable">
            <thead>
              <tr style="background-color:#06F;color:#FFF">
                <th>Employee code</th>
                <th>Employee Name</th>
                <th>DepaertmentName</th>
                <th>Basic Salary</th>
                <th>WorkOnHolidays</th>
                <th>Bouns</th>
                <th>PF</th>
                <th>ESI</th>
               <!--  <th>Gross Salary</th> -->
                 <th>LOAN</th>
                  <th>TDS</th>
                   <th>Total Salary</th>
              </tr>
            </thead>
            <tbody>
              
             
            </tbody>
            <tfoot>
             
            </tfoot>
          </table>
          
      </div>
    </div>
    </div>
   
        
       
</div>
</section>


<!-- START: page scripts -->

<!-- END: page scripts -->

</div>
</div>

<jsp:include page="../layout/footer.jsp"></jsp:include>
</div>
</div>

</body>
</html>