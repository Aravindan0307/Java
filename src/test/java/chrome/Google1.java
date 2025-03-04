package chrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Google1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url= "http://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drop=driver.findElement(By.xpath("( //li[@class='placeholder'])[1]"));
		Actions s= new Actions(driver);
		s.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions c= new Actions(driver);
		c.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement drag2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement drop2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions call= new Actions(driver);
		call.dragAndDrop(drag2, drop2).build().perform();
		
		WebElement drag3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions calls= new Actions(driver);
		calls.dragAndDrop(drag3, drop3).build().perform();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\aravi\\eclipse-workspace\\Class\\target\\actions.png");
		FileHandler.copy(src, des);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		


		

	}

}
