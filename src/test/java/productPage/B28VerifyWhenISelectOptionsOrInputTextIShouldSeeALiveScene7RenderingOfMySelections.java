package productPage;



import prepare.basePrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B28VerifyWhenISelectOptionsOrInputTextIShouldSeeALiveScene7RenderingOfMySelections extends basePrepare{
  @Test
  public void Personalize() throws Exception {
	
	  	driver.get("http://qa.weddingshop.theknot.com/personalized-napkins-beverage.aspx");
		driver.findElement(By.xpath("//div[@class='prod-buttons text-center btn-group-lg']//button[@id='ctl00_MainContentArea_ctl00_ctl00_ctl00_addToCartPersonalized']")).click();
		Select select=new Select(driver.findElement(By.id("Napkin Designs")));
		select.selectByVisibleText("I Do");
		Select B=new Select(driver.findElement(By.id("Napkin Colors")));
		B.selectByVisibleText("Plum");
		Select C=new Select(driver.findElement(By.id("Foil or Ink Colors")));
		C.selectByVisibleText("Silver Foil");
		Select D=new Select(driver.findElement(By.id("Fonts")));
		D.selectByVisibleText("Modern");
		driver.findElement(By.xpath("//span[contains(text(),'Enter')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Line 1")).click();
		driver.findElement(By.id("Line 1")).sendKeys("Line 1");
		driver.findElement(By.id("Line 2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Line 2")).sendKeys("Line 2");
		driver.findElement(By.xpath("//span[@class='current_step' and text()=6]/../../../.")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("PersonalizationQuantity")).clear();
		driver.findElement(By.id("PersonalizationQuantity")).sendKeys("2");
		Thread.sleep(2000);
		
	  String Src=driver.findElement(By.id("PersonalizationImage")).getAttribute("src");
	  System.out.println(Src);
	  String img="http://theknot.scene7.com/is/image/TheKnot?src=ir{TheKnotRender/11518?&obj=imprint&color=783265&decal&pos=-.1,-1.2&src=ir{TheKnotRender/foil?obj=foil&decal&src=is{TheKnot/MAIN?&$IMGsrc=i_do&$IMGsize=500,500&$font1=Futura&$phrase1=Line%201&$phrase2=Line%202&$phrase1fs=130&$phrase2fs=130}&show&res=150&color=cccdcf&req=object}&res=300}&$400px$";
//	  if(Src!=img){
//		  driver.findElement(By.xpath("//span[contains(text(),'Enter')]")).click();
//		  driver.findElement(By.id("Line 2")).clear();
//		  driver.findElement(By.id("Line 2")).click();
//		  driver.findElement(By.id("Line 2")).sendKeys("Line 2");
//		  driver.findElement(By.xpath("//span[@class='current_step' and text()=6]/../../../.")).click();
//			Thread.sleep(2000);
//			System.out.print("´í");
//			Assert.assertEquals(Src, img);
//	  }else{
	  Assert.assertEquals(Src, img);
	  
	 
  }




}
