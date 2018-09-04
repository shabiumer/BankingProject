package LoginPageTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import CommonFunctions.SetUp;
import LoginPage.LoginFunction;

public class LoginFunctions extends SetUp{
	
	LoginFunction lf = new LoginFunction();

	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String LpTitle = driver.getTitle();
		assertEquals(LpTitle, "Guru99 Bank Home Page", "Login Page title does not match....");
	}
	
	@Test(priority=2)
	public void loginTest() throws Exception {
		lf.Login();
		String title = driver.getTitle();
		assertEquals(title, "Guru99 Bank Manager HomePage", "HomePage Title does not match......");
	}
}
