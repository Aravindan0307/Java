package chrome;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElementById("fullName").sendKeys("Aravindan Jagadeesan");
		driver.findElementById("join").sendKeys(" person",Keys.TAB);
		String myvalue=driver.findElementById("getMe").getAttribute("value");
		System.out.println(myvalue);
		driver.findElementById("clearMe").clear();
		boolean isEdit=driver.findElementById("noEdit").isEnabled();
		System.out.println(isEdit);
		String isReadOnly=driver.findElementById("noEdit").getAttribute("readonly");
		System.out.println(isReadOnly);
		driver.quit();
		
		
		
		
		
		
	}

}
