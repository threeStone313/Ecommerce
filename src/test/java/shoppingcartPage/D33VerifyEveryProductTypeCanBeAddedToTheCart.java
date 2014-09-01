package shoppingcartPage;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class D33VerifyEveryProductTypeCanBeAddedToTheCart extends basePrepare {
  @Test
  public void Type() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("be");
	  driver.findElement(By.xpath("//div[@id='divFlyoutCart']//button[@class='close']")).click();
	  st.ProductPageAndAdd("pa");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='divFlyoutCart']//button[@class='close']")).click();
	  st.ProductPageAndAdd("en");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@id='divFlyoutCart']//button[@class='close']")).click();
	  st.ProductPageAndAdd("eng");
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
	  Thread.sleep(4000);
	  Assert.assertEquals(true, driver.findElement(By.xpath("//img[@alt='Personalized Napkins - BEVERAGE']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//img[@alt='Paddle Fan']")).isDisplayed());
	  String src=driver.findElement(By.xpath("//div[@class='panel-body']//div[3]//div[2]//strong[1]")).getText();
	  Assert.assertEquals("Engravable Beer Mug", src);
	  Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Circle Monogram')]/../..//*[contains(text(),'Engravable Beer Mug')]")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Circle Monogram')]")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'First Initial:')]")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Third Initial:')]")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Second Initial:')]")).isDisplayed());
	 
  }
}
