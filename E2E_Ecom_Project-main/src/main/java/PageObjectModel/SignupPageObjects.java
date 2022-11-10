package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@id='input-firstname']");
	private By lastname=By.xpath("//input[@id='input-lastname']");
	private By email=By.xpath("//input[@id='input-email']");
	private By telephone=By.xpath("//input[@id='input-telephone']");
	private By signuppass=By.xpath("//input[@id='input-password']");
	private By comfirmpass=By.xpath("//input[@id='input-confirm']");
	private By radiobutton=By.xpath("(//input[@name='newsletter'])[1]");
	private By checkbox=By.xpath("//input[@name='agree']");
	
	public SignupPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement FirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement LastName() {
		return driver.findElement(lastname);
	}
	
	public WebElement Email() {
		return driver.findElement(email);
		
	}
	
	public WebElement Telephone() {
		return driver.findElement(telephone);
	}
	
	public WebElement EnterSignupPass() {
		return driver.findElement(signuppass);
	}
	
	public WebElement EnterComfirmPass() {
		return driver.findElement(comfirmpass);
	}
	
	public WebElement ClickRadioButton() {
		return driver.findElement(radiobutton);
	}
	
	public WebElement ClickCheckBox() {
		return driver.findElement(checkbox);
	}
	

}
