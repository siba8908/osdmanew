<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOM JS -->
<script src="../vendors/customizedjs/empappraisal.js"></script>
<script src="../vendors/customizedjs/print_download.js"></script>
<script src="../vendors/validationjs/appraisal.js"></script>
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
		<div class="cui-layout"> 
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<span class="font-size-18 d-block">
					<span class="text-muted">Home</span>
    				<strong>Appraisal</strong>
					<small class="text-muted"></small>
  				</span>
  				<div class="cui-utils-content">
  				<form id="letterData">
					<div class="row">
	 					<div class="col-md-4">
	 						<input type="text" class="form-control" id="empId" placeholder="Enter Employee Code">
	 					</div>
	    				<div  class="col-md-4">
	    					<button type="button" id="btnEnterEmpCode" class="btn btn-primary">Search</button>
	    				</div>
					</div>
	 				<!-- START: forms/basic-forms-elements -->
					<section  id="PrintDiv"> 
	   					<div class="card-header">
		   					<span class="cui-utils-title">
						    	<strong>Personal particular</strong>
						    </span>
						</div>    
	  					<div class="card-body">
					   		<!-- Horizontal Form -->
							<div class="form-group row">
					    		<label class="col-md-3 col-form-label" for="l0">Name of Appraisal:</label>
						        <div class="col-md-9">
						        	<p id="empName" />
							    </div>
	            			</div>
	            			<div class="form-group row">
	              				<label class="col-md-3 col-form-label" for="l10">Employee Code:</label>
	              				<div class="col-md-9">
	                 				<p id="empCode" />
	              				</div>
					        </div>
	        				<div class="form-group row">
	              				<label class="col-md-3 col-form-label" for="l13">Designation</label>
	              				<div class="col-md-9">
	                  				<p id="empDesg" />
	              				</div>
	            			</div>
	          				<div class="form-group row">
	         					<label class="col-md-3 col-form-label" for="l13">Section</label>
	                     		<div class="col-md-9">
		                			<p id="empSec" />
		              			</div>
	           				</div>  
	          				<div class="form-group row">
								<label class="col-md-3 col-form-label" for="l13" >Remarks</label>
	              				<div class="col-md-9">
	                				<p class="remarks"><input type="text" class="form-control" placeholder="Enter Remark" id="empRemarks" name="remarks" /></p>
	               				</div>
	              				<span id="rmrk" class="text-danger font-weight-bold"></span>
	              			</div>
	              			<div class="form-group row">
		              			<label class="col-md-3 col-form-label" for="l13">Date of employment From</label>
			              		<div class="col-md-9">
									<p id="empDOE" />
				          		</div>     
	              			</div>
							<div class="form-group row">       
	              				<label class="col-md-3 col-form-label" for="l13">Period under review:</label>
	              				<div class="col-md-4">	 
				    				<label class="col-md-3 col-form-label" for="l13">From:</label>
					        			<div class="form-group">
						    				<p class="reviewDateFrom"><input type="date" class="form-control" placeholder="Select Date" id="datepicker-only-init" name="reviewDateFrom" /></p>
		          							<span id="dtf" class="text-danger font-weight-bold"></span>
		          						</div>
	             					<label class="col-md-3 col-form-label" for="l13">To:</label>
					        			<div class="form-group">	
						        			<p class="reviewDateTo"><input type="date" class="form-control" placeholder="Select Date" id="datepicker-only-init1" name="reviewDateTo" /></p>
											<span id="dt" class="text-danger font-weight-bold"></span>
										</div>
								</div>
	              			</div>
							<div class="form-group row">
								<label class="col-md-3 col-form-label" for="l13">Salary</label>
							    <div class="col-md-9">
							    	<p id="empSalary" />
							    </div>
							</div>	
						</div>
						
						<div class="card-header">
							<span class="cui-utils-title">
						   	 	<strong>Record of Assessment/Review</strong>
						   	</span>
						</div>	   	
						<div class="card-body">
						   	<div class="form-group row">
						    	<label class="col-md-3 col-form-label" for="l0">Name </label>
						        <div class="col-md-9">
						        	<p class="enterName"><input type="text" class="form-control" placeholder="Enter Name" id="fullname" name="enterName" /></p>
						        </div>
						       	<span id="nm" class="text-danger font-weight-bold"></span>
						    </div> 
							<div class="form-group row">
							  	<label class="col-md-3 col-form-label" for="l0">Signature </label>
								<div class="col-md-5">
									<p class="file"><input type="file" name="file" id="image"></p>
									<img src="" id="sign" width="200px" />
									<script type="text/javascript">
									    function readURL(input) {
									        if (input.files && input.files[0]) {
									            
									        	var reader = new FileReader();
									            reader.onload = function (e) {
									                $('#sign').attr('src', e.target.result);
									            }
									            reader.readAsDataURL(input.files[0]);
									        }
									    }
									    $("#image").change(function(){
									        readURL(this);
									    });
									</script>
							     </div>
							</div>
							<div class="form-group row">
								<label class="col-md-3 col-form-label" for="l13">Member  committee(MC) member or Supervisor of the appraise.</label>
							</div>
						</div>	
						<div class="card-header">
							<span class="cui-utils-title">
								<strong>Performance Assessment</strong>
							</span>
						</div>	
						<div class="card-body">
							<div class="form-group row">
						       	<label class="col-md-3 col-form-label" for="l13">Attendance</label>
						        <div class="col-md-9">
									<p class="present">
										<select class="form-control" id="l13" name="present">
								           	<option></option>
								            <option>1</option>
								            <option>2</option>
								            <option>3</option>
								            <option>4</option>
								            <option>5</option>
								        </select>
							        </p>
						        </div>
						     </div>
						     <div class="form-group row">
						       	<label class="col-md-3 col-form-label" for="l13">Teamwork</label>
						        <div class="col-md-9">
							       	<p class="team">
							       		<select class="form-control" id="l13" name="team">
								        	<option></option>
								            <option>1</option>
								            <option>2</option>
								            <option>3</option>
								            <option>4</option>
								            <option>5</option>
							            </select>
						            </p>
					            </div>
					        </div>
					        <div class="form-group row">
					        	<label class="col-md-3 col-form-label" for="l13">Job knowledge & skills</label>
							    <div class="col-md-9">
							       	<p class="job">
								       	<select class="form-control" id="l13" name="job">
									       	<option></option>	
									        <option>1</option>
									        <option>2</option>
									        <option>3</option>
									        <option>4</option>
									        <option>5</option>
								    	</select>
									</p>
						        </div>
						    </div>
					        <div class="form-group row">
					          	<label class="col-md-3 col-form-label" for="l13">General conduct</label>
					           	<div class="col-md-9">
					               	<p class="gc">
						               	<select class="form-control" id="l13" name="gc">
						               		<option></option>
							               	<option>1</option>
								            <option>2</option>
								            <option>3</option>
								            <option>4</option>
								            <option>5</option>
							            </select>
						            </p>
						        </div>
						    </div>
						    <div class="form-group row">
						       	<label class="col-md-3 col-form-label" for="l13">Quality of work</label>
						       	<div class="col-md-9">
						           	<p class="work">
						           		<select class="form-control" id="l13" name="work">
							           		<option></option>
							           		<option>1</option>
							        		<option>2</option>
							                <option>3</option>
							                <option>4</option>
							               	<option>5</option>
							            </select>
							    	</p>
						        </div>
						    </div>
		             		<div class="form-group row">
		              			<label class="col-md-3 col-form-label" for="l13">Discipline</label>
		              			<div class="col-md-9">
		                			<p class="disc">
		                				<select class="form-control" id="l13" name="disc">
								        	<option></option>
								            <option>1</option>
								            <option>2</option>
								            <option>3</option>
								            <option>4</option>
								            <option>5</option>
						            	</select>
						            </p>
						        </div>
						    </div>
							<div class="form-group row">
							    <label class="col-md-3 col-form-label" for="l13">Initiative & motivation</label>
							    <div class="col-md-9">
							    	<p class="init">
								       	<select class="form-control" id="l13" name="init">
									       	<option></option>
									        <option>1</option>
									        <option>2</option>
									        <option>3</option>
									        <option>4</option>
									        <option>5</option>
				                		</select>
				                	</p>	
		              			</div>
		              		</div>
		              	</div>	
	              		
	              		<div class="card-header">
	    					<span class="cui-utils-title">
	      						<strong>Overall performance rating</strong>      
	    					</span>
	    				</div>
	    				<div class="card-body">
	    					<div class="form-group row">
							    <label class="col-md-3 col-form-label" for="l13">Rating</label>
							    <div class="col-md-9">
							    	<p class="rate">
								       	<select class="form-control" id="l13" name="rate">
									       	<option></option>
									        <option>Substantially exceeds job</option>
									        <option>Exceed job requirement</option>
									        <option>Meets job requirement</option>
									        <option>Partially meet job requirement</option>
									        <option>Does not meet most job requirement</option>
				                		</select>
				                	</p>	
		              			</div>
		              		</div>
		              	</div>	
		              			          		
		          		<div class="card-header">
	     					<div class="card-body">
		     					Special task taken up or comendation obtain by the appraise during the appraisal period (to be filled by the mc member/supervisor)
			  					<div class="col-md-12">
			  						<input type="text" class="form-control">
			  					</div>
			  				</div>	
		  				</div>
						
						<div class="card-header">
							<div class="card-body">
			  					Overall comments on performance(to be filled by the mc member/supervisor) 
				      			<div class="col-md-12">
					   		    	<input type="text" class="form-control"  />
					            </div>   
					        </div>     
			      		</div>
			      	</section>
		      		<p style="float: right">
		      			<button type="button" class="btn btn-primary" onclick="PreviewLetter()">Preview</button>
		      		</p>	
		      	</form>
		     	</div>	
		    </div>	
    		<div> 
		   		<p style="float: right"> 
		   			<a href="javascript: void(0);" class="btn btn-primary">Send</a>
					<button type="button" onclick="PrintElem('#PrintDiv')"class="btn btn-primary">Print</button>
					<a href="javascript: void(0);" class="btn btn-primary">Download</a>
		   		</p>
  			</div>
          		<!-- End Vertical Form -->
          	
 			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>

 <script>
  (function($) {
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
      

    })
  })(jQuery)
</script>

</body>


</html>