package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement e:radio) {
			e.click();
			Thread.sleep(1500);
		}
		System.out.println(radio.size());
	}
}
