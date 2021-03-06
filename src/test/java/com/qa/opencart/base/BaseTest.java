package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;

public class BaseTest {

	DriverFactory df;
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		driver = df.init_driver("chrome");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
