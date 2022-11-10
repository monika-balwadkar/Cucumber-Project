package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObject;
import Resources.Baseclass;
import Resources.Commonutilities;
import Resources.TestcaseData;

public class VerifyLoginPage extends Baseclass {
	
	@Test
	public void login() throws InterruptedException {
		
		HomePageObjects hpo=new HomePageObjects(driver);
		LoginPageObject lpo=new LoginPageObject(driver);
		hpo.MoveToAcc().click();
		hpo.MoveToLogin().click();
		
		lpo.EnterEmail().sendKeys(TestcaseData.Email);
		lpo.EnterPassword().sendKeys(TestcaseData.password);
		lpo.ClickLogin().click();
		
		String Expected1=TestcaseData.Expected1;
		String Actual1=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		String Expected2=TestcaseData.Expected2;
		String Actual2=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(Actual2);
		
		if(Expected1.equalsIgnoreCase(Actual1)) {
		Commonutilities.HandleAssertions(Actual1, Expected1);
		}
		else {
			Commonutilities.HandleAssertions(Actual2, Expected2);
		     }
		
		Thread.sleep(2000);
		lpo.ClickRegister().click();
	}

}
