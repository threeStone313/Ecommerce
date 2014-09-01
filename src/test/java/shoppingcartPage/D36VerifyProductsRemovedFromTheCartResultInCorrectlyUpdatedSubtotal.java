package shoppingcartPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D36VerifyProductsRemovedFromTheCartResultInCorrectlyUpdatedSubtotal extends basePrepare{
  @Test
  public void RemovePro() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("en");
	  st.viewCart("close");
	  st.ProductPageAndAdd("eng");
	  st.viewCart("close");
	  st.ProductPageAndAdd("sa");
	  st.viewCart("checkout");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[@class='edit_personalization']/../../../..//input")).clear();
	  driver.findElement(By.xpath("//span[@class='edit_personalization']/../../../..//input")).sendKeys("0");
	  driver.findElement(By.xpath("//span[@class='edit_personalization']/../../../..//a[@class='updateLnk']")).click();
	  Thread.sleep(1000);
	  Assert.assertEquals(true, driver.findElement(By.xpath("//img[@alt='Engravable Beer Mug']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//img[@alt='Sandalwood Fan']")).isDisplayed());
	  Assert.assertEquals("$43.47", driver.findElement(By.xpath("//div[@class='panel-footer']//div[@class='col-xs-4 col-sm-4 col-md-3 text-right']//strong")).getText());
	  
  }
}
