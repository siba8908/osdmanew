package com.sunjray.osdma.util;

public class QueryConstant 
{
	public static final String GET_USER = "Select * from t_os_hr_user  ";
	//Get All Designations
	public static final String GET_EMP_DESIGNATION = "select * from t_os_master_designation";
	////Get Company Details
	public static final String GET_COMPANY_NAME="SELECT company_name FROM t_os_master_company;";
	//Find User
	public static final String FIND_USER_NAME = "select * from t_os_hr_user where username=?";
	//Get Role List
	public static final String GET_ROLE_LIST="Select r.role from t_os_role_user_map ur, t_os_master_role r where ur.role_id = r.role_id and ur.user_id = ?";
	//Get Employee List
	public static final String GET_PAYROLL_BY_ID = "select el.email,el.empcode,al.empcode,al.isApprover,al.approver_for from employee_master as el INNER JOIN  approver_list as al on el.empcode=al.empcode where  al.approver_for=? and al.isapprover=? AND el.empcode!=?";
	//Insert user
	public static final String SEARCH_EMAIL = "SELECT * FROM t_os_hr_user WHERE EMAIL=? ";
	public static final String INSERT_USER = "insert into t_os_hr_user (email,name,created_date) values (?,?,CURDATE())";
	//Get All User
	public static final String DISPLAY_USER_LIST = "select * from t_os_hr_user";
	//Delete User
	public static final String DELETE_USER = "delete from t_os_hr_user where user_id=?";
	public static final String DISPLAYALL_USER_LIST = "select * from t_os_hr_user";
	
	public static final String UPDATE_USER = "UPDATE t_os_hr_user SET email=?,name=? WHERE user_id=?";
	
	//APPRAISAL LETTER
	
	public static final String GET_DETAILS_BY_EMPLOYEE_ID = "SELECT p.first_name,p.last_name,a.employee_code,d.designation,m.department_name,a.joining_date,a.salary FROM t_os_hr_emp_personal_dtls p LEFT JOIN t_os_hr_emp_add_employee a ON p.employee_id = a.employee_id LEFT JOIN t_os_master_designation d ON a.designation_id = d.designation_id LEFT JOIN t_os_master_department m ON a.department_id = m.department_id WHERE p.employee_id = ? ";
	public static final String INSERT_DATA = "INSERT INTO t_os_hr_emp_appraisal (emp_code,section,DOE,review_date_from,review_date_to,remarks,employee_id,created_date) values (?,?,?,?,?,?,?,?)";

	//Experience Details Queries...
	
	//public static final String GET_EMPLOYEE_EXPERIENCE_DETAILS="SELECT e.first_name,e.last_name,ad.present_village,ad.present_pin,ms.state_name,md.district_name,am.joining_date FROM t_os_hr_emp_personal_dtls e INNER JOIN t_os_hr_emp_address ad ON e.employee_id= ad.employee_id INNER JOIN t_os_master_state ms ON ms.master_state_id=ad.present_state INNER JOIN t_os_master_district md ON md.district_master_id=ad.permanent_dist INNER JOIN t_os_hr_emp_add_employee am ON e.employee_id=am.employee_id WHERE e.employee_id=?";
	//public static final String GET_COMPANY_NAME="SELECT company_name FROM t_os_master_company";
	
	//TERMINATION LETTER
	
	public static final String GET_TERMINATION_DETAILS = "SELECT e.first_name,e.last_name, ad.present_village,md.district_name,ms.state_name,ad.present_pin, am.joining_date FROM t_os_hr_emp_personal_dtls e LEFT JOIN t_os_hr_emp_address ad ON e.employee_id= ad.employee_id LEFT JOIN t_os_master_state ms ON ms.master_state_id=ad.present_state LEFT JOIN t_os_master_district md ON md.district_master_id=ad.permanent_dist LEFT JOIN t_os_hr_emp_add_employee am ON e.employee_id=am.employee_id WHERE e.employee_id=?";
	
	//ATTENDANCE
	public static final String GET_EMP_DETAILS_ATTN = "SELECT first_name, last_name, employee_code, designation FROM t_os_hr_emp_personal_dtls e JOIN t_os_hr_emp_add_employee u on e.employee_id = u.employee_id JOIN t_os_master_designation t on u.designation_id =  t.designation_id";
			    
