package GuviScripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class policyBazaarLogin {
	WebDriver d;
	
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		d.get("https://www.policybazaar.com/"); // Launch the browser
		
		assertEquals(d.getTitle(),"Insurance - Compare & Buy Insurance Plans – Health, Term, Life, Car"); // Verify the page title 
		
		d.findElement(By.linkText("Sign in")).click(); // Click in Signin button
		
		Thread.sleep(2000); // Page idle for 2 seconds
		
		d.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("90123456789"); // Entering Valid mobile number
		
		d.findElement(By.linkText("Sign in with Password")).click(); // Clicking on Sign in with Password
		
		d.findElement(By.id("central-login-password")).sendKeys("012345"); // Enter the Valid password
		
		d.findElement(By.id("login-in-with-password")).click();// Click on Log in with Password
		
		
		d.findElement(By.cssSelector(".userprofile")).click(); // click on Myaccount option
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(.,'Sign out')]")).click(); // Click on Signout to logout the account
		
		Thread.sleep(2000);

		d.quit(); // Close the browser
	}

