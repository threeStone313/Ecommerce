package shoppingcartPage;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;

public class D34VerifyClickingOnMyCartTextRedirectsUseToShoppingCartPage {
  @Test
  public void CartLink() {
	  StepsCollection st=new StepsCollection();
;
	  st.getHP();
	  st.singleClick(By.id("ctl00_tkShared_Header_lblCartItemCount"));
	  st.UrlEquals("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
	 
  }
}
