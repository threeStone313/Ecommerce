package KWS.listPage;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class A27VerifyFacetsOfLeftNavAppear0nSubsubcategoryPagesAndWorkWell extends basePrepare{
 
@Test
  public void facets() {
	  StepsCollection st=new StepsCollection();
	  st.getSubsubcategory();
	  st.textEquals("FILTER BY:", By.className("filterhead"));
	  st.singleClick(By.id("chkFilter_saleprice_min_0"));
	  st.UrlEquals("http://qa.weddingshop.theknot.com/wedding-candles.aspx?saleprice_min=under-10");
	  
  }
}
