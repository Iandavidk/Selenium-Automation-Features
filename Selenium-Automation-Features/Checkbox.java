package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> checkbox = driver.findElements(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		System.out.println(checkbox.size());
		
		for(WebElement e: checkbox) {
			System.out.println(e.isSelected());
			System.out.println(e.getAttribute("value"));
			
			if(e.getAttribute("value").equals("football") || e.getAttribute("value").equals("baseball")) {
				e.click();
			}
		}
		
		System.out.println(".........................");
		for(WebElement e: checkbox) {
			System.out.println(e.isSelected());
			
		}
		
		
	}

}
