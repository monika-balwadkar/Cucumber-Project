package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrencyDropdownObjects {
	
	public WebDriver driver;
	
	private By Currencybutton=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By Euro=By.xpath("//button[@name='EUR']");
	private By Pound=By.xpath("//button[@name='GBP']");
	private By Doller=By.xpath("//button[@name='USD']");
	private By button=By.xpath("//button[@class='currency-select btn btn-link btn-block']");
	
    public CurrencyDropdownObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement ClickOnCuB() {
		
		return driver.findElement(Currencybutton);
	}
	
   public WebElement ClickOnEuro() {
		
		return driver.findElement(Euro);
	}
   
   public WebElement ClickOnPound() {
		
		return driver.findElement(Pound);
	}
   
   public WebElement ClickOnDoller() {
		
		return driver.findElement(Doller);
	}
   
   public List<WebElement> button1()
	{
		return driver.findElements(button);
	}
	

}
