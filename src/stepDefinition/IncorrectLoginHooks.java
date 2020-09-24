package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncorrectLoginHooks {

	WebDriver driver=Hooksdemo.driver;
	@Given("^Application is opened$")
	public void application_is_opened() throws Throwable {
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("open application");
	}

	@When("^I provide valid username and invalid password$")
	public void i_provide_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("deekshitha.teegala850@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("12345");
	}

	@Then("^I should view a error message$")
	public void i_should_view_a_error_message() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		boolean view=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful.']")).isDisplayed();
		assertTrue(view);
	}


}
