package shoppingcartPage;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D38VerifyIfAUserIsAlreadyLoggedInWeWillRecognizeThatUserWhenTheyProceedToCheckout extends basePrepare{
	@Test
  public void member()  {

		StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("sa");
	  st.viewCart("close");
//	  WebDriverWait wait = new WebDriverWait(basePrepare.driver, 15);//等待15s后超时
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkLogin")));//等待直到元素可以点击的时候再点击
	  st.guestOrMember("member");
	  st.getShoppingcart();
	  st.singleClick(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
	  st.attributeEquals("Use my billing address", By.id("chkOneAddress"),"name");
  }
}
