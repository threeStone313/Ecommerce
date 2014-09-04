package miniCart;



import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class C30VerifyClickingOnCheckoutInMiniCartWindowTakesUserToShoppingCartPage extends basePrepare{
  @Test
  public void ViewCart() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  Thread.sleep(2000);
	  Assert.assertEquals("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx", driver.getCurrentUrl());
	  driver.quit();
  }
}