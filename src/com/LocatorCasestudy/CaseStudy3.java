package com.LocatorCasestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy3 {

	WebDriver driver;
	String url = "https://www.easycalculation.com/";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void countAllLinks() {
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		
		System.out.println("Number of links: " + linkCount);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
