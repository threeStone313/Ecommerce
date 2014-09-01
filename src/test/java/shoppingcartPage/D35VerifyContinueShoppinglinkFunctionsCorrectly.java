package shoppingcartPage;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D35VerifyContinueShoppinglinkFunctionsCorrectly extends basePrepare{
  @Test
  public void Continue() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("de");
	  driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'CONTINUE SHOPPING')]")).click();
	  Assert.assertEquals("http://qa.weddingshop.theknot.com/", driver.getCurrentUrl());
	 
	  
  }
}
