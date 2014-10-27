package KWS.prepare;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoMan {
	public static Logger logger = Logger.getLogger(autoMan.class.getName());
	int waitTime = 120;

	public void getUrl(String url) {
		try{
		basePrepare.driver.get(url);
		this.sleep(5000);
		logger.info("Get ["+url+"] successfully");
		}catch(TimeoutException e){
			logger.error("Can't load the ["+url+"] page");
		}
	}

	public String getCurrentUrl() {
		logger.info("Get current page' url");
		return basePrepare.driver.getCurrentUrl();	
	}

	public WebElement getElement(final By by) {
		WebElement element = null;
		try {
			boolean status = new WebDriverWait(basePrepare.driver, waitTime)
					.until(new ExpectedCondition<Boolean>() {

						@Override
						public Boolean apply(WebDriver d) {
							return d.findElement(by).isDisplayed();
						}
					});
			if (status) {
				element = basePrepare.driver.findElement(by);
				logger.info("founded the element [" + by + "] and operate it");
			}
		} catch (TimeoutException e) {
			logger.error("TIME OUT!! " + waitTime
					+ " second(s) has passed,but did not find element [" + by
					+ "]");
		}
		return element;
	}

	public WebElement getElementNoWait(final By by) {
		WebElement element = null;
		try {
			element = basePrepare.driver.findElement(by);
			logger.info("founded the element [" + by + "] and operate");
		} catch (Exception e) {
			element = null;
			logger.error("did not find element [" + by + "]");
		}
		return element;
	}

	public void sleep(int sleepTime) {
		try {
			Thread.sleep(sleepTime);
			logger.info("Wait ["+sleepTime+"] ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectByVisibleText(final By by, String text) {
		try {
			Select select = new Select(getElement(by));
			select.selectByVisibleText(text);
			logger.info("The element [" + text + "] is selected");
		} catch (Exception e) {
			logger.error("did not find element [" + by + text + "]");
		}
	}

	public void switchWindow(String a) {
		try {
			String[] handles = new String[basePrepare.driver.getWindowHandles()
					.size()];
			basePrepare.driver.getWindowHandles().toArray(handles);
			if (a == "next") {
				basePrepare.driver.switchTo().window(handles[1]);
				logger.info("Focused on new window");
			} else {
				basePrepare.driver.switchTo().window(handles[0]);
				logger.info("Returned to main window ");
			}
		} catch (Exception e) {
			logger.error("Can not jump to request window]");
		}
	}
}
