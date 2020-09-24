package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLogin {

	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		//assert driver.getTitle().contains("Demo web Shop. Login");
        assertEquals(expectedtitle,actualtitle);
        
		
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password()  {
		driver.findElement(By.id("Email")).sendKeys("deekshitha.teegala850@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("deekshitha@123");
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

	@Then("^user should be able to see logout button$")
	public void user_should_be_able_to_see_logout_button() {
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
        driver.close();   
	}

}
