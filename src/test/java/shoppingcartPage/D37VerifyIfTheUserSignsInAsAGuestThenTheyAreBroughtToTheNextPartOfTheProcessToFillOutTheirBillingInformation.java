package shoppingcartPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D37VerifyIfTheUserSignsInAsAGuestThenTheyAreBroughtToTheNextPartOfTheProcessToFillOutTheirBillingInformation{
  @Test
  public void guest() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.guestOrMember("guest");
	  st.attributeEquals("Use my billing address", By.id("chkOneAddress"),"name");
	 
  }
}
