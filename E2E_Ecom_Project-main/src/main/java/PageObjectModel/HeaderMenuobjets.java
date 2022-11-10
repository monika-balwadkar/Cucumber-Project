package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Baseclass;

public class HeaderMenuobjets {
	
	public WebDriver driver;
	
	private By Currencybutton=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By Contact=By.xpath("//*[contains(text(),'123456789')]");
	private By Acc=By.xpath("//a[@title='My Account']");
	private By Wishlist=By.xpath("//a[@id='wishlist-total']");
	private By Shopcart=By.xpath("//a[@title='Shopping Cart']");
	private By Checkout=By.xpath("//a[@title='Checkout']");
	
    public HeaderMenuobjets(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement IsCuButtonDisplayed() {
		
		return driver.findElement(Currencybutton);
	}
	
    public WebElement IsContactDisplayed() {
		
		return driver.findElement(Contact);
	}
    
    public WebElement IsAcctDisplayed() {
		
		return driver.findElement(Acc);
	}
    
    public WebElement IsWishlistDisplayed() {
		
		return driver.findElement(Wishlist);
	}
    
    public WebElement IsShopCDisplayed() {
		
		return driver.findElement(Shopcart);
	}

    public WebElement IsCheckoutDisplayed() {
	
	return driver.findElement(Checkout);
}

}
