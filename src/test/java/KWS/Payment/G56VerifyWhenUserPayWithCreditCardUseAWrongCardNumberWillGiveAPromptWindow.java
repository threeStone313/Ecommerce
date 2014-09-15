package KWS.Payment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import KWS.prepare.StepsCollection;
import KWS.prepare.basePrepare;

public class G56VerifyWhenUserPayWithCreditCardUseAWrongCardNumberWillGiveAPromptWindow extends basePrepare{
  @Test
  public void wrongCard() {
	  StepsCollection st=new StepsCollection();
	  st.ProductPageAndAdd("sa");
	  st.viewCart("checkout");
	  st.guestOrMember("guest");
	  st.billingShippingInfo();
	  st.wrongCard();
	  st.textEquals("We're sorry, your payment has been declined.", By.xpath("//div[@class='modal-body text-danger']"));
  }
}
