package com.stepdefinition;

import javax.swing.Box.Filler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass{
	WebDriver driver;

	@Given("user is on the Facebook page")
	public void user_is_on_the_Facebook_page() {
		load();
		url("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
	    user.sendKeys("sangve");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123");
		
	    
	}
	
	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String s1, String s2) {
		WebElement user= driver.findElement(By.id("email"));
	    user.sendKeys("sangve");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123");
		
	    
	}
	
	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		WebElement log=driver.findElement(By.xpath("//input[@value='Log In']"));
		btnClick(log);
	   
	}
	
	@Then("user should verufy the message")
	public void user_should_verufy_the_message() {
	    
	}
	
	
	




}
