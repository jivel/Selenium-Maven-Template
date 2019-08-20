package mx.com.jimenezlav.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

	private final WebDriver webDriver;

	public GoogleHomePage(WebDriver webDriver) throws Exception {
		this.webDriver = webDriver;
	}

	public GoogleHomePage enterSearchTerm(String searchTerm) {
		webDriver.findElement(By.name("q")).clear();
		webDriver.findElement(By.name("q")).sendKeys(searchTerm);

		return this;
	}

	public GoogleHomePage submitSearch() {
		webDriver.findElement(By.name("btnK")).submit();
		return this;
	}

	public void getLucky() {
		webDriver.findElement(By.name("btnI")).click();
	}

}