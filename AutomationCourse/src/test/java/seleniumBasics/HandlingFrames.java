package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void verifyFrames() {

		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totaliframe = driver.findElements(By.tagName("frame1"));
		System.out.println(totaliframe.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames = new HandlingFrames();
		frames.initializeBrowser();
		frames.verifyFrames();
	}

}
