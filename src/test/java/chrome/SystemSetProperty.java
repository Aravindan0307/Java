package chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class SystemSetProperty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in");
		driver.quit();
	}

}
