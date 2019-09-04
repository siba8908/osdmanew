
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script>
 <script src="../vendors/customizedjs/material.js"></script>
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
    <strong>Store Manager</strong>
    <small class="text-muted"></small>
  </span>
</nav>

 <div class="row">
     
      
    </div>
    <div class="row">
      
      
    </div>
<!-- START: tables/datatables -->
<br>
<div class="row">
      <div class="col-lg-10" style="margin-left:80px;">
        <h3 class="text-black"><strong>Account Manager</strong></h3><br/>
       <h5 style="color:#066;font-family:'Arial Black', Gadget"></h5>
        <p class="text-muted"><code></code></p>
        
         <form name="timesheetform" id="timesheetform" onsubmit="return validation()">
          
          <table class="table table-hover table-bordered" id="field">
          <thead>
           <tr style="background-color:#FC9;text-align:center;font-weight:bold;">
           <tr style="background-color:#FC9;text-align:center;font-weight:bold;">
           <th><strong>Material Purchase(China)</strong></th></td></td>
            </tfoot>               
             <tr style="background-color:#FC9;text-align:center;font-weight:bold;">
               <td></td>
            	<td>Date Of supply:<class="txt1"><input type="text" class="form-control" placeholder="Select Date" id="datepicker-only-init"
              		data-toggle="datetimepicker" data-target="#datepicker-only-init" /></td> </td>
                 <td>Supplier ID:<input type="text" class="form-control" placeholder="" id="l1" class="txt1"/></td>
                <td>Conginment No:<select class="form-control " id="myselect" name="[0][consinment_id]">
										<option>Select Logistic</option>
												<c:forEach var="showConsignmentNo" items="${showConsignmentNo}">
													<option value="${showConsignmentNo.consignment_id}">${showConsignmentNo.consingement_no}</option>
												</c:forEach>
													</select></td>
				</tr>

				<tr style="background-color:#FCC;text-align:center;font-weight:bold;">
                <th>Item</th>
                <th>Serial No:</th>
                
                <th>Quantity</th>
                <th></th>
                
              </tr>
            </thead>
            <tbody>
              <tr>
              
                 <td><input type="text" class="form-control" placeholder="" id="item_name" name=[0][item_name] class="txt1"/><span id="ename" class=" text-red my-2 pl-2"></span> </td>
            	<td><input type="text" class="form-control" placeholder="" id="serial_no" name=[0][serial_no] class="txt1"/><span id="eserial" class=" text-red my-2 pl-2"></span></td>
                <td><input type="number" class="form-control" placeholder="" id="quantity" name=[0][quantity] class="txt1"/><span id="equantity" class=" text-red my-2 pl-2"></span></td>
                 <td> <div class="col-md-3 offset-md-3">
                  <button type="button" name="add" id="add" class="btn btn-info"><i class="fa fa-plus"></i>
                  </button>
                </div></td>
               
              </tr>
              </tbody>
 		<thead>
          </table>
          <input type="button" name="submit" id="submit" class="btn btn-success pull-right" value="Submit" />
   </form>

        </div>
      </div>
    </div>
   
    <div class="row">
      <div class="col-lg-12">
        <div class="mb-5">
          
        </div>
      </div>
    </div>
  </div>
</section>
<!-- END: tables/datatables -->

<!-- START: page scripts -->
<script>

	
function validation() {
	  var vitemname = document.getElementById("item_name").value;
	  var vserialno = document.getElementById("serial_no").value;
	  var vquantity = document.getElementById("quantity").value;
	  
	  
	  if (vitemname.trim() == "") {		             
			document.getElementById("ename").innerHTML = "** please fillup item name field";		
			return false;
		}
	    if(!isNaN(vitemname)){
			  document.getElementById("ename").innerHTML="** only character are allowed";
			  	     			  
			  return false;
	   }
	   
	    if(vitemname!=""){
			document.getElementById("ename").innerHTML="";
			
	   }  
	    
	    if (vserialno.trim() == "") {		             
			document.getElementById("eserial").innerHTML = "** please fillup serial no. field";		
			return false;
		}
	    if(vserialno!=""){
			document.getElementById("eserial").innerHTML="";
			
	   }  
	    if(vquantity.trim() == "")
	    	{
	    	 document.getElementById("equantity").innerHTML = "** please fillup quantity field";
	    	 return false;
	    	}
	    if(vquantity!=""){
			document.getElementById("equantity").innerHTML="";
			
	   } 
	    
	    return true; 
}
  ;(function($) {
    'use strict'
    $(function() {
      $('#example1').DataTable({
        responsive: true,
      })

      $('#example2').DataTable({
        autoWidth: true,
        scrollX: true,
        fixedColumns: true,
      })

      $('#example3').DataTable({
        autoWidth: true,
        scrollX: true,
        fixedColumns: true,
      })
    })
  })(jQuery)
  
  
  ;(function($) {
    'use strict'
    $(function() {
      $('#timepicker-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LT',
      })

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

      $('#datetimepicker-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
      })

      $('#datepicker-inline-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        inline: true,
        sideBySide: false,
      })

      $('#timepicker-inline-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LT',
        inline: true,
        sideBySide: false,
      })
    })
  })(jQuery)

  

</script>
<!-- END: page scripts -->

</div>
</div>
<div class="cui-layout-footer">
<div class="cui-footer">
  <div class="cui-footer-inner">
    <div class="cui-footer-top">
      <div class="row">
        <div class="col-lg-9 mb-3">
          <div class="mb-3">
            <strong
              ></strong
            >
          </div>
          <div class="cui-footer-description">
            <p>
              
            </p>

            <p>
             
            </p>
          </div>
        </div>
      </div>
    </div>
    <div class="cui-footer-bottom">
      <div class="row">
        <div class="col-md-4">
          <img src="../components/dummy-assets/common/img/logo.png" width="200" height="auto"> </div>
        <div class="col-md-8">
          <div class="cui-footer-company">
            <img
              class="cui-footer-company-logo"
              src="../components/dummy-assets/common/img/N-m.png" width="90" height="auto"
              title="#"
            />
            <span>
              © 2019 <a href="#" target="_blank">Powered by Nucigent Technology</a>
             
            </span>
          </div>
        </div>
      </div>
    </div>
    <a
      href="javascript: void(0);"
      class="cui-utils-scroll-top"
      onclick="$('body, html').animate({'scrollTop': 0}, 500)"
      ><i class="icmn-arrow-up"></i
    ></a>
  </div>
</div>
</div>
</div>
</div>
</body>

</html>