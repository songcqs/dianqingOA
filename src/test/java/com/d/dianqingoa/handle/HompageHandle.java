package com.d.dianqingoa.handle;

import com.a.publish.base.DriverBase;
import com.c.dianqingoa.element.HompageEle;

public class HompageHandle {

	public DriverBase driver;
	public HompageEle hompageEle;
	
	public HompageHandle(DriverBase driver) {
		super();
		this.driver = driver;
		hompageEle = new HompageEle(driver);
	}
	
	//---------------------------点击主页侧边栏元素---------------------------------//
	
	/**
	 * 1.点击"工作日志管理"
	 */
	public void clickWorkLogManagement() {
		hompageEle.clickElement(hompageEle.getWorkLogManagement());
	}
	
	/**
	 * 1.1点击"我的工作日志"链接
	 */
	public void clickMyJobLogLink() {
		hompageEle.clickElement(hompageEle.getMyJobLogLink());
	}
	
	/**
	 * 1.2点击"他人工作日志"链接
	 */
	public void clickOtherPeoplesWorkLogLink() {
		hompageEle.clickElement(hompageEle.getOtherPeoplesWorkLogLink());
	}
	
	/**
	 * 1.3点击"日志参数设置"链接
	 */
	public void clickLogParameterSettingLink() {
		hompageEle.clickElement(hompageEle.getLogParameterSettingLink());
	}
	
	/**
	 * 2.点击"工作计划管理"
	 */
	public void clickwork_plan_management() {
		hompageEle.clickElement(hompageEle.getwork_plan_management());
	}
	
	/**
	 * 2.1点击"安排新的工作计划"链接
	 */
	public void clickarrange_a_new_work_planLink() {
		hompageEle.clickElement(hompageEle.getarrange_a_new_work_planLink());
	}
	
	/**
	 * 2.2点击"浏览现有工作计划"链接
	 */
	public void clickbrowse_through_existing_work_plansLink() {
		hompageEle.clickElement(hompageEle.getbrowse_through_existing_work_plansLink());
	}
	
	/**
	 * 2.3点击"工作计划类别维护"链接
	 */
	public void clickmaintenance_of_Work_Plan_CategoryLink() {
		hompageEle.clickElement(hompageEle.getmaintenance_of_Work_Plan_CategoryLink());
	}
	
	/**
	 * 3.点击"项目跟踪管理"
	 */
	public void clickproject_tracking_management() {
		hompageEle.clickElement(hompageEle.getproject_tracking_management());
	}
	
	/**
	 * 3.1点击"增加项目"链接
	 */
	public void clickadditional_projectsLink() {
		hompageEle.clickElement(hompageEle.getadditional_projectsLink());
	}
	
	/**
	 * 3.2点击"周期性项目跟踪"链接
	 */
	public void clickperiodic_project_trackingLink() {
		hompageEle.clickElement(hompageEle.getperiodic_project_trackingLink());
	}
	
	/**
	 * 3.3点击"项目类别名称维护"链接
	 */
	public void clickproject_Category_Name_MaintenanceLink() {
		hompageEle.clickElement(hompageEle.getproject_Category_Name_MaintenanceLink());
	}
	
	/**
	 * 3.4点击"项目进度名称维护"链接
	 */
	public void clickmaintenance_of_Project_Progress_NameLink() {
		hompageEle.clickElement(hompageEle.getmaintenance_of_Project_Progress_NameLink());
	}
	
	/**
	 * 4.点击"通知公告管理"
	 */
	public void clicknotification_and_Announcement_Management() {
		hompageEle.clickElement(hompageEle.getnotification_and_Announcement_Management());
	}
	
	/**
	 * 4.1点击"发布通知公告"链接
	 */
	public void clickannouncement_of_NotificationLink() {
		hompageEle.clickElement(hompageEle.getannouncement_of_NotificationLink());
	}
	
	/**
	 * 4.2点击"浏览通知公告"链接
	 */
	public void clickbrowse_Notice_BulletinLink() {
		hompageEle.clickElement(hompageEle.getbrowse_Notice_BulletinLink());
	}
	
	/**
	 * 4.3点击"签收记录管理"链接
	 */
	public void clickmanagement_of_Sign_and_Receive_RecordsLink() {
		hompageEle.clickElement(hompageEle.getmanagement_of_Sign_and_Receive_RecordsLink());
	}
	
