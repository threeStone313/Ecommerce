package listPage;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import prepare.StepsCollection;
import prepare.basePrepare;

public class A26VerifyTheSearchResultReturnedIsRelatedToSearchCondition extends basePrepare {
	@Test
	public void Search(){
		StepsCollection st=new StepsCollection();
		
		st.getHP();
		st.Search("fan");
	String A=driver.findElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_ucSearchControl_MyResults_EntriesList_ctrl0_ctl00_hlnkProductName")).getText();
		Assert.assertEquals(A,"Sandalwood Fan");
		
}
}