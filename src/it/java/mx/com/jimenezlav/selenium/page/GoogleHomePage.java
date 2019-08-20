package mx.com.jimenezlav.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

	private final WebDriver webDriver;

	public GoogleHomePage(WebDriver webDriver) throws Exception {
		this.webDriver = webDriver;
	}

	public WebElement enterSearchTerm(String searchTerm) {
		WebElement q = webDriver.findElement(By.name("q"));
		q.clear();
		q.sendKeys(searchTerm);
		return q;
	}

	public WebElement submitSearch() {
		WebElement webElement = webDriver.findElement(By.name("btnK"));
		webElement.submit();
		return webElement;
	}

	public void getLucky() {
		webDriver.findElement(By.name("btnI")).click();
	}

}