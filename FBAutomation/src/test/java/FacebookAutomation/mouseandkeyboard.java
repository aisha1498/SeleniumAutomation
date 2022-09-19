package FacebookAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mouseandkeyboard {
	@Test
	public void facebooklogin() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		//1. Launch the browser
				WebDriver driver = new ChromeDriver();
				//2. enter the url -
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(5000);
				driver.manage().window().maximize();
				Robot robot = new Robot();
				robot.mouseMove(300, 500);
				robot.mouseWheel(3);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				Thread.sleep(2000);
				driver.close();
			}
		}