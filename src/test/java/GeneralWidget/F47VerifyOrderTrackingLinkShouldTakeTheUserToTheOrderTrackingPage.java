package GeneralWidget;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;

public class F47VerifyOrderTrackingLinkShouldTakeTheUserToTheOrderTrackingPage {
  @Test
  public void orderTack() {
	  StepsCollection st=new StepsCollection();
	  st.getHP();
	  st.singleClick(By.xpath("//a[@id='lnkJoin']"));
	  st.UrlEquals("http://qa.weddingshop.theknot.com/ordertracking/ordertracking.aspx");
  }
}
