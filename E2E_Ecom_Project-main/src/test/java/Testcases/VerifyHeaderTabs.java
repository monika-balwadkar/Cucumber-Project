package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.HeaderTabObjects;
import Resources.Baseclass;
import Resources.Commonutilities;
import Resources.TCDataForHeaderTab;
import Resources.TestcaseData;

public class VerifyHeaderTabs extends Baseclass {
	
	@Test
	public void HeaderTabs() {
		
		HeaderTabObjects hto=new HeaderTabObjects(driver);
		String Act1=driver.findElement(By.xpath("(//*[contains(text(),'Desktops')])[1]")).getText();
		String Act2=driver.findElement(By.xpath("(//*[contains(text(),'Laptops & Notebooks')])[1]")).getText();
		String Act3=driver.findElement(By.xpath("(//*[contains(text(),'Components')])[1]")).getText();
		String Act4=driver.findElement(By.xpath("(//*[contains(text(),'Tablets')])[1]")).getText();
		String Act5=driver.findElement(By.xpath("(//*[contains(text(),'Software')])[1]")).getText();
		String Act6=driver.findElement(By.xpath("(//*[contains(text(),'Phones & PDAs')])[1]")).getText();
		String Act7=driver.findElement(By.xpath("(//*[contains(text(),'Cameras')])[2]")).getText();
		String Act8=driver.findElement(By.xpath("(//*[contains(text(),'MP3 Players')])[1]")).getText();
		
		String Exp1=TCDataForHeaderTab.Exp1;
		String Exp2=TCDataForHeaderTab.Exp2;
		String Exp3=TCDataForHeaderTab.Exp3;
		String Exp4=TCDataForHeaderTab.Exp4;
		String Exp5=TCDataForHeaderTab.Exp5;
		String Exp6=TCDataForHeaderTab.Exp6;
		String Exp7=TCDataForHeaderTab.Exp7;
		String Exp8=TCDataForHeaderTab.Exp8;
		
		Commonutilities.HandleAssertions(Act1, Exp1);
		Commonutilities.HandleAssertions(Act2, Exp2);
		Commonutilities.HandleAssertions(Act3, Exp3);
		Commonutilities.HandleAssertions(Act4, Exp4);
		Commonutilities.HandleAssertions(Act5, Exp5);
		Commonutilities.HandleAssertions(Act6, Exp6);
		Commonutilities.HandleAssertions(Act7, Exp7);
		Commonutilities.HandleAssertions(Act8, Exp8);
		
		}

}
