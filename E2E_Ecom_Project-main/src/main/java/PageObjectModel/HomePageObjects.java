package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver;
	
	private By Search=By.xpath("//input[@placeholder='Search']");
	private By SearchButton=By.xpath("//i[@class='fa fa-search']");
	private By Price=By.xpath("//p[@class='price']");
	private By CartButton=By.xpath("(//div[@class='button-group']//button)[1]");
	private By Price2=By.xpath("(//p[@class='price'])[2]");
	private By CartButton2=By.xpath("(//div[@class='button-group']//button)[4]");
	private By OriginalCart=By.xpath("//div[@id='cart']/button");
	private By OriginalPrice=By.xpath("(//td[@class='text-right'])[12]");
	private By MyAcc=By.xpath("//i[@class='fa fa-user']");
	private By Login=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	private By SignUp=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']");
	
	public HomePageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterSearchWord() {
		
		return driver.findElement(Search);
	}
	
	public WebElement ClickSearch() {
		
		return driver.findElement(SearchButton);
	}
	
    public WebElement GetPrice() {
		
		return driver.findElement(Price);
	}
    
    public WebElement AddtoCart() {
		
		return driver.findElement(CartButton);
	}
    
    public WebElement GetTabPrice() {
		
		return driver.findElement(Price2);
	}
    
   public WebElement AddtoCart2() {
		
		return driver.findElement(CartButton2);
	}
   
   public WebElement MoveToCart() {
		
		return driver.findElement(OriginalCart);
	}
   
   public WebElement GetOriginalPrice() {
		
		return driver.findElement(OriginalPrice);
	}
   
   public WebElement MoveToAcc() {
		
		return driver.findElement(MyAcc);
	}
   
   public WebElement MoveToLogin() {
		
		return driver.findElement(Login);
	}
   
   public WebElement MoveToSignUp() {
		
		return driver.findElement(SignUp);
	}


}
