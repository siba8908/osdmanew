<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- CUSTOM JS -->
<script src="../vendors/customizedjs/termination.js"></script>
<script src="../vendors/customizedjs/print_download.js"></script>
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
				<!-- START: ../components/modal -->
					<div class="mb-5">         
					    <form id="letterData">
					    	<div class="row">
					    		<div class="col-md-4">
							    	<input type="text" class="form-control" id="empCode" placeholder="Enter Employee Code">
				       			</div>
				        		<div  class="col-md-4"><button type="button" id="search" class="btn btn-primary">Search</button></div>
				    		</div>
			        		<table class="table table-hover">
			            		<thead>
						           	<tr style="color:#06C">
							        	<!-- <th style="padding-left:50px"></th> -->
							    	    <th style="padding-left:50px">Reason For Termination</th>
							            <th style="padding-left:50px">Property Refund Date</th>
							            <th style="padding-left:50px">Termination Date</th>             
						            </tr>
						        </thead>
						        <tbody>
						            <tr>
										<td><input type="text" class="form-control" placeholder="Enter Reason" name="reason" /></td>
				            			<td><input type="date" class="form-control" placeholder="Select Date" name="propertyReturnDate" /></td> 
				            			<td><input type="date" class="form-control" placeholder="Select Date" name="terminationDate" /></td>
										<td><button type="button" class="btn btn-primary" onclick="PreviewLetter()">Preview</button></td>
						  			</tr>
								</tbody> 
							</table>
						</form>
			  		</div>	
			 		<section class="card" id="PrintDiv">
			 			<div class="card-header" style="background-color:#F00;color:#FFF">
				    		<span class="cui-utils-title">
				      			<strong>Termination-Letter</strong>
				    		</span>
						</div><br><br>
			    		<div style="background-color:#FFF;padding-left:20px;padding-right:20px;padding-top:20px">
			    			<h4><strong>SUBJECT : Termination of your employment</strong></h4><br>
			    			<strong><b class="recipientName"></b></strong><br>
			    			<strong id="todaydate" style="float:right;margin-right:100px"></strong>
			    			<p><b class="companyname"></b></p>
			    			<p><b class="allAddress"></b></p><br>
			    			
						    <p>Dear <b class="recipientName"></b>,</p>    
						    <p>
						 	   	I am sorry to inform you that as of <b class="terminationDate"></b>, you'll be no longer employed with <b class="companyname"></b>. As discussed, we think this is the best decision, because of <b class="reason"></b>. [This is the final step in our disciplinary process/performance Improvement plan which we launched on_date_] .
						    </p>
						    <p>
						    	From <b class="terminationDate"></b> on you won't be eligible for any compensation or benefits associated with your position. Please return [company property that must be returned] before <b class="propertyReturnDate"></b> to the Human Resources office.
						    </p>
						    <p>
						       	You are entitled to your salary up until <b class="terminationDate"></b> and we'll also compensate you for your remaining vacation days. We'll also provide severance pay that will amount to [amount]. [You'll receive a separate letter with the complete details of compensation or other related information you're entitled to receive from us].
						    </p>
						    <p>
						       	Please keep in mind that you have signed a non-compete,non-solicitation and non-disclosure agreement. If you have any information about our customers,employees or other stockholders stored on paper or on your personal devices you must delete it immediately.
						    </p>
						    <p>
						        If you have questions or clarifications, I'm at your disposal for up to [five] working days after your last day of employment.
						    </p>
						    <br>
						    <strong style="font-family:'Arial Black', Gadget, sans-serif">We Wish You Best Of luck</strong><br><br/>
						    <strong>Sincerely</strong><br>
						    <strong><c:out value="${uname}" /></strong><br>
						    <!-- <strong>[Title]</strong><br>
						    <strong>Enclosure</strong><br><br/> -->
						    <p style="background-color:#FFC; padding:20px 20px 20px 20px">
						    	<strong style="color:#03F;font-size:18px">Disclaimer:</strong><br>Note that this letter should be used as a reference only. It doesn't take into account all local, national or international laws. Consult your attorney or legal expert before sending a termination letter to employee.        
						    </p>
			 			</div>
			 		</section>				  
				 	<p style="float: right"> 
				 		<a href="javascript: void(0);" class="btn btn-primary">Send</a>
				 		<button type="button" onclick="PrintElem('#PrintDiv')"class="btn btn-primary">Print</button>
						<a href="javascript: void(0);" class="btn btn-primary">Download</a>
				 	</p>
					<!-- END: ../components/modal -->
				</div>
			</div>
			<jsp:include page="../layout/footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>