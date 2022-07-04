package eCommerceLive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingElements {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.id("gsc-i-id1")).sendKeys("search by id");
		driver.findElement(By.linkText("Learn Bootstrap")).click();
		driver.findElement(By.name("search")).sendKeys("search by name");
		driver.findElement(By.partialLinkText("Bootstrap")).click();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Learn CSS")) {
				list.get(i).click();
				break;
			}
		}

	}

}
