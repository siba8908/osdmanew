<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<jsp:include page="../layout/links.jsp"></jsp:include>
<%-- <script src="<c:url value='/vendors/customizedjs/appoinmentLetter.js'/>"></script> --%>
<script src="<c:url value='/vendors/customizedjs/letterOperation.js'/>"></script>
<script src="<c:url value='/vendors/customizedjs/warningletter.js'/>"></script>
</head>

<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>
			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted"></span>
						<strong>Human resource</strong> <small class="text-muted"></small>
					</span>
				</nav>
				<div class="cui-utils-content">
					<!-- START: layout/typography -->
					<form id="letterData">
						<table class="table table-hover nowrap">
							<thead>
							</thead>
							<tbody>
								<tr>
								<td>
										<div class="col-md-9">
											<input type="text" class="form-control" name="employeecode" placeholder="Employee Code" />
										</div>
									</td>
									<td>
										<div class="col-md-9">
											<input type="text" class="form-control" name="recipentName" placeholder="Recipent Name" />
										</div>
									</td>
									
									<td>
										<div class="col-md-9">
											<input type="text" class="form-control" name="supervisor" placeholder="Manager's Name" />
										</div>
									</td>
									
<!-- 										<div class="col-md-9"> -->
<!-- 											<select class="form-control" name="designation"> -->
<!-- 												<option>Select Designation</option> -->
<%-- 												<c:forEach items="${ol.designationlist}" var="designation"> --%>
<%-- 													<option>${designation.designationName}</option> --%>
<%-- 												</c:forEach> --%>
<!-- 											</select> -->
<!-- 										</div> -->
<!-- 									</td> -->
									<th>Select DOW:</th>
									<td>
										<input type="date" class="form-control"	placeholder="Select Date" name="dow" />
									</td>
									<td>
										<button type="button" class="btn btn-primary" onclick="letterPreviewData()">Preview</button>
									</td>
								</tr>
							</tbody>
						</table>
					</form>
					<section class="card" id="PrintDiv">
						<div class="card-header">
							<div class="cui-login-block-sidebar-title">
								<img src="../components/dummy-assets/common/img/logo - Copy.png" width="154" height="82"/> <strong> </strong>
								<div class="pull-right">
									<p style="font-weight: 200:">SUNJRAY INFO SYSTEM Pvt. Lmt.</p>
									<p>Address First Floor,1294(P) Gouri Complex</p>
									<p>CRP Square Bhubaneswar, Odisha 751012</p>
									<p>Phone: 0674 256 2506 | www.sunjray.com</p>
								</div><br />
							</div>
						</div>
						<!-- START: forms/extras -->
						<div class="card-header">
							<div class="cui-info-card cui-info-card-white-font bg-success">
								<span class="cui-utils-title">
									<strong style="color:white">Warning Letter</strong>
								</span>
							</div>
						</div> <br><br>
						<div  style="background-color:#FFF;padding-left:30px;padding-right:20px;padding-top:20px">
         					<h5><strong> SUBJECT : Warning Letter</strong></h5><br>
          					<!-- <strong ><b class="date">Date:</b></strong> -->
             				<strong class="recipentname"></strong> 
            				<p><b class="companyName"></b><br><b class="allAddress"></b></p><br>
                 			<p >You are receiving this first Warning as a result of the issue(s) described below. Please be aware that this is the first step in <b class="companyName">'s</b> progressive  discipline process.We trust that you will correct this matter by improving your performance of your job and/or refraining from the act or omission that has led to this First Warning Notice. Failure to make appropriate corrections will lead to further discipline.up to and including discharge.   </p>
	    					<strong>NATURE OF INFRACTION</strong>
    					</div>
						<div class="card-body" id="all_checked_data" >
    						<div class="row">
      							<div class="col-lg-6">
       								<div class="mb-5">
          								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" id="Performance" type="checkbox" checked value="1"/> Poor Work Performance
              								</label>
          								</div>
				        				<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked  value="2" /> Tardiness
								            </label>
          								</div>
          								<div class="form-check disabled">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox"  value="3" /> Insubordination
             								</label>
          								</div>
           								<div class="form-check">
           									<label class="form-check-label">
              									<input class="form-check-input" type="checkbox"  checked value="4" /> Improper Conduct
             								</label>
          								</div>
           								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox"  value="5" /> Safety Violation
              								</label>
          								</div>
           								<div class="form-check">
           				 					<label class="form-check-label">
              									<input class="form-check-input" type="checkbox"  value="6" /> Refusal to Work Overtime
             								</label>
            							</div>
           								<div class="form-check">
            								<label class="form-check-label">
								           		<input class="form-check-input" type="checkbox" checked value="7" /> Others
								           	</label>
								           	<input type="text" class="form-control" checked placeholder="Enter text" id="l1" />
								        </div>
        							</div>
      							</div>
      							<div class="col-lg-6">
       								<div class="mb-5">
         								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked value="8" /> Absenteeism
              								</label>
          								</div><br />
          								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked value="9" /> Substance Use or Abuse
              								</label>
          								</div>
          								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked  value="10" />  Abuse of Leave
             								</label>
  										</div>
          								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked  value="11" /> Misuse of Email or Telephone
              								</label>
          								</div>
          								<div class="form-check">
           									<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked value="12" /> Property Damage
             								</label>
          							    </div>
          								<div class="form-check">
            								<label class="form-check-label">
              									<input class="form-check-input" type="checkbox" checked value="13" /> Failure to Comply with Company Policy
              								</label>
            							</div>
        							</div>
      							</div>
    							<div class="form-group" style="margin-left:20px">
              						<label class="form-label" for="validation-username" style="color:#06F">Date
              							<input id="validation-username" class="form-control" name="validation[username]" type="text" 
              								   data-validation="[L>=6, L<=18, MIXED]" 
              								   data-validation-message="$ must be between 6 and 18 characters. No special characters allowed."
                							   data-validation-regex="/^((?!admin).)*$/i" 
                							   data-validation-regex-message='The word "Admin" is not allowed in the $'
              							/>
              						</label>	
            					</div>
            					<div class="form-group">
              						<label class="form-label" for="validation-username" style="color:#06F">Time
              							<input id="validation-username" class="form-control" name="validation[username]" type="text"
                							   data-validation="[L>=6, L<=18, MIXED]"
                							   data-validation-message="$ must be between 6 and 18 characters. No special characters allowed."
                							   data-validation-regex="/^((?!admin).)*$/i"
                							   data-validation-regex-message='The word "Admin" is not allowed in the $'
              							/>
              						</label>	
            					</div>
            					<div class="form-group">
              						<label class="form-label" for="validation-username" style="color:#06F">Location of Infraction
              							<input id="validation-username" class="form-control" name="validation[username]" type="text"
                							   data-validation="[L>=6, L<=18, MIXED]"
								               data-validation-message="$ must be between 6 and 18 characters. No special characters allowed."
								               data-validation-regex="/^((?!admin).)*$/i"
								               data-validation-regex-message='The word "Admin" is not allowed in the $'
							              />
							         </label>    
							    </div>  
           					</div>
             				<div class="form-group">
              					<label class="form-label" for="validation-username" style="color:#06F">DETAILS</label>
            						<textarea id="validation-username" class="form-control" name="validation[username]"
               								  data-validation="[L>=6, L<=18, MIXED]"
                						      data-validation-message="$ must be between 6 and 18 characters. No special characters allowed."
                							  data-validation-regex="/^((?!admin).)*$/i"
                							  data-validation-regex-message='The word "Admin" is not allowed in the $'>
             						</textarea>
           		 			</div>
            				<p>
            					<strong>Supervisor/Manager's Name : <b class="supervisor"></b></strong><br><strong>
            				</p>
            				<br><strong>Employee's Name :<b class="recipentname"></b> </strong><br><br>
            				<strong>Employee's Code :<b class="employeecode"></b> </strong><br><br>
            				<p>
            					I acknowledge that i have received a copy of the foregoing First Written Warning and that i have had an opportunity to discuss it with my supervisor or designated manager.
            				</p>
            				<br><br><label>________________________________</label><br>
            				<strong>Employee's Signature</strong>
            				<br><br>
            				<div style="background-color:#FFC;padding:20px 20px 20px 20px">
	             				<p><strong style="color:#03C">EMPLOYER NOTES : </strong></p>
	             				<P>This form is provided as a model to be adapted to your individual business needs.Employers are strongly advised to consult with experienced employment counsel prior to any action involving discipline or discharge. It is important to provide as much detail as possible in the warning. If there is ever litigation or any other matter related to the employee's behavior or performance.It is imperative that this warning be well documented.The detail should be such that someone reading this a few years from now, other than the auther, will know and understand the details clearly. Be specific in the details .It is important that you both (1) apprise the employee of the basis of the discipline So that he or she can correct the behavior, and (2) create a paper trail in case of legal claims or other grievances by the employee later on. It is a good practice to allow employees to place a responce in their personnel file. It may or may not make much difference in the end, but it does give the employee a sense of having "been heard". If you allow the employee to submit a statement, include a sentence to that effect in the notice, such as "You may, if you wish, provide a written comment ti this First Written Warning for placement in your personnel file.Any such written response must be submitted to your supervisor within ten (10) business days of your receipt of the warning."  </P>
             				</div>
             			</div>
             			
               	</section>
  				<p style="float: right">
  				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Send</button>
