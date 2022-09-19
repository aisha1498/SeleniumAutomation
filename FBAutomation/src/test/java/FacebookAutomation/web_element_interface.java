package FacebookAutomation;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class web_element_interface {
		@Test
		public void clearMethodofwebelement() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//1. Clear method
			driver.findElement(By.id("email")).sendKeys("Aisha");
			Thread.sleep(2000);
			driver.findElement(By.id("email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("");
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public static void removeValuefromUsernameWithoutClearMethod() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("Aishwarya");
			Thread.sleep(2000);
			String value = driver.findElement(By.id("email")).getAttribute("value");
			System.out.println("Value present inside the text box is : " + value);
			driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public static void Click() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//3.click method
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9373017197");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Aish@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public static void getText() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//4.get text method
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			Boolean bool = login.isDisplayed();
			System.out.println(bool);
			String text = login.getText();
			System.out.println(text);
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public void getLocationMethodofwebelement() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//5. get location method
			WebElement email = driver.findElement(By.id("email"));
			int mailx = email.getLocation().getX();
			int maily = email.getLocation().getY();
			System.out.println("email x coordinate :" + mailx);
			System.out.println("email y coordinate :" + maily);
			driver.findElement(By.id("pass"));
			int passx = email.getLocation().getX();
			int passy = email.getLocation().getY();
			System.out.println("password x coordinate :" + passx);
			System.out.println("password y coordinate :" + passy);
			driver.close();
		}
		@Test
		public static void getAttribute() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//6.get attribute method
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			Boolean bool = login.isDisplayed();
			System.out.println(bool);
			String attribute = login.getAttribute("name");
			System.out.println(attribute);
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public void verifyColourOfErrormessageonFBloginPage() {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			//7. get css value method
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			WebElement errMsg = driver.findElement(By.xpath("//button[text()='Log In']"));
			String errtext = errMsg.getText();
			System.out.println("error message is :" + errtext);
			String c = errMsg.getCssValue("color");
			System.out.println("hexadecimal format : " + c);
			if (c.equals("#ce0100")) {
				System.out.println("Error message is in red color");
			} else {
				System.out.println("Error message is in red color");
			}
			String fontSize = errMsg.getCssValue("font-size");
			String fontWeight = errMsg.getCssValue("font-weight");
			System.out.println("Size of the font is :" + fontSize);
			System.out.println("Weight of the font is :" + fontWeight);
			driver.close();
		}
		@Test
		public static void getRect() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//8. get Rect method
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			Boolean bool = login.isDisplayed();
			System.out.println(bool);
			///Dimension rect = login.getRect().getDimension();
			//System.out.println(rect);
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public static void getTagName() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//9.get tagname method
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			Boolean bool = login.isDisplayed();
			System.out.println(bool);
			String tag = login.getTagName();
			System.out.println(tag);
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public static void EnterTextintoFocussedElement() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
            //10. switch to method
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.switchTo().activeElement().sendKeys("9373017197");
			driver.close();
		}
		@Test
		public static void submitMethod() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//11.submit method
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
			driver.findElement(By.name("websubmit")).submit();
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public void isSelectedMethodofwebelement() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//12. is selected method
			WebElement email = driver.findElement(By.id("email"));
			if (email.isSelected()) {
				System.out.println("email text box is selected");
			} else {
				System.out.println("email text box is not selected");
			}
			WebElement password = driver.findElement(By.id("pass"));
			if (password.isDisplayed()) {
				System.out.println("password text box is selected");
			} else {
				System.out.println("password text box is not selected");
			}
		}
		@Test
		public void isEnabledMethodofwebelement() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//13.IsEnabled method
			WebElement email = driver.findElement(By.id("email"));
			if (email.isEnabled()) {
				System.out.println("email text box is enabled");
			} else {
				System.out.println("email text box is disabled");
			}
			WebElement password = driver.findElement(By.id("pass"));
			if (password.isDisplayed()) {
				System.out.println("password text box is enabled");
			} else {
				System.out.println("password text box is disabled");
			}
		}
		@Test
		public void isDisplayedMethodofwebelement() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			// 14.get displayed
			WebElement email = driver.findElement(By.id("email"));
			if (email.isDisplayed()) {
				System.out.println("email text box is displayed");
			} else {
				System.out.println("email text box is not displayed");
			}
			WebElement password = driver.findElement(By.id("pass"));
			if (password.isDisplayed()) {
				System.out.println("password text box is displayed");
			} else {
				System.out.println("password text box is not displayed");
			}
		}
}		
