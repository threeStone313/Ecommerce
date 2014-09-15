package KWS.Payment;

import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class G58VerifyLoggedOutUserCanPayWithPayPalViaShoppingCartPagePayPalButton extends basePrepare {
  @Test
  public void paypalPayment() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.paypalOnCart();
	  st.submitOrder("d");
	  st.waitUntilConfirm();
	  st.UrlEquals("https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx");
  }
}