	public static final String Insert_Attendance="insert into t_os_attendance"+"(employee_code,attendee_date,attendee_day,status)"+"values(?,?,?,?)";
	
	
	//payroll
	public static final String GET_WORKING_DAYS =" SELECT count(*) AS count,e.attendee_date,e.`employee_code`,e.`status`,h.holiday_date from t_os_attendance as e join t_os_hr_emp_holiday as h on  h.holiday_date !=e.attendee_date where e.employee_code=? && e.status='leave'";
	public static final String SAVE_PAYROLL = " insert into  t_os_master_deduction_type (employee_id,pf,esi,loan,tds,work_on_holidays,bonus,calcu_salary) values (?,?,?,?,?,?,?,?)";
	public static final String GET_PAYROLL_LIST = "SELECT p.first_name,p.last_name,e.employee_code,s.department_name,e.salary,e.employee_id,d.esi,d.loan,d.pf,d.tds,d.work_on_holidays,d.calcu_salary,d.bonus from t_os_hr_emp_personal_dtls p LEFT JOIN t_os_hr_emp_add_employee e on p.employee_id=e.employee_id LEFT JOIN t_os_employee_deduction d ON e.employee_id=d.employee_id LEFT JOIN t_os_master_department s ON e.department_id = s.department_id";
	public static final String GET_PAYROLL = "SELECT p.first_name,p.last_name,e.employee_code,d.designation,s.department_name,e.salary,e.employee_id from t_os_hr_emp_personal_dtls p LEFT JOIN t_os_hr_emp_add_employee e on p.employee_id=e.employee_id LEFT JOIN t_os_master_designation d ON e.designation_id = d.designation_id LEFT JOIN t_os_master_department s ON e.department_id = s.department_id";
	
	//TRAINING DETAILS
	
	public static final String SHOW_ALL_EMP_NAME_BY_EMPLOYEEID = "SELECT employee_id, first_name, last_name FROM t_os_hr_emp_personal_dtls";
	public static final String INSERT_TYPE = "INSERT INTO t_os_hr_emp_training_dtls (employee_id, types_of_training, created_date) values (?,?,?)";
	public static final String VIEW_TRAINING_DETAILS = "SELECT a.first_name, a.last_name, t.employee_id, t.types_of_training, t.created_date  FROM 			t_os_hr_emp_training_dtls t LEFT JOIN t_os_hr_emp_personal_dtls a ON a.employee_id=t.training_id";
	//ResourcesUtilisation
	
		public static final String GET_RESOURCES_UTILISATION_DETAILS="SELECT p.project_name,t.team_name,pd.first_name,pd.last_name,u.util_id FROM t_os_hr_utilisation u INNER JOIN t_os_project p ON p.project_id=u.project_id INNER JOIN t_os_hr_emp_personal_dtls pd ON u.employee_id=pd.employee_id INNER JOIN t_os_master_team t ON u.team_id=t.team_id where u.status='NOTASSIGNED' ";
		public static final String SET_STATUS="UPDATE t_os_hr_utilisation SET STATUS=? WHERE util_id=?"; 
	
	//AMDASHBOARD
	
	public static final String GET_ALL_DETAILS = "SELECT f.approval_date, f.raised_for, s.site_code, w.stage_name, f.amount, f.purpose, f.approved_amount, f.remark FROM t_os_pm_fund_request f LEFT JOIN t_os_master_work_stage w ON f.stage_of_work = w.stage_id LEFT JOIN t_os_sitecode s ON f.site_code = s.sitecode_id";
	public static final String PAY_DASHBOARD = "INSERT INTO t_os_am_req_trans (transaction_date,transaction_id,amount) values (?,?,?)";

	//AMDAILYEXPENCE
	
