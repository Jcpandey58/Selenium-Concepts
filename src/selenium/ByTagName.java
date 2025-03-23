package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To get all the l,inks in a page
public class ByTagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement e: links) {
			System.out.println(e.getAttribute("href"));
		}
		driver.quit();
	}
}
