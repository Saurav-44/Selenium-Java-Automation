package com.LocatorCasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy2 {

	WebDriver driver;
	String url = "https://www.easycalculation.com/";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void searchCity() {
		String title = driver.getTitle();
		int pageSourceCount = driver.getPageSource().length();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();

		System.out.println("Title: " + title);
		System.out.println("Length: " + pageSourceCount);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
