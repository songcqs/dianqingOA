package com.c.dianqingoa.element;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.BasePage;
import com.b.publish.util.ByMethod;

public class ReleaseNewsEle extends BasePage{

	public ReleaseNewsEle(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//---------------------------获取"发布新闻"页面元素---------------------------------//
	
	/**
	 * 1.获取"发布人"输入框
	 */
	public WebElement getPublisher() {
		return findElement(ByMethod.getLocator("Publisher"));
	}
	
	/**
	 * 2.获取"录入时间"选择按钮
	 */
	public WebElement getEntry_time() {
		return findElement(ByMethod.getLocator("Entry_time"));
	}
	
	/**
	 * 3.获取"发布部门"下拉选择框
	 */
	public WebElement getPublishing_Department() {
		return findElement(ByMethod.getLocator("Publishing_Department"));
	}
	
	/**
	 * 4.获取"新闻栏目"下拉选择框
	 */
	public WebElement getNews_column() {
		return findElement(ByMethod.getLocator("News_column"));
	}
	
	/**
	 * 5.获取"新闻模板"下拉选择框
	 */
	public WebElement getNews_template() {
		return findElement(ByMethod.getLocator("News_template"));
	}
	
	/**
	 * 6.获取"文章标题"输入框
	 */
	public WebElement getArticle_title() {
		return findElement(ByMethod.getLocator("Article_title"));
	}
	
	/**
	 * 获取 富文本框所在表单
	 */
	public WebElement getRich_Text_Box_iframe() {
		return findElement(ByMethod.getLocator("Rich_Text_Box_iframe"));
	}
	
	/**
	 * 7.获取富文本框中编辑页面元素对象
	 */
	public WebElement getRich_Text_Box() {
		return findElement(ByMethod.getLocator("Rich_Text_Box"));
	}
	
	/**
	 * 8.获取"发布新闻"按钮
	 */
	public WebElement getRelease_news() {
		return findElement(ByMethod.getLocator("Release_news"));
	}
	
	/**
	 * 获取所有的 新闻标题
	 */
	public List<WebElement> getAll_News_Title() {
		return findElements(ByMethod.getLocator("All_News_Title"));
	}
	
	/**
	 * 获取最新新闻标题 展开后内容元素
	 */
	public WebElement getNews_content() {
		return findElement(ByMethod.getLocator("News_content"));
	}

	/**
	 * 获取文章内容图片
	 */
	public WebElement getArticle_pictures() {
		return findElement(ByMethod.getLocator("Article_pictures"));
	}
}
