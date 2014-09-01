package productPage;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class B29VerifyPersonalizationDetailsShouldBePassedToMyShoppingCart extends basePrepare{
  @Test
  public void personalization() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("be");
	  st.viewCart("checkout");
	 Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'I Do')]")).isDisplayed());  
	 Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Plum')]")).isDisplayed());
	 Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Silver Foil')]")).isDisplayed());
	 Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Line 1')]")).isDisplayed());
	 Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Line 2')]")).isDisplayed());
	 
  }
}
