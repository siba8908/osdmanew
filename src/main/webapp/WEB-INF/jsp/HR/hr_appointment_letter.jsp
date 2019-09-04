<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>

<script src="<c:url value='/vendors/customizedjs/letterOperation.js'/>"></script>
<script src="<c:url value='/vendors/customizedjs/appoinmentLetter.js'/>"></script>

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
    <span class="text-muted"> </span>
    <strong>Human resource</strong>
    <small class="text-muted"></small>
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
										<td><div class="col-md-9">
												<input type="text" class="form-control" name="recipentName" placeholder="Recipent Name"/>
											</div></td>
											<td><div class="col-md-9">
												<input type="text" class="form-control" name="salary" placeholder="Enter Salary"/>
											</div></td>
										<td>
											<div class="col-md-9">

												<select class="form-control" name="designation">
													<option>Select Designation</option>
													<c:forEach items="${ol.designationlist}" var="designation"> 

													<option>${designation.designationName}</option> 
													</c:forEach> 
												</select>
											</div>
										</td>
										<th>Select DOJ:</th>
										<td><input type="date" class="form-control"
												placeholder="Select Date" name="doj" /></td>
										<!-- <td><div class="col-md-9">
												<input type="text" class="form-control" name="senderName"  />
											</div></td> -->
										<td><button type="button" class="btn btn-primary" onclick="letterPreviewData()">Preview</button></td>
									</tr>
									</tbody>
							</table>
							</form>
							<section class="card" id="PrintDiv">
							
  
							<div class="card-header" >
  
   <div class="cui-login-block-sidebar-title">
            <img src="../components/dummy-assets/common/img/logo - Copy.png" width="154" height="82"> <strong>
</strong>

     <div class="pull-right">        
          <p style="font-weight:200:">
           SUNJRAY INFO SYSTEM Pvt. Lmt. </p>
           <p>	Address First Floor,1294(P) Gouri Complex</p>
           <p>CRP Square Bhubaneswar, Odisha 751012</p>
           <p>Phone: 0674 256 2506   |   www.sunjray.com</p>
           
           
            </div> 
              <br />
              
              
         
   
            </div>
            
       
            
  
  </div>

<section class="card">
  <div class="card-header">
    <span class="cui-utils-title">
     <div class="cui-info-card cui-info-card-white-font bg-success">
      <strong>Appointment Latter</strong>
     </div>
    </span>
  </div>
  <div class="card-body">
    <div class="row">
      <div class="col-lg-12">
        <!-- Headings -->
        <div class="mb-5">
          <h5 class="text-black">
            <strong>SUBJECT:Appontment Letter"</strong>
          </h5>
          
         
          <h4><b class="recipentname"></b> </h4>
<!--           <h4>[Title] </h4> -->
<!--           <h4>[Company Name] </h4> -->
<!--           <h4>[Street Address] </h4> -->
<!--           <h4>[City,ST ZIP Code] </h4> -->
          
