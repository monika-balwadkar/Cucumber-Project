package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By Email=By.xpath("//input[@id='input-email']");
	private By Password=By.xpath("//input[@id='input-password']");
	private By Login=By.xpath("//input[@value='Login']");
	private By Register=By.xpath("//a[@class='btn btn-primary']");
	
	
    public LoginPageObject(WebDriver driver2) {
    	this.driver=driver2;
	}

    public WebElement EnterEmail() {
		
		return driver.findElement(Email);
	}
    
    public WebElement EnterPassword() {
		
		return driver.findElement(Password);
	}

    public WebElement ClickLogin() {
	
	return driver.findElement(Login);
    }
    
    public WebElement ClickRegister() {
    	
    	return driver.findElement(Register);
    }
}
