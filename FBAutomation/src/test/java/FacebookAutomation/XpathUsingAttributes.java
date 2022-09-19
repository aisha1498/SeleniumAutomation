package FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;


public class XpathUsingAttributes extends BaseClassFinder{
	@Test
		public void xPath() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Enter the url of facebook application
		driver.get("https://www.facebook.com/");
		//xpath using multiple attributes
		String xp = "//input[@class='textField'][ @id = 'username']";
		Thread.sleep(2000);
		//Enter admin into username text box
		driver.findElement(By.xpath(xp)).sendKeys("admin");
		Thread.sleep(2000);
		//find password element using xpath by attribute and enter manager in to password textbox.
		driver.findElement(By.xpath("//input[@name='jazoest']")).sendKeys("manager");
		Thread.sleep(2000);
		//find an image on the web page whose attributes (src)contains a value called timer
		WebElement clock = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		//store the width value of the clock image into a variable called widthValue
		String widthValue = clock.getAttribute("width");
		//Print the width of the clock image 
		System.out.println("the width is :"+widthValue);
		//Print the height of the clock image
		System.out.println("the height of the clock element is : "+ clock.getAttribute("height"));
		//xpath using text() function
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		//xpath using contains() function and text() function
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.close();
		}
		
}

