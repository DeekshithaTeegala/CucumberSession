package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Outlinedemo {

	WebDriver driver;
	@Given("^application is opened$")
	public void application_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	}

	@When("^I provide valid ([^\\\"]*) and valid ([^\\\"]*)$")
	public void i_provide_valid_deekshitha_teegala_gmail_com_and_valid_deekshitha(String email, String password) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@Then("^I should see the link$")
	public void i_should_see_the_link() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
        driver.close();  
	}

//	@When("^I provide valid rekhabr(\\d+)@gmail\\.com and valid rekhab$")
//	public void i_provide_valid_rekhabr_gmail_com_and_valid_rekhab(int arg1) throws Throwable {
//	    
//	}

}
