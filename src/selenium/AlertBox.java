package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		// Simple Alert Box
		WebElement alert=driver.findElement(By.xpath("//button[contains(@class,'btn-primary') and text()='Alert']"));
		alert.click();
		Thread.sleep(1000);
		Alert al=driver.switchTo().alert();
		al.getText();
		al.accept();
		
		//Confirm Box
		WebElement Confirm=driver.findElement(By.xpath("//button[contains(@class,'btn-primary') and @onclick='myDesk()']"));
		Confirm.click();
		Alert ConfBx=driver.switchTo().alert();
		ConfBx.dismiss();
		
		//Prompt Box
		WebElement Prompt=driver.findElement(By.xpath("//button[contains(@class,'btn-primary') and @onclick='myPromp()']"));
		Prompt.click();
		Alert prompBx=driver.switchTo().alert();
		prompBx.sendKeys("Dummy");
		prompBx.accept();
	}
}
