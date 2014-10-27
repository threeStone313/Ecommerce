package KWS.prepare;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basePrepare {
	public static Logger logger = Logger.getLogger(basePrepare.class.getName());
	public static WebDriver driver = null;
	public ITestContext testContext = null;

	// @Parameters({"browser"})

	@BeforeClass
	public void setBrowser(ITestContext context) throws MalformedURLException {
		this.testContext = context;
		String browser = context.getCurrentXmlTest().getParameter("browser");
		try {
			if (browser.equals("firefox")) {
				// System.setProperty("webdriver.firefox.bin","D:\\firefox18\\firefox.exe");
				FirefoxProfile profile = new FirefoxProfile(
						new File(
								"C:\\Users\\swang\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\prm1ngix.default"));
				driver = new FirefoxDriver(profile);
			} else if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Selenium\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				// options.addExtensions(new
				// File("C:\\Users\\swang\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ijaobnmmgonppmablhldddpfmgpklbfh\\1.6.0_0.crx"));
				options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				options.addArguments("test-type", "start-maximized",
						"no-default-browser-check");
				driver = new ChromeDriver(options);
				// driver.manage().window().maximize();
			} else if (browser.equals("remote")) {
				DesiredCapabilities dc = DesiredCapabilities.firefox();// 设置远程启动的浏览器
				driver = new RemoteWebDriver(new URL(
						"http://172.25.34.146:4444/wd/hub"), dc);// URL 远程机的Ip地址
			}
			logger.info("Launch [" + browser + "] successfully");
			testContext.setAttribute("SELENIUM_DRIVER", driver);
			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);// 页面加载的超时时间
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);// 等待页面元素显示的超时时间
		} catch (Exception e) {
			logger.error("Can't launch [" + browser + "]");
		}
	}

	@AfterClass
	public void afterTest() {
		logger.info("Close the browser successfully");
		driver.quit();
	}

}
