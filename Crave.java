package com.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Crave {
	


		public static WebDriver driver ;
		public static void browserLaunch() {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\sri rama jayam\\eclipse-workspacel\\last\\Point\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		public static void loadURL(String url) {
			driver.get(url);
		}
		public static  void typeData(WebElement element, String data) {
			element.sendKeys(data);
		}
		
		public static void click(WebElement element) {
			element.click();
		}
		
		public static void selectDropDown(WebElement element, int num) {
			Select s = new Select(element);
			s.selectByIndex(num);
		}
		
		public static void actionMovetoElement(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).perform();
		}

	}

			 