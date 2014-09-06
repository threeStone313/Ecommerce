package checkoutPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;

public class E44VerifyWhenTheLoggedInUserClicksToSubmitTheOrderTheConfirmationPagesComesUp{
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
