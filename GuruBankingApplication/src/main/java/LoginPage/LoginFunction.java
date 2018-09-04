package LoginPage;

import org.openqa.selenium.By;
import CommonFunctions.SetUp;

public class LoginFunction extends SetUp{
	
	public void Login() { //uid=mngr151888 password=nytaqyp btnLogin
		
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys("mngr151888");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("nytaqyp");
		driver.findElement(By.name("btnLogin")).click();
		
		
	}
	
}
