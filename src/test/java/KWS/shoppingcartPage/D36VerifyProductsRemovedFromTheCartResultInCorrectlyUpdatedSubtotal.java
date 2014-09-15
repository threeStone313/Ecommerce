package KWS.shoppingcartPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class D36VerifyProductsRemovedFromTheCartResultInCorrectlyUpdatedSubtotal extends basePrepare{
  @Test
  public void RemovePro() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("en");
	  st.viewCart("close");
	  st.ProductPageAndAdd("eng");
	  st.viewCart("close");
	  st.ProductPageAndAdd("sa");
	  st.viewCart("checkout");
	  st.singleClear(By.xpath("//span[@class='edit_personalization']/../../../..//input"));
	  st.singleSend(By.xpath("//span[@class='edit_personalization']/../../../..//input"),"0");
	  st.singleClick(By.xpath("//span[@class='edit_personalization']/../../../..//a[@class='updateLnk']"));
	  st.trueEquals(By.xpath("//img[@alt='Engravable Beer Mug']"));
	  st.trueEquals(By.xpath("//img[@alt='Sandalwood Fan']"));
	  st.textEquals("$43.47", By.xpath("//div[@class='panel-footer']//div[@class='col-xs-4 col-sm-4 col-md-3 text-right']//strong"));
	  
  }
}
