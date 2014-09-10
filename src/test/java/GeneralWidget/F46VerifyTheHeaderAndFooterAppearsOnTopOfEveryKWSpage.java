package GeneralWidget;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class F46VerifyTheHeaderAndFooterAppearsOnTopOfEveryKWSpage extends basePrepare {
  @Test
  public void headerAndFooter() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.getHP();
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  st.Search("wedding");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/reception.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/shopbydesign.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/on_sale.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/sandalwood-fan.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  st.ProductPageAndAdd("sa");
	  st.viewCart("checkout");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/ordertracking/ordertracking.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/affiliatepage.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	  driver.get("http://qa.weddingshop.theknot.com/customer-service.aspx");
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='navbar-brand-alt']")).isDisplayed());
	  Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='tklogo']")).isDisplayed());
	 
	 
  }
}
