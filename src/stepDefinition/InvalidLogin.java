package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLogin {

	WebDriver driver;
	@Given("^user has opened login page$")
	public void user_has_opened_login_page() {
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

	@When("^user enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password()  {
		driver.findElement(By.id("Email")).sendKeys("deekshitha.teegala850@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("deekshitha@12");
	}
	
	@When("^user clicked on login button$")
	public void user_clicked_on_login_button() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	
	
	@Then("^user should view a message Login was unsuccessful$")
	public void user_should_view_a_message_Login_was_unsuccessful()  {
		boolean view=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. ']")).isDisplayed();
		assertTrue(view);
        driver.close();	
	}


}
