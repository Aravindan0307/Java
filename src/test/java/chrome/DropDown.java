package chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElementById("fruits");
		WebElement fruits= driver.findElementByCssSelector("#fruits");
		Select myfruits= new Select(fruits);
		myfruits.selectByVisibleText("Apple");
		myfruits.selectByVisibleText("Banana");
		System.out.println(myfruits.isMultiple());
		
		WebElement country= driver.findElementById("country");
		Select myCountry= new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry=myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		WebElement heros= driver.findElementById("superheros");
		Select myHeros= new Select(heros);
		boolean isMul= myHeros.isMultiple();
		System.out.println("Is Multiple? "+isMul );
		myHeros.selectByIndex(1);
		myHeros.selectByValue("bt");
		List<WebElement> allHeros=myHeros.getAllSelectedOptions();
		
		myHeros.deselectByIndex(1);
		
		
		
		
		
	}

}
