//package com.c.dianqingoa.element;
//
//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Properties;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import com.a.publish.base.DriverBase;
//import com.b.publish.util.BasePage;
//import com.b.publish.util.ByMethod;
//
//public class HomePageEle3 extends BasePage {
//	
//	public HomePageEle3(DriverBase driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		Map map=readProperties();
//		
//		for(Object obj : map.keySet()){
//			Object value = map.get(obj);
//			System.out.println(value);
//		}
//	}
//
//	// 读取properties的全部信息
////	public static Map<String,String> readProperties() {
//		public static Map<String,WebElement> readProperties() {
//		Properties props = new Properties();
//		//保存所有的键值
//		Map<String,String> map=new HashMap<String,String>();
//		Map<String,WebElement> map2=new HashMap<String,WebElement>();
//		try {
//			InputStream in = new BufferedInputStream(new FileInputStream("element.properties"));
//			props.load(in);
//			Enumeration en = props.propertyNames();
//			while (en.hasMoreElements()) {
//				String key = (String) en.nextElement();
//				String Property = props.getProperty(key);
////				System.out.println("key:" + key + "  =  " + "Property:" + Property);
//				
//				// 对Property进行拆分
//				String LocateMethon = Property.split("<")[0];
//				String LocateEle = Property.split("<")[1];
//				
//				WebElement element = null;
//				if (LocateMethon.equalsIgnoreCase("id")) {
//
//					element = findElement(By.id(LocateEle));
//				} else if (LocateMethon.equalsIgnoreCase("name")) {
//
//					element = findElement(By.name(LocateEle));
//				} else if (LocateMethon.equalsIgnoreCase("tagNmae")) {
//
//					element = findElement(By.tagName(LocateEle));
//				} else if (LocateMethon.equalsIgnoreCase("linkText")) {
//
//					element = findElement(By.linkText(LocateEle));
//				} else if (LocateMethon.equalsIgnoreCase("className")) {
//
//					element = findElement(By.className(LocateEle));
//				} else if (LocateMethon.equalsIgnoreCase("xpath")) {
//
//					element = findElement(By.xpath(LocateEle));
//				} else if (LocateMethon.equalsIgnoreCase("cssSelector")) {
//
//					element = findElement(By.cssSelector(LocateEle));
//				} else {
//					element = findElement(By.partialLinkText(LocateEle));
//				}
//				
//				map.put(key, Property);
//				map2.put(key, element);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return map2;
//	}
//
//	public WebElement getElement(String key) {
//		WebElement element = null;
//		Map<String, WebElement> map=readProperties();
//		//keySet是键的集合，Set里面的类型即key的类型
//		//entrySet是 键-值 对的集合，Set里面的类型是Map.Entry
////		for (Map.Entry<String, WebElement> entry : map.entrySet()) {
////			
////		}
//		for(String str : map.keySet()){
//			if (str == key) {
//				element = map.get(str);
//				System.out.println(element);
//			}
//		}
//		return element;
//		
//	}
//}
//
//
///*
//	Java遍历Map的4种方式
//	如果只是获取key，或者value，推荐使用keySet或者values方式；
//	如果同时需要key和value推荐使用entrySet；
//	如果需要在遍历过程中删除元素推荐使用Iterator；
//	如果需要在遍历过程中增加元素，可以新建一个临时map存放新增的元素，等遍历完毕，再把临时map放到原来的map中。
// 		public static void main(String[] args) {
//        // 循环遍历Map的4中方法
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        map.put(1, 2);
//        // 1. entrySet遍历，在键和值都需要时使用（最常用）
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
//        }
//        // 2. 通过keySet或values来实现遍历,性能略低于第一种方式
//        // 遍历map中的键
//        for (Integer key : map.keySet()) {
//            System.out.println("key = " + key);
//        }
//        // 遍历map中的值
//        for (Integer value : map.values()) {
//            System.out.println("key = " + value);
//        }
//        // 3. 使用Iterator遍历
//        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Integer, Integer> entry = it.next();
//            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
//        }
//
//        // 4. java8 Lambda
//        // java8提供了Lambda表达式支持，语法看起来更简洁，可以同时拿到key和value，
//        // 不过，经测试，性能低于entrySet,所以更推荐用entrySet的方式
//        map.forEach((key, value) -> {
//            System.out.println(key + ":" + value);
//        });
//        
//    }
// */
