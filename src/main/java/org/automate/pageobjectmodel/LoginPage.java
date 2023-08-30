package org.automate.pageobjectmodel;

import java.io.IOException;

import org.automate.utility.UtilityFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public WebDriver login_driver;

	public LoginPage(WebDriver driver)

	{
		this.login_driver = driver;
	}

	public void enterUserName(String name) throws IOException

	{
		WebElement username = login_driver.findElement(By.xpath(UtilityFile.getXpath("USERNAME")));
		username.sendKeys(name);
	}

	public void enterPassword(String pass) throws IOException

	{
		WebElement password = login_driver.findElement(By.xpath(UtilityFile.getXpath("PASSWORD")));
		password.sendKeys(pass);
	}

	public void enterLogin() throws IOException

	{
		WebElement login = login_driver.findElement(By.xpath(UtilityFile.getXpath("LOGIN_BUTTON")));
		login.click();
	}

	public void enterForgetPassword() throws IOException

	{
		WebElement forgetpassword = login_driver.findElement(By.xpath(UtilityFile.getXpath("FORGETPASSWORD")));
		forgetpassword.click();
	}

	public void enterNewUser() throws IOException

	{
		WebElement newuser = login_driver.findElement(By.xpath(UtilityFile.getXpath("NEW_USER")));
		newuser.click();
	}
}
