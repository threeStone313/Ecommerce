package miniCart;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class C32VerifyProductDetailsShouldBeShownOnMiniCart extends basePrepare{
  @Test
  public void detailOfviewcart() throws Exception {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("tee");
	  st.textEquals("Pink,  Size 2", By.id("divFlyProdDetail"));
	  
  }
}
