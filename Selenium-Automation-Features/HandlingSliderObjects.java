package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSliderObjects {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		
		
		
	}

}
