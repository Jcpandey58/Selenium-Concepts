package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
	//To register a user in demoWebShop
		driver.findElement(By.cssSelector("a[href='/register'")).click();
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[data-val='true']")).sendKeys("Demo");
		driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("Name");
		driver.findElement(By.cssSelector("input[data-val-required='Email is required.']")).sendKeys("demoqa@test.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		
		
	}
}
