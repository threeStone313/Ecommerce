package GeneralWidget;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class F48VerifyJoinFreeLinkShouldTakeTheUserToTheMembershipCreationPage extends basePrepare {
  @Test
  public void join() {
	  StepsCollection st=new StepsCollection();
	  st.getHP();
	  driver.findElement(By.xpath("//a[@id='lnkLogin']")).click();
	  driver.findElement(By.xpath("//a[@id='hlnkJoin']")).click();
	  String url="http://global.theknot.com/join/memberprofile.aspx?target=http://qa.weddingshop.theknot.com/default.aspx?openaddressmodal=true&MsdVisit=1";
	  Assert.assertEquals(url, driver.getCurrentUrl());
  }
}
