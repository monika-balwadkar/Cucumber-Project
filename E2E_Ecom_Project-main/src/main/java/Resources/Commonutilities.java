package Resources;

import org.testng.asserts.SoftAssert;

public class Commonutilities {
	
public static void HandleAssertions(String Actual,String Expected) {
		
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(Actual, Expected);
		assertion.assertAll();
	}

}
