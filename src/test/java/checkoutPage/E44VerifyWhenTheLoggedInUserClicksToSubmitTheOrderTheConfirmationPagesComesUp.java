package checkoutPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class E44VerifyWhenTheLoggedInUserClicksToSubmitTheOrderTheConfirmationPagesComesUp extends basePrepare{
  @Test
  public void confirm() throws Exception {
	  StepsCollection st=new StepsCollection();
		 st.ProductPageAndAdd("sa");
		  st.viewCart("checkout");
		  st.guestOrMember("member");
		  driver.findElement(By.id("SaveAndContinue")).click();
		  st.ccInfoAndSubmit(); 
	  String url="https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx";
	  Assert.assertEquals(url, driver.getCurrentUrl()); 
}
}