	/**
	 * 4.4点击"基础信息设置"链接
	 */
	public void clicknotice_basic_Information_SettingsLink() {
		hompageEle.clickElement(hompageEle.getnotice_basic_Information_SettingsLink());
	}
	
	/**
	 * 5.点击"公文收发管理"
	 */
	public void clickdocument_Receiving_and_Dispatching_Management() {
		hompageEle.clickElement(hompageEle.getdocument_Receiving_and_Dispatching_Management());
	}
	
	/**
	 * 5.1点击"发文拟稿"链接
	 */
	public void clickdraft_manuscriptgLink() {
		hompageEle.clickElement(hompageEle.getdraft_manuscriptgLink());
	}
	
	/**
	 * 5.2点击"收发文审核"链接
	 */
	public void clickaudit_of_Receiving_and_Sending_DocumentsLink() {
		hompageEle.clickElement(hompageEle.getaudit_of_Receiving_and_Sending_DocumentsLink());
	}
	
	/**
	 * 5.3点击"我的拟稿"链接
	 */
	public void clickmy_draftLink() {
		hompageEle.clickElement(hompageEle.getmy_draftLink());
	}
	
	/**
	 * 5.4点击"收文拟办"链接
	 */
	public void clickreceiving_Papers_to_be_ProcessedLink() {
		hompageEle.clickElement(hompageEle.getreceiving_Papers_to_be_ProcessedLink());
	}
	
	/**
	 * 5.5点击"收文承办"链接
	 */
	public void clickacceptanceLink() {
		hompageEle.clickElement(hompageEle.getacceptanceLink());
	}
	
	/**
	 * 5.6点击"公文督办"链接
	 */
	public void clickdocument_Supervisory_OfficeLink() {
		hompageEle.clickElement(hompageEle.getdocument_Supervisory_OfficeLink());
	}
	
	/**
	 * 5.7点击"查看公文"链接
	 */
	public void clickview_official_documentsLink() {
		hompageEle.clickElement(hompageEle.getview_official_documentsLink());
	}
	
	/**
	 * 5.8点击"基础信息设置"链接
	 */
	public void clickdocument_basic_Information_SettingsLink() {
		hompageEle.clickElement(hompageEle.getdocument_basic_Information_SettingsLink());
	}
	
	/**
	 * 6.点击"工作联络单"
	 */
	public void clickwork_contact_sheet() {
		hompageEle.clickElement(hompageEle.getwork_contact_sheet());
	}
	
	/**
	 * 6.1点击"发送联络单"链接
	 */
	public void clicksend_Contact_FormLink() {
		hompageEle.clickElement(hompageEle.getsend_Contact_FormLink());
	}
	
	/**
	 * 6.2点击"审核联络单"链接
	 */
	public void clickaudit_contact_sheetLink() {
		hompageEle.clickElement(hompageEle.getaudit_contact_sheetLink());
	}
	
	/**
	 * 6.3点击"浏览联络单"链接
	 */
	public void clickbrowse_contact_sheetsLink() {
		hompageEle.clickElement(hompageEle.getbrowse_contact_sheetsLink());
	}
	
	/**
	 * 6.4点击"管理联络单"链接
	 */
	public void clickmanagement_contact_sheetLink() {
		hompageEle.clickElement(hompageEle.getmanagement_contact_sheetLink());
	}
	
	/**
	 * 7.点击"工作流管理"
	 */
	public void clickworkflow_management() {
		hompageEle.clickElement(hompageEle.getworkflow_management());
	}
	
	/**
	 * 7.1点击"工作流申请"链接
	 */
	public void clickworkflow_applicationLink() {
		hompageEle.clickElement(hompageEle.getworkflow_applicationLink());
	}
	
	/**
	 * 7.2点击"我的审批"链接
	 */
	public void clickmy_approvalLink() {
		hompageEle.clickElement(hompageEle.getmy_approvalLink());
	}
	
	/**
	 * 7.3点击"我的申请"链接
	 */
	public void clickmy_applicationLink() {
		hompageEle.clickElement(hompageEle.getmy_applicationLink());
	}
	
	/**
	 * 7.4点击"已办工作流"链接
	 */
	public void clickworkflow_already_doneLink() {
		hompageEle.clickElement(hompageEle.getworkflow_already_doneLink());
	}
	
	/**
	 * 7.5点击"模板管理"链接
	 */
	public void clicktemplate_managementLink() {
		hompageEle.clickElement(hompageEle.gettemplate_managementLink());
	}
	
