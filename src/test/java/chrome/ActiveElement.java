package chrome;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement activeElement= driver.switchTo().activeElement();
		activeElement.sendKeys("something",Keys.TAB,"Password",Keys.ENTER);
	}

}
