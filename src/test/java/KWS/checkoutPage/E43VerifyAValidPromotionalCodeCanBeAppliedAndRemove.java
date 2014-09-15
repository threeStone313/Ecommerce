package KWS.checkoutPage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class E43VerifyAValidPromotionalCodeCanBeAppliedAndRemove extends basePrepare{
  @Test
  public void Promo() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("eng");
	  st.viewCart("close");
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.guestOrMember("guest");
	  st.billingShippingInfo();
	  st.textEquals("$154.70", By.xpath("//div[@id='SummaryTotals']//div[1]//div[2]//strong"));
	  st.textEquals("$165.53", By.xpath("//div[@id='SummaryTotals']//div[5]//div[2]//strong"));
	  st.promoCode("add");
	  st.textEquals("$154.70", By.xpath("//div[@id='SummaryTotals']//div[1]//div[2]//strong"));
	  st.textEquals("$148.98", By.xpath("//div[@id='SummaryTotals']//div[6]//div[2]//strong"));
	  st.滚动条();
	  st.promoCode("remove");
	  st.textEquals("$154.70", By.xpath("//div[@id='SummaryTotals']//div[1]//div[2]//strong"));
	  st.textEquals("$165.53", By.xpath("//div[@id='SummaryTotals']//div[5]//div[2]//strong"));
  }
}
