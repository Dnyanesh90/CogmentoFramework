package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

@Test(groups= {"LoginPage","Regression"})
public class LoginPageTest extends BaseClass {
	private LoginPage loginpage;

	@BeforeTest
	public void setUp() {
		BaseClass.iniliazation();
	}

	@Test
	public void validateLoginFunctionality() {
		loginpage = new LoginPage();
		loginpage.typeUsername("prafulp1010@gmail.com");
		loginpage.typePassword("Pr@ful0812");
		loginpage.clickOnLoginButton();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
