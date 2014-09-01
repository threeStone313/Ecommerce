package checkoutPage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class E43VerifyAValidPromotionalCodeCanBeAppliedAndRemove extends basePrepare {
  @Test
  public void Promo() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("eng");
	  st.viewCart("close");
	  st.ProductPageAndAdd("de");
	  st.viewCart("checkout");
	  st.guestOrMember("guest");
	  st.billingShippingInfo();
	 String subtotal= driver.findElement(By.xpath("//div[@id='SummaryTotals']//div[1]//div[2]//strong")).getText();
	 String total= driver.findElement(By.xpath("//div[@id='SummaryTotals']//div[5]//div[2]//strong")).getText();
	 Assert.assertEquals("$154.70", subtotal);
	 Assert.assertEquals("$261.82", total);
	  st.promoCode("add");
	  String total2= driver.findElement(By.xpath("//div[@id='SummaryTotals']//div[6]//div[2]//strong")).getText();
	  Assert.assertEquals("$154.70", subtotal);
	  Assert.assertEquals("$245.27", total2);
	  String js1 = "return document.documentElement.scrollHeight;";  // 返回滑动条的位置值
	  String js2="scroll(0,10000);";//指定滚动条要滚动的像素
	  ((JavascriptExecutor)driver).executeScript(js1);// 返回滑动条的位置值
	  ((JavascriptExecutor)driver).executeScript(js2);//执行滚动
	  st.promoCode("remove");
	  Assert.assertEquals("$154.70", subtotal);
	  Assert.assertEquals("$261.82", total);
  }
}
