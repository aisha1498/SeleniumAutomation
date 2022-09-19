package FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class csslocatorssignup {
		@Test
		public void Startsignup() throws InterruptedException {
	        // Launch Chrome browser {

		System.setProperty("webdriver.chrome.driver","C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");

	// Create object of web driver
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//login 
	driver.findElement(By.cssSelector("#email")).sendKeys("9373017197");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#pass")).sendKeys("Aisha@123");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#loginbutton")).click();
    Thread.sleep(2000);
	driver.close();
    }
 @Test
    public static void CreateAccount() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();// maximizing window
	        driver.findElement(By.partialLinkText("Create New")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#u_3_b_wT")).sendKeys("Aishwarya");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#u_3_d_80")).sendKeys("Ingle");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#u_3_g_k1")).sendKeys("9373017197");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Aisha@123");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#day")).sendKeys("13");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#month")).sendKeys("Dec");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#year")).sendKeys("1995");
	        Thread.sleep(2000);
	        driver.findElements(By.cssSelector("#u_3_4_hT")).get(0).click();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#u_3_s_xN")).click();
	        Thread.sleep(2000);
	        driver.close();
	    }
}

