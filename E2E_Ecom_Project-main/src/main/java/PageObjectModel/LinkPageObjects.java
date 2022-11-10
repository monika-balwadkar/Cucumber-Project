package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkPageObjects {
	
	public WebDriver driver;
	
	 private By links=By.xpath("//div[@class='col-sm-3']//a");
	 
	 public LinkPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public List<WebElement> links1()
		{
			return driver.findElements(links);
		}


}
