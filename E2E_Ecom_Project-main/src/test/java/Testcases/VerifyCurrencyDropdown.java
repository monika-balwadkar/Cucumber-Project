package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.CurrencyDropdownObjects;
import Resources.Baseclass;
import Resources.TestcaseData;

public class VerifyCurrencyDropdown extends Baseclass {
	
	@Test
	public void CurrencyDropdown() {
		
		CurrencyDropdownObjects cdo=new CurrencyDropdownObjects(driver);
		
		cdo.ClickOnCuB().click();
        for(int i=0;i<cdo.button1().size();i++) {
        	
        	if( cdo.button1().get(i).getText().equals(TestcaseData.Pound)){
                cdo.button1().get(i).click();
                break;
        }
		
		
	}

}
	
}
