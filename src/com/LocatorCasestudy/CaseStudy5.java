package com.LocatorCasestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy5 {
	
	WebDriver driver;
	String url = "https://www.inmotionhosting.com/";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void countLinks() {
		String title = driver.getTitle();
		int titleCount = driver.getTitle().length();
		
		String currUrl = driver.getCurrentUrl();
//		String expectedUrl = "https://www.inmotionhosting.com/";
		
		System.out.println("Current Url: " + currUrl);
		
		if(currUrl.equals(url)) {
			System.out.println("URL Verified");
		}
		
		else {
			System.out.println("URL Verification Failed");
		}
		
		String pageSource = driver.getPageSource();
		int pageSourceCount = driver.getPageSource().length();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		
		for(WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}

		
		System.out.println("Number of links: " + linkCount);
		System.out.println("Title: " + title);
		System.out.println("Title Count: " + titleCount);
		System.out.println("Length: " + pageSourceCount);
		

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
