package FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebooklogin {
	@Test
	 public void FBlogin() throws InterruptedException {
	        // Launch Chrome browser {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");

     // Create object of web driver
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.findElement(By.name("email")).sendKeys("9373017197");
     Thread.sleep(2000);
     driver.findElement(By.name("pass")).sendKeys("Aisha@123");
     Thread.sleep(2000);
     driver.findElement(By.name("login")).click();
     Thread.sleep(3000);
     driver.close();
	}
	@Test
     public void fbsignup() throws InterruptedException {
    	 
    	 System.setProperty("webdriver.chrome.driver","C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
     
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://www.facebook.com/");
    	 Thread.sleep(2000);
         driver.manage().window().maximize();
         Thread.sleep(2000);
     driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
     Thread.sleep(2000);
     driver.findElement(By.name("firstname")).sendKeys("Aisha");
     Thread.sleep(2000);


     driver.findElement(By.name("lastname")).sendKeys("Ingle");
     Thread.sleep(2000);
     driver.findElement(By.name("reg_email__")).sendKeys("aisha999@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aisha999@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.name("reg_passwd__")).sendKeys("1233456");
     Thread.sleep(2000);
     WebElement dateElement= driver.findElement(By.name("birthday_day"));
     Thread.sleep(2000);
     WebElement monthElement = driver.findElement(By.name("birthday_month"));
     Thread.sleep(2000);
     WebElement yearElement = driver.findElement(By.name("birthday_year"));
     Thread.sleep(2000);

     Select d_Dropdown = new Select(dateElement);
     Select m_Dropdown = new Select(monthElement);
     Select y_Dropdown = new Select(yearElement);

     d_Dropdown.selectByVisibleText("13");

     m_Dropdown.selectByVisibleText("Dec");

     y_Dropdown.selectByVisibleText("1995");
     Thread.sleep(2000);

     driver.findElement(By.xpath("//label[text()='Female']")).click();
     Thread.sleep(2000);
     driver.findElement(By.name("websubmit")).click();
     driver.close();
 }
}
