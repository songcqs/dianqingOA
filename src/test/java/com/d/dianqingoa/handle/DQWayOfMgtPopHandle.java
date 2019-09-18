package com.d.dianqingoa.handle;

import com.a.publish.base.DriverBase;
import com.c.dianqingoa.element.DQWayOfMgtPopEle;

public class DQWayOfMgtPopHandle {
	
	public DriverBase driver;
	public DQWayOfMgtPopEle dQWayOfMgtPopEle;
	
	public DQWayOfMgtPopHandle(DriverBase driver) {
		super();
		this.driver = driver;
		this.dQWayOfMgtPopEle = new DQWayOfMgtPopEle(driver);
	}
	
	//---------------------------鼠标悬浮"点睛管理之道"弹窗侧边栏元素---------------------------//
	
		/**
		 * 17.1鼠标悬浮"点晴MIS信息通（IM）"
		 */
		public void roverWinLeft_MIS_Information_Communication() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_MIS_Information_Communication());
		}
		
		/**
		 * 17.2鼠标悬浮"点晴进销存管理系统"
		 */
		public void roverWinLeft_Invoicing_management_system() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Invoicing_management_system());
		}
		
		/**
		 * 17.3鼠标悬浮"点晴CRM客户管理系统"
		 */
		public void roverWinLeft_Customer_Management_System() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Customer_Management_System());
		}
		
		/**
		 * 17.4鼠标悬浮"点晴全员考勤解决方案"
		 */
		public void roverWinLeft_Solution_of_full_attendance() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Solution_of_full_attendance());
		}
		
		/**
		 * 17.5鼠标悬浮"点晴WMS仓储管理系统"
		 */
		public void roverWinLeft_Warehouse_Management_System() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Warehouse_Management_System());
		}
		
		/**
		 * 17.6鼠标悬浮"点晴DRP微信分销系统"
		 */
		public void roverWinLeft_Wechat_Distribution_System() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Wechat_Distribution_System());
		}
		
		/**
		 * 17.7鼠标悬浮"点晴EBR预算报销系统"
		 */
		public void roverWinLeft_Budget_reimbursement_system() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Budget_reimbursement_system());
		}
		
		/**
		 * 17.8鼠标悬浮"点晴Inet内网通方案"
		 */
		public void roverWinLeft_Intranet_Communication_Scheme() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Intranet_Communication_Scheme());
		}
		
		/**
		 * 17.9鼠标悬浮"点晴PMS港口管理系统"
		 */
		public void roverWinLeft_Port_Management_System() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Port_Management_System());
		}
		
		/**
		 * 17.10鼠标悬浮"点晴ERP企业管理系统"
		 */
		public void roverWinLeft_Enterprise_Management_System() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Enterprise_Management_System());
		}
		
		/**
		 * 17.11鼠标悬浮"点晴模切ERP管理系统"
		 */
		public void roverWinLeft_Die_cutting_ERP_Management_System() {
			dQWayOfMgtPopEle.roverAction(dQWayOfMgtPopEle.getWinLeft_Die_cutting_ERP_Management_System());
		}
		
		//---------------------------点击"点睛管理之道"弹窗各页面"立即体验"---------------------------//
		
		/**
		 * 17.0.1.6点击"点晴MIS信息通（IM）"页"立即体验"
		 */
		public void clickWinMain_Experience_Start1() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start1());
		}
		
		/**
		 * 17.0.2.6点击"点晴进销存管理系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start2() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start2());
		}
		
		/**
		 * 17.0.3.6点击"点晴CRM客户管理系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start3() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start3());
		}
		
		/**
		 * 17.0.4.6点击"点晴全员考勤解决方案"页"立即体验"
		 */
		public void clickWinMain_Experience_Start4() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start4());
		}
		
		/**
		 * 17.0.5.6点击"点晴WMS仓储管理系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start5() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start5());
		}
		
		/**
		 * 17.0.6.6点击"点晴DRP微信分销系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start6() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start6());
		}
		
		/**
		 * 17.0.7.6点击"点晴EBR预算报销系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start7() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start7());
		}
		
		/**
		 * 17.0.8.6点击"点晴Inet内网通方案"页"立即体验"
		 */
		public void clickWinMain_Experience_Start8() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start8());
		}
		
		/**
		 * 17.0.9.6点击"点晴PMS港口管理系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start9() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start9());
		}
		
		/**
		 * 17.0.10.6点击"点晴ERP企业管理系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start10() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start10());
		}
		
		/**
		 * 17.0.11.6点击"点晴模切ERP管理系统"页"立即体验"
		 */
		public void clickWinMain_Experience_Start11() {
			dQWayOfMgtPopEle.clickElement(dQWayOfMgtPopEle.getWinMain_Experience_Start11());
		}
		
}
