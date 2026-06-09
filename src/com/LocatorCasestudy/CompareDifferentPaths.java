package com.LocatorCasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompareDifferentPaths {
	
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";

	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Test
	public void LocatorsTest() {
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String actualTitle = driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
		
		//validation using if-else
		String expectedTitle = "Logged In Successfully";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("TEST CASE PASSED");
		}
		
		else {
			System.out.println("TEST CASE FAILED");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
