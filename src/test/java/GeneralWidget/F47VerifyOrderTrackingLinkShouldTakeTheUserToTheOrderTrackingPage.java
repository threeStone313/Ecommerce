package GeneralWidget;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class F47VerifyOrderTrackingLinkShouldTakeTheUserToTheOrderTrackingPage extends basePrepare{
  @Test
  public void orderTack() {
	  StepsCollection st=new StepsCollection();
	  st.getHP();
	  driver.findElement(By.xpath("//a[@id='lnkJoin']")).click();
	  Assert.assertEquals("http://qa.weddingshop.theknot.com/ordertracking/ordertracking.aspx", driver.getCurrentUrl());
  }
}
