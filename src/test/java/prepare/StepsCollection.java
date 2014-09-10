package prepare;

import org.openqa.selenium.*;
import org.testng.Assert;

public class StepsCollection{
	autoMan autoMan=new autoMan();
	public void getHP() {// 去到homepage
		autoMan.getUrl("http://qa.weddingshop.theknot.com/");
	}

	public void getShoppingcart() {// 去到shoppingcart
		autoMan.getUrl("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
	}

	public void getSubsubcategory() {// 去到Subsubcategory page
		autoMan.getUrl("http://qa.weddingshop.theknot.com/wedding-candles.aspx");
	}

	public void Search(String a) {// 输入关键字并搜索
		autoMan.getElement(
				By.id("ctl00_tkShared_Header_txtHeaderSearchBox")).sendKeys(a);
		autoMan.getElementNoWait(
				By.xpath("//span[@class='glyphicon glyphicon-search']"))
				.click();
	}

	public void ProductPageAndAdd(String a) {// 跟据传的参数进入到不同的product
																// page并且添加
		if (a == "be") {
			autoMan.getUrl("http://qa.weddingshop.theknot.com/personalized-napkins-beverage.aspx");
			autoMan.getElement(
							By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"))
					.click();
			autoMan.selectByVisibleText(By.id("Napkin Designs"),"I Do" );
			autoMan.selectByVisibleText(By.id("Napkin Colors"),"Plum" );
			autoMan.selectByVisibleText(By.id("Foil or Ink Colors"),"Silver Foil");
			autoMan.selectByVisibleText(By.id("Fonts"),"Modern" );
			autoMan.getElementNoWait(
					By.xpath("//span[contains(text(),'Enter')]")).click();
			autoMan.getElement(By.id("Line 1")).click();
			autoMan.getElement(By.id("Line 1")).sendKeys("Line 1");
			autoMan.getElement(By.id("Line 2")).click();
			autoMan.getElement(By.id("Line 2")).sendKeys("Line 2");
			autoMan.getElementNoWait(By.xpath("//span[@class='current_step' and text()=6]/../../../.")).click();				
			autoMan.getElement(By.id("PersonalizationQuantity"))
					.clear();
			autoMan.getElementNoWait(By.id("PersonalizationQuantity"))
					.sendKeys("2");
			autoMan.getElement(By.id("addFromPersonalizationModal")).click();
			autoMan.sleep(4000);;
		} else if (a == "de") {
			autoMan.getUrl("http://qa.weddingshop.theknot.com/deluxe-personalized-ribbon-38.aspx");
			autoMan.getElement(By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"))
					.click();
			autoMan.sleep(2000);
			this.滚动条();
			autoMan.getElement(By.xpath("//span[@class='current_step' and text()=3]/../../../.")).click();
			autoMan.getElement(By.xpath("//input[@id='Names']")).click();
			autoMan.getElement(By.xpath("//input[@id='Names']")).sendKeys("test");
			autoMan.getElementNoWait(By.xpath("//span[@class='current_step' and text()=6]/../../../."))
					.click();
			autoMan.sleep(3000);
			autoMan.getElement(By.id("PersonalizationQuantity")).clear();
			autoMan.getElementNoWait(By.id("PersonalizationQuantity")).sendKeys("5");
			autoMan.getElement(By.id("addFromPersonalizationModal")).click();
			autoMan.sleep(2000);
		} else if (a == "tee") {
			autoMan.getUrl("http://qa.weddingshop.theknot.com/crystal-flower-girl-tee.aspx");
			autoMan.selectByVisibleText(By.id("tkDropdown0"),"Pink" );
			autoMan.selectByVisibleText(By.id("tkDropdown1"),"Size 2" );
			autoMan.getElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCart"))
					.click();
			autoMan.sleep(2000);
		} else if (a == "pa") {// paddle fan
			autoMan.getUrl("http://qa.weddingshop.theknot.com/paddle-fan.aspx");
			autoMan.selectByVisibleText(By.id("tkDropdown0"),"Black" );
			autoMan.getElement(By.id("gotoquantity")).click();
			autoMan.getElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty")).clear();
			autoMan.getElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty")).sendKeys("7");
			autoMan.getElementNoWait(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCart")).click();
			autoMan.sleep(2000);
		} else if (a == "sa") {// sandalwood fan
			autoMan.getUrl("http://qa.weddingshop.theknot.com/sandalwood-fan.aspx");
			autoMan.getElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCart"))
					.click();
			autoMan.sleep(4000);
		} else if (a == "en") {// addWithoutPersonalization
			autoMan.getUrl("http://qa.weddingshop.theknot.com/engravable-beer-mug.aspx");
			autoMan.getElement(By.id("gotoquantity")).click();
			autoMan.getElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty"))
					.clear();
			autoMan.getElement(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty"))
					.sendKeys("3");
			autoMan.getElementNoWait(By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addWithoutPersonalization"))
					.click();
			autoMan.sleep(2000);
		} else if (a == "eng") {// addWithPersonalization
			autoMan.getUrl("http://qa.weddingshop.theknot.com/engravable-beer-mug.aspx");
			autoMan.sleep(2000);
			autoMan.getElement(By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"))
					.click();
			autoMan.selectByVisibleText(By.xpath("//select[@id='Font']"), "Circle Monogram");
			autoMan.getElementNoWait(By.xpath("//span[contains(text(),'Name')]")).click();
			autoMan.getElement(By.id("First Initial")).click();
			autoMan.getElement(By.id("First Initial")).sendKeys("A");
			autoMan.getElement(By.id("Third Initial")).click();
			autoMan.getElement(By.id("Third Initial")).sendKeys("B");
			autoMan.getElement(By.id("Second Initial")).click();
			autoMan.getElement(By.id("Second Initial")).sendKeys("C");
			autoMan.getElement(By.xpath("//span[contains(text(),'How')]")).click();
			autoMan.sleep(3000);
			autoMan.getElement(By.id("addFromPersonalizationModal")).click();
			autoMan.sleep(3000);
		}
	}

	public void viewCart(String a) {// 对viewcart modal上的按钮进行操作
		if (a == "checkout") {
			autoMan.getElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();// go to shoppingcart
			autoMan.sleep(4000);
		} else 
			if (a == "close") {
			autoMan.getElement(By.xpath("//div[@id='divFlyoutCart']//button[@class='close']")).click();// 关闭modal
		}
	}

	public void guestOrMember(String a)  {
		if (a == "guest") {
			autoMan.getElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"))
					.click();
			autoMan.getElement(By.id("divCheckoutAsGuestButton"))
					.click();
		} else if (a == "member") {
			autoMan.sleep(1000);
			autoMan.getElement(By.id("lnkLogin")).click();
			autoMan.getElement(By.id("txtUsername")).sendKeys(
					"vicwangtest@gmail.com");
			autoMan.getElement(By.id("txtPassword")).sendKeys(
					"123456");
			autoMan.getElement(By.id("divLoginButton")).click();
			autoMan.sleep(3000);
		}
	}

	public void billingShippingInfo(){
		autoMan.getElement(By.xpath("//div[@id='tkBillingAddress']//input[@name='FirstName']")).sendKeys("vic");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='LastName']"))
				.sendKeys("wang");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='Email']"))
				.sendKeys("vicwangtest@gmail.com");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='Address1']"))
				.sendKeys("11600 burt");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='Address2']"))
				.sendKeys("2");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='City']"))
				.sendKeys("Omaha");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='State']"))
				.sendKeys("ne");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='ZipCode']"))
				.sendKeys("68154");
		autoMan.getElementNoWait(By.xpath("//div[@id='tkBillingAddress']//input[@name='Phone']"))
				.sendKeys("1234567890");
		autoMan.getElementNoWait(By.id("SaveAndContinue")).click();
		autoMan.sleep(3000);

	}

