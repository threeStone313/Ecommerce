package KWS;
import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
public class testng2 {
	WebDriver driver;
	@Test
	public void test() throws Exception {
		 System.setProperty("webdriver.firefox.bin","D:\\firefox18\\firefox.exe");
		  FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\swang\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\11hwccox.default"));
		  	driver=new FirefoxDriver(profile);
		  	driver.get("http://qa.weddingshop.theknot.com/deluxe-personalized-ribbon-38.aspx");
		  	driver.findElement(By.id("lnkLogin")).click();
		  	driver.findElement(By.id("txtUsername")).sendKeys("qateststone@163.com");
		  	driver.findElement(By.id("txtPassword")).sendKeys("Wl15926345245");
		  	driver.findElement(By.id("divLoginButton")).click();
		  	Thread.sleep(2000);
		  System.out.println(driver.findElement(By.id("lnkMyAccount")).isDisplayed());
		  Assert.assertEquals(driver.findElement(By.id("lnkMyAccount")).isDisplayed(), true);
		  	
	}
	  @AfterTest
	  	public void TearDown(){
		  	driver.quit();
	  }
}
