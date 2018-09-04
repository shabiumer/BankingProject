package Homepage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import CommonFunctions.SetUp;
import LoginPage.LoginFunction;

public class HomepageTitleTest extends SetUp{
	
	LoginFunction lf = new LoginFunction();
	HomepageTitle hp = new HomepageTitle();
	
	@Test
	public void loginTest() throws Exception {
		lf.Login();
		String hpTitle = hp.homepageTitle();
		assertEquals(hpTitle, "Guru99 Bank Manager HomePage", "HomePage Title does not match......");
	}

}
