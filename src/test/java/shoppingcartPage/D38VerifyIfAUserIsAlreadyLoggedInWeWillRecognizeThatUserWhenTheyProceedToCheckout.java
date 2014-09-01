package shoppingcartPage;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D38VerifyIfAUserIsAlreadyLoggedInWeWillRecognizeThatUserWhenTheyProceedToCheckout extends basePrepare  {
	@Test
  public void member() throws Exception {

		StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("sa");
	  Thread.sleep(2000);
	  st.viewCart("close");
	  Thread.sleep(2000);
//	  WebDriverWait wait = new WebDriverWait(basePrepare.driver, 15);//�ȴ�15s��ʱ
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkLogin")));//�ȴ�ֱ��Ԫ�ؿ��Ե����ʱ���ٵ��
	  st.guestOrMember("member");
	  st.getShoppingcart();
	  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	  Assert.assertEquals("Use my billing address", driver.findElement(By.id("chkOneAddress")).getAttribute("name"));
  }
}
