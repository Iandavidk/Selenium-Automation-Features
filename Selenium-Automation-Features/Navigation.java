package eCommerceLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.rediff.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}

}
