package Testcases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.HomePageObjects;
import Resources.Baseclass;
import Resources.TestcaseData;

public class VerifyPriceProducts extends Baseclass {
	
	@Test
	public void Priceproducts() throws InterruptedException {
		
		HomePageObjects hpo=new HomePageObjects(driver);
		hpo.EnterSearchWord().sendKeys(TestcaseData.Keyword1);
		hpo.ClickSearch().click();
		String iphonePrice=hpo.GetPrice().getText();
		System.out.println(iphonePrice);
		
		String words[]=iphonePrice.split(" ");
        System.out.println(Arrays.toString(words));
        
        String FinalIphonePRice=words[0].replaceAll("[^\\d.]", "");
        System.out.println(FinalIphonePRice);
        double FinalIphonePriceInt= Double.parseDouble(FinalIphonePRice);
        hpo.AddtoCart().click();
        
        hpo.EnterSearchWord().clear();
        hpo.EnterSearchWord().sendKeys(TestcaseData.Keyword2);
        hpo.ClickSearch().click();
        
        String samsunggPrice=hpo.GetTabPrice().getText();
        System.out.println(samsunggPrice);
      
         String wordsSamsung[]=samsunggPrice.split(" ");
         System.out.println(Arrays.toString(wordsSamsung));
         
         System.out.println(wordsSamsung[0]);
         
         String FinalSamsungPRice=wordsSamsung[0].replaceAll("[^\\d.]", "");
         System.out.println(FinalSamsungPRice);
         
         double FinalSamsungPriceInt= Double.parseDouble(FinalSamsungPRice);
         hpo.AddtoCart2().click();
         
         double totalPRice=FinalIphonePriceInt+FinalSamsungPriceInt;
         System.out.println(totalPRice);
         String toatlPRiceWithDollar="$"+totalPRice;
         
         Thread.sleep(2000);
         hpo.MoveToCart().click();
         
         String totalPRiceFromCart=hpo.GetOriginalPrice().getText();
         if(toatlPRiceWithDollar.equalsIgnoreCase(totalPRiceFromCart)) 
         {
        	 System.out.println(TestcaseData.Result);
         }
		
	}

}
