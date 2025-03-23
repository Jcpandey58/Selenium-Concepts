package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		Rectangle locat= searchbox.getRect();
		System.out.println(locat.getX());
		System.out.println(locat.getY());
		System.out.println(locat.getHeight());
		System.out.println(locat.getWidth());
	}
}
