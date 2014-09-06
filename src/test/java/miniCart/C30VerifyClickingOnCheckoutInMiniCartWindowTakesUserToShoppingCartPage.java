package miniCart;



import org.testng.annotations.Test;

import prepare.StepsCollection;

public class C30VerifyClickingOnCheckoutInMiniCartWindowTakesUserToShoppingCartPage{
  @Test
  public void ViewCart() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  Thread.sleep(2000);
	  st.UrlEquals("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
  }
}
