package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations {

	public WebDriver driver;
	 @Given("^Initialize the web driver$")
	    public void initialize_the_web_driver() throws Throwable {
	        driver= new ChromeDriver();
	    }

	    @When("^user navigates to website \"([^\"]*)\"$")
	    public void user_navigates_to_website_something(String strArg1) throws Throwable {
	       
	    	driver.get(strArg1);
	    }

	    @And("^enter (.+) and (.+) and click on login button$")
	    public void enter_and_and_click_on_login_button(String username, String password) throws Throwable {
	    	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		      driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		      driver.findElement(By.xpath("//input[@id='Login']")).click();
	    }
	    
	    @Then("^user should be able to login successfully$")
	    public void user_should_be_able_to_login_successfully() throws Throwable {
	    	System.out.println("Success Login");
	    }


}
