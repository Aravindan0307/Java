package chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit");
		List<WebElement> labels= driver.findElementsByTagName("label");
		WebElement lastElement= labels.get(labels.size()-1);
		System.out.println("Last element "+lastElement.getText());
		int size= labels.size();
		if(size ==6) {
			System.out.println("Test case passed");
		}
		else
			System.out.println("failed");
		for (WebElement label : labels) {
			String text = label.getText();
			System.out.println(text);
		
		}
		driver.quit();
	}

}
