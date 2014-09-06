package prepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoMan {
	int waitTime=60;
	public void getUrl(String url){
		basePrepare.driver.get(url);
	}
	public String getCurrentUrl(){
		return basePrepare.driver.getCurrentUrl();
	}

	public WebElement getElement(final By by){
		WebElement element=null;
		boolean status=new WebDriverWait(basePrepare.driver, waitTime).until(new ExpectedCondition<Boolean>(){

			@Override
			public Boolean apply(WebDriver d) {
				return d.findElement(by).isEnabled();
			}	
		});
			if(status){
				element=basePrepare.driver.findElement(by);
	}
			return element;
}
	public WebElement getElementNoWait(final By by){
		WebElement element=null;
		 try {
	            element = basePrepare.driver.findElement(by);
	        } catch (Exception e) {
	            element = null;
	        }
	        return element;
	        }
	public void sleep(int sleepTime) {
		try {
		Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	public void selectByVisibleText(final By by,String text){
		Select select=new Select(getElement(by));
		select.selectByVisibleText(text);
	}
	}

