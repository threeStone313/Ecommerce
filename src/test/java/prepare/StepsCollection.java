package prepare;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepsCollection {

	public void getHP() {// 去到homepage
		basePrepare.driver.get("http://qa.weddingshop.theknot.com/");
	}

	public void getShoppingcart() {// 去到shoppingcart
		basePrepare.driver
				.get("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
	}

	public void getSubsubcategory() {// 去到Subsubcategory page
		basePrepare.driver
				.get("http://qa.weddingshop.theknot.com/wedding-candles.aspx");
	}

	public void Search(String a) {// 输入关键字并搜索
		basePrepare.driver.findElement(
				By.id("ctl00_tkShared_Header_txtHeaderSearchBox")).sendKeys(a);
		basePrepare.driver.findElement(
				By.xpath("//span[@class='glyphicon glyphicon-search']"))
				.click();
	}

	public void ProductPageAndAdd(String a) throws Exception {// 跟据传的参数进入到不同的product
																// page并且添加
		if (a == "be") {
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/personalized-napkins-beverage.aspx");
			basePrepare.driver
					.findElement(
							By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"))
					.click();
			Select select = new Select(basePrepare.driver.findElement(By
					.id("Napkin Designs")));
			select.selectByVisibleText("I Do");
			Select B = new Select(basePrepare.driver.findElement(By
					.id("Napkin Colors")));
			B.selectByVisibleText("Plum");
			Select C = new Select(basePrepare.driver.findElement(By
					.id("Foil or Ink Colors")));
			C.selectByVisibleText("Silver Foil");
			Select D = new Select(
					basePrepare.driver.findElement(By.id("Fonts")));
			D.selectByVisibleText("Modern");
			basePrepare.driver.findElement(
					By.xpath("//span[contains(text(),'Enter')]")).click();
			Thread.sleep(1000);
			basePrepare.driver.findElement(By.id("Line 1")).click();
			basePrepare.driver.findElement(By.id("Line 1")).sendKeys("Line 1");
			basePrepare.driver.findElement(By.id("Line 2")).click();
			Thread.sleep(1000);
			basePrepare.driver.findElement(By.id("Line 2")).sendKeys("Line 2");
			basePrepare.driver
					.findElement(
							By.xpath("//span[@class='current_step' and text()=6]/../../../."))
					.click();
			Thread.sleep(2000);
			basePrepare.driver.findElement(By.id("PersonalizationQuantity"))
					.clear();
			basePrepare.driver.findElement(By.id("PersonalizationQuantity"))
					.sendKeys("2");
			basePrepare.driver
					.findElement(By.id("addFromPersonalizationModal")).click();
			Thread.sleep(4000);
		} else if (a == "de") {
			Thread.sleep(2000);
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/deluxe-personalized-ribbon-38.aspx");
			Thread.sleep(2000);
			basePrepare.driver
					.findElement(
							By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"))
					.click();
			Thread.sleep(2000);
			basePrepare.driver
					.findElement(
							By.xpath("//span[@class='current_step' and text()=3]/../../../."))
					.click();
			Thread.sleep(2000);
			basePrepare.driver.findElement(By.xpath("//input[@id='Names']"))
					.click();
			basePrepare.driver.findElement(By.xpath("//input[@id='Names']"))
					.sendKeys("test");
			basePrepare.driver
					.findElement(
							By.xpath("//span[@class='current_step' and text()=6]/../../../."))
					.click();
			Thread.sleep(3000);
			basePrepare.driver.findElement(By.id("PersonalizationQuantity"))
					.clear();
			basePrepare.driver.findElement(By.id("PersonalizationQuantity"))
					.sendKeys("5");
			basePrepare.driver
					.findElement(By.id("addFromPersonalizationModal")).click();
			Thread.sleep(2000);
		} else if (a == "tee") {
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/crystal-flower-girl-tee.aspx");
			Select b = new Select(basePrepare.driver.findElement(By
					.id("tkDropdown0")));
			b.selectByVisibleText("Pink");
			Select c = new Select(basePrepare.driver.findElement(By
					.id("tkDropdown1")));
			c.selectByVisibleText("Size 2");
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCart"))
					.click();
			Thread.sleep(2000);
		} else if (a == "pa") {// paddle fan
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/paddle-fan.aspx");
			new Select(basePrepare.driver.findElement(By.id("tkDropdown0")))
					.selectByVisibleText("Black");
			basePrepare.driver.findElement(By.id("gotoquantity")).click();
			Thread.sleep(1000);
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty"))
					.clear();
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty"))
					.sendKeys("7");
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCart"))
					.click();
			Thread.sleep(2000);
		} else if (a == "sa") {// sandalwood fan
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/sandalwood-fan.aspx");
			Thread.sleep(2000);
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCart"))
					.click();
			Thread.sleep(4000);
		} else if (a == "en") {// addWithoutPersonalization
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/engravable-beer-mug.aspx");
			Thread.sleep(2000);
			basePrepare.driver.findElement(By.id("gotoquantity")).click();
			Thread.sleep(1000);
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty"))
					.clear();
			basePrepare.driver.findElement(
					By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_txtQty"))
					.sendKeys("3");
			basePrepare.driver
					.findElement(
							By.id("ctl00_MainContentArea_ctl00_ctl00_ctl00_addWithoutPersonalization"))
					.click();
			Thread.sleep(2000);
		} else if (a == "eng") {// addWithPersonalization
			basePrepare.driver
					.get("http://qa.weddingshop.theknot.com/engravable-beer-mug.aspx");
			Thread.sleep(2000);
			basePrepare.driver
					.findElement(
							By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"))
					.click();
			Thread.sleep(1000);
			new Select(basePrepare.driver.findElement(By
					.xpath("//select[@id='Font']")))
					.selectByVisibleText("Circle Monogram");
			basePrepare.driver.findElement(
					By.xpath("//span[contains(text(),'Name')]")).click();
			Thread.sleep(1000);
			basePrepare.driver.findElement(By.id("First Initial")).click();
			basePrepare.driver.findElement(By.id("First Initial"))
					.sendKeys("A");
			basePrepare.driver.findElement(By.id("Third Initial")).click();
			basePrepare.driver.findElement(By.id("Third Initial"))
					.sendKeys("B");
			basePrepare.driver.findElement(By.id("Second Initial")).click();
			basePrepare.driver.findElement(By.id("Second Initial")).sendKeys(
					"C");
			basePrepare.driver.findElement(
					By.xpath("//span[contains(text(),'How')]")).click();
			Thread.sleep(3000);
			basePrepare.driver
					.findElement(By.id("addFromPersonalizationModal")).click();
			Thread.sleep(3000);
		}
	}

	public void viewCart(String a) throws InterruptedException {// 对viewcart
																// modal上的按钮进行操作
		if (a == "checkout") {
			Thread.sleep(5000);
			basePrepare.driver.findElement(
					By.xpath("//a[@class='btn btn-primary btn-lg']")).click();// go
																				// to
																				// shoppingcart
		} else if (a == "close") {
			Thread.sleep(2000);
			basePrepare.driver
					.findElement(
							By.xpath("//div[@id='divFlyoutCart']//button[@class='close']"))
					.click();// 关闭modal
		}
	}

	public void guestOrMember(String a) throws InterruptedException {
		if (a == "guest") {
			basePrepare.driver
					.findElement(
							By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"))
					.click();
			Thread.sleep(2000);
			basePrepare.driver.findElement(By.id("divCheckoutAsGuestButton"))
					.click();
		} else if (a == "member") {

			basePrepare.driver.findElement(By.id("lnkLogin")).click();
			basePrepare.driver.findElement(By.id("txtUsername")).sendKeys(
					"vicwangtest@gmail.com");
			basePrepare.driver.findElement(By.id("txtPassword")).sendKeys(
					"123456");
			basePrepare.driver.findElement(By.id("divLoginButton")).click();
			Thread.sleep(3000);
		}
	}

	public void billingShippingInfo() throws Exception {
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='FirstName']"))
				.sendKeys("vic");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='LastName']"))
				.sendKeys("wang");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='Email']"))
				.sendKeys("vicwangtest@gmail.com");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='Address1']"))
				.sendKeys("11600 burt");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='Address2']"))
				.sendKeys("2");
		basePrepare.driver.findElement(
				By.xpath("//div[@id='tkBillingAddress']//input[@name='City']"))
				.sendKeys("Omaha");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='State']"))
				.sendKeys("ne");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='ZipCode']"))
				.sendKeys("68154");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='tkBillingAddress']//input[@name='Phone']"))
				.sendKeys("1234567890");
		basePrepare.driver.findElement(By.id("SaveAndContinue")).click();
		Thread.sleep(3000);

	}

	public void promoCode(String a) throws Exception {
		if (a == "add") {
			basePrepare.driver.findElement(
					By.xpath("//input[@id='CouponCode1']")).click();
			basePrepare.driver.findElement(
					By.xpath("//input[@id='CouponCode1']")).sendKeys(
					"savetennow");
			basePrepare.driver.findElement(
					By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
			Thread.sleep(8000);
		} else if (a == "remove") {
			basePrepare.driver.findElement(
					By.xpath("//a[contains(text(),'remove')]")).click();
			Thread.sleep(4000);
		}
	}

	public void ccInfoAndSubmit() throws InterruptedException {
		Thread.sleep(10000);
		basePrepare.driver.findElement(By.id("CCName")).click();
		basePrepare.driver.findElement(By.id("CCName")).sendKeys("st");
		basePrepare.driver.findElement(By.id("CCNumber")).click();
		basePrepare.driver.findElement(By.id("CCNumber")).sendKeys(
				"4111111111111111");
		basePrepare.driver.findElement(By.id("CCCCV")).click();
		basePrepare.driver.findElement(By.id("CCCCV")).sendKeys("123");
		basePrepare.driver
				.findElement(
						By.xpath("//div[@id='cktwo']//a[contains(text(),'SUBMIT ORDER')]"))
				.click();
		Thread.sleep(5000);
	}
}
