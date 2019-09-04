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
<div class="cui-menu-right">
  <div class="cui-menu-right-inner">
    <div class="cui-menu-right-header">
      <span class="fa fa-times pull-right cui-menu-right-action-toggle"><!-- --></span>
      Theme Settings
    </div>
    <div class="cui-menu-right-content">
      <div class="cui-menu-right-descr">
        This module "block-menu-right" gives possibility to construct custom blocks with any
        widgets, ../components and elements inside, like this theme settings
      </div>
      <div class="cui-menu-right-label">
        Theme Style
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="" /> Dark
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-light" /> Light
            </label>
          </div>
        </div>
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-green" /> Green
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-blue" /> Blue
            </label>
          </div>
        </div>
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-red" /> Red
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-orange" /> Orange
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Menu Shadow
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-shadow" value="cui-menu-left-shadow" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-shadow" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Borderless Cards
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-borderless" value="cui-config-borderless" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-borderless" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Squared Corners
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-corners" value="cui-config-squared-corners" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-corners" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Fixed Width
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-boxed" value="cui-config-fixed-width" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-boxed" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Colorful Menu
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-colorful" value="cui-menu-left-colorful" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-colorful" value="" /> Off
            </label>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<jsp:include page="../layout/am-leftmenu.jsp"></jsp:include>
<div class="cui-layout">
<jsp:include page="../layout/header.jsp"></jsp:include>
<div class="cui-layout-content">
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  <div class="pull-right">
      </div>
  <span class="font-size-18 d-block">
    <span class="text-muted">Home ·</span>
    <strong>Account manager</strong>
    <small class="text-muted"></small>
  </span>
</nav>



  <div class="card-header">
    <span class="cui-utils-title">
    
      <strong>Views Consignment Details</strong>
      
    </span>
 
          <!-- Horizontal Form -->
          <!-- <form>
          <table class="table table-hover nowrap" id="example1">
            <thead>
   
          End Sizing
        </div>
      </div> -->
      
      <div class="mb-5">
          <table class="table table-hover nowrap" id="viewconsigTable">
            <thead>
              <tr style="background-color:#FCC"> 
              <th></th> 
              <th></th>              
              	<th>Consignment No</th>
                <th></th>
              </tr>
            </thead>
          </table>
        </div>
  
  <!-- -----modal start----- -->

 <div class="modal fade" id="viewconsignmentId">
		 <div class="modal-dialog modal-md">
		<div class="modal-content">
				<div class="box box-primary">
					<button type="button" class="close" data-dismiss="modal"
					aria-label="Close"><span aria-hidden="true">&times;</span>
				</button>
			</div>
				<div id=modalbody>
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
				<div class="col-md-4">Status</div>
				<div class="col-md-5"><input type="text" placeholder="Status" readonly="readonly" id="statusedit" class="form-control "></div>
				</div>	
				<div class="row">
					<div class="col-md-4">Exp arrival date</div>
					<div class="col-md-5"><input type="date" placeholder="Expected Date" readonly="readonly" id="expectedDateedit" class="form-control "></div>
				</div>
				<div class="row">
					<div class="col-md-4">Act arrival date</div>
					<div class="col-md-5"><input type="date" placeholder="Actual arrival date" readonly="readonly"  id="actualDateedit" class="form-control "></div>
				</div>
				<div class="row">
					<div class="col-md-4">Updated Date</div>
					<div class="col-md-5"><input type="date" placeholder="updated Date" readonly="readonly" id="updateonedit" class="form-control "></div>
				</div>
						   
				 </div>
				<div class="modal-footer">
					<button type="button" data-dismiss="modal" class="btn btn-danger pull-left" id="btnclose">close</button>
				</div>
					
				<!-- </section> -->
				 </div>

		</div> 
	</div> 
<!-- ------modal end-------- -->

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

</html>