package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterSample extends Base {

	public void verifyJavaScript() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", ""); // scroll down
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	public static void main(String[] args) {

		JavaScriptExecuterSample javascriptexec = new JavaScriptExecuterSample();
		javascriptexec.initializeBrowser();
		javascriptexec.verifyJavaScript();

	}

}
