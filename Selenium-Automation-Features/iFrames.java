package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		
		//1st method
		driver.switchTo().frame(0);
		
		//2nd method
		//WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
				//driver.switchTo().frame(frame);
		
		//3rd method
		
		
		//Switch back to original window
		driver.switchTo().defaultContent();
		
		WebElement PageElement = driver.findElement(By.className("entry-title"));
		System.out.println(PageElement.getText());
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
