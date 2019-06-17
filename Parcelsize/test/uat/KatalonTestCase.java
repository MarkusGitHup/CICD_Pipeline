package uat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatalonTestCase {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeEach
	public void setUp() throws Exception {
		Thread.sleep(10000);
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.gecko.driver", homeDir + "/data/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		driver = new FirefoxDriver(options);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("http://localhost:8080/ParcelWebserver/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body")).click();
		driver.findElement(By.id("cfg-package-length")).click();
		driver.findElement(By.id("cfg-package-length")).clear();
		driver.findElement(By.id("cfg-package-length")).sendKeys("6");
		driver.findElement(By.id("cfg-package-width")).click();
		driver.findElement(By.id("cfg-package-width")).clear();
		driver.findElement(By.id("cfg-package-width")).sendKeys("10");
		driver.findElement(By.id("cfg-package-depth")).click();
		driver.findElement(By.id("cfg-package-depth")).clear();
		driver.findElement(By.id("cfg-package-depth")).sendKeys("15");
		driver.findElement(By.id("button")).click();
		assertEquals("Groesse: M", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Groesse berechnen'])[1]/following::h4[1]")).getText());
	}

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
