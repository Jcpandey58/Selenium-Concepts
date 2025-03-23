package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithTxtbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		//to enter any value
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Demo");
		Thread.sleep(1500);
		
		//to find if the textbox is enabled or disabled
		WebElement pwdBox= driver.findElement(By.id("pass"));
		System.out.println("Pwd box is enabled : "+pwdBox.isEnabled());
		Thread.sleep(1500);
		
		//to append a text inside the txtbox with the text
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Name");
		Thread.sleep(1500);
		
		//to get the value present inside the txtbox
		System.out.println(driver.findElement(By.xpath("//*[@id='fname']")).getAttribute("value"));
		
		//to clear the text inside the txtbox
		driver.findElement(By.xpath("//*[@id='fname']")).clear();
		driver.quit();
	}
}
