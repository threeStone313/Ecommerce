package KWS.shoppingcartPage;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class D35VerifyContinueShoppinglinkFunctionsCorrectly extends basePrepare{
  @Test
  public void Continue()  {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.singleClick(By.xpath("//a[@class='btn btn-primary btn-lg']"));
	  st.singleClick(By.xpath("//a[contains(text(),'CONTINUE SHOPPING')]"));
	  st.UrlEquals("http://qa.weddingshop.theknot.com/"); 
  }
}
