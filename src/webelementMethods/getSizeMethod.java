package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement searchbx= driver.findElement(By.xpath("//input[contains(@id,'small')]"));
		Dimension size =searchbx.getSize();
		System.out.println(size);
		
		int width=size.getWidth();	
		int height=size.getHeight();
		System.out.println(height);
		System.out.println(width);
	
	}
}
