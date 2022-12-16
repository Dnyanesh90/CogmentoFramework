package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {

	// POM with Page Factory

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Associated Methods for each and every Object.

	public void typeUsername(String uname) {
		UtilsClass.entervalue(username, uname);
	}

	public void typePassword(String pass) {
		UtilsClass.entervalue(password, pass);
	}

	public void clickOnLoginButton() {
		UtilsClass.clickonElement(loginButton);
	}

}
