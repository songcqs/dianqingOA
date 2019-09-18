package com.c.dianqingoa.element;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.BasePage;
import com.b.publish.util.ByMethod;

public class DQWayOfMgtPopEle extends BasePage {

	public DQWayOfMgtPopEle(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//---------------------------获取 点晴管理之道 侧边栏元素---------------------------------//
	
	/**
	 * 获取元素侧边栏所在iframe表单
	 */
	public WebElement getJCXleft_menu() {
		return findElement(ByMethod.getLocator("JCXleft_menu"));
	}
	
	/**
	 * 获取元素"点晴MIS信息通（IM）"》"点晴JCX子系统"
	 */
	public WebElement getJCX_Subsystem() {
		return findElement(ByMethod.getLocator("JCX_Subsystem"));
	}
	
	/**
	 * 获取元素"点晴CRM子系统"
	 */
	public WebElement getCRM_Subsystem() {
		return findElement(ByMethod.getLocator("CRM_Subsystem"));
	}
	
	/**
	 * 获取元素"人力资源管理"
	 */
	public WebElement getHuman_Resources_Management() {
		return findElement(ByMethod.getLocator("Human_Resources_Management"));
	}
	
	/**
	 * 获取元素"点晴WMS子系统"
	 */
	public WebElement getWMS_Subsystem() {
		return findElement(ByMethod.getLocator("WMS_Subsystem"));
	}
	
	/**
	 * 获取元素"点晴DRP子系统"
	 */
	public WebElement getDPR_Subsystem() {
		return findElement(ByMethod.getLocator("DPR_Subsystem"));
	}
	
	/**
	 * 获取元素"点晴EBR子系统"
	 */
	public WebElement getEBR_Subsystem() {
		return findElement(ByMethod.getLocator("EBR_Subsystem"));
	}
	
	/**
	 * 获取元素"点晴内网通"》"用户问题答疑"
	 */
	public WebElement getUser_Question_Answering() {
		return findElement(ByMethod.getLocator("User_Question_Answering"));
	}
	
	/**
	 * 获取元素"点晴PMS子系统"
	 */
	public WebElement getPMS_Subsystem() {
		return findElement(ByMethod.getLocator("PMS_Subsystem"));
	}
	
	/**
	 * 获取元素"点晴ERP子系统"
	 */
	public WebElement getERP_Subsystem() {
		return findElement(ByMethod.getLocator("ERP_Subsystem"));
	}
	
	/**
	 * 获取元素"点晴模切ERP管理系统主页面iframe表单"
	 */
	public WebElement getmain_Die_cutting_ERP_Subsystem_iframe() {
		return findElement(ByMethod.getLocator("main_Die_cutting_ERP_Subsystem_iframe"));
	}
	
	/**
	 * 获取点晴模切ERP管理系统主页面元素"点晴ERP子系统"
	 */
	public WebElement getmain_ERP_Subsystem() {
		return findElement(ByMethod.getLocator("main_ERP_Subsystem"));
	}
	
	//---------------------------获取"点睛管理之道"弹出窗口侧边栏元素---------------------------//
	
	/**
	 * 17.0.01进入"点睛 管理之道"弹窗所在iframe表单
	 */
	public WebElement getBallistic_Window_of_ManagementIframe() {
		return findElement(ByMethod.getLocator("Ballistic_Window_of_Management"));
	}
	
	/**
	 * 17.0.01获取"点睛 管理之道"弹窗所在二级iframe表单
	 */
	public WebElement getBallistic_Window_of_ManagementIframe_csun() {
		return findElement(ByMethod.getLocator("Ballistic_Window_of_Management2"));
	}
	/**
	 * 17.0.1获取"点睛管理之道"弹窗侧边栏元素"点晴MIS信息通（IM）"
	 */
	public WebElement getWinLeft_MIS_Information_Communication() {
		return findElement(ByMethod.getLocator("WinLeft_MIS_Information_Communication"));
	}
	
	/**
	 * 17.0.2获取"点睛管理之道"弹窗侧边栏元素"点晴进销存管理系统"
	 */
	public WebElement getWinLeft_Invoicing_management_system() {
		return findElement(ByMethod.getLocator("WinLeft_Invoicing_management_system"));
	}
	
	/**
	 * 17.0.3获取"点睛管理之道"弹窗侧边栏元素"点晴CRM客户管理系统"
	 */
	public WebElement getWinLeft_Customer_Management_System() {
		return findElement(ByMethod.getLocator("WinLeft_Customer_Management_System"));
	}
	
	/**
	 * 17.0.4获取"点睛管理之道"弹窗侧边栏元素"点晴全员考勤解决方案"
	 */
	public WebElement getWinLeft_Solution_of_full_attendance() {
		return findElement(ByMethod.getLocator("WinLeft_Solution_of_full_attendance"));
	}
	
	/**
	 * 17.0.5获取"点睛管理之道"弹窗侧边栏元素"点晴WMS仓储管理系统"
	 */
	public WebElement getWinLeft_Warehouse_Management_System() {
		return findElement(ByMethod.getLocator("WinLeft_Warehouse_Management_System"));
	}
	
	/**
	 * 17.0.6获取"点睛管理之道"弹窗侧边栏元素"点晴DRP微信分销系统"
	 */
	public WebElement getWinLeft_Wechat_Distribution_System() {
		return findElement(ByMethod.getLocator("WinLeft_Wechat_Distribution_System"));
	}
	
	/**
	 * 17.0.7获取"点睛管理之道"弹窗侧边栏元素"点晴EBR预算报销系统"
	 */
	public WebElement getWinLeft_Budget_reimbursement_system() {
		return findElement(ByMethod.getLocator("WinLeft_Budget_reimbursement_system"));
	}
	
	/**
	 * 17.0.8获取"点睛管理之道"弹窗侧边栏元素"点晴Inet内网通方案"
	 */
	public WebElement getWinLeft_Intranet_Communication_Scheme() {
		return findElement(ByMethod.getLocator("WinLeft_Intranet_Communication_Scheme"));
	}
	
	/**
	 * 17.0.9获取"点睛管理之道"弹窗侧边栏元素"点晴PMS港口管理系统"
	 */
	public WebElement getWinLeft_Port_Management_System() {
		return findElement(ByMethod.getLocator("WinLeft_Port_Management_System"));
	}
	
	/**
	 * 17.0.10获取"点睛管理之道"弹窗侧边栏元素"点晴ERP企业管理系统"
	 */
	public WebElement getWinLeft_Enterprise_Management_System() {
		return findElement(ByMethod.getLocator("WinLeft_Enterprise_Management_System"));
	}
	
	/**
	 * 17.0.11获取"点睛管理之道"弹窗侧边栏元素"点晴模切ERP管理系统"
	 */
	public WebElement getWinLeft_Die_cutting_ERP_Management_System() {
		return findElement(ByMethod.getLocator("WinLeft_Die-cutting_ERP_Management_System"));
	}
	
	//---------------------------获取"点睛管理之道"弹出窗口主窗口元素---------------------------//
	
	/**
	 * 17.0.1.1获取"点晴MIS信息通（IM）"文本
	 */
	public WebElement getWinMain_MIS_Information_Communication() {
		return findElement(ByMethod.getLocator("WinMain_MIS_Information_Communication"));
	}
	
	/**
	 * 17.0.1.6获取"点晴MIS信息通（IM）"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start1() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start1"));
	}
	
	/**
	 * 17.0.2.1获取"点晴进销存管理系统"文本
	 */
	public WebElement getWinMain_main_Invoicing_management_system() {
		return findElement(ByMethod.getLocator("WinMain_main_Invoicing_management_system"));
	}
	
	/**
	 * 17.0.2.6获取"点晴进销存管理系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start2() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start2"));
	}
	
	/**
	 * 17.0.3.1获取"点晴CRM客户管理系统"文本
	 */
	public WebElement getWinMain_main_Customer_Management_System() {
		return findElement(ByMethod.getLocator("WinMain_main_Customer_Management_System"));
	}
	
	/**
	 * 17.0.3.6获取"点晴CRM客户管理系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start3() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start3"));
	}
	
	/**
	 * 17.0.4.1获取"点晴全员考勤解决方案"文本
	 */
	public WebElement getWinMain_main_Solution_of_full_attendance() {
		return findElement(ByMethod.getLocator("WinMain_main_Solution_of_full_attendance"));
	}
	
	/**
	 * 17.0.4.6获取"点晴全员考勤解决方案"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start4() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start4"));
	}
	
	/**
	 * 17.0.5获取"点晴WMS仓储管理系统"文本
	 */
	public WebElement getWinMain_Warehouse_Management_System() {
		return findElement(ByMethod.getLocator("WinMain_Warehouse_Management_System"));
	}
	
	/**
	 * 17.0.5.6获取"点晴WMS仓储管理系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start5() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start5"));
	}
	
	/**
	 * 17.0.6.1获取"点晴DRP微信分销系统"文本
	 */
	public WebElement getWinMain_Wechat_Distribution_System() {
		return findElement(ByMethod.getLocator("WinMain_Wechat_Distribution_System"));
	}
	
	/**
	 * 17.0.6.6获取"点晴DRP微信分销系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start6() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start6"));
	}
	
	/**
	 * 17.0.7.1获取"点晴EBR预算报销系统"文本
	 */
	public WebElement getWinMain_Budget_reimbursement_system() {
		return findElement(ByMethod.getLocator("WinMain_Budget_reimbursement_system"));
	}
	
	/**
	 * 17.0.7.6获取"点晴EBR预算报销系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start7() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start7"));
	}
	
	/**
	 * 17.0.8.1获取"点晴Inet内网通方案"文本
	 */
	public WebElement getWinMain_Intranet_Communication_Scheme() {
		return findElement(ByMethod.getLocator("WinMain_Intranet_Communication_Scheme"));
	}
	
	/**
	 * 17.0.8.6获取"点晴Inet内网通方案"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start8() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start8"));
	}
	
	/**
	 * 17.0.9.1获取"点晴PMS港口管理系统"文本
	 */
	public WebElement getWinMain_Port_Management_System() {
		return findElement(ByMethod.getLocator("WinMain_Port_Management_System"));
	}
	
	/**
	 * 17.0.9.6获取"点晴PMS港口管理系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start9() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start9"));
	}
	
	/**
	 * 17.0.10.1获取"点晴ERP企业管理系统"文本
	 */
	public WebElement getWinMain_Enterprise_Management_System() {
		return findElement(ByMethod.getLocator("WinMain_Enterprise_Management_System"));
	}
	
	/**
	 * 17.0.10.6获取"点晴ERP企业管理系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start10() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start10"));
	}
	
	/**
	 * 17.0.11.1获取"点晴模切ERP管理系统"文本
	 */
	public WebElement getWinMain_Die_cutting_ERP_Management_System() {
		return findElement(ByMethod.getLocator("WinMain_Die-cutting_ERP_Management_System"));
	}
	
	/**
	 * 17.0.11.6获取"点晴模切ERP管理系统"页"立即体验"
	 */
	public WebElement getWinMain_Experience_Start11() {
		return findElement(ByMethod.getLocator("WinMain_Experience_Start11"));
	}
	
	
}
