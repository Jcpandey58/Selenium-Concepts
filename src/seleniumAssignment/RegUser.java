package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegUser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Demo");
//		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Name");
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("demoqa3@test.com");
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@id='register-button']")).submit();
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@class,'register')]")).getText();
		driver.quit();
	}
}
