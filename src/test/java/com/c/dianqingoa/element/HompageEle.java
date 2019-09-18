package com.c.dianqingoa.element;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.BasePage;
import com.b.publish.util.ByMethod;

public class HompageEle extends BasePage{

	public HompageEle(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//---------------------------获取侧边栏元素---------------------------------//
	
	/**
	 * ## 侧边栏表单
	 */
	public WebElement getLeftIframe() {
		return findElement(ByMethod.getLocator("leftIframe"));
	}
	
	/**
	 * ## 主窗口表单
	 */
	public WebElement getMainIframe() {
		return findElement(ByMethod.getLocator("mainIframe"));
	}
	
	/**
	 * 
	 * 1.获取主页侧边栏元素"工作日志管理"
	 */
	public WebElement getWorkLogManagement() {
		return findElement(ByMethod.getLocator("workLogManagement"));
	}
	
	/**
	 * 1.1获取主页侧边栏元素"我的工作日志"文本
	 */
	public WebElement getMyJobLog() {
		return findElement(ByMethod.getLocator("myJobLog"));
	}
	
	/**
	 * 1.1获取主页侧边栏元素"我的工作日志"链接
	 */
	public WebElement getMyJobLogLink() {
		return findElement(ByMethod.getLocator("myJobLoglink"));
	}
	
	/**
	 * 1.2获取主页侧边栏元素"他人工作日志"文本
	 */
	public WebElement getOtherPeoplesWorkLog() {
		return findElement(ByMethod.getLocator("otherPeoplesWorkLog"));
	}
	
	/**
	 * 1.2获取主页侧边栏元素"他人工作日志"链接
	 */
	public WebElement getOtherPeoplesWorkLogLink() {
		return findElement(ByMethod.getLocator("otherPeoplesWorkLoglink"));
	}

	/**
	 * 1.3获取主页侧边栏元素"日志参数设置"文本
	 */
	public WebElement getLogParameterSetting() {
		return findElement(ByMethod.getLocator("logParameterSetting"));
	}
	
	/**
	 * 1.3获取主页侧边栏元素"日志参数设置"链接
	 */
	public WebElement getLogParameterSettingLink() {
		return findElement(ByMethod.getLocator("logParameterSettinglink"));
	}
	

	/**
	 * 2.获取主页侧边栏元素"工作流管理"
	 */
	public WebElement getworkflow_management() {
		return findElement(ByMethod.getLocator("workflow_management"));
	}
	
	/**
	 * 2.1获取主页侧边栏元素"工作流申请"文本
	 */
	public WebElement getworkflow_application() {
		return findElement(ByMethod.getLocator("workflow_application"));
	}
	
	/**
	 * 2.1获取主页侧边栏元素"工作流申请"链接
	 */
	public WebElement getworkflow_applicationLink() {
		return findElement(ByMethod.getLocator("workflow_applicationlink"));
	}
	
	/**
	 * 2.2获取主页侧边栏元素"我的审批"文本
	 */
	public WebElement getmy_approval() {
		return findElement(ByMethod.getLocator("my_approval"));
	}
	
	/**
	 * 2.2获取主页侧边栏元素"我的审批"链接
	 */
	public WebElement getmy_approvalLink() {
		return findElement(ByMethod.getLocator("my_approvallink"));
	}
	
	/**
	 * 2.3获取主页侧边栏元素"我的申请"文本
	 */
	public WebElement getmy_application() {
		return findElement(ByMethod.getLocator("my_application"));
	}
	
	/**
	 * 2.3获取主页侧边栏元素"我的申请"链接
	 */
	public WebElement getmy_applicationLink() {
		return findElement(ByMethod.getLocator("my_applicationlink"));
	}
	
	/**
	 * 2.4获取主页侧边栏元素"已办工作流"文本
	 */
	public WebElement getworkflow_already_done() {
		return findElement(ByMethod.getLocator("workflow_already_done"));
	}
	
	/**
	 * 2.4获取主页侧边栏元素"已办工作流"链接
	 */
	public WebElement getworkflow_already_doneLink() {
		return findElement(ByMethod.getLocator("workflow_already_donelink"));
	}
	
	/**
	 * 2.5获取主页侧边栏元素"模板管理"文本
	 */
	public WebElement gettemplate_management() {
		return findElement(ByMethod.getLocator("template_management"));
	}
	
	/**
	 * 2.5获取主页侧边栏元素"模板管理"链接
	 */
	public WebElement gettemplate_managementLink() {
		return findElement(ByMethod.getLocator("template_managementlink"));
	}
	
	/**
	 * 2.6获取主页侧边栏元素"流程管理"文本
	 */
	public WebElement getprocess_management() {
		return findElement(ByMethod.getLocator("process_management"));
	}
	
	/**
	 * 2.6获取主页侧边栏元素"流程管理"链接
	 */
	public WebElement getprocess_managementLink() {
		return findElement(ByMethod.getLocator("process_managementlink"));
	}
	
	/**
	 * 2.7获取主页侧边栏元素"参数设置"文本
	 */
	public WebElement getparameter_Settings() {
		return findElement(ByMethod.getLocator("parameter_Settings"));
	}
	
	/**
	 * 2.7获取主页侧边栏元素"参数设置"链接
	 */
	public WebElement getparameter_SettingsLink() {
		return findElement(ByMethod.getLocator("parameter_Settingslink"));
	}
	

	/**
	 * 3.获取主页侧边栏元素"通知公告管理"
	 */
	public WebElement getnotification_and_Announcement_Management() {
		return findElement(ByMethod.getLocator("notification_and_Announcement_Management"));
	}
	
	/**
	 * 3.1获取主页侧边栏元素"发布通知公告"文本
	 */
	public WebElement getannouncement_of_Notification() {
		return findElement(ByMethod.getLocator("announcement_of_Notification"));
	}
	
	/**
	 * 3.1获取主页侧边栏元素"发布通知公告"链接
	 */
	public WebElement getannouncement_of_NotificationLink() {
		return findElement(ByMethod.getLocator("announcement_of_Notificationlink"));
	}
	
	/**
	 * 3.2获取主页侧边栏元素"浏览通知公告"文本
	 */
	public WebElement getbrowse_Notice_Bulletin() {
		return findElement(ByMethod.getLocator("browse_Notice_Bulletin"));
	}
	
	/**
	 * 3.2获取主页侧边栏元素"浏览通知公告"链接
	 */
	public WebElement getbrowse_Notice_BulletinLink() {
		return findElement(ByMethod.getLocator("browse_Notice_Bulletinlink"));
	}
	
	/**
	 * 3.3获取主页侧边栏元素"签收记录管理"文本
	 */
	public WebElement getmanagement_of_Sign_and_Receive_Records() {
		return findElement(ByMethod.getLocator("management_of_Sign_and_Receive_Records"));
	}
	
	/**
	 * 3.3获取主页侧边栏元素"签收记录管理"链接
	 */
	public WebElement getmanagement_of_Sign_and_Receive_RecordsLink() {
		return findElement(ByMethod.getLocator("management_of_Sign_and_Receive_Recordslink"));
	}
	
	/**
	 * 3.4获取主页侧边栏元素"基础信息设置"文本
	 */
	public WebElement getnotice_basic_Information_Settings() {
		return findElement(ByMethod.getLocator("notice_basic_Information_Settings"));
	}
	
	/**
	 * 3.4获取主页侧边栏元素"基础信息设置"链接
	 */
	public WebElement getnotice_basic_Information_SettingsLink() {
		return findElement(ByMethod.getLocator("notice_basic_Information_Settingslink"));
	}
	
	
	/**
	 * 4.获取主页侧边栏元素"我的通信录"
	 */
	public WebElement getmy_address_book() {
		return findElement(ByMethod.getLocator("my_address_book"));
	}
	
	/**
	 * 4.1获取主页侧边栏元素"单位通讯录"文本
	 */
	public WebElement getunit_Address_Book() {
		return findElement(ByMethod.getLocator("unit_Address_Book"));
	}
	
	/**
	 * 4.1获取主页侧边栏元素"单位通讯录"链接
	 */
	public WebElement getunit_Address_BookLink() {
		return findElement(ByMethod.getLocator("unit_Address_Booklink"));
	}
	
	/**
	 * 4.2获取主页侧边栏元素"个人通讯录"文本
	 */
	public WebElement getpersonal_Address_Book() {
		return findElement(ByMethod.getLocator("personal_Address_Book"));
	}
	
	/**
	 * 4.2获取主页侧边栏元素"个人通讯录"链接
	 */
	public WebElement getpersonal_Address_BookLink() {
		return findElement(ByMethod.getLocator("personal_Address_Booklink"));
	}
	
	/**
	 * 4.3获取主页侧边栏元素"外部通讯录"文本
	 */
	public WebElement getexternal_Address_Book() {
		return findElement(ByMethod.getLocator("external_Address_Book"));
	}
	
	/**
	 * 4.3获取主页侧边栏元素"外部通讯录"链接
	 */
	public WebElement getexternal_Address_BookLink() {
		return findElement(ByMethod.getLocator("external_Address_Booklink"));
	}
	
	/**
	 * 4.4获取主页侧边栏元素"个人资料维护"文本
	 */
	public WebElement getpersonal_Data_Maintenance() {
		return findElement(ByMethod.getLocator("personal_Data_Maintenance"));
	}
	
	/**
	 * 4.4获取主页侧边栏元素"个人资料维护"链接
	 */
	public WebElement getpersonal_Data_MaintenanceLink() {
		return findElement(ByMethod.getLocator("personal_Data_Maintenancelink"));
	}
	
	
	/**
	 * 5.获取主页侧边栏元素"单位车辆管理"
	 */
	public WebElement getUnit_Vehicle_ManagementLink() {
		return findElement(ByMethod.getLocator("Unit_Vehicle_Management"));
	}
	
	/**
	 * 5.1获取主页侧边栏元素"车辆预约"文本
	 */
	public WebElement getVehicle_reservationText() {
		return findElement(ByMethod.getLocator("Vehicle_reservation_Text"));
	}
	
	/**
	 * 5.1获取主页侧边栏元素"车辆预约"链接
	 */
	public WebElement getVehicle_reservationLink() {
		return findElement(ByMethod.getLocator("Vehicle_reservation"));
	}
	
	/**
	 * 5.2获取主页侧边栏元素"车辆占用情况"
	 */
	public WebElement getOccupancy_of_vehiclesLink() {
		return findElement(ByMethod.getLocator("Occupancy_of_vehicles"));
	}
	
	/**
	 * 5.3获取主页侧边栏元素"用车审核管理"
	 */
	public WebElement getVehicle_Audit_ManagementLink() {
		return findElement(ByMethod.getLocator("Vehicle_Audit_Management"));
	}
	
	/**
	 * 5.4获取主页侧边栏元素"车辆使用记录"
	 */
	public WebElement getVehicle_use_recordLink() {
		return findElement(ByMethod.getLocator("Vehicle_use_record"));
	}
	
	/**
	 * 5.5获取主页侧边栏元素"车辆信息管理"
	 */
	public WebElement getVehicle_Information_ManagementLink() {
		return findElement(ByMethod.getLocator("Vehicle_Information_Management"));
	}
	
	/**
	 * 5.6获取主页侧边栏元素"车辆费用管理"
	 */
	public WebElement getVehicle_Cost_ManagementLink() {
		return findElement(ByMethod.getLocator("Vehicle_Cost_Management"));
	}
	
	/**
	 * 5.7获取主页侧边栏元素"基础信息设置"
	 */
	public WebElement getBasic_Information_SettingsLink() {
		return findElement(ByMethod.getLocator("Basic_Information_Settings"));
	}
	
	
	/**
	 * 6.获取主页侧边栏元素"公文收发管理"
	 */
	public WebElement getdocument_Receiving_and_Dispatching_Management() {
		return findElement(ByMethod.getLocator("document_Receiving_and_Dispatching_Management"));
	}
	
	/**
	 * 6.1获取主页侧边栏元素"发文拟稿"文本
	 */
	public WebElement getdraft_manuscriptg() {
		return findElement(ByMethod.getLocator("draft_manuscript"));
	}
	
	/**
	 * 6.1获取主页侧边栏元素"发文拟稿"链接
	 */
	public WebElement getdraft_manuscriptgLink() {
		return findElement(ByMethod.getLocator("draft_manuscriptlink"));
	}
	
	/**
	 * 6.2获取主页侧边栏元素"收发文审核"文本
	 */
	public WebElement getaudit_of_Receiving_and_Sending_Documents() {
		return findElement(ByMethod.getLocator("audit_of_Receiving_and_Sending_Documents"));
	}
	
	/**
	 * 6.2获取主页侧边栏元素"收发文审核"链接
	 */
	public WebElement getaudit_of_Receiving_and_Sending_DocumentsLink() {
		return findElement(ByMethod.getLocator("audit_of_Receiving_and_Sending_Documentslink"));
	}
	
	/**
	 * 6.3获取主页侧边栏元素"我的拟稿"文本
	 */
	public WebElement getmy_draft() {
		return findElement(ByMethod.getLocator("my_draft"));
	}
	
	/**
	 * 6.3获取主页侧边栏元素"我的拟稿"链接
	 */
	public WebElement getmy_draftLink() {
		return findElement(ByMethod.getLocator("my_draftlink"));
	}
	
	/**
	 * 6.4获取主页侧边栏元素"收文拟办"文本
	 */
	public WebElement getreceiving_Papers_to_be_Processed() {
		return findElement(ByMethod.getLocator("receiving_Papers_to_be_Processed"));
	}
	
	/**
	 * 6.4获取主页侧边栏元素"收文拟办"链接
	 */
	public WebElement getreceiving_Papers_to_be_ProcessedLink() {
		return findElement(ByMethod.getLocator("receiving_Papers_to_be_Processedlink"));
	}
	
	/**
	 * 6.5获取主页侧边栏元素"收文承办"文本
	 */
	public WebElement getacceptance() {
		return findElement(ByMethod.getLocator("acceptance"));
	}
	
	/**
	 * 6.5获取主页侧边栏元素"收文承办"链接
	 */
	public WebElement getacceptanceLink() {
		return findElement(ByMethod.getLocator("acceptancelink"));
	}
	
	/**
	 * 6.6获取主页侧边栏元素"公文督办"文本
	 */
	public WebElement getdocument_Supervisory_Office() {
		return findElement(ByMethod.getLocator("document_Supervisory_Office"));
	}
	
	/**
	 * 6.6获取主页侧边栏元素"公文督办"链接
	 */
	public WebElement getdocument_Supervisory_OfficeLink() {
		return findElement(ByMethod.getLocator("document_Supervisory_Officelink"));
	}
	
	/**
	 * 6.7获取主页侧边栏元素"查看公文"文本
	 */
	public WebElement getview_official_documents() {
		return findElement(ByMethod.getLocator("view_official_documents"));
	}
	
	/**
	 * 6.7获取主页侧边栏元素"查看公文"链接
	 */
	public WebElement getview_official_documentsLink() {
		return findElement(ByMethod.getLocator("view_official_documentslink"));
	}
	
	/**
	 * 6.8获取主页侧边栏元素"基础信息设置"文本
	 */
	public WebElement getdocument_basic_Information_Settings() {
		return findElement(ByMethod.getLocator("document_basic_Information_Settings"));
	}
	
	/**
	 * 6.8获取主页侧边栏元素"基础信息设置"链接
	 */
	public WebElement getdocument_basic_Information_SettingsLink() {
		return findElement(ByMethod.getLocator("document_basic_Information_Settingslink"));
	}
	
	
	/**
	 * 7.获取主页侧边栏元素"工作报告管理"
	 */
	public WebElement getwork_report_management() {
		return findElement(ByMethod.getLocator("work_report_management"));
	}
	
	/**
	 * 7.1获取主页侧边栏元素"安排工作报告"文本
	 */
	public WebElement getarrangement_of_work_reports() {
		return findElement(ByMethod.getLocator("arrangement_of_work_reports"));
	}
	
	/**
	 * 7.1获取主页侧边栏元素"安排工作报告"链接
	 */
	public WebElement getarrangement_of_work_reportsLink() {
		return findElement(ByMethod.getLocator("arrangement_of_work_reportslink"));
	}
	
	/**
	 * 7.2获取主页侧边栏元素"工作报告管理(跟踪)"文本
	 */
	public WebElement getwork_report_tracking() {
		return findElement(ByMethod.getLocator("work_report_tracking"));
	}
	
	/**
	 * 7.2获取主页侧边栏元素"工作报告管理(跟踪)"链接
	 */
	public WebElement getwork_report_trackingLink() {
		return findElement(ByMethod.getLocator("work_report_trackinglink"));
	}
	
	
	/**
	 * 8.获取主页侧边栏元素"工作计划管理"
	 */
	public WebElement getwork_plan_management() {
		return findElement(ByMethod.getLocator("work_plan_management"));
	}
	
	/**
	 * 8.1获取主页侧边栏元素"安排新的工作计划"文本
	 */
	public WebElement getarrange_a_new_work_plan() {
		return findElement(ByMethod.getLocator("arrange_a_new_work_plan"));
	}
	
	/**
	 * 8.1获取主页侧边栏元素"安排新的工作计划"链接
	 */
	public WebElement getarrange_a_new_work_planLink() {
		return findElement(ByMethod.getLocator("arrange_a_new_work_planlink"));
	}
	
	/**
	 * 8.2获取主页侧边栏元素"浏览现有工作计划"文本
	 */
	public WebElement getbrowse_through_existing_work_plans() {
		return findElement(ByMethod.getLocator("browse_through_existing_work_plans"));
	}
	
	/**
	 * 8.2获取主页侧边栏元素"浏览现有工作计划"链接
	 */
	public WebElement getbrowse_through_existing_work_plansLink() {
		return findElement(ByMethod.getLocator("browse_through_existing_work_planslink"));
	}
	
	/**
	 * 8.3获取主页侧边栏元素"工作计划类别维护"文本
	 */
	public WebElement getmaintenance_of_Work_Plan_Category() {
		return findElement(ByMethod.getLocator("maintenance_of_Work_Plan_Category"));
	}
	
	/**
	 * 8.3获取主页侧边栏元素"工作计划类别维护"链接
	 */
	public WebElement getmaintenance_of_Work_Plan_CategoryLink() {
		return findElement(ByMethod.getLocator("maintenance_of_Work_Plan_Categorylink"));
	}
	
	
	/**
	 * 9.获取主页侧边栏元素"改善提案管理"
	 */
	public WebElement getimproving_Proposal_Management() {
		return findElement(ByMethod.getLocator("improving_Proposal_Management"));
	}
	
	/**
	 * 9.1获取主页侧边栏元素"我要提交提案"文本
	 */
	public WebElement geti_want_to_submit_a_proposal() {
		return findElement(ByMethod.getLocator("i_want_to_submit_a_proposal"));
	}
	
	/**
	 * 9.1获取主页侧边栏元素"我要提交提案"链接
	 */
	public WebElement geti_want_to_submit_a_proposalLink() {
		return findElement(ByMethod.getLocator("i_want_to_submit_a_proposallink"));
	}
	
	/**
	 * 9.2获取主页侧边栏元素"提案浏览及反馈"文本
	 */
	public WebElement getproposal_Browsing_and_Feedback() {
		return findElement(ByMethod.getLocator("proposal_Browsing_and_Feedback"));
	}
	
	/**
	 * 9.2获取主页侧边栏元素"提案浏览及反馈"链接
	 */
	public WebElement getproposal_Browsing_and_FeedbackLink() {
		return findElement(ByMethod.getLocator("proposal_Browsing_and_Feedbacklink"));
	}
	
	
	/**
	 * 10.获取主页侧边栏元素"项目跟踪管理"
	 */
	public WebElement getproject_tracking_management() {
		return findElement(ByMethod.getLocator("project_tracking_management"));
	}
	
	/**
	 * 10.1获取主页侧边栏元素"增加项目"文本
	 */
	public WebElement getadditional_projects() {
		return findElement(ByMethod.getLocator("additional_projects"));
	}
	
	/**
	 * 10.1获取主页侧边栏元素"增加项目"链接
	 */
	public WebElement getadditional_projectsLink() {
		return findElement(ByMethod.getLocator("additional_projectslink"));
	}

	/**
	 * 10.2获取主页侧边栏元素"周期性项目跟踪"文本
	 */
	public WebElement getperiodic_project_tracking() {
		return findElement(ByMethod.getLocator("periodic_project_tracking"));
	}
	
	/**
	 * 10.2获取主页侧边栏元素"周期性项目跟踪"链接
	 */
	public WebElement getperiodic_project_trackingLink() {
		return findElement(ByMethod.getLocator("periodic_project_trackinglink"));
	}
	
	/**
	 * 10.3获取主页侧边栏元素"项目类别名称维护"文本
	 */
	public WebElement getproject_Category_Name_Maintenance() {
		return findElement(ByMethod.getLocator("project_Category_Name_Maintenance"));
	}
	
	/**
	 * 10.3获取主页侧边栏元素"项目类别名称维护"链接
	 */
	public WebElement getproject_Category_Name_MaintenanceLink() {
		return findElement(ByMethod.getLocator("project_Category_Name_Maintenancelink"));
	}
	
	/**
	 * 10.4获取主页侧边栏元素"项目进度名称维护"文本
	 */
	public WebElement getmaintenance_of_Project_Progress_Name() {
		return findElement(ByMethod.getLocator("maintenance_of_Project_Progress_Name"));
	}
	
	/**
	 * 10.4获取主页侧边栏元素"项目进度名称维护"链接
	 */
	public WebElement getmaintenance_of_Project_Progress_NameLink() {
		return findElement(ByMethod.getLocator("maintenance_of_Project_Progress_Namelink"));
	}
	
	
	/**
	 * 11.获取主页侧边栏元素"单位会议管理"
	 */
	public WebElement getunit_Meeting_Management() {
		return findElement(ByMethod.getLocator("unit_Meeting_Management"));
	}
	
	/**
	 * 11.1获取主页侧边栏元素"发布会议通知"文本
	 */
	public WebElement getpress_conference_announcement() {
		return findElement(ByMethod.getLocator("press_conference_announcement"));
	}
	
	/**
	 * 11.1获取主页侧边栏元素"发布会议通知"链接
	 */
	public WebElement getpress_conference_announcementLink() {
		return findElement(ByMethod.getLocator("press_conference_announcementlink"));
	}
	
	/**
	 * 11.2获取主页侧边栏元素"新增会议纪要"文本
	 */
	public WebElement getadded_minutes_of_the_meeting() {
		return findElement(ByMethod.getLocator("added_minutes_of_the_meeting"));
	}
	
	/**
	 * 11.2获取主页侧边栏元素"新增会议纪要"链接
	 */
	public WebElement getadded_minutes_of_the_meetingLink() {
		return findElement(ByMethod.getLocator("added_minutes_of_the_meetinglink"));
	}
	
	/**
	 * 11.3获取主页侧边栏元素"浏览会议纪要"文本
	 */
	public WebElement getbrowse_the_minutes_of_the_meeting() {
		return findElement(ByMethod.getLocator("browse_the_minutes_of_the_meeting"));
	}
	
	/**
	 * 11.3获取主页侧边栏元素"浏览会议纪要"链接
	 */
	public WebElement getbrowse_the_minutes_of_the_meetingLink() {
		return findElement(ByMethod.getLocator("browse_the_minutes_of_the_meetinglink"));
	}
	
	
	/**
	 * 12.获取主页侧边栏元素"单位新闻管理"
	 */
	public WebElement getunit_News_Management() {
		return findElement(ByMethod.getLocator("unit_News_Management"));
	}
	
	/**
	 * 12.1获取主页侧边栏元素"发布新闻"文本
	 */
	public WebElement getpublish_news() {
		return findElement(ByMethod.getLocator("publish_news"));
	}
	
	/**
	 * 12.1获取主页侧边栏元素"发布新闻"链接
	 */
	public WebElement getpublish_newsLink() {
		return findElement(ByMethod.getLocator("publish_newslink"));
	}
	
	/**
	 * 12.2获取主页侧边栏元素"浏览新闻"文本
	 */
	public WebElement getbrowse_the_news() {
		return findElement(ByMethod.getLocator("browse_the_news"));
	}
	
	/**
	 * 12.2获取主页侧边栏元素"浏览新闻"链接
	 */
	public WebElement getbrowse_the_newsLink() {
		return findElement(ByMethod.getLocator("browse_the_newslink"));
	}
	
	
	/**
	 * 13.获取主页侧边栏元素"工作联络单"
	 */
	public WebElement getwork_contact_sheet() {
		return findElement(ByMethod.getLocator("work_contact_sheet"));
	}
	
	/**
	 * 13.1获取主页侧边栏元素"发送联络单"文本
	 */
	public WebElement getsend_Contact_Form() {
		return findElement(ByMethod.getLocator("send_Contact_Form"));
	}
	
	/**
	 * 13.1获取主页侧边栏元素"发送联络单"链接
	 */
	public WebElement getsend_Contact_FormLink() {
		return findElement(ByMethod.getLocator("send_Contact_Formlink"));
	}
	
	/**
	 * 13.2获取主页侧边栏元素"审核联络单"文本
	 */
	public WebElement getaudit_contact_sheet() {
		return findElement(ByMethod.getLocator("audit_contact_sheet"));
	}
	
	/**
	 * 13.2获取主页侧边栏元素"审核联络单"链接
	 */
	public WebElement getaudit_contact_sheetLink() {
		return findElement(ByMethod.getLocator("audit_contact_sheetlink"));
	}
	
	/**
	 * 13.3获取主页侧边栏元素"浏览联络单"文本
	 */
	public WebElement getbrowse_contact_sheets() {
		return findElement(ByMethod.getLocator("browse_contact_sheets"));
	}
	
	/**
	 * 13.3获取主页侧边栏元素"浏览联络单"链接
	 */
	public WebElement getbrowse_contact_sheetsLink() {
		return findElement(ByMethod.getLocator("browse_contact_sheetslink"));
	}
	
	/**
	 * 13.4获取主页侧边栏元素"管理联络单"文本
	 */
	public WebElement getmanagement_contact_sheet() {
		return findElement(ByMethod.getLocator("management_contact_sheet"));
	}
	
	/**
	 * 13.4获取主页侧边栏元素"管理联络单"链接
	 */
	public WebElement getmanagement_contact_sheetLink() {
		return findElement(ByMethod.getLocator("management_contact_sheetlink"));
	}
	
	
	/**
	 * 14.获取主页侧边栏元素"个人备忘录"
	 */
	public WebElement getpersonal_Memorandum() {
		return findElement(ByMethod.getLocator("personal_Memorandum"));
	}
	
	/**
	 * 14.1获取主页侧边栏元素"增加备忘录"文本
	 */
	public WebElement getadditional_memorandum() {
		return findElement(ByMethod.getLocator("additional_memorandum"));
	}
	
	/**
	 * 14.1获取"新增个人备忘录"弹窗中的右上角关闭按钮
	 */
	public WebElement getcloseadditional_memorandum() {
		return findElement(ByMethod.getLocator("close_Additional_Personal_Memorandum"));
	}
	
	/**
	 * 14.1获取主页侧边栏元素"增加备忘录"链接
	 */
	public WebElement getadditional_memorandumLink() {
		return findElement(ByMethod.getLocator("additional_memorandumlink"));
	}
	
	/**
	 * 14.2获取主页侧边栏元素"浏览备忘录"文本
	 */
	public WebElement getbrowse_the_Memorandum() {
		return findElement(ByMethod.getLocator("browse_the_Memorandum"));
	}
	
	/**
	 * 14.2获取主页侧边栏元素"浏览备忘录"链接
	 */
	public WebElement getbrowse_the_MemorandumLink() {
		return findElement(ByMethod.getLocator("browse_the_Memorandumlink"));
	}
	
	
	/**
	 * 15.获取主页侧边栏元素"党员天地"
	 */
	public WebElement getparty_members_world() {
		return findElement(ByMethod.getLocator("party_members_world"));
	}
	
	/**
	 * 15.1获取主页侧边栏元素"党务信息公开"文本
	 */
	public WebElement getopenness_of_Party_Affairs_Information() {
		return findElement(ByMethod.getLocator("openness_of_Party_Affairs_Information"));
	}
	
	/**
	 * 15.1获取主页侧边栏元素"党务信息公开"链接
	 */
	public WebElement getopenness_of_Party_Affairs_InformationLink() {
		return findElement(ByMethod.getLocator("openness_of_Party_Affairs_Informationlink"));
	}
	
	/**
	 * 15.2获取主页侧边栏元素"党员信息介绍"文本
	 */
	public WebElement getinformation_Introduction_of_Party_Members() {
		return findElement(ByMethod.getLocator("information_Introduction_of_Party_Members"));
	}
	
	/**
	 * 15.2获取主页侧边栏元素"党员信息介绍"链接
	 */
	public WebElement getinformation_Introduction_of_Party_MembersLink() {
		return findElement(ByMethod.getLocator("information_Introduction_of_Party_Memberslink"));
	}
	
	
	/**
	 * 16.获取主页侧边栏元素"视频监视系统"
	 */
	public WebElement getvideo_surveillance_system() {
		return findElement(ByMethod.getLocator("video_surveillance_system"));
	}
	
	
	/**
	 * 17.获取主页侧边栏元素"MIS信息通"
	 */
	public WebElement getMIS_Information_Communication() {
		return findElement(ByMethod.getLocator("MIS_Information_Communication"));
	}
	
	
	/**
	 * 18.获取主页侧边栏元素"点睛管理之道"
	 */
	public WebElement getDianqings_Way_of_Management() {
		return findElement(ByMethod.getLocator("Dianqings_Way_of_Management"));
	}
	
	/**
	 * 17.获取主页侧边栏元素"万能魔表管理"
	 */
//	public WebElement getuniversal_Magic_Table_Management() {
//		return findElement(ByMethod.getLocator("universal_Magic_Table_Management"));
//	}
	
	/**
	 * 17.1获取主页侧边栏元素"新增万能魔表"文本
	 */
//	public WebElement getnew_Magic_Watch() {
//		return findElement(ByMethod.getLocator("new_Magic_Watch"));
//	}
	
	/**
	 * 17.1获取主页侧边栏元素"新增万能魔表"链接
	 */
//	public WebElement getnew_Magic_WatchLink() {
//		return findElement(ByMethod.getLocator("new_Magic_Watchlink"));
//	}
	
	/**
	 * 17.2获取主页侧边栏元素"万能魔表维护"文本
	 */
//	public WebElement getuniversal_Magic_Watch_Maintenance() {
//		return findElement(ByMethod.getLocator("universal_Magic_Watch_Maintenance"));
//	}
	
	/**
	 * 17.2获取主页侧边栏元素"万能魔表维护"链接
	 */
//	public WebElement getuniversal_Magic_Watch_MaintenanceLink() {
//		return findElement(ByMethod.getLocator("universal_Magic_Watch_Maintenance"));
//	}
	
	//-----------------------------------获取主窗口元素-------------------------------------------//
	

	/**
	 * 1.1.1获取"工作日志管理"》"我的工作日志"主窗口"我的工作日志(2019年8月)"
	 */
	public WebElement getMy_Job_Log() {
		return findElement(ByMethod.getLocator("My_Job_Log"));
	}

	/**
	 * 1.2.1获取"工作日志管理"》"他人工作日志"主窗口"下属日志列表"
	 */
	public WebElement getSubordinate_Log_List() {
		return findElement(ByMethod.getLocator("Subordinate_Log_List"));
	}

	/**
	 * 1.3.1获取"工作日志管理"》"日志参数设置"主窗口"工作日志参数设置"
	 */
	public WebElement getWorking_Log_Parameter_Settings() {
		return findElement(ByMethod.getLocator("Working_Log_Parameter_Settings"));
	}
	
	/**
	 * 2.1.1获取"工作计划管理"》"安排新工作计划"主窗口"发布新的工作计划"
	 */
	public WebElement getPublish_a_new_work_plan() {
		return findElement(ByMethod.getLocator("Publish_a_new_work_plan"));
	}
	
	/**
	 * 2.2.1获取"工作计划管理"》"浏览现有工作计划"主窗口"待处理事宜"
	 */
	public WebElement getMatters_to_be_dealt_with() {
		return findElement(ByMethod.getLocator("Matters_to_be_dealt_with"));
	}
	
	/**
	 * 2.3.1获取"工作计划管理"》"工作计划类别维护"主窗口"维护现有类别"
	 */
	public WebElement getMaintaining_existing_categories() {
		return findElement(ByMethod.getLocator("Maintaining_existing_categories"));
	}
	
	/**
	 * 3.1.1获取"项目跟踪管理"》"增加项目"主窗口"增加项目"
	 */
	public WebElement getmainAdditional_projects() {
		return findElement(ByMethod.getLocator("mainAdditional_projects"));
	}
	
	/**
	 * 3.2.1获取"项目跟踪管理"》"周期性项目跟踪"主窗口"周期性项目跟踪管理"
	 */
	public WebElement getmainPeriodic_Project_Tracking_Management() {
		return findElement(ByMethod.getLocator("mainPeriodic_Project_Tracking_Management"));
	}
	
	/**
	 * 3.3.1获取"项目跟踪管理"》"项目类别名称维护"主窗口"项目类别名称管理"
	 */
	public WebElement getmainProject_Category_Name_Management() {
		return findElement(ByMethod.getLocator("mainProject_Category_Name_Management"));
	}
	
	/**
	 * 3.4.1获取"项目跟踪管理"》"项目进度名称维护"主窗口"项目进度名称管理"
	 */
	public WebElement getmainProject_progress_name_management() {
		return findElement(ByMethod.getLocator("mainProject_progress_name_management"));
	}

	/**
	 * 4.1.1获取"通知公告管理"》"发布通知公告"主窗口"发布新公文/通知"
	 */
	public WebElement getPublication_of_new_documents_or_notices() {
		return findElement(ByMethod.getLocator("Publication_of_new_documents_or_notices"));
	}
	
	/**
	 * 4.2.1获取"通知公告管理"》"浏览通知公告"主窗口"浏览公文/通知"
	 */
	public WebElement getBrowse_documents_or_notices() {
		return findElement(ByMethod.getLocator("Browse_documents_or_notices"));
	}
	
	/**
	 * 4.3.1获取"通知公告管理"》"签收记录管理"主窗口"签收记录管理"
	 */
	public WebElement getManagement_of_Sign_and_Receive_Records() {
		return findElement(ByMethod.getLocator("mainManagement_of_Sign_and_Receive_Records"));
	}
	
	/**
	 * 4.4.1获取"通知公告管理"》"基础信息设置"主窗口"全局信息维护"
	 */
	public WebElement getGlobal_Information_Maintenance() {
		return findElement(ByMethod.getLocator("Global_Information_Maintenance"));
	}
	
	/**
	 * 5.1.1获取"公文收发管理"》"发文拟稿"主窗口"公文拟稿"
	 */
	public WebElement getDrafting_of_Official_Documents() {
		return findElement(ByMethod.getLocator("Drafting_of_Official_Documents"));
	}
	
	/**
	 * 5.2.1获取"公文收发管理"》"收发文审核"主窗口"收发文审核"
	 */
	public WebElement getmainAudit_of_Receiving_and_Sending_Documents() {
		return findElement(ByMethod.getLocator("mainAudit_of_Receiving_and_Sending_Documents"));
	}
	
	/**
	 * 5.3.1获取"公文收发管理"》"我的拟稿"主窗口"我的拟稿"
	 */
	public WebElement getmainMy_Draft() {
		return findElement(ByMethod.getLocator("mainMy_Draft"));
	}
	
	/**
	 * 5.4.1获取"公文收发管理"》"收文拟办"主窗口"待我接收"
	 */
	public WebElement getTo_be_accepted_by_me() {
		return findElement(ByMethod.getLocator("To_be_accepted_by_me"));
	}
	
	/**
	 * 5.5.1获取"公文收发管理"》"收文承办"主窗口"收文承办"
	 */
	public WebElement getmainAcceptance() {
		return findElement(ByMethod.getLocator("mainAcceptance"));
	}
	
	/**
	 * 5.6.1获取"公文收发管理"》"公文督办"主窗口"公文督办"
	 */
	public WebElement getSupervisory_Office_of_Documents() {
		return findElement(ByMethod.getLocator("Supervisory_Office_of_Documents"));
	}
	
	/**
	 * 5.7.1获取"公文收发管理"》"查看公文"主窗口"查看公文"
	 */
	public WebElement getViewing_Official_Documents() {
		return findElement(ByMethod.getLocator("Viewing_Official_Documents"));
	}
	
	/**
	 * 5.8.1获取"公文收发管理"》"基础信息设置"主窗口"公文类别管理"
	 */
	public WebElement getDocument_Category_Management() {
		return findElement(ByMethod.getLocator("Document_Category_Management"));
	}
	
	/**
	 * 6.1.1获取"工作联络单"》"发送联络单"主窗口"发送工作联络单"
	 */
	public WebElement getSend_Work_Contact_Form() {
		return findElement(ByMethod.getLocator("Send_Work_Contact_Form"));
	}
	
	/**
	 * 6.2.1获取"工作联络单"》"审核联络单"主窗口"审核工作联络单"
	 */
	public WebElement getAudit_Contact_Form() {
		return findElement(ByMethod.getLocator("Audit_Contact_Form"));
	}
	
	/**
	 * 6.3.1获取"工作联络单"》"浏览联络单"主窗口"浏览工作联络单"
	 */
	public WebElement getBrowse_Work_Contact_Sheet() {
		return findElement(ByMethod.getLocator("Browse_Work_Contact_Sheet"));
	}
	
	/**
	 * 6.4.1获取"工作联络单"》"管理联络单"主窗口"工作联络单"
	 */
	public WebElement getmainWork_contact_sheet() {
		return findElement(ByMethod.getLocator("mainWork_contact_sheet"));
	}
	
	/**
	 * 7.1.1获取"工作流管理"》"工作流申请"主窗口"工作流申请"
	 */
	public WebElement getmainWorkflow_Application() {
		return findElement(ByMethod.getLocator("mainWorkflow_Application"));
	}
	
	/**
	 * 7.2.1获取"工作流管理"》"我的审批"主窗口"待本人审核(/归档)工作流"
	 */
	public WebElement getWorkflow_to_be_audited_by_me() {
		return findElement(ByMethod.getLocator("Workflow_to_be_audited_by_me"));
	}
	
	/**
	 * 7.3.1获取"工作流管理"》"我的申请"主窗口"本人申请的工作流(审核中)"
	 */
	public WebElement getThe_workflow_I_applied() {
		return findElement(ByMethod.getLocator("The_workflow_I_applied"));
	}
	
	/**
	 * 7.4.1获取"工作流管理"》"已办工作流"主窗口"工作流列表"
	 */
	public WebElement getWorkflow_List() {
		return findElement(ByMethod.getLocator("Workflow_List"));
	}
	
	/**
	 * 7.5.1获取"工作流管理"》"模板管理"主窗口"工作流模板管理"
	 */
	public WebElement getWorkflow_Template_Management() {
		return findElement(ByMethod.getLocator("Workflow_Template_Management"));
	}
	
	/**
	 * 7.6.1获取"工作流管理"》"流程管理"主窗口"工作流流程管理"
	 */
	public WebElement getWorkflow_Process_Management() {
		return findElement(ByMethod.getLocator("Workflow_Process_Management"));
	}
	
	/**
	 * 7.7.1获取"工作流管理"》"参数设置"主窗口"工作流参数设置"
	 */
	public WebElement getWorkflow_Parameter_Settings() {
		return findElement(ByMethod.getLocator("Workflow_Parameter_Settings"));
	}
	
	/**
	 * 8.1.1.0获取"个人备忘录"》"增加备忘录"》"新增个人备忘录"弹窗 所在表单
	 */
	public WebElement getpopupIframe() {
		return findElement(ByMethod.getLocator("popupIframe"));
	}
	
	/**
	 * 8.1.1.1获取"个人备忘录"》"增加备忘录"》"新增个人备忘录"弹窗》"新增个人备忘录"
	 */
	public WebElement getAdditional_Personal_Memorandum() {
		return findElement(ByMethod.getLocator("Additional_Personal_Memorandum"));
	}
	
	/**
	 * 8.2.1获取"个人备忘录"》"浏览备忘录"主窗口"个人日记＆备忘录浏览"
	 */
	public WebElement getPersonal_Diaries_Memo_Browsing() {
		return findElement(ByMethod.getLocator("Personal_Diaries_Memo_Browsing"));
	}
	
	/**
	 * 9.1.1获取"我的通讯录"》"单位通讯录"主窗口"单位通讯录"
	 */
	public WebElement getmainUnit_Address_Book() {
		return findElement(ByMethod.getLocator("mainUnit_Address_Book"));
	}
	
	/**
	 * 9.2.1获取"我的通讯录"》"个人通讯录"主窗口"个人通讯录"
	 */
	public WebElement getmainPerson_Address_Book() {
		return findElement(ByMethod.getLocator("mainPerson_Address_Book"));
	}
	
	/**
	 * 9.3.1获取"我的通讯录"》"外部通讯录"主窗口"外部通讯录"
	 */
	public WebElement getmainExternal_Address_Book() {
		return findElement(ByMethod.getLocator("mainExternal_Address_Book"));
	}
	
	/**
	 * 9.4.1获取"我的通讯录"》"个人资料维护"主窗口"个人资料维护"
	 */
	public WebElement getPersonnel_Data_Maintenance() {
		return findElement(ByMethod.getLocator("Personnel_Data_Maintenance"));
	}
	
	/**
	 * 10.1.1获取"工作报告管理"》"安排工作报告"主窗口"新增工作报告任务"
	 */
	public WebElement getAdditional_Work_Reporting_Tasks() {
		return findElement(ByMethod.getLocator("Additional_Work_Reporting_Tasks"));
	}
	
	/**
	 * 10.2.1获取"工作报告管理"》"工作报告管理"主窗口"工作报告跟踪"
	 */
	public WebElement getmainWork_Report_Tracking() {
		return findElement(ByMethod.getLocator("mainWork_Report_Tracking"));
	}
	
	/**
	 * 11.1.1获取"改善提案管理"》"我要提交提案"主窗口"新增改善提案"
	 */
	public WebElement getAdditional_Improvement_Proposals() {
		return findElement(ByMethod.getLocator("Additional_Improvement_Proposals"));
	}
	
	/**
	 * 11.2.1获取"改善提案管理"》"提案浏览及反馈"主窗口"改善提案浏览"
	 */
	public WebElement getImprove_proposal_browsing() {
		return findElement(ByMethod.getLocator("Improve_proposal_browsing"));
	}
	
	/**
	 * 12.1.1获取"单位会议管理"》"发布会议通知"主窗口"发布会议通知"
	 */
	public WebElement getAnnouncement_of_Conference() {
		return findElement(ByMethod.getLocator("Announcement_of_Conference"));
	}
	
	/**
	 * 12.2.1获取"单位会议管理"》"新增会议纪要"主窗口"新增会议纪要"
	 */
	public WebElement getSummary_of_Additional_Meetings() {
		return findElement(ByMethod.getLocator("Summary_of_Additional_Meetings"));
	}
	
	/**
	 * 12.3.1获取"单位会议管理"》"浏览会议纪要"主窗口"浏览会议纪要"
	 */
	public WebElement getBrowse_Conference_Summary() {
		return findElement(ByMethod.getLocator("Browse_Conference_Summary"));
	}
	
	/**
	 * 13.1.1获取"单位新闻管理"》"发布新闻"主窗口"发布新闻"
	 */
	public WebElement getPress_release() {
		return findElement(ByMethod.getLocator("Press_release"));
	}
	
	/**
	 * 13.2.1获取"单位新闻管理"》"浏览新闻"主窗口"浏览新闻"
	 */
	public WebElement getmainBrowse_the_News() {
		return findElement(ByMethod.getLocator("mainBrowse_the_News"));
	}
	
	/**
	 * 14.1.1获取"党员天地"》"党务信息公开"主窗口"党务公开"
	 */
	public WebElement getmainOpenness_of_Party_Affairs() {
		return findElement(ByMethod.getLocator("mainOpenness_of_Party_Affairs"));
	}
	
	/**
	 * 14.2.1获取"党员天地"》"党员信息介绍"主窗口"党员信息"
	 */
	public WebElement getParty_Member_Information() {
		return findElement(ByMethod.getLocator("Party_Member_Information"));
	}
	
	/**
	 * 15.0.1获取"视频监视系统"主窗口"找不到服务器"
	 */
	public WebElement getServer_not_found() {
		return findElement(ByMethod.getLocator("Server_not_found"));
	}
	
	/**
	 * 16.0.1获取"MIS信息通"主窗口"信息通通话管理"
	 */
	public WebElement getCommunication_management() {
		return findElement(ByMethod.getLocator("Communication_management"));
	}


	
	/**
	 * 17.1.1获取"万能魔表管理"》"新增万能魔表"主窗口"新增万能魔表"
	 */
//	public WebElement getmainNew_Magic_Watch() {
//		return findElement(ByMethod.getLocator("mainNew_Magic_Watch"));
//	}
	
	/**
	 * 17.2.1获取"万能魔表管理"》"万能魔表维护"主窗口"万能魔表维护"
	 */
//	public WebElement getUniversal_Magic_Table_Maintenance() {
//		return findElement(ByMethod.getLocator("Universal_Magic_Table_Maintenance"));
//	}
	
	
	
	/**
	 * 5.1.1获取"单位车辆管理"》"车辆预约"》"车辆预约申请表"
	 */
	public WebElement getApplication_Form_for_Vehicle_Reservation() {
		return findElement(ByMethod.getLocator("Application_Form_for_Vehicle_Reservation"));
	}
	
	/**
	 * 5.2.1获取"单位车辆管理"》"车辆占用情况"》"车辆占用图示"
	 */
	public WebElement getVehicle_Occupancy_Diagram() {
		return findElement(ByMethod.getLocator("Vehicle_Occupancy_Diagram"));
	}
	
	/**
	 * 5.3.1获取"单位车辆管理"》"用车审核管理"》"车辆预约申请审核"
	 */
	public WebElement getExamination_of_Vehicle_Reservation_Application() {
		return findElement(ByMethod.getLocator("Examination_of_Vehicle_Reservation_Application"));
	}
	
	/**
	 * 5.4.1获取"单位车辆管理"》"车辆使用记录"》"车辆使用记录"
	 */
	public WebElement getmain_Vehicle_use_record() {
		return findElement(ByMethod.getLocator("main_Vehicle_use_record"));
	}
	
	/**
	 * 5.5.1获取"单位车辆管理"》"车辆信息管理"》"车辆信息"
	 */
	public WebElement getVehicle_information() {
		return findElement(ByMethod.getLocator("Vehicle_information"));
	}
	
	/**
	 * 5.6.1获取"单位车辆管理"》"车辆费用管理"》"车辆费用管理"
	 */
	public WebElement getmain_Vehicle_Cost_Management() {
		return findElement(ByMethod.getLocator("main_Vehicle_Cost_Management"));
	}
	
	/**
	 * 5.7.1获取"单位车辆管理"》"基础信息设置"》"基础信息设置"
	 */
	public WebElement getmain_Basic_Information_Settings() {
		return findElement(ByMethod.getLocator("main_Basic_Information_Settings"));
	}
	
}
