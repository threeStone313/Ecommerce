package shoppingcartPage;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D34VerifyClickingOnMyCartTextRedirectsUseToShoppingCartPage extends basePrepare{
  @Test
  public void CartLink() {
	  StepsCollection st=new StepsCollection();
;
	  st.getHP();
	  driver.findElement(By.id("ctl00_tkShared_Header_lblCartItemCount")).click();
	  Assert.assertEquals("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx", driver.getCurrentUrl());
	 
  }
}
