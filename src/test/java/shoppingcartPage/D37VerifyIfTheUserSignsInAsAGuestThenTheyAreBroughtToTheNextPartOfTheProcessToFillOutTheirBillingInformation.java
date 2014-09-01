package shoppingcartPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D37VerifyIfTheUserSignsInAsAGuestThenTheyAreBroughtToTheNextPartOfTheProcessToFillOutTheirBillingInformation extends basePrepare{
  @Test
  public void guest() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.guestOrMember("guest");
	  Assert.assertEquals("Use my billing address", driver.findElement(By.id("chkOneAddress")).getAttribute("name"));
	 
  }
}
