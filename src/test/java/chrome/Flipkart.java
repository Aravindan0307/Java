package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email").sendKeys("aravindanme03@gmail.com");
		driver.findElementByName("password").sendKeys("9787337970");
		driver.findElementByXPath("//button[.='LOGIN']").click();

		
		
	}

}
