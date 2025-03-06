package chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElementById("accept").click();
		//Alert alert= driver.switchTo().alert();
		//String text= alert.getText();
		//System.out.println("Simple alert text"+text);
		 //alert.accept();
		
	}

}
