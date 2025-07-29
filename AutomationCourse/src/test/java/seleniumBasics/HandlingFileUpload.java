package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	
	public void fileUploadUsingSendkeys() {
		
		driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\manik\\eclipse-workspace\\AutomationCourse\\src\\test\\resources\\Syamasree_Javadeveloper.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement button=driver.findElement(By.id("submitbutton"));
		button.click();
	}
	
	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement select=driver.findElement(By.id("pickfiles"));
		select.click();
		StringSelection s=new StringSelection("C:\\Users\\manik\\eclipse-workspace\\AutomationCourse\\src\\test\\resources\\Syamasree_Javadeveloper.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot=new Robot();
        robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {
		
		HandlingFileUpload fileupload = new HandlingFileUpload();
		fileupload.initializeBrowser();
		//fileupload.fileUploadUsingSendkeys();
		try {
		fileupload.fileUploadUsingRobotClass();
		}
       catch (AWTException e) {
			
			e.printStackTrace();
		}
	}

}
