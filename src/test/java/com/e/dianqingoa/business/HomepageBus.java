package com.e.dianqingoa.business;

import com.a.publish.base.DriverBase;
import com.d.dianqingoa.handle.HompageHandle;

public class HomepageBus {

	public HompageHandle hompageHandle;

	public HomepageBus(DriverBase driverBase) {
		super();
		hompageHandle = new HompageHandle(driverBase);
	}

	/**
	 * 1.点击"工作日志管理"
	 */
	public void clickWorkLogManagement() {
		hompageHandle.clickWorkLogManagement();
	}

	/**
	 * 1.1点击"我的工作日志"链接
	 */
	public void clickMyJobLogLink() {
		hompageHandle.clickMyJobLogLink();
	}

	/**
	 * 1.2点击"他人工作日志"
	 */
	public void clickOtherPeoplesWorkLogLink() {
		hompageHandle.clickOtherPeoplesWorkLogLink();
	}

	/**
	 * 1.3点击"日志参数设置"
	 */
	public void clickLogParameterSettingLink() {
		hompageHandle.clickLogParameterSettingLink();
	}

	/**
	 * 2.点击"工作计划管理"
	 */
	public void clickwork_plan_management() {
		hompageHandle.clickwork_plan_management();
	}

	/**
	 * 2.1点击"安排新的工作计划"链接
	 */
	public void clickarrange_a_new_work_planLink() {
		hompageHandle.clickarrange_a_new_work_planLink();
	}

	/**
	 * 2.2点击"浏览现有工作计划"链接
	 */
	public void clickbrowse_through_existing_work_plansLink() {
		hompageHandle.clickbrowse_through_existing_work_plansLink();
	}

	/**
	 * 2.3点击"工作计划类别维护"链接
	 */
	public void clickmaintenance_of_Work_Plan_CategoryLink() {
		hompageHandle.clickmaintenance_of_Work_Plan_CategoryLink();
	}

	/**
	 * 3.点击"项目跟踪管理"
	 */
	public void clickproject_tracking_management() {
		hompageHandle.clickproject_tracking_management();
	}

	/**
	 * 3.1点击"增加项目"链接
	 */
	public void clickadditional_projectsLink() {
		hompageHandle.clickadditional_projectsLink();
	}

	/**
	 * 3.2点击"周期性项目跟踪"链接
	 */
	public void clickperiodic_project_trackingLink() {
		hompageHandle.clickperiodic_project_trackingLink();
	}

	/**
	 * 3.3点击"项目类别名称维护"链接
	 */
	public void clickproject_Category_Name_MaintenanceLink() {
		hompageHandle.clickproject_Category_Name_MaintenanceLink();
	}

	/**
	 * 3.4点击"项目进度名称维护"链接
	 */
	public void clickmaintenance_of_Project_Progress_NameLink() {
		hompageHandle.clickmaintenance_of_Project_Progress_NameLink();
	}

	/**
	 * 4.点击"通知公告管理"
	 */
	public void clicknotification_and_Announcement_Management() {
		hompageHandle.clicknotification_and_Announcement_Management();
	}

	/**
	 * 4.1点击"发布通知公告"
	 */
	public void clickannouncement_of_NotificationLink() {
		hompageHandle.clickannouncement_of_NotificationLink();
	}

	/**
	 * 4.2点击"浏览通知公告"
	 */
	public void clickbrowse_Notice_BulletinLink() {
		hompageHandle.clickbrowse_Notice_BulletinLink();
	}

	/**
	 * 4.3点击"签收记录管理"
	 */
	public void clickmanagement_of_Sign_and_Receive_RecordsLink() {
		hompageHandle.clickmanagement_of_Sign_and_Receive_RecordsLink();
	}

	/**
	 * 4.4点击"基础信息设置"
	 */
	public void clicknotice_basic_Information_SettingsLink() {
		hompageHandle.clicknotice_basic_Information_SettingsLink();
	}

