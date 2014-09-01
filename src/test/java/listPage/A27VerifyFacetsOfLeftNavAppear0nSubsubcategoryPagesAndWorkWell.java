package listPage;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class A27VerifyFacetsOfLeftNavAppear0nSubsubcategoryPagesAndWorkWell extends basePrepare{
 
@Test
  public void facets() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.getSubsubcategory();
	  String A=driver.findElement(By.className("filterhead")).getText();
	  Assert.assertEquals("FILTER BY:", A);
	  driver.findElement(By.id("chkFilter_saleprice_min_0")).click();
	  Thread.sleep(2000);
	  Assert.assertEquals("http://qa.weddingshop.theknot.com/wedding-candles.aspx?saleprice_min=under-10", driver.getCurrentUrl());
	  
  }
}
