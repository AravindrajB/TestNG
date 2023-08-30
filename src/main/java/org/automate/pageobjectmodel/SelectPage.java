package org.automate.pageobjectmodel;

import java.io.IOException;
import org.automate.utility.UtilityFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPage {

	public WebDriver select_driver;

	public SelectPage(WebDriver driver)

	{
		this.select_driver = driver;
	}

	public void enterRadioButton() throws IOException

	{
		WebElement radio = select_driver.findElement(By.xpath(UtilityFile.getXpath("RADIO-BUTTON")));
		radio.click();
	}

	public void enterContinue() throws IOException

	{
		WebElement continue_ = select_driver.findElement(By.xpath(UtilityFile.getXpath("CONTINUE-BUTTON")));
		continue_.click();
	}

	public void enterCancel() throws IOException

	{
		WebElement cancel = select_driver.findElement(By.xpath(UtilityFile.getXpath("CANCEL-BUTTON")));
		cancel.click();
	}
}