<!-- 					<a href="javascript: void(0);" class="btn btn-primary" id="sendmail">Send</a> -->
					<button type="button" onclick="PrintElem('#PrintDiv')" class="btn btn-primary">Print</button>
<!-- 					<a href="javascript: void(0);" class="btn btn-primary">Download</a> -->
				</p>
			</div>
		</div>
		<jsp:include page="../layout/footer.jsp"></jsp:include>
	</div>
	
</div>
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="open" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Email Form</h4>
      </div>
      <div class="modal-body">
         <div class="container">
            <!-- Form Started -->
           
            <div class="container form-top">
                <div class="row">
                    <div class="col-md-12 col-md-offset-3 col-sm-12 col-xs-12">
                        <div class="panel panel-danger">
                            <div class="panel-body">
                                <form id="reused_form">
<!--                                     <div class="form-group"> -->
<!--                                         <label><i class="fa fa-envelope" aria-hidden="true"></i> From</label> -->
<!--                                         <input type="email" name="formmail" class="form-control" placeholder="Enter Email"> -->
<!--                                     </div> -->
                                    <div class="form-group">
                                        <label><i class="fa fa-envelope" aria-hidden="true"></i> To</label>
                                        <input type="email" name="email" class="form-control" placeholder="Enter Email">
										
										
                                    </div>
                                   
