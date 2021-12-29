package StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.CheckOutPage;
import com.pages.LoginPage;
import com.pages.UserInformationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class placeOrderSteps {
	
	
	private WebDriver driver = DriverFactory.getDriver();
	private LoginPage loginPage = new LoginPage(driver);
	private CheckOutPage checkoutPage = new CheckOutPage(driver);
	private UserInformationPage userInfoPage = new UserInformationPage(driver);
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	   loginPage.loginPage();
	    
	}

	@When("Users enters {string} and {string}")
	public void users_enters_and(String userName, String password) {
	driver = loginPage.loginAction(userName, password);
	}

	@And("User select the products")
	public void user_select_the_products(io.cucumber.datatable.DataTable productsName) {
	   List<String> data = productsName.asList();
	   System.out.println("Ha ha aha "+data);
	   checkoutPage.selectProducts(data);
	
	}
	@And("User clicks on Card icon")
	public void user_clicks_on_card_icon() {
	   checkoutPage.clickOnCards();  
	}

	@And("User clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
		checkoutPage.checkOut();
	    
	}

       @When("user enters User information First name as {string}, Last Name as {string} and zipcode as  {string}")
       public void user_enters_user_information_first_name_as_last_name_as_and_zipcode_as(String firstName, String lastName, String zipCode) {
               userInfoPage.userInformation(firstName,lastName,zipCode);

	@And("user Clicks on continue button")
	public void user_clicks_on_continue_button() {
	   userInfoPage.continueBtn();
	}

	@And("User clicks on Finish button")
	public void user_clicks_on_finish_button() {
	   userInfoPage.finish();
	}

	@Then("users gets the success message  as{string}")
	public void users_gets_the_success_message_as(String expectedTitleName) {
		String actualMessage = userInfoPage.confirmation();
		Assert.assertEquals(actualMessage, expectedTitleName);
		
	    
	}

}
