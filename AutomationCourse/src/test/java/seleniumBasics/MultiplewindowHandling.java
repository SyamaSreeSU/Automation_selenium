package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultiplewindowHandling extends Base{
	
	public void verifyWindowHandling() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstwindowhandleid=driver.getWindowHandle();
		System.out.println(firstwindowhandleid);
		WebElement clickbutton=driver.findElement(By.xpath("//a[text()='click Here']"));
		clickbutton.click();
		Set<String> handleids=driver.getWindowHandles();
		Iterator <String> it=handleids.iterator();
		while(it.hasNext()) 
		{
			String currentId=it.next();
			if(!currentId.equals(firstwindowhandleid))
			{
				driver.switchTo().window(currentId);
				WebElement mailid=driver.findElement(By.xpath("//input[@name='emailid']"));
				mailid.sendKeys("syamasree20@gmail.com");
				WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				button.click();
			}
				
		}
		
	}

	public static void main(String[] args) {
		MultiplewindowHandling windowhandling = new MultiplewindowHandling();
		windowhandling.initializeBrowser();
		windowhandling.verifyWindowHandling();
	}

}
