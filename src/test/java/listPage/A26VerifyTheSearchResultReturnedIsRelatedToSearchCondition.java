package listPage;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

import prepare.StepsCollection;

public class A26VerifyTheSearchResultReturnedIsRelatedToSearchCondition {
	@Test
	public void Search(){
		StepsCollection st=new StepsCollection();
		
		st.getHP();
		st.Search("fan");
		st.textEquals("Sandalwood Fan", By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_ucSearchControl_MyResults_EntriesList_ctrl0_ctl00_hlnkProductName"));	
}
}