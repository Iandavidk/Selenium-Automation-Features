package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//input[name='group1']"));
		
		System.out.println(list.size());
		
		for (WebElement e: list) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
			
			if(e.getAttribute("value").equals("Cheese")) {
				e.click();
			}
		}
		
		System.out.println("----------------------------");
		for (WebElement e: list) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
		}
	}
}
