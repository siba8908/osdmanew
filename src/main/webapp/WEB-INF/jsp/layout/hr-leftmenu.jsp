<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<nav class="cui-menu-left">
	<div class="cui-menu-left-trigger cui-menu-left-trigger-action"></div>
	<div class="cui-menu-left-handler">
		<div class="cui-menu-left-handler-icon"></div>
	</div>
	<div class="cui-menu-left-inner">
		<div class="cui-menu-left-logo">
			<a href="dashboards-alpha.html"> <img
		    class="cui-menu-left-logo-default"
		    src="../components/dummy-assets/common/img/logo-p.png"
		    alt=""
		 />
		<img
			class="cui-menu-left-logo-toggled"
		    src="../components/dummy-assets/common/img/logo-pmt.png"
		    alt=""
		 />
			</a>
		</div>
		<div class="cui-menu-left-scroll">
			<ul class="cui-menu-left-list cui-menu-left-list-root">
				<li class="cui-menu-left-item"><a href="hr-dashboard"> <span
						class="cui-menu-left-icon icmn-cog"></span> <span
						class="cui-menu-left-title">Dashboard</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="javascript: void(0);"> <span
						class="cui-menu-left-icon icmn-loop"></span> <span
						class="cui-menu-left-title">Recruitment</span>
				</a>
					<ul class="cui-menu-left-list">
						<li class="cui-menu-left-item"><a href="recruitmentList">
								<span class="cui-menu-left-title">Recruitment list</span>
						</a></li>
						<li class="cui-menu-left-item"><a href="requirementstatus">
								<span class="cui-menu-left-title">Recruitment Status</span>
						</a></li>
					</ul></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="javascript: void(0);"> <span
						class="cui-menu-left-icon icmn-file-text"></span> <span
						class="cui-menu-left-title">Manage Employee</span>
				</a>
					<ul class="cui-menu-left-list">
						<li class="cui-menu-left-item"><a
							href="hr-show-employee-details"> <span
								class="cui-menu-left-title">Show Employee</span>
						</a></li>
						<li class="cui-menu-left-item"><a href="hr-add-employee">
								<span class="cui-menu-left-title">Add Employee</span>
						</a></li>
					</ul></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="javascript: void(0);"> <span
						class="cui-menu-left-icon icmn-loop"></span> <span
						class="cui-menu-left-title">Training Details</span>
				</a>
					<ul class="cui-menu-left-list">
						<li class="cui-menu-left-item"><a href="hr-training-details">
								<span class="cui-menu-left-title">Training Details</span>
						</a></li>
						<li class="cui-menu-left-item"><a
							href="hr-view-training-details"> <span
								class="cui-menu-left-title">View Training Details</span>
						</a></li>
					</ul></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="javascript: void(0);"> <span
						class="cui-menu-left-icon icmn-file-text"></span> <span
						class="cui-menu-left-title">Letters</span>
				</a>
					<ul class="cui-menu-left-list">
						<li class="cui-menu-left-item"><a href="empOfferLetter">
								<span class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Offer Letter</span>
						</a></li>

						<li class="cui-menu-left-item"><a href="appointmentLetter">
								<span class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Appointment Letter</span>
						</a></li>

						<li class="cui-menu-left-item"><a href="hr-appraisal"> <span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Appraisal Letter</span>
						</a></li>

						<li class="cui-menu-left-item"><a href="warningLetter"> <span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Warning Letter</span>
						</a></li>

						<li class="cui-menu-left-item"><a href="terminationletter"> <span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Termination Letter</span>
						</a></li>

						<li class="cui-menu-left-item"><a
							href="experienceCertificate"> <span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Experience Certificate</span>
						</a></li>
					</ul></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a href="holidayList"> <span
						class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Holiday List</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a href="attendance"> <span
						class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Attendance</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="javascript: void(0);"> <span
						class="cui-menu-left-icon icmn-loop"></span> <span
						class="cui-menu-left-title">Leave</span>
				</a>
					<ul class="cui-menu-left-list">
						<li class="cui-menu-left-item"><a href="leavemanagement">
								<span class="cui-menu-left-title">Leave Management</span>
						</a></li>
						<li class="cui-menu-left-item"><a href="leave"> <span
								class="cui-menu-left-title">Leave Balance Report</span>
						</a></li>
					</ul></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a href="resourcesUtilisation">
						<span class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Utilization of Recourses</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="javascript: void(0);"> <span
						class="cui-menu-left-icon icmn-loop"></span> <span
						class="cui-menu-left-title">Payroll</span>
				</a>
					<ul class="cui-menu-left-list">
						<li class="cui-menu-left-item"><a href="hr-payroll"> <span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Payroll</span>
						</a></li>
						<li class="cui-menu-left-item"><a href="payrollSheet">
						 <span
								class="cui-menu-left-icon icmn-books"></span>
								 <span
								class="cui-menu-left-title">Salary Sheet</span>
						</a></li>
					</ul></li>
					
					<li class="cui-menu-left-divider">
		          <!-- -->
		        </li>
		        <li class="cui-menu-left-item cui-menu-left-submenu">
		        	<a href="javascript: void(0);">
			            <span class="cui-menu-left-icon icmn-loop"></span>
			            <span class="cui-menu-left-title">Reports</span>
		            </a>
		          	<ul class="cui-menu-left-list">
		          		<li class="cui-menu-left-item">
				          	<a href="employee_summary_report">
					            <span class="cui-menu-left-icon icmn-books"></span>
					            <span class="cui-menu-left-title">Employee Summary Report</span>
				          	</a>
				        </li>
				        <li class="cui-menu-left-item">
				          	<a href="attendance_report">
					            <span class="cui-menu-left-icon icmn-books"></span>
					            <span class="cui-menu-left-title">Daily/Monthly Attendance Report</span>
				          	</a>
				        </li>
				        <li class="cui-menu-left-item">
				          	<a href="payrollSheetReport">
					            <span class="cui-menu-left-icon icmn-books"></span>
					            <span class="cui-menu-left-title">Payroll Summary Report</span>
				          	</a>
				        </li>
				        <li class="cui-menu-left-item">
				          	<a href="resourcesUtilisationReport">
					            <span class="cui-menu-left-icon icmn-books"></span>
					            <span class="cui-menu-left-title">Resources of Utilization Report</span>
				          	</a>
				        </li>
				        <li class="cui-menu-left-item">
				          	<a href="leave_report">
					            <span class="cui-menu-left-icon icmn-books"></span>
					            <span class="cui-menu-left-title">Employee Leave Report</span>
				          	</a>
				        </li>
		            </ul>
		        </li>
			</ul>
		</div>
	</div>
</nav>