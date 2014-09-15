package KWS.shoppingcartPage;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class D34VerifyClickingOnMyCartTextRedirectsUseToShoppingCartPage extends basePrepare{
  @Test
  public void CartLink() {
	  StepsCollection st=new StepsCollection();
;
	  st.getHP();
	  st.singleClick(By.id("ctl00_tkShared_Header_lblCartItemCount"));
	  st.UrlEquals("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
	 
  }
}