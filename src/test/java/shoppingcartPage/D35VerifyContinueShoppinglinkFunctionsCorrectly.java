package shoppingcartPage;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;

public class D35VerifyContinueShoppinglinkFunctionsCorrectly{
  @Test
  public void Continue()  {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  st.singleClick(By.xpath("//a[@class='btn btn-primary btn-lg']"));
	  st.singleClick(By.xpath("//a[contains(text(),'CONTINUE SHOPPING')]"));
	  st.UrlEquals("http://qa.weddingshop.theknot.com/"); 
  }
}
