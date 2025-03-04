package chrome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/frame");
		WebElement myFrame= driver.findElementByXPath("//iframe[@src='frameUI']");
		driver.switchTo().frame(0);
		driver.findElementByName("fname").sendKeys("aravindan");
		driver.findElementByName("lname").sendKeys("jagadeesan");
		
		driver.switchTo().frame(0);
		driver.findElementByName("email").sendKeys("email");
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys("jagadeesan");
		
		driver.findElementByXPath("//button[text()='Refer the video']");
	}   
	

}
