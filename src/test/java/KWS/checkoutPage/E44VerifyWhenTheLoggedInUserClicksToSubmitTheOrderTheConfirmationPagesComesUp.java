package KWS.checkoutPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class E44VerifyWhenTheLoggedInUserClicksToSubmitTheOrderTheConfirmationPagesComesUp extends basePrepare{
  @Test
  public void confirm() {
	  StepsCollection st=new StepsCollection();
		 st.ProductPageAndAdd("sa");
		  st.viewCart("checkout");
		  st.guestOrMember("member");
		  st.singleClick(By.id("SaveAndContinue"));
		  st.ccInfoAndSubmit(); 
	      st.UrlEquals("https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx");
}
}
