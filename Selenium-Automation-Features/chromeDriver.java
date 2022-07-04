package eCommerceLive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
			WebDriver chromeDriver = new ChromeDriver();
			chromeDriver.get("http://www.google.com");
	}

}
