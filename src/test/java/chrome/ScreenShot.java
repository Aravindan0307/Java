package chrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		File firstSrc= driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./snaps/img.png");
		FileHandler.copy(firstSrc, dest);
		driver.quit();
		
		
		
	}

}
