package eCommerceLive;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	static String encodedPassword = "QXBwaXVtMTIz";


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("appautomator@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(getDecodedPassword());
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();		
	}
	
	public static String getDecodedPassword() {
		return new String (Base64.getDecoder().decode(encodedPassword.getBytes()));
	}

}
