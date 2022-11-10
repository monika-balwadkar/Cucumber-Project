package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderTabObjects {
	
	public WebDriver driver;
	
	private By Desktops=By.xpath("(//*[contains(text(),'Desktops')])[1]");
	private By LapAndNoteb=By.xpath("(//*[contains(text(),'Laptops & Notebooks')])[1]");
	private By Components=By.xpath("(//*[contains(text(),'Components')])[1]");
	private By Tablets=By.xpath("(//*[contains(text(),'Tablets')])[1]");
	private By Softwares=By.xpath("(//*[contains(text(),'Software')])[1]");
	private By PhoneAndPDs=By.xpath("(//*[contains(text(),'Phones & PDAs')])[1]");
	private By Cameras=By.xpath("(//*[contains(text(),'Cameras')])[1]");
	private By MP3Players=By.xpath("(//*[contains(text(),'MP3 Players')])[1]");
	
public HeaderTabObjects(WebDriver driver2) {
		this.driver=driver2;
	}

public WebElement VerifyDesktop() {
		
		return driver.findElement(Desktops);
	}

public WebElement VerifyLap_NoteB() {
	
	return driver.findElement(LapAndNoteb);
}

public WebElement VerifyComponents() {
	
	return driver.findElement(Components);
}

public WebElement VerifyTablets() {
	
	return driver.findElement(Tablets);
}

public WebElement VerifySoftware() {
	
	return driver.findElement(Softwares);
}



public WebElement VerifyPAndP() {
	
	return driver.findElement(PhoneAndPDs);
}

public WebElement VerifyCamera() {
	
	return driver.findElement(Cameras);
}

public WebElement VerifyMp3Player() {
	
	return driver.findElement(MP3Players);
}

}
