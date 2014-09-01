package KWS;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestng {
 
	
	WebDriver driver;
  @Test
  public void test() throws Exception {
//	  System.setProperty("webdriver.firefox.bin","D:\\firefox18\\firefox.exe");
//	  FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\swang\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\11hwccox.default"));
//	  	driver=new FirefoxDriver(profile);//启动带有用户配置的FF浏览器
//	  	driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.MINUTES);//设置页面加载时的超时时间
//	  	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//设置识别元素时的超时时间
		DesiredCapabilities dc = DesiredCapabilities.firefox();//设置需要驱动的浏览器
		driver = new RemoteWebDriver(new URL("http://172.26.11.163:4444/wd/hub"), dc);//URL 远程机的ip地址
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.MINUTES);//设置页面加载时的超时时间
	  	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	  	driver.get("http://qa.weddingshop.theknot.com/deluxe-personalized-ribbon-38.aspx");
		driver.findElement(By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']")).click();
		driver.findElement(By.xpath("//span[@class='current_step' and text()=3]/../../../.")).click();
		driver.findElement(By.xpath("//input[@id='Names']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@class='current_step' and text()=4]/../../../.")).click();
		driver.findElement(By.id("Date")).sendKeys("1212");
		driver.findElement(By.id("addFromPersonalizationModal")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("addFromPersonalizationModal")).click();
		Thread.sleep(2000);
		driver.get("http://qa.weddingshop.theknot.com/cart/shoppingcart.aspx");
		driver.findElement(By.id("OffAmazonPaymentsWidgets0")).click();
		String[] handles=new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		driver.switchTo().window(handles[1]);
		driver.findElement(By.id("ap_email")).sendKeys("tli@xogrp.com");
		driver.findElement(By.id("ap_password")).sendKeys("testtest");
		driver.findElement(By.id("signInSubmit")).click();
		driver.switchTo().window(handles[0]);
//		new WebDriverWait(driver, 30 ).until(//等待直到某个元素存在 最长等待30s
//					      ExpectedConditions.presenceOfElementLocated(By.className( "collapse in" ))
//					);
		
		driver.findElement(By.xpath("//div[@class='buffer text-right']//a[contains(text(),'SUBMIT ORDER')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='modal-footer text-right']//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='buffer text-right']//a[contains(text(),'SUBMIT ORDER')]")).click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://qa.weddingshop.theknot.com/checkout/orderconfirmation.aspx");	
		driver.quit();
  }

}

