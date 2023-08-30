package org.automate.assumption;

import java.io.IOException;

import org.automate.utility.UtilityFile;
import org.openqa.selenium.WebDriver;

public class Assumption {

	public static void loginCheck(WebDriver driver) throws IOException

	{
		if (driver.getCurrentUrl().equals(UtilityFile.getConditions("EXPECTED_URL")))

		{
			System.out.println("LOGIN-URL-PASS");
		}

		else

		{
			System.out.println("LOGIN-URL-FAIL");
		}
	}

	public static void searchHotelCheck(WebDriver driver) throws IOException

	{
		if (driver.getCurrentUrl().equals(UtilityFile.getConditions("SEARCH_HOTEL_URL")))

		{
			System.out.println("SEARCH-URL-PASS");
		}

		else

		{
			System.out.println("SEARCH-URL-FAIL");
		}
	}

	public static void selectHotelCheck(WebDriver driver) throws IOException

	{
		if (driver.getCurrentUrl().equals(UtilityFile.getConditions("SELECT_HOTEL_URL")))

		{
			System.out.println("SELECT-URL-PASS");
		}

		else

		{
			System.out.println("SELECT-URL-FAIL");
		}
	}

	public static void bookHotelCheck(WebDriver driver) throws IOException

	{
		if (driver.getCurrentUrl().equalsIgnoreCase(UtilityFile.getConditions("BOOK-HOTEL")))

		{
			System.out.println("BOOK-HOTEL-URL-PASS");
		}

		else

		{
			System.out.println("BOOK-HOTEL-URL-FAIL");
		}
	}
	
	public static void bookingConfirmationCheck(WebDriver driver) throws IOException
	
	{
		if (driver.getCurrentUrl().equalsIgnoreCase(UtilityFile.getConditions("BOOKING-CONFIRMATION")))

		{
			System.out.println("BOOKING-CONFIRMATION-URL-PASS");
		}

		else

		{
			System.out.println("BOOKING-CONFIRMATION-URL-FAIL");
		}
	}
	
	public static void logoutTC006(WebDriver driver) throws IOException
	
	{
		if (driver.getCurrentUrl().equalsIgnoreCase(UtilityFile.getConditions("LOGOUT"))) 
		
		{
			System.out.println("LOGOUT-URL-PASS");
		}
		
		else 
		
		{
			System.out.println("LOGOUT-URL-FAIL");
		}
	}
}
