package LoginPageTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import CommonFunctions.SetUp;
import LoginPage.LoginFunction;

public class LoginFunctions extends SetUp{

	
	@Test
	public void LoginPageTitleTest() {
		String LpTitle = driver.getTitle();
		assertEquals(LpTitle, "Guru99 Bank Home Page", "Login Page title does not match....");
	}
	
}
