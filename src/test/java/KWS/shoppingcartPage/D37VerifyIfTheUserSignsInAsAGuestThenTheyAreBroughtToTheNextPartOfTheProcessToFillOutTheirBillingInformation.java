package KWS.shoppingcartPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class D37VerifyIfTheUserSignsInAsAGuestThenTheyAreBroughtToTheNextPartOfTheProcessToFillOutTheirBillingInformation extends basePrepare{
  @Test
  public void guest() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.guestOrMember("guest");
	  st.attributeEquals("Use my billing address", By.id("chkOneAddress"),"name");
	 
  }
}
