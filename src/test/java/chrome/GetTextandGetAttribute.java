package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandGetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement header= driver.findElementByTagName("h1");
		String text=header.getText();
		System.out.println(text);
		
		
		//String text2= driver.findElementByLinkText("Sign up").getText();
		//System.out.println("Link: +text2");
		
		String cardContent=driver.findElementByClassName("card-content").getText();
		System.out.println(cardContent);
		
		//String attribute= driver.findElementById("join").getAttribute("value");
		//System.out.println(attribute);
		
		driver.quit();
		
		
		
	}

}