<!--           <p class="text-muted"> -->
            Dear <b class="recipentname"></b>
             <h5>Appointment as <b class="designation"></b>
         <p>We refer to your  recent  interview for the above position and are pleased  to advise that we are offering you the position with our 
         Company effective from<b class="doj"></b> under  the following  terms and conditions.</p>
            <h5><strong>1.SALARY</strong></h5>
            <P>Your salary will commence at Rs <b class="salary"></b>Per month.</P>
            <p><strong>2.PROBATIONARY HOURS</strong></p>
            <P>Your appointment will be subject to a probationary period of 3 months.An official  confirmation of your appointment  will be  notified to  you in writing.</P>
            <p><strong>3.WORKING HOURS</strong></p>
        <P>Your working hours will be as follow:</P>
            
          <p>Mon-Sat</p>
          <p>Lunch Break</p>
          <p>At time you may be required to work  irregular hours including Saturday and Sunday.Appropriate time  off will be considered for work  Perform outside normal operation hours.</p>
          <p><strong>4.LEAVE OF ABSENCE</strong></p>
          <P>Leave of absence whether medical or annual will be given in accordance with the Company's Employee Handbook.Application on prescribed from for leave must be  made one week in advance. 
          </p>
          <p><strong>5.PAID LEAVE</strong></p>
          <P><strong>5.1ANNUAL LEAVE</strong></P>
          <P>The annual leave will be follows:-</P>
          <p>a)EEmployee for 1-3 years:days b)Employee for 4-5 years:days c)Employee for more than 5 years:days</p>
          <p></p>
          <p>The maximum leave will be fixed at <b></b> days.The leave will be taken  at interval unless requested for  special such as an overseas trip.No leave will be granted immediately before/after Public Holiday.Employee may carry forward maxmium of 7 working day's unutillised leave to the following year and must be utilised by end of that  year.</p>
          <p><strong>5.2MARRIAGE LEAVE</strong></p>
          <P>Permanent employee are entitled to 2 days' Marriage Leave.</P>
          <p><strong>5.3COMPASSIONATE LEAVE</strong></p>
          <p>Permanent employees are entitled to-
          <P>a)3days- death of spouse child  or parent</P>
          <p>b)1day-death of parent-in-law ,broth,sister or grandparent.</p>
          <p><strong>6.BONUS</strong></p>
          <p>Bonus is dependent upon the  Company's profitability and your  performance.it is only  payable at the end of  one year's services and will  e paid before chinese New Year.</p>
          <p><strong>7.EPF</strong></p>
          <P>Deduction of employee's contribution and employee's share of  contribution will e in accordance with the respective ordinance our recently enforced</P>
          <p><strong>8.PERIOD OF NOTICE FOR TERMINATION OF EMPLOYMENT</strong></p>
          <P>Period of notion for termination of employment or salary in lieu shall be as follows.</P>
          <p>a)First month of probation-without notice</p>
          <p>HKIHRM Toolkits:HR Sample -Letter of Appointment(HK)</p>
          <P>b)Second month till probation end-7days</P>
          <p>c)After probation-1 month</p>
          <p>Leave cannot be utilized as resignal notice.</p>
          <p><strong>9.FRINGE BENEFITS</strong></p>
          <P>Upon satisfactory completion of the probation period you will become our permanent employee and entitled to the fringe benefits specified in the employee Handbook.you are required to serve the company with loyalty and strictly follow all instructionns given to you by your supervisors in carrying  out your duties.You shall not take or engage in any other employement ,trade, business.Whatsoever outside the business of the company during the period of your employment.</P>
          <p><strong>10.CONFIDENTIALITY</strong></p>
          <P>You shall not at any time during or after your employment  term with the company  reveal any of the affairs or  secrets of the company  to any other person(s) nor use or attempt to use any information which you may acquire in the employment in any  manner which may injure or cause to the Company.</P>
          <p><strong>11.RESIGNATION/TERMINATION</strong></p>
          <P>The company shall be at liberty at any time by  notice in writing summarily terminate the  service of the  employee if:-</P>
          <p>a)she/he is guilty of misconduct.</p>
          <p>b)She/he is negligent in the discharge  of her/his duties;or </p>
          <p>c)begin absent or begin unable to perform her/his duties and alleging ill-health as the cause thereof,she/he refuse to practitioner nominated by the company to examine her/him or shall fail to give to suh medical practitioner the information necessary to report upon her/his state of health.</p>
          <p>Upon  the termination of her/his employee of any  means whatsoever the employee shall not for a period of 12months there after  undertake or carry on either  alone or in partnership not be employee or interested directly or indirectly in any capacity whatever i the business of <b></b>within country and shall not during the lieu period and within he same area either per somally or by her/his agent or by letters.circulars or advertisements whether on her/his own behalf of any other person.firm or company canvass or solicit order from or in any way interfere with any person(s),company who shall at any  time during the continuance of the employee's employment thereunder have been a customer or customers of the company its associates not use or disclose any information convenin the company's or its associates' business or affairs or any customer  of the company of its  associates which  may have been acquired by her/him in the course of  or as incident to her /his employment  here under for her/his own benefit or to the  detriment or intended or probable detriment of the company or its associates.Upon resignation or termination of service.you shall deliver to the person in change  all documents in your possession which belong to the company.</p>
          <p>To avoid any doubt.it is  here by declared that the property and all such documents used in the course of your work belong to the company.
         </p>
         <p>If you are agreeable to the above terms and conditions of the appointment.Kindly confirm your acceptance by signing and returning  the duplicate copy of this letter for out file and records.</p>  
         
          </h5><h5>Yours Sincerely</h5>
<!--           <h5>Human Resource Manager</h5> -->
			<h5><c:out value="${uname}"/></h5>
          <h5>I agree to the appointment and accept the above terms and conditions of service.</h5></br>
         
        
          <p>Name:</p>
            <p>Signature:</p>
         
        </div>
        <!-- End Headings -->
      </div>

      
        </div>
        <!-- End Body Copy -->
      </div>
      
  </section>
  </div>
  <p style="float: right">
							<a href="javascript: void(0);" class="btn btn-primary">Send</a>
							<button type="button" onclick="PrintElem('#PrintDiv')"
								class="btn btn-primary">Print</button>
<!-- 							<a href="javascript: void(0);" class="btn btn-primary">Download</a> -->
						</p>
</div>
</div>
</div>




</body></html>