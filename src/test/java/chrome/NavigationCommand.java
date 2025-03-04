package chrome;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url=driver.getCurrentUrl();
		System.out.println("Buttonmpage URL "+url);
		Thread.sleep(3000);
		
		driver.findElementById("home").click();
		String homeurl=driver.getCurrentUrl();
		System.out.println("home page URL  "+url);
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("returns to Button"+driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");
		
		Navigation nav= driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		nav.to("");
		
		

	}

}
