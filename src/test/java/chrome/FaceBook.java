package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url= "https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F";
		driver.get(url);
		driver.manage().window().maximize();
		//WebElement user= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		WebElement user= driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]"));
		
		if(user.isDisplayed()) {
			user.sendKeys("aravindan@gmail.com");
			user.clear();
			user.sendKeys("aravindan123@gmail.com");
		}
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
		
		//String attribute=user.getAttribute("value");
		// System.out.println(attribute);
		 
		
		


}
}