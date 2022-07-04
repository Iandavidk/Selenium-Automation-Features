package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		System.out.println(drag.getText());
		
		Actions action = new Actions(driver);
		action.moveToElement(drag).dragAndDropBy(drag, 50, 50).build().perform();

	}

}
