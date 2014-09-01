package KWS;
import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;
import org.testng.Assert;
public class TEST {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.bin","D:\\firefox18\\firefox.exe");
		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\swang\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\11hwccox.default"));
		WebDriver driver=new FirefoxDriver(profile);//启动带有用户配置的FF浏览器
		driver.get("http://qa.weddingshop.theknot.com/deluxe-personalized-ribbon-38.aspx");
		WebElement perAdd=driver.findElement(By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']"));
		perAdd.click();
		driver.findElement(By.xpath("//span[@class='current_step' and text()=3]/../../../.")).click();
		driver.findElement(By.id("Names")).sendKeys("test");
		driver.findElement(By.xpath("//span[@class='current_step' and text()=6]/../../../.")).click();
		driver.findElement(By.id("PersonalizationQuantity")).sendKeys("5");
		driver.findElement(By.id("PersonalizationQuantity")).clear();
		driver.findElement(By.id("PersonalizationQuantity")).sendKeys("5");
		driver.findElement(By.id("addFromPersonalizationModal")).click();
		Thread.sleep(3000);
		driver.get("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("OffAmazonPaymentsWidgets0")).click();
		String[] handles=new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		driver.switchTo().window(handles[1]);
		driver.findElement(By.id("ap_email")).sendKeys("tli@xogrp.com");
		driver.findElement(By.id("ap_password")).sendKeys("testtest");
		driver.findElement(By.id("signInSubmit")).click();
		driver.switchTo().window(handles[0]);
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[@class='buffer text-right']//a[contains(text(),'SUBMIT ORDER')]")).click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx", url);
		
	}

}
//String explorer =String.valueOf(context.getCurrentXmlTest().getParameter("browserName"));
//if(explorer.equalsIgnoreCase("ff")){
//	  
//}else if (explorer.equalsIgnoreCase("chrome")){
//	  
//	  
//	  
//}else{
//	  
//	  就是ie
//	  
//}
