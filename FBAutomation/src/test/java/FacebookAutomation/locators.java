package FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locators {
	@Test
	public void locator() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("9373017197");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Aisha@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void name() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
           //1. Name
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Aishwarya");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Ingle");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("9373017197");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Aisha@123");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_day")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_month")).sendKeys("Dec");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
	}
	@Test
	public void createAccount() throws InterruptedException {
		System.setProperty("webdriver.xhrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// 2.Id
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_b_Jl")).sendKeys("Aishwarya");
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_d_c4")).sendKeys("Ingle");
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_g_Xo")).sendKeys("9373017197");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Aisha@123");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Dec");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1995");
		Thread.sleep(2000);
		driver.findElements(By.id("u_w_4_zk")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_s_50")).submit();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void tagname() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//3. TagNAme
		WebElement email = driver.findElement(By.tagName("input"));
		email.sendKeys("9373017197");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.tagName("div"));
		pass.sendKeys("Aisha@123");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//4.Class Name
		WebElement email = driver.findElement(By.className("inputtext _55r1 inputtext _1kbt _9ay4 inputtext _1kbt"));
		email.sendKeys("9373017197");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		pass.sendKeys("Aisha@123");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void CreateAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//5. CSS selector
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Aishwarya");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Ingle");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9373017197");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Aisha@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='day']")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='month']")).sendKeys("Dec");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1995");
		Thread.sleep(2000);
	    driver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void linkText_Locator() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//6. linkText
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("9373017197");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Aisha@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void partial_linkText_Locator() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//7.Partial linkText
		driver.findElement(By.name("email")).sendKeys("9373017197");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Aisha@123");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Log In")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void xpath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//8. Xpath 
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aishwarya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ingle");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9373017197");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Aisha@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Dec");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
		Thread.sleep(2000);
		driver.findElements(By.xpath("//input[@value='1']")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