	public void promoCode(String a){
		if (a == "add") {
			autoMan.getElement(By.xpath("//input[@id='CouponCode1']")).click();
			autoMan.getElement(By.xpath("//input[@id='CouponCode1']")).sendKeys(
					"savetennow");
			autoMan.getElementNoWait(
					By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
			autoMan.sleep(8000);
		} else if (a == "remove") {
			autoMan.getElement(
					By.xpath("//a[contains(text(),'remove')]")).click();
			autoMan.sleep(6000);
		}
	}

	public void ccInfoAndSubmit(){//输入信用卡信息并提交
		autoMan.getElement(By.id("CCName")).click();
		autoMan.getElement(By.id("CCName")).sendKeys("st");
		autoMan.getElement(By.id("CCNumber")).click();
		autoMan.getElement(By.id("CCNumber")).sendKeys("4111111111111111");
		autoMan.getElement(By.id("CCCCV")).click();
		autoMan.getElement(By.id("CCCCV")).sendKeys("123");
		autoMan.getElement(By.xpath("//div[@id='cktwo']//a[contains(text(),'SUBMIT ORDER')]"))
				.click();
		autoMan.sleep(5000);
	}
	public void singleClick(final By by){//单个的点击操作
		autoMan.getElement(by).click();
		autoMan.sleep(3000);
	}
	public void singleClear(final By by){//单个的清除文本操作
		autoMan.getElement(by).clear();
	}
	public void singleSend(final By by,String a){//单个的输入文本操作
		autoMan.getElement(by).sendKeys(a);
	}
	public void 滚动条(){
		 String js="scroll(0,10000);";//指定滚动条要滚动的像素
		  ((JavascriptExecutor)basePrepare.driver).executeScript(js);//执行滚动
	}
	public void UrlEquals(String a){
		 Assert.assertEquals(a,autoMan.getCurrentUrl());
	}
	public void textEquals(String a,final By by){
		Assert.assertEquals(a,autoMan.getElement(by).getText());
	}
	public void trueEquals(final By by){
		Assert.assertEquals(true,autoMan.getElement(by).isDisplayed());
	}
	public void attributeEquals(String a,final By by,String b){
		Assert.assertEquals(a,autoMan.getElement(by).getAttribute(b));
	}
}
