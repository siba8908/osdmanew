<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- Mirrored from cleanuitemplate.com/admin/html/preview/versions/menu-left/forms-selectboxes.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Apr 2019 09:16:51 GMT -->
<!-- CUSTOM JS -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
<script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script>
<script src="../vendors/customizedjs/attendance.js"></script>

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
					    <strong>Human Resource </strong>
					    <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
				<!-- START: forms/selectboxes -->
					<section class="card">
  						<div class="card-header">
    						<span class="cui-utils-title">
							    <strong>Attendance</strong>
    						</span>
    	  				</div>
    					<form name="attendance" id="attendance">       
   							<div class="table-responsive mb-5"  >
    							<table class="table table-hover">
						          	<!-- <td id="show_error_date"></td>
						          	<td id="show_error_day"></td>
						          	<td id="show_error_status"></td> -->
					         		<thead>
							            <tr style="background-color:#09F">
	               							<th style="text-align:center"> Date</th>
	               
	                 						<th style="text-align:center">Day</th>
	                 
	                 						<th style="text-align:center">Status</th>
	                						<th></th>
              							</tr>
            						</thead>
            						<tbody>
              							<tr>
                
               								<td>
               									<div class="form-group">
                   									<input
										              type="date"
										              class="form-control"
										              id="datedata"
										              name="attendeeDate"
										            />
										        </div>
										    </td>
										    <td> <div class="form-group row">
								              
								              <div class="col-md-12">
								                <select class="form-control" name="attendeeDay" id="day">
								                <option >Select...</option>
								                 <option value="Mon">Mon</option>
								                  <option value="tus">tus</option>
								                  <option value="wed">wed</option>
								                  <option value="thu">thu</option>
								                   <option value="fri">fri</option>
								                    <option value="sat">sat</option>
								                     <option value="sun">sun</option>
								                </select>
								                
									              </div>
									              </div>
									            </td>
									            <td> <div class="form-group row">
			              
			              <div class="col-md-12">
			                <select class="form-control" name="status" id="status">
			                <option value="0"></option>
			                 <option value="1">Absent</option>
			                  <option value="2">Present</option>
			                  <option value="3">Leave</option>
			                 
			                </select>
			              </div>
			            </div></td>
			                
			              </tr>
			             
			         
			          
			              
			                <tr>
			              
			                <td>${attendance.attendeeDate}</td>
			        <!--  <div class="show_error_date"></div> -->
			                <td>${attendance.attendeeDay}</td>
			                <td>${attendance.status}</td>
			               
			                
			              </tr>
			             <tr>
			            <!--  <td id="show_error_date"></td>
			             <td id="show_error_day"></td> -->
			             
			             </tr>
			            </tbody>
			            <tfoot>
			            
			            </tfoot>
			          </table>
			                  
			              
			        </div>
			      
			     <div class="mb-5">
			     
			     
			   
			      <table class="table table-hover" id ="emptable">
			      
			       <td id="show_error_employee-code"></td>
			            <thead>
			    
			               <tr style="background-color:#09F">
			              
			             
			                  <th></th> 
			                 <th >Employee Name</th>
			                 <th> Employee Code</th>
			                 <th >Designation</th>
			               
			              </tr>
			              
			              
			            </thead>
			            
			            
			            
			                                  <c:forEach items="${empdlts}" var="emp">
														<tr>
														     <td><input type="checkbox" value="${emp.employee_code}"/></td>
														    <td>${emp.fullName}</td>
															<td>${emp.employee_code}</td>
															<td>${emp.designation}</td>
															
														</tr>
													</c:forEach>
													
													
													<td>      <div class="input-group-append" >
			                      <a class="btn btn-default btn-sm" id ="btnSave" style="
			                                        margin-left:
			                                        5px; background-color:#09F;"> Save
			                      </a>
			                      
			                    </div></td>
													
													
			            <tfoot>
			             
			            </tfoot>
			          </table>
			        </div>
			          </form>
			  </section>
			<!-- END: forms/selectboxes -->
			
			<!-- START: page scripts -->
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


</html>