package KWS.Payment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class G59VerifyLoggedOutUserCanPayWithAmazonViaShoppingCartPageAmazonButton extends basePrepare{
  @Test
  public void AmazonOnCart() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.AmazonInfo("cart");
	  new WebDriverWait(basePrepare.driver, 120).until(new ExpectedCondition<Boolean>(){

			@Override
			public Boolean apply(WebDriver d) {
				return d.findElement(By.id("ctl00_tkCheckoutHtml_phCmsCheckoutArea_ctl00_ctl00_ctl00_ddlShippingMethods")).isDisplayed();
			}	
		});
	  st.submitOrder("amazon");
	  st.waitUntilConfirm();
	  st.UrlEquals("https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx");
  }
}
