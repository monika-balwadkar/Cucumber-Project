package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObjects;
import Resources.Baseclass;
import Resources.TestcaseData;

public class VerifySignupPage extends Baseclass {
	
	@Test
	public void Register() {
		
		HomePageObjects hpo=new HomePageObjects(driver);
		LoginPageObject lpo=new LoginPageObject(driver);
		SignupPageObjects spo=new SignupPageObjects(driver);
		hpo.MoveToAcc().click();
		hpo.MoveToSignUp().click();
		
		spo.FirstName().sendKeys(TestcaseData.firstname);
		spo.LastName().sendKeys(TestcaseData.lastname);
		spo.Email().sendKeys(TestcaseData.Email);
		spo.Telephone().sendKeys(TestcaseData.telephone);
		spo.EnterSignupPass().sendKeys(TestcaseData.SignupPass);
		spo.EnterComfirmPass().sendKeys(TestcaseData.Confirmpass);
		spo.ClickRadioButton().click();
		spo.ClickCheckBox().click();
	}

}
