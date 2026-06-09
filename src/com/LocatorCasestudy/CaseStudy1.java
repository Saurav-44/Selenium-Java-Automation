package com.LocatorCasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy1 {

	WebDriver driver;
	String url = "https://www.login.hiox.com/register?referrer=easycalculation.com";

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void verifyPageTitle() {
		String title = driver.getTitle();
		int pageSourceCount = driver.getPageSource().length();

		System.out.println("Title: " + title);
		System.out.println("Length: " + pageSourceCount);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
