package org.automate.pageobjectmodel;

import java.io.IOException;
import org.automate.baseclass.BassClass;
import org.automate.utility.UtilityFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchHotelPage {

	public WebDriver search_driver;

	public SearchHotelPage(WebDriver driver)

	{
		this.search_driver = driver;
	}

	public void enterLocation() throws IOException

	{
		WebElement location = search_driver.findElement(By.xpath(UtilityFile.getXpath("LOCATION")));
		BassClass.getDropDown(location, UtilityFile.getXpathValues("LOCATION-VALUE"));
	}

	public void enterHotel() throws IOException

	{
		WebElement hotel = search_driver.findElement(By.xpath(UtilityFile.getXpath("HOTELS")));
		BassClass.getDropDown(hotel, UtilityFile.getXpathValues("HOTELS-VALUE"));
	}

	public void enterRoomType() throws IOException

	{
		WebElement roomtype = search_driver.findElement(By.xpath(UtilityFile.getXpath("ROOM-TYPE")));
		BassClass.getDropDown(roomtype, UtilityFile.getXpathValues("ROOM-TYPE-VALUE"));
	}

	public void enterNumberOfRoom() throws IOException

	{
		WebElement numberofroom = search_driver.findElement(By.xpath(UtilityFile.getXpath("NUMBER-OF-ROOMS")));
		BassClass.getDropDown(numberofroom, UtilityFile.getXpathValues("NUMBER-OF-ROOMS-VALUE"));
	}

	public void enterCheckInDate(String date) throws IOException

	{
		WebElement checkindate = search_driver.findElement(By.xpath(UtilityFile.getXpath("CHECK-IN-DATE")));
		checkindate.sendKeys(date);
	}

	public void enterCheckOutDate(String date) throws IOException

	{
		WebElement checkoutdate = search_driver.findElement(By.xpath(UtilityFile.getXpath("CHECK-OUT-DATE")));
		checkoutdate.sendKeys(date);
	}

	public void enterAdultPerRoom() throws IOException

	{
		WebElement adultperroom = search_driver.findElement(By.xpath(UtilityFile.getXpath("ADULT-PER-ROOM")));
		BassClass.getDropDown(adultperroom, UtilityFile.getXpathValues("ADULT-PER-ROOM-VALUE"));
	}

	public void enterChildrenPerRoom() throws IOException

	{
		WebElement childrenperroom = search_driver.findElement(By.xpath(UtilityFile.getXpath("CHILDREN-PER-ROOM")));
		BassClass.getDropDown(childrenperroom, UtilityFile.getXpathValues("CHILDREN-PER-ROOM-VALUE"));
	}

	public void enterSearch() throws IOException

	{
		WebElement search = search_driver.findElement(By.xpath(UtilityFile.getXpath("SEARCH-BUTTON")));
		search.click();
	}

	public void enterReset() throws IOException

	{
		WebElement reset = search_driver.findElement(By.xpath(UtilityFile.getXpath("RESET-BUTTON")));
		reset.click();
	}
}
