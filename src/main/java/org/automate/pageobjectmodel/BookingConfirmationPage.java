package org.automate.pageobjectmodel;

import java.io.IOException;
import org.automate.utility.UtilityFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingConfirmationPage {

	public WebDriver confirmation_driver;

	public BookingConfirmationPage(WebDriver driver)

	{
		this.confirmation_driver = driver;
	}

	public void enterSearchHotel() throws IOException

	{
		WebElement search = confirmation_driver.findElement(By.xpath(UtilityFile.getXpath("SEARCH-HOTEL")));
		search.click();
	}

	public void enterMyItinerary() throws IOException

	{
		WebElement itinerary = confirmation_driver.findElement(By.xpath(UtilityFile.getXpath("MY-ITINERARY")));
		itinerary.click();
	}

	public void enterLogout() throws IOException

	{
		WebElement logout = confirmation_driver.findElement(By.xpath(UtilityFile.getXpath("LOGOUT")));
		logout.click();
	}

	public void enterChangePassword() throws IOException

	{
		WebElement changepass = confirmation_driver.findElement(By.xpath(UtilityFile.getXpath("CHANGE-PASSWORD")));
		changepass.click();
	}

	public void enterBookedItinerary() throws IOException

	{
		WebElement bookeditinerary = confirmation_driver
				.findElement(By.xpath(UtilityFile.getXpath("BOOKED-ITINERARY")));
		bookeditinerary.click();
	}
}
