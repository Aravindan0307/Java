package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*
		 * WebElement login= driver.findElementByLinkText("Log in");
		 * System.out.println("Login btn: +displayed");
		 */
		
		/*
		 * driver.get("https://letcode.in/edit"); 
		 * WebElement edit=driver.findElementById("noEdit"); 
		 * System.out.println(edit.isEnabled());
		 */		
		
		driver.get("https://letcode.in/radio");
		WebElement remember= driver.findElementByXPath("(//label[@class='checkbox']//in[1])");
		System.out.println(remember.isSelected());
		
		
		
		driver.quit();
	}

}