	/**
	 * 5.点击"公文收发管理"
	 */
	public void clickdocument_Receiving_and_Dispatching_Management() {
		hompageHandle.clickdocument_Receiving_and_Dispatching_Management();
	}

	/**
	 * 5.1点击"发文拟稿"链接
	 */
	public void clickdraft_manuscriptgLink() {
		hompageHandle.clickdraft_manuscriptgLink();
	}

	/**
	 * 5.2点击"收发文审核"链接
	 */
	public void clickaudit_of_Receiving_and_Sending_DocumentsLink() {
		hompageHandle.clickaudit_of_Receiving_and_Sending_DocumentsLink();
	}

	/**
	 * 5.3点击"我的拟稿"链接
	 */
	public void clickmy_draftLink() {
		hompageHandle.clickmy_draftLink();
	}

	/**
	 * 5.4点击"收文拟办"链接
	 */
	public void clickreceiving_Papers_to_be_ProcessedLink() {
		hompageHandle.clickreceiving_Papers_to_be_ProcessedLink();
	}

	/**
	 * 5.5点击"收文承办"链接
	 */
	public void clickacceptanceLink() {
		hompageHandle.clickacceptanceLink();
	}

	/**
	 * 5.6点击"公文督办"链接
	 */
	public void clickdocument_Supervisory_OfficeLink() {
		hompageHandle.clickdocument_Supervisory_OfficeLink();
	}

	/**
	 * 5.7点击"查看公文"链接
	 */
	public void clickview_official_documentsLink() {
		hompageHandle.clickview_official_documentsLink();
	}

	/**
	 * 5.8点击"基础信息设置"链接
	 */
	public void clickdocument_basic_Information_SettingsLink() {
		hompageHandle.clickdocument_basic_Information_SettingsLink();
	}

	/**
	 * 6.点击"工作联络单"
	 */
	public void clickwork_contact_sheet() {
		hompageHandle.clickwork_contact_sheet();
	}

	/**
	 * 6.1点击"发送联络单"链接
	 */
	public void clicksend_Contact_FormLink() {
		hompageHandle.clicksend_Contact_FormLink();
	}

	/**
	 * 6.2点击"审核联络单"链接
	 */
	public void clickaudit_contact_sheetLink() {
		hompageHandle.clickaudit_contact_sheetLink();
	}

	/**
	 * 6.3点击"浏览联络单"链接
	 */
	public void clickbrowse_contact_sheetsLink() {
		hompageHandle.clickbrowse_contact_sheetsLink();
	}

	/**
	 * 6.4点击"管理联络单"链接
	 */
	public void clickmanagement_contact_sheetLink() {
		hompageHandle.clickmanagement_contact_sheetLink();
	}

	/**
	 * 7.点击"工作流管理"
	 */
	public void clickworkflow_management() {
		hompageHandle.clickworkflow_management();
	}

	/**
	 * 7.1点击"工作流申请"链接
	 */
	public void clickworkflow_applicationLink() {
		hompageHandle.clickworkflow_applicationLink();
	}

	/**
	 * 7.2点击"我的审批"链接
	 */
	public void clickmy_approvalLink() {
		hompageHandle.clickmy_approvalLink();
	}

	/**
	 * 7.3点击"我的申请"链接
	 */
	public void clickmy_applicationLink() {
		hompageHandle.clickmy_applicationLink();
	}

	/**
	 * 7.4点击"已办工作流"链接
	 */
	public void clickworkflow_already_doneLink() {
		hompageHandle.clickworkflow_already_doneLink();
	}

	/**
	 * 7.5点击"模板管理"链接
	 */
	public void clicktemplate_managementLink() {
		hompageHandle.clicktemplate_managementLink();
	}

	/**
	 * 7.6点击"流程管理"链接
	 */
	public void clickprocess_managementLink() {
		hompageHandle.clickprocess_managementLink();
	}

