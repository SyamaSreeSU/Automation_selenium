package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {

	public void verifyDropDown() {

		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		// select.selectByIndex(2);
		// select.selectByValue("sql");
		select.selectByVisibleText("Python");
	}

	public void verifyCheckbox() {

		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}

	public void verifyRadioButton() {

		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='orange']"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());

	}

	public static void main(String[] args) {

		HandlingDropDown drop = new HandlingDropDown();
		drop.initializeBrowser();
		drop.verifyDropDown();
		drop.verifyCheckbox();
		drop.verifyRadioButton();

	}

}
