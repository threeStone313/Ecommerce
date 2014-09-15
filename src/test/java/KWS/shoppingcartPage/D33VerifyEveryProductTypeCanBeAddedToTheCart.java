package KWS.shoppingcartPage;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class D33VerifyEveryProductTypeCanBeAddedToTheCart extends basePrepare{
  @Test
  public void Type()  {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("be");
	  st.viewCart("close");
	  st.ProductPageAndAdd("pa");
	  st.viewCart("close");
	  st.ProductPageAndAdd("en");
	  st.viewCart("close");
	  st.ProductPageAndAdd("eng");
	  st.viewCart("checkout");
	  st.trueEquals(By.xpath("//img[@alt='Personalized Napkins - BEVERAGE']"));
	  st.trueEquals(By.xpath("//img[@alt='Paddle Fan']"));
	  st.textEquals("Engravable Beer Mug", By.xpath("//div[@class='panel-body']//div[3]//div[2]//strong[1]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Circle Monogram')]/../..//*[contains(text(),'Engravable Beer Mug')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Circle Monogram')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'First Initial:')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Third Initial:')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Second Initial:')]"));
	 
  }
}