	/**
	 * 7.7点击"参数设置"链接
	 */
	public void clickparameter_SettingsLink() {
		hompageHandle.clickparameter_SettingsLink();
	}

	/**
	 * 8.点击"个人备忘录"
	 */
	public void clickpersonal_Memorandum() {
		hompageHandle.clickpersonal_Memorandum();
	}

	/**
	 * 8.1点击"增加备忘录"链接
	 */
	public void clickadditional_memorandumLink() {
		hompageHandle.clickadditional_memorandumLink();
	}
	
	/**
	 * 8.1.1关闭"新增个人备忘录"弹窗
	 */
	public void closeadditional_memorandumWindow() {
		hompageHandle.closeadditional_memorandumWindow();
	}

	/**
	 * 8.2点击"浏览备忘录"链接
	 */
	public void clickbrowse_the_MemorandumLink() {
		hompageHandle.clickbrowse_the_MemorandumLink();
	}

	/**
	 * 9.点击"我的通信录"
	 */
	public void clickmy_address_book() {
		hompageHandle.clickmy_address_book();
	}

	/**
	 * 9.1点击"单位通讯录"链接
	 */
	public void clickunit_Address_BookLink() {
		hompageHandle.clickunit_Address_BookLink();
	}

	/**
	 * 9.2点击"个人通讯录"链接
	 */
	public void clickpersonal_Address_BookLink() {
		hompageHandle.clickpersonal_Address_BookLink();
	}

	/**
	 * 9.3点击"外部通讯录"链接
	 */
	public void clickexternal_Address_BookLink() {
		hompageHandle.clickexternal_Address_BookLink();
	}

	/**
	 * 9.4点击"个人资料维护"链接
	 */
	public void clickpersonal_Data_MaintenanceLink() {
		hompageHandle.clickpersonal_Data_MaintenanceLink();
	}

	/**
	 * 10.点击"工作报告管理"
	 */
	public void clickwork_report_management() {
		hompageHandle.clickwork_report_management();
	}

	/**
	 * 10.1点击"安排工作报告"链接
	 */
	public void clickarrangement_of_work_reportsLink() {
		hompageHandle.clickarrangement_of_work_reportsLink();
	}

	/**
	 * 10.2点击"工作报告管理(跟踪)"链接
	 */
	public void clickwork_report_trackingLink() {
		hompageHandle.clickwork_report_trackingLink();
	}

	/**
	 * 11.点击"改善提案管理"
	 */
	public void clickimproving_Proposal_Management() {
		hompageHandle.clickimproving_Proposal_Management();
	}

	/**
	 * 11.1点击"我要提交提案"链接
	 */
	public void clicki_want_to_submit_a_proposalLink() {
		hompageHandle.clicki_want_to_submit_a_proposalLink();
	}

	/**
	 * 11.2点击"提案浏览及反馈"链接
	 */
	public void clickproposal_Browsing_and_FeedbackLink() {
		hompageHandle.clickproposal_Browsing_and_FeedbackLink();
	}

	/**
	 * 12.点击"单位会议管理"
	 */
	public void clickunit_Meeting_Management() {
		hompageHandle.clickunit_Meeting_Management();
	}

	/**
	 * 12.1点击"发布会议通知"链接
	 */
	public void clickpress_conference_announcementLink() {
		hompageHandle.clickpress_conference_announcementLink();
	}

	/**
	 * 12.2点击"新增会议纪要"链接
	 */
	public void clickadded_minutes_of_the_meetingLink() {
		hompageHandle.clickadded_minutes_of_the_meetingLink();
	}

	/**
	 * 12.3点击"浏览会议纪要"链接
	 */
	public void clickbrowse_the_minutes_of_the_meetingLink() {
		hompageHandle.clickbrowse_the_minutes_of_the_meetingLink();
	}

