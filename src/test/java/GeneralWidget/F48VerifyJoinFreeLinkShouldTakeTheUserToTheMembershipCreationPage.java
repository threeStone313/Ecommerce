package GeneralWidget;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class F48VerifyJoinFreeLinkShouldTakeTheUserToTheMembershipCreationPage extends basePrepare{
  @Test
  public void join() {
	  StepsCollection st=new StepsCollection();
	  st.getHP();
	  st.singleClick(By.xpath("//a[@id='lnkLogin']"));
	  st.singleClick(By.xpath("//a[@id='hlnkJoin']"));
	  st.UrlEquals("http://global.theknot.com/join/memberprofile.aspx?target=http://qa.weddingshop.theknot.com/default.aspx?openaddressmodal=true&MsdVisit=1");
  }
}
