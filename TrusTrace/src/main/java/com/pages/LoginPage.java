package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private By userName = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button");
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

    public void loginPage() {
    	driver.get("https://www.saucedemo.com/");
    }
    
    public WebDriver loginAction(String user, String pwd) {
    	driver.findElement(userName).sendKeys(user);
    	driver.findElement(password).sendKeys(pwd);
    	driver.findElement(loginBtn).click();
    	return driver;
    }
	
}
