package GuviScripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class policyBazaarLogin {
	WebDriver d;
	@BeforeMethod
	public void browserLaunch() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().deleteAllCookies();
		
	}
	@AfterMethod
	public void closeBrowser() {
		d.quit();
	}
	
	@Test
	public void testSetup() throws Exception {
		
		d.get("https://www.policybazaar.com/"); // Launch the browser
		
		assertEquals(d.getTitle(),"Insurance - Compare & Buy Insurance Plans – Health, Term, Life, Car"); // Verify the title
		
		d.findElement(By.linkText("Sign in")).click(); // Click in Signin button
		
		Thread.sleep(2000); // Page idle for 2 seconds
		
		d.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("7013770494"); // Entering mobile number
		
		d.findElement(By.linkText("Sign in with Password")).click(); // Clicking on Sign in with Password
		
		d.findElement(By.id("central-login-password")).sendKeys("niteesh575"); // Enter the password
		
		d.findElement(By.id("login-in-with-password")).click();// Click on Log in with Password
		
		
		d.findElement(By.cssSelector(".userprofile")).click(); // click on Myaccount option
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(.,'Sign out')]")).click(); // Click on Signout to logout the account
		
		Thread.sleep(2000);
	}

}