	public static final String DAILY_DETAILS = "SELECT transaction_id,amount FROM t_os_am_req_trans";
	public static final String INSERT_VALUES ="INSERT INTO t_os_am_daily_expense (transaction_date,transaction_id,amount,accounthead,transction_purpose,payment_type,bank_trans_id,remarks) values (CURDATE(),?,?,?,?,?,?,?)";
	//Leave
	//public static final String DISPLAYALL_LEAVE = "SELECT * from t_os_hr_leave ";
	//Leave
		public static final String DISPLAY_ALL_LEAVE = "SELECT * from t_os_hr_leave ";
	//Employee List
	public static final String DISPLAYALL_EMPLOYEE = "SELECT a.employee_code,p.first_name,p.last_name,d.designation,m.department_name,a.joining_date,a.salary,p.contact_no,u.email FROM t_os_hr_emp_personal_dtls p LEFT JOIN t_os_hr_emp_add_employee a ON p.employee_id = a.employee_id LEFT JOIN t_os_master_designation d ON a.designation_id = d.designation_id LEFT JOIN t_os_master_department m ON a.department_id = m.department_id LEFT JOIN t_os_hr_user u ON p.user_id = u.user_id";
	
	//
	/*
	 * public static final String GET_SITENAME =
	 * "SELECT s.site_name, m.sitecode_id from t_os_pm_team_task_map m LEFT JOIN t_os_sitecode s on m.sitecode_id=s.sitecode_id LEFT JOIN t_os_master_task k on m.task_id = k.task_id LEFT JOIN t_os_master_work_stage w on k.work_stage= w.stage_id WHERE m.task_status='COMPLETE' "
	 * ; public static final String SAVE_BILL = "";
	 */
	//AssignLogistics Queries
	
	
	
			public static final String GET_ALLCONSIGNMENT_LOGISTICS_DETAILS="SELECT c.consignment_id,c.consignment_no,lo.provider_id,lo.provider_name FROM t_os_am_consignment_logistic cl INNER JOIN t_os_am_consingement_track_c2p c ON cl.consignment_id=c.consignment_id INNER JOIN t_os_ser_pro_personal_dtls lo ON lo.provider_id=cl.logistic_id";
			public static final String GET_CONSIGNMENT_ID_NO="SELECT consignment_id,consignment_no FROM t_os_am_consingement_track_c2p AS c WHERE c.consignment_id NOT IN(SELECT consignment_id FROM t_os_am_consignment_logistic)";
			public static final String GET_LOGISTIC_PROVIDER_ID_NAME="SELECT provider_id,provider_name FROM t_os_ser_pro_personal_dtls ";
			
			
			public static final String INSERT_ASSIGN_LOGISTICS_DETAILS="INSERT INTO t_os_am_consignment_logistic" + 
			"(consignment_id,logistic_id,vechile_no,lr_no,eway_bil_no,exp_arrival)"
					+ "values(?,?,?,?,?,?)";
			//SUPPLIER/CONTRACTER/LOGISTIC
			public static final String GET_PROVIDER_TYPE_AND_ID="SELECT service_provider_id,service_provider_type FROM t_os_master_servprovr_type";
			public static final String GET_ACCOUNTMANAGEMENT_DETAILS="SELECT p.provider_id,pb.bill_no,pb.bill_amount,pb.bill_date,sc.site_code,p.provider_name,pb.sitecode_id,pb.bill_id FROM t_os_master_servprovr_type sp INNER JOIN t_os_ser_pro_personal_dtls p ON sp.service_provider_id=p.service_type_id INNER JOIN t_os_serv_pro_bill pb ON p.provider_id=pb.provider_id INNER JOIN t_os_sitecode sc ON pb.sitecode_id=sc.sitecode_id WHERE sp.service_provider_id=? AND pb.status='PENDING'";
			public static final String GET_ONE_BILLDETAILS_By_BILL_ID="SELECT pb.provider_id,pb.bill_no,pb.bill_amount,pb.bill_date,pb.sitecode_id FROM t_os_serv_pro_bill pb WHERE pb.bill_id=?  AND pb.status='PENDING'";
			
			public static final String SET_PM_FUND_REQUEST="INSERT INTO t_os_pm_fund_request" + "(raised_for,bill,amount,created_date,site_code,purpose)"
					+ "values(?,?,?,?,?,?)";
			
