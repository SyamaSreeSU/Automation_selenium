package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNGBase;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredential() {
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.clickOnSignInButton();
	}

	@Test
	public void verifyUserLoginWithValidUsernameandInvalidPassword() {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("problem-user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}

	@Test
	public void verifyUserLoginWithInvalidUsernameandValidPassword() {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("testuser");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}

	@Test
	public void verifyUserLoginWithInValidCredential() {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}

}
