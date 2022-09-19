package FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class starthotspot {
	@Test
	
	 public void statlogin() throws InterruptedException {
	        // Launch Chrome browser {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");

  // Create object of web driver
  WebDriver driver = new ChromeDriver();
  driver.get("https://connect.starthotspot.com/SignIn/");
  Thread.sleep(2000);
  driver.manage().window().maximize();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aisha@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aisha123");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@type='submit']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id='btnSignUp']")).click();
  Thread.sleep(2000);
  driver.close();
}
}