	/**
	 * 13.点击"单位新闻管理"
	 */
	public void clickunit_News_Management() {
		hompageHandle.clickunit_News_Management();
	}

	/**
	 * 13.1点击"发布新闻"链接
	 */
	public void clickpublish_newsLink() {
		hompageHandle.clickpublish_newsLink();
	}

	/**
	 * 13.2点击"浏览新闻"链接
	 */
	public void clickbrowse_the_newsLink() {
		hompageHandle.clickbrowse_the_newsLink();
	}

	/**
	 * 14.点击"党员天地"
	 */
	public void clickparty_members_world() {
		hompageHandle.clickparty_members_world();
	}

	/**
	 * 14.1点击"党务信息公开"链接
	 */
	public void clickopenness_of_Party_Affairs_InformationLink() {
		hompageHandle.clickopenness_of_Party_Affairs_InformationLink();
	}

	/**
	 * 14.2点击"党员信息介绍"链接
	 */
	public void clickinformation_Introduction_of_Party_MembersLink() {
		hompageHandle.clickinformation_Introduction_of_Party_MembersLink();
	}

	/**
	 * 15.点击"视频监视系统"
	 */
	public void clickvideo_surveillance_system() {
		hompageHandle.clickvideo_surveillance_system();
	}

	/**
	 * 16.点击"MIS信息通"
	 */
	public void clickMIS_Information_Communication() {
		hompageHandle.clickMIS_Information_Communication();
	}

	/**
	 * 17.点击"点睛管理之道"
	 */
	public void clickDianqings_Way_of_Management() {
		hompageHandle.clickDianqings_Way_of_Management();
	}


	/**
	 * 17.点击"万能魔表管理"
	 */
//	public void clickuniversal_Magic_Table_Management() {
//		hompageHandle.clickuniversal_Magic_Table_Management();
//	}

	/**
	 * 17.1点击"新增万能魔表"链接
	 */
//	public void clicknew_Magic_WatchLink() {
//		hompageHandle.clicknew_Magic_WatchLink();
//	}

	/**
	 * 17.2点击"万能魔表维护"链接
	 */
//	public void clickuniversal_Magic_Watch_MaintenanceLink() {
//		hompageHandle.clickuniversal_Magic_Watch_MaintenanceLink();
//	}
	
	/**
	 * 5.点击主页侧边栏元素"单位车辆管理"
	 */
	public void clickUnit_Vehicle_Management() {
		hompageHandle.clickUnit_Vehicle_Management();
	}
	
	/**
	 * 5.1点击主页侧边栏元素"车辆预约"
	 */
	public void clickVehicle_reservation() {
		hompageHandle.clickVehicle_reservation();
	}
	
	/**
	 * 5.2点击主页侧边栏元素"车辆占用情况"
	 */
	public void clickOccupancy_of_vehicles() {
		hompageHandle.clickOccupancy_of_vehicles();
	}
	
	/**
	 * 5.3点击主页侧边栏元素"用车审核管理"
	 */
	public void clickVehicle_Audit_Management() {
		hompageHandle.clickVehicle_Audit_Management();
	}
	
	/**
	 * 5.4点击主页侧边栏元素"车辆使用记录"
	 */
	public void clickVehicle_use_record() {
		hompageHandle.clickVehicle_use_record();
	}
	
	/**
	 * 5.5点击主页侧边栏元素"车辆信息管理"
	 */
	public void clickVehicle_Information_Management() {
		hompageHandle.clickVehicle_Information_Management();
	}
	
	/**
	 * 5.6点击主页侧边栏元素"车辆费用管理"
	 */
	public void clickVehicle_Cost_Management() {
		hompageHandle.clickVehicle_Cost_Management();
	}
	
	/**
	 * 5.7点击主页侧边栏元素"基础信息设置"
	 */
	public void clickBasic_Information_Settings() {
		hompageHandle.clickBasic_Information_Settings();
	}
	
}
