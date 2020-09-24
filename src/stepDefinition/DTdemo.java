package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DTdemo {

	WebDriver driver;
	
	@Given("^user is on demowebshoptricentis page$")
	public void user_is_on_demowebshoptricentis_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	}

	@When("^user signs in with valid email and valid password$")
	public void user_signs_in_with_valid_email_and_valid_password(DataTable credentials) {
		List<List<String>> data=credentials.raw();
		
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user should see logout$")
	public void user_should_see_logout() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
        driver.close();  
	}


}
