package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dream11.com");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("6305206071");
		driver.findElement(By.xpath("//a[text()='GET APP LINK']")).click();
	}
}
