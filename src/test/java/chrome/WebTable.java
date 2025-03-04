package chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		WebElement table=driver.findElementById("simpletable");
		List<WebElement> headers=table.findElements(By.tagName("th"));
		for(WebElement header : headers) {
			String text= header.getText();
			System.out.println(text);
		}
		List<WebElement> allrows= table.findElements(By.tagName("tbody tr"));
		int size=allrows.size();
		System.out.println("Row size:"+size);
		if(size ==3) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		for(WebElement row :allrows) {
			List<WebElement> colums= row.findElements(By.tagName("td"));
			WebElement firstColumn= colums.get(0);
			System.out.println(firstColumn.getText()
					);
		}
		
		
		
		driver.quit();
		
	}

}