	/**
	 * 7.6点击"流程管理"链接
	 */
	public void clickprocess_managementLink() {
		hompageEle.clickElement(hompageEle.getprocess_managementLink());
	}
	
	/**
	 * 7.7点击"参数设置"链接
	 */
	public void clickparameter_SettingsLink() {
		hompageEle.clickElement(hompageEle.getparameter_SettingsLink());
	}
	
	/**
	 * 8.点击"个人备忘录"
	 */
	public void clickpersonal_Memorandum() {
		hompageEle.clickElement(hompageEle.getpersonal_Memorandum());
	}
	
	/**
	 * 8.1点击"增加备忘录"链接
	 */
	public void clickadditional_memorandumLink() {
		hompageEle.clickElement(hompageEle.getadditional_memorandumLink());
	}
	
	/**
	 * 8.1.1关闭"新增个人备忘录"弹窗
	 */
	public void closeadditional_memorandumWindow() {
		hompageEle.clickElement(hompageEle.getcloseadditional_memorandum());
	}
	
	/**
	 * 8.2点击"浏览备忘录"链接
	 */
	public void clickbrowse_the_MemorandumLink() {
		hompageEle.clickElement(hompageEle.getbrowse_the_MemorandumLink());
	}
	
	/**
	 * 9.点击"我的通信录"
	 */
	public void clickmy_address_book() {
		hompageEle.clickElement(hompageEle.getmy_address_book());
	}
	
	/**
	 * 9.1点击"单位通讯录"链接
	 */
	public void clickunit_Address_BookLink() {
		hompageEle.clickElement(hompageEle.getunit_Address_BookLink());
	}
	
	/**
	 * 9.2点击"个人通讯录"链接
	 */
	public void clickpersonal_Address_BookLink() {
		hompageEle.clickElement(hompageEle.getpersonal_Address_BookLink());
	}
	
	/**
	 * 9.3点击"外部通讯录"链接
	 */
	public void clickexternal_Address_BookLink() {
		hompageEle.clickElement(hompageEle.getexternal_Address_BookLink());
	}
	
	/**
	 * 9.4点击"个人资料维护"链接
	 */
	public void clickpersonal_Data_MaintenanceLink() {
		hompageEle.clickElement(hompageEle.getpersonal_Data_MaintenanceLink());
	}
	
	/**
	 * 10.点击"工作报告管理"
	 */
	public void clickwork_report_management() {
		hompageEle.clickElement(hompageEle.getwork_report_management());
	}
	
	/**
	 * 10.1点击"安排工作报告"链接
	 */
	public void clickarrangement_of_work_reportsLink() {
		hompageEle.clickElement(hompageEle.getarrangement_of_work_reportsLink());
	}
	
	/**
	 * 10.2点击"工作报告管理(跟踪)"链接
	 */
	public void clickwork_report_trackingLink() {
		hompageEle.clickElement(hompageEle.getwork_report_trackingLink());
	}
	
	/**
	 * 11.点击"改善提案管理"
	 */
	public void clickimproving_Proposal_Management() {
		hompageEle.clickElement(hompageEle.getimproving_Proposal_Management());
	}
	
	/**
	 * 11.1点击"我要提交提案"链接
	 */
	public void clicki_want_to_submit_a_proposalLink() {
		hompageEle.clickElement(hompageEle.geti_want_to_submit_a_proposalLink());
	}
	
	/**
	 * 11.2点击"提案浏览及反馈"链接
	 */
	public void clickproposal_Browsing_and_FeedbackLink() {
		hompageEle.clickElement(hompageEle.getproposal_Browsing_and_FeedbackLink());
	}
	
	/**
	 * 12.点击"单位会议管理"
	 */
	public void clickunit_Meeting_Management() {
		hompageEle.clickElement(hompageEle.getunit_Meeting_Management());
	}
	
	/**
	 * 12.1点击"发布会议通知"链接
	 */
	public void clickpress_conference_announcementLink() {
		hompageEle.clickElement(hompageEle.getpress_conference_announcementLink());
	}
	
	/**
	 * 12.2点击"新增会议纪要"链接
	 */
	public void clickadded_minutes_of_the_meetingLink() {
		hompageEle.clickElement(hompageEle.getadded_minutes_of_the_meetingLink());
	}
	
	/**
	 * 12.3点击"浏览会议纪要"链接
	 */
	public void clickbrowse_the_minutes_of_the_meetingLink() {
		hompageEle.clickElement(hompageEle.getbrowse_the_minutes_of_the_meetingLink());
	}
	
