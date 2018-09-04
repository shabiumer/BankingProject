package LoginPage;

import org.openqa.selenium.By;
import CommonFunctions.SetUp;
import Homepage.HomepageTitleTest;

public class LoginFunction extends SetUp{
	
	public HomepageTitleTest Login() {
		
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys("mngr151888");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("nytaqyp");
		driver.findElement(By.name("btnLogin")).click();
		
		return new HomepageTitleTest();
		
		
	}
	
}