			public static final String SET_BILL_STATUS="UPDATE t_os_serv_pro_bill pb SET pb.STATUS='RAISED' WHERE bill_id=?";
	       //experience
			public static final String GET_EMPLOYEE_EXPERIENCE_DETAILS="SELECT e.first_name,e.last_name,ad.present_village,ad.present_pin,ms.state_name,md.district_name,am.joining_date,am.employee_code FROM t_os_hr_emp_personal_dtls e INNER JOIN t_os_hr_emp_address ad ON e.employee_id= ad.employee_id INNER JOIN t_os_master_state ms ON ms.master_state_id=ad.present_state INNER JOIN t_os_master_district md ON md.district_master_id=ad.permanent_dist INNER JOIN t_os_hr_emp_add_employee am ON e.employee_id=am.employee_id WHERE am.employee_code=?";

			//Account and QAQC Add by Jayashree
			//----------------Start-------------------------------//
			public static final String UPDATE_CONSINMENT = "insert into t_os_am_consingement_track_c2p(consingement_no,airwaybill_no,status,exp_arrival_date,act_arrival_date,updated_on) values (?,?,?,?,?,?)";
			public static final String DISPLAYALL_TRACK_MATERIAL = "select * from t_os_am_consingement_track_c2p";
			public static final String UPDATE_TRACK_MATERIAL = "UPDATE t_os_am_consingement_track_c2p SET consingement_no=?,airwaybill_no=?,status=?,exp_arrival_date=?,act_arrival_date=?,updated_on=? WHERE consignment_id=?";
			public static final String DISPLAYALL_CONSIGNMENT_NO = "select * from t_os_am_consingement_track_c2p";
			public static final String INSERT_MATERIAL = "insert into t_os_am_consignment_materiallist (item_name,serial_no,quantity,consinment_id) values (?,?,?,?)";
			public static final String DISPLAY_CONSIGNMENT_NO = "select * from t_os_am_consingement_track_c2p ";
			public static final String DISPLAYALL_ITEM = "select material_id,item_name,quantity from t_os_am_consignment_materiallist";
			public static final String INSERT_ITEMS_DETAILS = "insert into t_os_qaqc_items (product_code,barcode,quality,remarks,material_id) values (?,?,?,?,?)";
			/*public static final String DISPLAY_COMPONENT_ITEM="SELECT c.component_name,c.quantity,i.item_id,i.product_code FROM t_os_qaqc_material_code m  LEFT JOIN t_os_master_component c ON c.component_id = m.component_id LEFT JOIN t_os_qaqc_items i ON m.item_id=i.item_id";*/
			public static final String UPDATE_PRODUCT = "UPDATE t_os_qaqc_items SET product_code=? where item_id=?";
			public static final String DISPLAY_COMPONENT_ITEM="SELECT m.material_code_id,m.item_id,c.component_name,i.product_code FROM t_os_qaqc_material_code m  LEFT JOIN t_os_master_component c ON c.component_id = m.component_id \r\n" + 
					"LEFT JOIN t_os_qaqc_items i ON m.item_id=i.item_id WHERE m.workstatus='NON-WORKING'";
			//----------------End-------------------------------//
			//----------Start---------Qaqc Add by Jayashree----------------------------------//
			public static final String DISPLAYALL_COMPONENT ="Select component_id ,component_name,quantity from t_os_master_component WHERE product_id=?";
			public static final String Insert_material=
					"insert into  t_os_qaqc_material_code"+"(material_code_id,product_id,component_id,item_id,sim_provider,phone_no,imei_no)"+"values(?,?,?,?,?,?,?)";
			
			public static final String DISPLAY_Product_Code ="Select item_id,product_code from t_os_qaqc_items";
			
			public static final String DISPLAY_Product_Name ="Select product_id,product_name from t_os_master_product";
			
			//-----------END------Qaqc Add by Jayashree----------------------------------//
			
			public static final String Insert_Leave=
					"insert into t_os_hr_emp_leave_management"+"(employee_code,from_date,to_date,leave_type)"+"values(?,?,?,?)";
			public static final String GET_LEAVEMANG = "Select a.employee_code,b.leave_type from t_os_hr_emp_leave_management a LEFT JOIN t_os_master_leave b on a.leave_type=b.leave_type_id ";
			
	
			
