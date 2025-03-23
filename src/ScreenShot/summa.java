package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class summa {
	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		
	}
}
