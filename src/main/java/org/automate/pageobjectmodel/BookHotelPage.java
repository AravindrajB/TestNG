package org.automate.pageobjectmodel;

import java.io.IOException;
import org.automate.baseclass.BassClass;
import org.automate.utility.UtilityFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookHotelPage {

	public WebDriver bookhotel_driver;

	public BookHotelPage(WebDriver driver)

	{
		this.bookhotel_driver = driver;
	}

	public void enterFirstName(String name) throws IOException

	{
		WebElement firstname = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("FIRST-NAME")));
		firstname.sendKeys(name);
	}

	public void enterLastName(String name) throws IOException

	{
		WebElement lastname = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("LAST-NAME")));
		lastname.sendKeys(name);
	}

	public void enterBillingAddress(String address) throws IOException

	{
		WebElement billingaddress = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("BILLING-ADDRESS")));
		billingaddress.sendKeys(address);
	}

	public void enterCreditCardNo(String num) throws IOException

	{
		WebElement ccn = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("CREDIT-CARD-NO")));
		ccn.sendKeys(num);
	}

	public void enterCreditCardType() throws IOException

	{
		WebElement cct = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("CREDIT-CARD-TYPE")));
		BassClass.getDropDown(cct, UtilityFile.getXpathValues("CREDIT-CARD-TYPE-VALUE"));
	}

	public void enterExpiryDateMonth() throws IOException

	{
		WebElement month = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("EXPIRY-DATE-MONTH")));
		BassClass.getDropDown(month, UtilityFile.getXpathValues("EXPIRY-DATE-MONTH-VALUE"));
	}

	public void enterExpiryDateYear() throws IOException

	{
		WebElement year = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("EXPIRY-DATE-YEAR")));
		BassClass.getDropDown(year, UtilityFile.getXpathValues("EXPIRY-DATE-YEAR-VALUE"));
	}

	public void enterCVVNo(String value) throws IOException

	{
		WebElement cvv = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("CCV-NO")));
		cvv.sendKeys(value);
	}

	public void enterBookNow() throws IOException

	{
		WebElement booknow = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("BOOK-NOW")));
		booknow.click();
	}

	public void enterCancel() throws IOException

	{
		WebElement cancel = bookhotel_driver.findElement(By.xpath(UtilityFile.getXpath("CANCEL")));
		cancel.click();
	}
}
