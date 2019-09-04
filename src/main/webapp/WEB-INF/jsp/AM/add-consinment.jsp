<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/account.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>
<div class="cui-layout">
<jsp:include page="../layout/header.jsp"></jsp:include>
<div class="cui-layout-content">
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
 
  <span class="font-size-18 d-block">
    <span class="text-muted">Home ·</span>
    <strong> Account Management</strong>
    <small class="text-muted"></small>
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: forms/basic-forms-elements -->
<section class="card">

  <div class="card-header" style="background-color:#CFC;color:#FFF">
    <span class="cui-utils-title">
      <strong>Add Consignment</strong>
    </span>
  
      </div>
  <div class="card-body">
    <div class="row">
      <div class="col-lg-12">
        <div class="mb-5">
          <h5 class="text-black"><strong></strong></h5>
          
          <!-- Horizontal Form -->
          <form id="consinmentadd">
            
            
            
            
            <div class="form-group row">
              <label class="col-md-3 col-form-label" for="l10">Consignment No:</label>
	              <div class="col-md-3">
	                <input type="number" class="form-control" id="consinmentNo" name="consingement_no" />
	              </div>
            </div>
            
            <div class="form-group row">
              <label class="col-md-3 col-form-label" for="l10">Airway Bill No:</label>
	              <div class="col-md-3">
	                <input type="text" class="form-control"  id="airwayBillNo" name="airwaybill_no" />
	              </div>
            </div>
            
             <div class="form-group row">
              <label class="col-md-3 col-form-label" for="l10">Status:</label>
              		<div class="col-md-3">
                	<select class="form-control select2" id="status" name="status"
						data-placeholder="Select Designation" style="width: 100%;">
						<option value="0">-select-</option>
						<option value="1">DISPATCHED</option>
						<option value="2">ARRIVED</option>
						<option value="3">INTRANSIT</option>
					</select>
             	 </div>
            </div>
            
             <div class="form-group row">
              <label class="col-md-3 col-form-label" for="l10">Expected Arrival Date:</label>
				<div class="col-md-3"> 
				 	<input type="date" class="form-control" placeholder="YYYY-MM-DD" for ="holiday_date" 
              		id="exp_arrival_date" name="exp_arrival_date" />
            	</div>
            </div>
            
            <div class="form-group row">
              <label class="col-md-3 col-form-label" for="l10">Actual Arrival Date:</label>
				<div class="col-md-3"> 
				 	<input type="date" class="form-control" placeholder="YYYY-MM-DD" for ="holiday_date" 
              		id="act_arrival_date" name="act_arrival_date" />
            	</div>
            </div>
            
             <div class="form-group row">
              <label class="col-md-3 col-form-label" for="l10">Update On:</label>
              <div class="col-md-3">
               <input type="date" class="form-control" placeholder="YYYY-MM-DD" for ="holiday_date" 
              		id="updated_on" name="updated_on" />
              </div>
            </div>
            
            <div class="form-actions">
              <div class="form-group row">
                <div class="col-md-3 offset-md-3">
                  <button type="submit"  class="btn btn-primary" id="addConsinment" onclick="saveConsinment();">Save</button>
                  
                </div>
              </div>
            </div>
          </form>
          <!-- End Horizontal Form -->
        </div>
      </div>
    </div>
   
   
   
          
        </div>
                   
          <!-- End Vertical Form -->
        </div>
      </div>
    </div>
             
  </div>
</div>
</div>
</div>
</div>
</body>
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


    })
  })(jQuery)
</script>

</html>