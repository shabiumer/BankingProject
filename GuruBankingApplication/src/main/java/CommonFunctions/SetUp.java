package CommonFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUp {
	
	public static WebDriver driver;
	public static String url = "http://www.demo.guru99.com/V4/";
	
	
	@BeforeTest (alwaysRun=true)
	public void openBrowser() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Automation Jar files\\jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	@AfterTest(alwaysRun=true)
	public void closeBrowser() {

		driver.quit();
	}

}
