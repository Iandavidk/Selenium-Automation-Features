package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='Create a new account']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='DOB_Dayef3114ea']"));
		
		
		List<WebElement> option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		
		String element;
		for(int i=0; i<option.size();i++) {
			element = option.get(i).getAttribute("value");
			if(element.equals("25")) {
				option.get(i).click();
			}
			
		}
		
	}

}