			//RISEBILL
			public static final String GET_SITENAME = "SELECT s.site_name, m.sitecode_id from t_os_pm_team_task_map m LEFT JOIN t_os_sitecode s on m.sitecode_id=s.sitecode_id LEFT JOIN t_os_master_task k on m.task_id = k.task_id LEFT JOIN t_os_master_work_stage w on k.work_stage= w.stage_id WHERE m.task_status='COMPLETE' ";
			public static final String SAVE_BILL = "insert  into t_os_am_site_bill_raise (site_id,bill_date,bill_amount,remarks) values (?,?,?,?)";
			public static final String DISPLAY_LEAVE = null;
			public static final String UPDATE_LEAVE = "UPDATE t_os_hr_leave SET leave_taken=? WHERE employee_code=? AND leave_type=?";
			public static final String FIND_LEAVETAKEN = "SELECT leave_taken FROM t_os_hr_leave WHERE employee_code=? AND leave_type=? ";
			public static final String GET_EMP_ATTENDANCE_DAYS ="SELECT  employee_code,status,attendee_date FROM `t_os_attendance` WHERE attendee_date=CURRENT_DATE" ;
			public static final String GET_EMP_ATTENDANCE_MONTH = " SELECT  employee_code,status,attendee_date FROM `t_os_attendance` WHERE MONTH(attendee_date) = MONTH(CURDATE())";
			public static final String GET_ALL_RAISE_REQUEST = "SELECT p.provider_id,pb.bill_no,pb.bill_amount,pb.bill_date,sc.site_code,p.provider_name,pb.sitecode_id,pb.bill_id FROM t_os_master_servprovr_type sp INNER JOIN t_os_ser_pro_personal_dtls p ON sp.service_provider_id=p.service_type_id INNER JOIN t_os_serv_pro_bill pb ON p.provider_id=pb.provider_id INNER JOIN t_os_sitecode sc ON pb.sitecode_id=sc.sitecode_id WHERE  pb.status='RAISED' ";
			public static final String GET_ALL_APPROVED_LIST = "SELECT f.approval_date, f.raised_for, s.site_code, w.stage_name, f.amount, f.purpose, f.approved_amount, f.remark FROM t_os_pm_fund_request f LEFT JOIN t_os_master_work_stage w ON f.stage_of_work = w.stage_id LEFT JOIN t_os_sitecode s ON f.site_code = s.sitecode_id";
			public static final String GET_LEDGER_BY_TYPE = "SELECT p.provider_name, b.bill_date, b.bill_amount, b.paid_amount, b.payment_date FROM t_os_serv_pro_bill b LEFT JOIN t_os_ser_pro_personal_dtls p ON b.provider_id= p.provider_id left join t_os_master_servprovr_type ms on p.service_type_id=ms.service_provider_id where ms.service_provider_id=?";



//REPORT.............
			

			//QAQC REPORT
			public static final String DISPLAY_MATERIAL_CHECKED = "Select product_code,barcode,quality,created_date,created_by,remarks from t_os_qaqc_items";
			public static final String SHOW_REJECT_LIST = "Select product_code,barcode,remarks from t_os_qaqc_items WHERE quality='faulty'";

			//AM REPORT
			
			public static final String GET_LIST = "SELECT c.consignment_no, m.material_id, m.item_name, m.serial_no FROM t_os_am_consignment_materiallist m LEFT JOIN t_os_am_consingement_track_c2p c ON c.consignment_id= m.consignment_id";

			public static final String GET_DATA = "SELECT transaction_date,amount,cash_inflow_outflow,payment_type FROM t_os_am_daily_expense";

			public static final String GET_LEDGER_LIST = "SELECT p.provider_name, b.bill_date, b.bill_amount, b.paid_amount, b.payment_date FROM t_os_serv_pro_bill b LEFT JOIN t_os_ser_pro_personal_dtls p ON b.provider_id= p.provider_id";

			public static final String GETBILL_LIST = "SELECT s.site_name,r.bill_date,r.bill_amount from t_os_am_site_bill_raise r LEFT JOIN t_os_sitecode s on s.sitecode_id=r.site_id";
			
