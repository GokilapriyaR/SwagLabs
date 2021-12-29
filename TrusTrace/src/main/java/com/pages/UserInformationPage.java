package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInformationPage {
	
	private WebDriver driver ;
	
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By zipCode = By.id("postal-code");
	private By continueBtn = By.id("continue");
	private By finishBtn = By.id("finish");
	private By successMsg = By.xpath("//div[@id=\"checkout_complete_container\"]/h2");
	
	public UserInformationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void userInformation() {
		driver.findElement(firstName).sendKeys("james");
		driver.findElement(lastName).sendKeys("Potter");
		driver.findElement(zipCode).sendKeys("123456");
	}
	
	public void continueBtn() {
		driver.findElement(continueBtn).click();
	}
	
	public void finish() {
		driver.findElement(finishBtn).click();
	}
	
	public String confirmation() {
		String text = driver.findElement(successMsg).getText();
		return text;
	}

}
