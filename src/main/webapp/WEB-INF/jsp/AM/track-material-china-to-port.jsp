<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
 <jsp:include page="../layout/links.jsp"></jsp:include>

<script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/viewconsignment.js"></script>
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
    <small class="text-muted"></small>
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: forms/basic-forms-elements -->
<section class="card">
  <div class="card-header">
    <span class="cui-utils-title">
      <strong>Material Tracking(China to Port)</strong>
      
    </span>
  </div>
  <div class="card-body">
    <div class="row">
      <div class="col-lg-12">
        <div class="mb-5">
          <h5 class="text-black"><strong></strong></h5>
          
          <!-- Horizontal Form -->
          
   
   <div class="mb-5">
          <table class="table table-hover nowrap" id="updateTrackTable">
            <thead>
              <tr style="background-color:#FCC"> 
              <th></th> 
              <th></th>              
              	<th>Consignment No</th>
                <th>Airway Bill No</th>
                <th>Satus</th>
                <th>Expected Arrival Date</th>
                <th>Actual Arrival Date</th>
                <th>Update</th>
                <th></th>
              </tr>
            </thead>
          </table>
        </div>
        
        
        <!-- -----modal start----- -->

 <div class="modal fade" id="trackEditId">
		 <div class="modal-dialog modal-md">
		<div class="modal-content">
				<div class="box box-primary">
					<button type="button" class="close" data-dismiss="modal"
					aria-label="Close"><span aria-hidden="true">&times;</span>
				</button>
			</div>
				<div id=modalbody>
				<!-- <section class="content"> Small boxes (Stat box) -->
						<div>
						  <!-- <h4 style="font:serif;">Do you want to Edit<span style="color:red;">?</span></h4> -->
						 <input type="hidden" id="consignment_id">
						 <div class="row">
					<div class="col-md-4">Consignment No</div>
					<div class="col-md-5"><input type="text" placeholder="Consignment No" readonly="readonly" id="consignmentNoedit" class="form-control netEmp  "></div>
				</div>
				<div class="row">
					<div class="col-md-4">Airway Bill No</div>
					<div class="col-md-5"><input type="text" placeholder="Airway Bill" readonly="readonly" id="arwaybilledit" class="form-control "></div>
				</div>								
						
				<div class="row"> 
				<div class="col-md-4">Status</div><div class="col-md-5"><select class="form-control select2" id="statusedit" name="status"
						data-placeholder="Select Designation" style="width: 100%;">
						<!-- <option value="0">-select-</option> -->
						<option>DISPATCHED</option>
						<option>ARRIVED</option>
						<option>INTRANSIT</option>
					</select></div>
				</div>	
				<div class="row">
					<div class="col-md-4">Exp arrival date</div>
					<div class="col-md-5"><input type="date" placeholder="Expected Date"  id="expectedDateedit" class="form-control "></div>
				</div>
				<div class="row">
					<div class="col-md-4">Act arrival date</div>
					<div class="col-md-5"><input type="date" placeholder="Expected Date"  id="actualDateedit" class="form-control "></div>
				</div>
				<div class="row">
					<div class="col-md-4">Updated Date</div>
					<div class="col-md-5"><input type="date" placeholder="Expected Date"  id="updateonedit" class="form-control "></div>
				</div>
						   
				 </div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success pull-right" id="btnUpdate">Update</button>
					<button type="button" data-dismiss="modal" class="btn btn-danger pull-left" id="btnclose">close</button>
				</div>
						   </div>
						 </div>
					<!-- </div>  -->
					<!-- </div> -->
					
				<!-- </section> -->
				 </div>

		</div> 
	</div> 
<!-- ------modal end-------- -->
                   
          <!-- End Vertical Form -->
        </div>
      </div>
    </div>
    
<!-- <div>
   <div class="pull-right">
    <div class="pull-right">
           <a href="javascript: void(0);" class="btn btn-sm btn-primary">
      
      <span class="hidden-sm-down"> Update</span>
    </a>


</div>
</div>
</div> -->
               
           
          
           
  </div>
</div>
</div>
</div>
</div>
</body>

</html>