package mx.com.jimenezlav.selenium.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import mx.com.jimenezlav.selenium.config.DriverBase;
import mx.com.jimenezlav.selenium.page.GoogleHomePage;

public class GoogleExampleIT extends DriverBase {

	private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString) {
		return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
	}

	@Test
	public void google_findPageObject_PatternOrAntipattern() throws Exception {
		// Create a new WebDriver instance
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		WebDriver driver = getDriver();

		// And now use this to visit Google
		driver.get("http://www.google.com");
		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");

		GoogleHomePage googleHomePage = new GoogleHomePage(driver);

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		Assert.assertTrue(googleHomePage.enterSearchTerm("Page Object").isDisplayed());
		Assert.assertTrue(googleHomePage.submitSearch().isEnabled());

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, 10, 100);
		wait.until(pageTitleStartsWith("Page Object"));

		Assert.assertTrue(driver.getTitle().contains("Page Object"));

		System.out.println("Page title is: " + driver.getTitle());
	}

}