			public static final String GET_ALL_SITE_CODE = "select sitecode_id,site_code from t_os_sitecode";
			public static final String GET_EXPENCES_BY_SITECODE = "select sum(m.budget) AS budget,s.stage_name,o.site_code from t_os_pm_team_task_map m left join t_os_master_task t on m.task_id=t.task_id left join t_os_master_work_stage s on t.work_stage= s.stage_id left join t_os_sitecode o on o.sitecode_id=m.sitecode_id  where m.sitecode_id=? group by s.stage_name";

			public static final String GET_TRACKING_C2P = "SELECT consignment_no,airwaybill_no,status,exp_arrival_date,act_arrival_date,updated_on FROM t_os_am_consingement_track_c2p";
			public static final String GET_TRACKING_P2A = "SELECT c.consignment_no,p.actual_arrival,p.expected_arrival,p.godown_recive_date,p.pickup_date FROM  t_os_consignment_track_p2a p LEFT JOIN t_os_am_consignment_logistic l ON p.log_consignment_id = l.log_asignment_id LEFT JOIN t_os_am_consingement_track_c2p c ON l.consignment_id = c.consignment_id";
			
			//HR REPORT

			public static final String GET_RESOURCES_UTILISATION_REPORT_DETAILS="SELECT p.project_name,t.team_name,pd.first_name,pd.last_name,u.util_id,u.status FROM t_os_hr_utilisation u INNER JOIN t_os_project p ON p.project_id=u.project_id INNER JOIN t_os_hr_emp_personal_dtls pd ON u.employee_id=pd.employee_id INNER JOIN t_os_master_team t ON u.team_id=t.team_id ";
			
			//HolidayList
			public static final String Insert_Holiday=
					"insert into t_os_hr_emp_holiday"+"(holiday_date,holiday_day,holiday_events)"+"values(?,?,?)";
			
			public static final String DISPLAYALL_HOLIDAY_LIST = "select holiday_date,holiday_day,holiday_events from t_os_hr_emp_holiday";
			//
			
			public static final String EMP_PERSONAL_DETAILS = "insert into t_os_hr_emp_personal_dtls"+"(first_name,last_name,father_name,DOB,gender,contact_no,marital_status,religion,adhar_no,insurance_policy_no)"+"values(?,?,?,?,?,?,?,?,?,?)" ;
			public static final String EMP_EMERGENCY_DETAILS = "insert into t_os_hr_emp_emergency_dlts"+"(name,relationship,phone_no,blood_group)"+"values(?,?,?,?)";
			public static final String EMP_ADDRESS = "insert into t_os_hr_emp_address"+"(present_village,present_post,present_police_station,present_dist,present_state,present_pin)"+"values(?,?,?,?,?,?)";
			public static final String EMP_EDUCATION_DETAILS = "insert into t_os_hr_emp_education"+"(edu_qualification,institution,year_of_passing,percent_cgpa)"+"values(?,?,?,?)";
			public static final String EMP_EXPERIENCE_INFORMATION = "insert into t_os_hr_emp_experience"+"(name_of_organisation,designation,joining_date,reliving_date,org_contact_no)"+"values(?,?,?,?,?)";
			public static final String EMP_ACCOUNT_DETAILS = "insert into t_os_hr_emp_bank"+"(bank_holder_name,account_no,bank_name,ifsc_code)"+"values(?,?,?,?)";
			public static final String DISPLAY_STATE = "select * from t_os_master_state";
			public static final String DISPLAY_DIST = "select * from t_os_master_district";
			
			
			public static final String DISPLAY_Project_Budget="select sum(m.budget) AS budget,s.stage_name,o.site_code from t_os_pm_team_task_map m left join t_os_master_task t on m.task_id=t.task_id left join t_os_master_work_stage s on t.work_stage= s.stage_id left join t_os_sitecode o on o.sitecode_id=m.sitecode_id  where m.sitecode_id=? group by s.stage_name";
			
			public static final String Actual_cost="select sum(m.actual_cost) AS actual_cost,s.stage_name,o.site_code from t_os_pm_team_task_map m left join t_os_master_task t on m.task_id=t.task_id left join t_os_master_work_stage s on t.work_stage= s.stage_id left join t_os_sitecode o on o.sitecode_id=m.sitecode_id  where m.sitecode_id=? group by s.stage_name";

			public static final String DISPLAY_SiteCode="select sitecode_id,site_code from t_os_sitecode";
}

