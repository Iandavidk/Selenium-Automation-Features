package eCommerceLive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieDriver {

	public static void main(String[] args) {
		
		WebDriver ieDriver = new InternetExplorerDriver();
		ieDriver.get("http://www.google.com");

	}

}
