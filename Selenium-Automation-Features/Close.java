package eCommerceLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']"));
		
		//Closes the browser window it is currently focused on/
		driver.close();
		
		//Closes all instances of the driver object.
		driver.quit();
		
				
	}

}
