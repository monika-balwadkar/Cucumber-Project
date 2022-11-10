package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.HeaderMenuobjets;
import Resources.Baseclass;

public class VerifyHeaderMenu extends Baseclass {
	
	@Test
	public void HeaderMenu() {
		
		HeaderMenuobjets hmo=new HeaderMenuobjets(driver);
		Boolean CuButtonR=hmo.IsCuButtonDisplayed().isDisplayed();
		System.out.println(CuButtonR);
		Boolean ContactR=hmo.IsContactDisplayed().isDisplayed();
		System.out.println(ContactR);
		Boolean AccR=hmo.IsAcctDisplayed().isDisplayed();
		System.out.println(AccR);
		Boolean WishlistR=hmo.IsWishlistDisplayed().isDisplayed();
		System.out.println(WishlistR);
		Boolean ShopCartR=hmo.IsShopCDisplayed().isDisplayed();
		System.out.println(ShopCartR);
		Boolean CheckoutR=hmo.IsCheckoutDisplayed().isDisplayed();
		System.out.println(CheckoutR);
		
	}

}
