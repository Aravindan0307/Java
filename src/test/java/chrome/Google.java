package chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		//WebElement log=driver.findElement(By.xpath("//span[text()='Login']"));
		//WebElement mail=driver.findElement(By.id("email"));
		//mail.sendKeys("selenium");
		//Actions s= new Actions(driver);
		//s.moveToElement(log).perform();
		//s.doubleClick(mail).perform();
		//s.contextClick(mail).build().perform();
		
		//Robot r= new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyRelease(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_V);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_V);
		
		WebElement log=driver.findElement(By.xpath("//button[text()='Log in']"));
		Actions s= new Actions(driver);
		//s.sendKeys(mail,"selenium").build().perform();
		s.click(log).perform();
		
		
		
		
		

		
		
		
		

		
	}

}
