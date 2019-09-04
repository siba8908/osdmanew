
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">


<jsp:include page="../layout/links.jsp"></jsp:include>
 <script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/ProjectBudget.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script> 



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
    <span class="text-muted">Home ·</span>
    <strong>Account Manager</strong>
   
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: tables/editable-tables -->
<section class="card">
  <div class="card-header">
    <span class="cui-utils-title">
  </span>
  </div>
  <div class="form-group row">
  
  <label class="col-md-3 col-form-label" for="l0">Site Code:</label>
         
                  <td> 
                  <div> 
                  
                <select class="form-control first-select"   id="SiteCode" name="[0][siteCodeId]"> 
            <option>Select SiteCode</option>
	         <c:forEach var="showSiteCode" items="${showSiteCode}">
			<option value="${showSiteCode.siteCodeId}">${showSiteCode.siteCode}</option>
					</c:forEach>
	  </select>                  
                                    
             <!-- 
                <select class="form-control" id="l13" placeholder="Component">
                  <option> Option 1 </option>
                  <option>Option 2</option>
                  <option>Option 3</option>
                  <option>Option 4</option>
                  <option>Option 5</option>
                </select> -->
              </div>
                  </td>
                </select>
              </div>
    <div class="row">
      <div class="col-lg-12">
        
        
        <div class="table-responsive mb-5" >
       <!--  <strong style="color:#FFF; Gadget">Project Budget</strong> -->
          <table  class="table table-hover" id="BudgetTable">
            <thead>
             <tr style="background-color:#FFF&lt;/h3&gt;;r;font-weight:bold;">
                <th style=""><strong></strong></th>
                <th style=""><strong>Site Survey</strong></th>
                <th><strong>Civil Work </strong></th>
                <th><strong>Electrical Work</strong></th>
                 <th><strong>Installation</strong></th>
                <th><strong>Performance</strong></th>
                 <th><strong>Handover Stage</strong></th>
                 <th><strong>Total Cost</strong></th>
                
              </tr>
            </thead>
            <tbody>
              <tr>
            
              
                
               <!-- 
                <td> 22300</td>
                <td>10000</td>
              <td>400000</td>
              <td>90000</td>
               <td>80000</td>
              <td>87000</td>
              <td>87000</td> -->
              </tr>
              <tr>
            
              
                
               
                <!-- <td> 22300</td>
                <td>10000</td>
              <td>400000</td>
              <td>90000</td>
               <td>80000</td>
              <td>87000</td>
              <td>87000</td> -->
              </tr>
              <tr>
            
              
               
                <!-- <td> 22300</td>
                <td>10000</td>
              <td>400000</td>
              <td>90000</td>
               <td>80000</td>
              <td>87000</td>
              <td>87000</td> -->
              </tr>
               <tr>
            
              
                
               <!-- 
                <td> 22300</td>
                <td>10000</td>
              <td>400000</td>
              <td>90000</td>
               <td>80000</td>
              <td>87000</td>
              <td>87000</td> -->
              </tr>
            </tbody>
            
          </table>
        </div>
      </div>
    </div>
     </section>
</div>
  </div>
  <div class="form-control">
  
    <div class="row">
      <div class="col-lg-12">
        
        
        <div class="table-responsive mb-5" >
       
          <table class="table table-hover" id="CostTable">
            <thead>
 <tr style="background-color:#FFF&lt;/h3&gt;;r;font-weight:bold;">
                <th style=""><strong></strong></th>
                <th style=""><strong>Site Survey</strong></th>
                <th><strong>Civil Work </strong></th>
                <th><strong>Electrical Work</strong></th>
                 <th><strong>Instalation</strong></th>
                <th><strong>Performance</strong></th>
                 <th><strong>Handover Stage</strong></th>
                 <th><strong>Notify Project Manager</strong></th>
                
              </tr>            </thead>
            <tbody>
               <tr>
              <td></td>
              <td><div class="pull-right">
    <a href="javascript: void(0);" class="btn btn-sm btn-primary">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Notify &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
     
    </a>
  </div></td>
              </tr>
              
            </tbody>
            
          </table>
        </div>
      </div>
    </div>
      </div>
  

  </div>

</section>



<!-- END: tables/editable-tables -->

<!-- START: page scripts -->
<script>
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
	
          $('#datepicker-only-init5').datetimepicker({
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
	
          $('#datepicker-only-init6').datetimepicker({
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


	
          $('#datepicker-only-init7').datetimepicker({
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


</script>

<!-- END: page scripts -->

</div>
</div>

  </div>
</div>
</div>
</div>
</div>
</body>


</html>