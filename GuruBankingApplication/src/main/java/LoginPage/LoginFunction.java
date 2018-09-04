package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunctions.SetUp;

public class LoginFunction extends SetUp{
	
	@FindBy(name="uid")
	public WebElement UserID;
	
	@FindBy(name="password")
	public WebElement Password;
	
	@FindBy(name="btnLogin")
	public WebElement LoginButton;
	
	public LoginFunction() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void Login() {
		
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys("mngr151888");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("nytaqyp");
		driver.findElement(By.name("btnLogin")).click();
		
		
	}
	
}
