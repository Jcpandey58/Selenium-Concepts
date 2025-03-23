package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframe1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("file:///C:/Users/jcpan/Downloads/iframe%20(1).html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computer");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.quit();
	}
}
