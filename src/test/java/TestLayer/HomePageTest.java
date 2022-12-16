package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

@Test(groups = { "HomePage", "Regression" }, dependsOnGroups = { "LoginPage" })
public class HomePageTest extends BaseClass {
	private HomePage homepage;

	@Test(priority = 1)
	public void validateHomePageTitle() {
		homepage = new HomePage();
		Assert.assertEquals("Cogmento CRM", homepage.captureHomePageActualTitle());
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		Assert.assertEquals(true, homepage.captureHomePageActualUrl().contains("cogmento"));
	}

	@Test(priority = 3)
	public void validateHomePageLogo() {
		Assert.assertEquals(true, homepage.checkLogoDisplayedStatus());
	}

	@Test(priority = 4)
	public void validateHomePageLoggedUsername() {
		Assert.assertEquals(true, homepage.captureLoggedUsername().contains("Praful"));
	}


}
