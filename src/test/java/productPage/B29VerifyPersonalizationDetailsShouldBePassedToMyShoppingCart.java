package productPage;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class B29VerifyPersonalizationDetailsShouldBePassedToMyShoppingCart extends basePrepare{
  @Test
  public void personalization(){
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("be");
	  st.viewCart("checkout");
	  st.trueEquals(By.xpath("//li[contains(text(),'I Do')]"));  
	  st.trueEquals(By.xpath("//li[contains(text(),'Plum')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Silver Foil')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Line 1')]"));
	  st.trueEquals(By.xpath("//li[contains(text(),'Line 2')]"));
	 
  }
}