	/**
	 * 13.点击"单位新闻管理"
	 */
	public void clickunit_News_Management() {
		hompageEle.clickElement(hompageEle.getunit_News_Management());
	}
	
	/**
	 * 13.1点击"发布新闻"链接
	 */
	public void clickpublish_newsLink() {
		hompageEle.clickElement(hompageEle.getpublish_newsLink());
	}
	
	/**
	 * 13.2点击"浏览新闻"链接
	 */
	public void clickbrowse_the_newsLink() {
		hompageEle.clickElement(hompageEle.getbrowse_the_newsLink());
	}
	
	/**
	 * 14.点击"党员天地"
	 */
	public void clickparty_members_world() {
		hompageEle.clickElement(hompageEle.getparty_members_world());
	}
	
	/**
	 * 14.1点击"党务信息公开"链接
	 */
	public void clickopenness_of_Party_Affairs_InformationLink() {
		hompageEle.clickElement(hompageEle.getopenness_of_Party_Affairs_InformationLink());
	}
	
	/**
	 * 14.2点击"党员信息介绍"链接
	 */
	public void clickinformation_Introduction_of_Party_MembersLink() {
		hompageEle.clickElement(hompageEle.getinformation_Introduction_of_Party_MembersLink());
	}
	
	/**
	 * 15.点击"视频监视系统"
	 */
	public void clickvideo_surveillance_system() {
		hompageEle.clickElement(hompageEle.getvideo_surveillance_system());
	}
	
	/**
	 * 16.点击"MIS信息通"
	 */
	public void clickMIS_Information_Communication() {
		hompageEle.clickElement(hompageEle.getMIS_Information_Communication());
	}
	
	/**
	 * 17.点击"点睛管理之道"
	 */
	public void clickDianqings_Way_of_Management() {
		hompageEle.clickElement(hompageEle.getDianqings_Way_of_Management());
	}
	
	
	
	
	/**
	 * 17.点击"万能魔表管理"
	 */
//	public void clickuniversal_Magic_Table_Management() {
//		hompageEle.clickElement(hompageEle.getuniversal_Magic_Table_Management());
//	}
	
	/**
	 * 17.1点击"新增万能魔表"链接
	 */
//	public void clicknew_Magic_WatchLink() {
//		hompageEle.clickElement(hompageEle.getnew_Magic_WatchLink());
//	}
	
	/**
	 * 17.2点击"万能魔表维护"链接
	 */
//	public void clickuniversal_Magic_Watch_MaintenanceLink() {
//		hompageEle.clickElement(hompageEle.getuniversal_Magic_Watch_MaintenanceLink());
//	}
	
	/**
	 * 5.点击主页侧边栏元素"单位车辆管理"
	 */
	public void clickUnit_Vehicle_Management() {
		hompageEle.clickElement(hompageEle.getUnit_Vehicle_ManagementLink());
	}
	
	/**
	 * 5.1点击主页侧边栏元素"车辆预约"
	 */
	public void clickVehicle_reservation() {
		hompageEle.clickElement(hompageEle.getVehicle_reservationLink());
	}
	
	/**
	 * 5.2点击主页侧边栏元素"车辆占用情况"
	 */
	public void clickOccupancy_of_vehicles() {
		hompageEle.clickElement(hompageEle.getOccupancy_of_vehiclesLink());
	}
	
	/**
	 * 5.3点击主页侧边栏元素"用车审核管理"
	 */
	public void clickVehicle_Audit_Management() {
		hompageEle.clickElement(hompageEle.getVehicle_Audit_ManagementLink());
	}
	
	/**
	 * 5.4点击主页侧边栏元素"车辆使用记录"
	 */
	public void clickVehicle_use_record() {
		hompageEle.clickElement(hompageEle.getVehicle_use_recordLink());
	}
	
	/**
	 * 5.5点击主页侧边栏元素"车辆信息管理"
	 */
	public void clickVehicle_Information_Management() {
		hompageEle.clickElement(hompageEle.getVehicle_Information_ManagementLink());
	}
	
	/**
	 * 5.6点击主页侧边栏元素"车辆费用管理"
	 */
	public void clickVehicle_Cost_Management() {
		hompageEle.clickElement(hompageEle.getVehicle_Cost_ManagementLink());
	}
	
	/**
	 * 5.7点击主页侧边栏元素"基础信息设置"
	 */
	public void clickBasic_Information_Settings() {
		hompageEle.clickElement(hompageEle.getBasic_Information_SettingsLink());
	}
	
}
