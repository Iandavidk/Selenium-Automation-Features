package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath("//*[id='resizable']/div[3]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(resize, 100, 100).build().perform();
		
	}

}