<div class="form-group">
                                        <label><i class="fa fa-envelope" aria-hidden="true"></i> Cc</label>
                                        <input type="email" name="email" class="form-control" placeholder="Enter Email">
										
										
                                    </div>
                                    <div class="form-group">
                                        <label><i class="fa fa-envelope" aria-hidden="true"></i> Bcc</label>
                                        <input type="email" name="email" class="form-control" placeholder="Enter Email">
										
										
                                    </div>
									 <div class="md-form mb-5">
          <i class="fas fa-tag prefix grey-text"></i>
          <input type="text" id="form32" class="form-control validate">
          <label data-error="wrong" data-success="right" for="form32">Subject</label>
        </div>
        	<div class="form-group">
                                        <label><i class="fa fa-paperclip" aria-hidden="true"></i> Attachment</label>
                                          <input type="file" rows="3" name="attachment" class="form-control" multiple> 
                                    </div>

                                    <div class="form-group">
                                        <label><i class="fa fa-comment" aria-hidden="true"></i> Message</label>
                                        <textarea rows="3" name="message" class="form-control" placeholder="Type Your Message"></textarea>
                                    </div>
								
                                    <div class="form-group">
<!--                                       <button type="button" id="postmail"></button> -->
                                        <button type="button" class="btn btn-raised btn-block btn-danger" id="postmail">Post &rarr;</button>
                                    </div>
                                </form>
                                <div id="error_message" style="width:100%; height:100%; display:none; ">
                                    <h4>
                                        Error
                                    </h4>
                                    Sorry there was an error sending your form. 
                                </div>
                                <div id="success_message" style="width:100%; height:100%; display:none; ">
<h2>Success! Your Message was Sent Successfully.</h2>
</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
         
            <!-- Form Ended -->
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
</body>


</html>