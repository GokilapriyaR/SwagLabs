package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	private WebDriver driver;
	
	private By cardLink = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	private By checkOut = By.id("checkout");
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectProducts(List<String> ProductsList) {
		for(String ProductName: ProductsList) {
		driver.findElement(By.xpath("//div[text()='"+ProductName+"']//ancestor::div[1]//following-sibling::div[1]//child::button")).click();
		}
	}
	
	public void clickOnCards() {
		driver.findElement(cardLink).click();
	}
	
	public void checkOut() {
		driver.findElement(checkOut).click();
	}


	
	
}
