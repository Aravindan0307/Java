package chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url= "https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("aravindan@gmail.com");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("1234567");  
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Log"));
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size();i++) {
			WebElement link=links.get(i);
			String text= link.getText();
			System.out.println(text);
		}
		
		
		

	}

}
