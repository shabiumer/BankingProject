package CommonFunctions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUp {
	
	public static WebDriver driver;
	public static String url = "http://www.demo.guru99.com/V4/";
	public static String Browser = "firefox";
	
	@BeforeTest (alwaysRun=true)
	public void openBrowser() {
		
		if (Browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation Jar files\\jar files\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Shoaib");
			driver = new ChromeDriver(options);
			
		}
		else {
		System.setProperty("webdriver.gecko.driver","C:\\Automation Jar files\\jar files\\geckodriver.exe");
		
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("shabi");
		dc.setCapability(FirefoxDriver.PROFILE, myprofile);
		driver = new FirefoxDriver(dc);
		
		}
		
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
