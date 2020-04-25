package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void load() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		 driver=driver=new ChromeDriver();
		 driver.manage().window().maximize();
		}
	public static void url(String url) {
		driver.get(url);
		}
	public static void type(WebElement element,String name) {
		element.sendKeys();
		}
	public static void id(String name, String id) {
		WebElement email=driver.findElement(By.id("id"));
		email.sendKeys("name");
	}
	public void fill(String locator) {
		WebElement a= driver.findElement(By.id("locator"));
		}
	public void btnClick(WebElement e) {
		e.click();
		

	}

}
