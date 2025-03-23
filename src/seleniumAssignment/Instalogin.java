package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.findElement(By.name("username")).sendKeys("jcpandey.58");
		driver.findElement(By.name("password")).sendKeys("Dummy");
		driver.findElement(By.className("_acas")).click();
	}
}
