package basicRelativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//xpath by attribute
		
		//user registration
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Demo");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("qa1@test.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}