package Testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LinkPageObjects;
import Resources.Baseclass;

public class VerifyBrokenLink extends Baseclass {
	
	@Test
	public void BrokenLink() throws MalformedURLException, IOException {
		
		LinkPageObjects lpo1=new LinkPageObjects(driver);
		
		  SoftAssert a =new SoftAssert();

	        for(WebElement link : lpo1.links1())
	        {
	        	 String url= link.getAttribute("href");

	             
	             HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
	             conn.setRequestMethod("HEAD");
	             conn.connect();
	             int respCode = conn.getResponseCode();
	             
	          
	             System.out.println(respCode);

	            a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
	   
	        }
	        
	        a.assertAll();

	}
	
	
 }
