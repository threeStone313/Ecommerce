package KWS.Payment;

import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class G57VerifyLoggedInUserCanPayWithCreditCardViaPaypalCheckoutPageSelectCreditCardOption extends basePrepare {
  @Test
  public void PayWithCreditCardViaPaypalCheckout() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("close");
	  st.guestOrMember("member");
	  st.getShoppingcart();
	  st.paypalOnCart();
	  st.changePaymentOnPaypalCheckout("cc");
	  st.ccInfoAndSubmit();
	  st.UrlEquals("https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx");
  }
}
