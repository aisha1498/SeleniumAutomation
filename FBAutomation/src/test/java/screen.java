import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class screen {
	@Test
	public void screenshots() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File screenshot = new File("C:\\Users\\ARNAVI\\eclipse-workspace\\FBAutomation\\Screenshot\\capture.png");
		//Files.copy(source, new File("/Screenshots/Screen.png"));
		FileHandler.copy(source,screenshot);
		System.out.println("the Screenshot is taken");
		driver.quit();
		}
}
