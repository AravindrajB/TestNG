package org.automate.testcases;

import java.io.IOException;
import org.automate.assumption.Assumption;
import org.automate.baseclass.BassClass;
import org.automate.dataprovider.DataGenerator;
import org.automate.pageobjectmodel.BookHotelPage;
import org.automate.pageobjectmodel.BookingConfirmationPage;
import org.automate.pageobjectmodel.LoginPage;
import org.automate.pageobjectmodel.SearchHotelPage;
import org.automate.pageobjectmodel.SelectPage;
import org.automate.utility.UtilityFile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTC001 extends BassClass {

	public LoginPage login_object;
	public static SearchHotelPage search_object;
	public static SelectPage select_object;
	public BookHotelPage bookhotel_object;
	public static BookingConfirmationPage bookingconf_driver;

	@Test(dataProvider = "STATIC_DATA", dataProviderClass = DataGenerator.class, priority = 1)
	public void loginTC001(String username, String password) throws IOException

	{
		login_object = new LoginPage(adactin_driver);

		Assumption.loginCheck(adactin_driver);

		login_object.enterUserName(username);

		login_object.enterPassword(password);

		login_object.enterLogin();

		LoginTC001.loginTC002();

	}

	public static void loginTC002() throws IOException

	{
		Assumption.searchHotelCheck(adactin_driver);

		search_object = new SearchHotelPage(adactin_driver);

		search_object.enterLocation();

		search_object.enterHotel();

		search_object.enterRoomType();

		search_object.enterNumberOfRoom();

		search_object.enterCheckInDate("30-08-2023");

		search_object.enterCheckOutDate("31-08-2023");

		search_object.enterAdultPerRoom();

		search_object.enterChildrenPerRoom();

		search_object.enterSearch();

		LoginTC001.selectTC003();

	}

	public static void selectTC003() throws IOException

	{
		Assumption.selectHotelCheck(adactin_driver);

		select_object = new SelectPage(adactin_driver);

		select_object.enterRadioButton();

		select_object.enterContinue();
	}

	@Test(dataProvider = "DYNAMIC_USERDATA", dataProviderClass = DataGenerator.class, priority = 2)
	public void bookhotelTC004(String firstname, String lastname, String address, String ccn, String ccv)
			throws IOException

	{
		Assumption.bookHotelCheck(adactin_driver);

		bookhotel_object = new BookHotelPage(adactin_driver);

		bookhotel_object.enterFirstName(firstname);

		bookhotel_object.enterLastName(lastname);

		bookhotel_object.enterBillingAddress(address);

		bookhotel_object.enterCreditCardNo(ccn);

		bookhotel_object.enterCreditCardType();

		bookhotel_object.enterExpiryDateMonth();

		bookhotel_object.enterExpiryDateYear();

		bookhotel_object.enterCVVNo(ccv);

		bookhotel_object.enterBookNow();

		WebDriverWait wait = new WebDriverWait(adactin_driver, 10); // Adjust the timeout as needed
		wait.until(ExpectedConditions.urlToBe(UtilityFile.getConditions("BOOKING-CONFIRMATION")));

		LoginTC001.bookingconfirmationTC005();
	}

	public static void bookingconfirmationTC005() throws IOException

	{
		Assumption.bookingConfirmationCheck(adactin_driver);

		bookingconf_driver = new BookingConfirmationPage(adactin_driver);

		bookingconf_driver.enterLogout();

		Assumption.logoutTC006(adactin_driver);
	}
}
