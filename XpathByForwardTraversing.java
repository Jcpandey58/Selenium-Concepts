package advanceRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByForwardTraversing {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a")).click();
		
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("(//div[@class='header-links']/ul/li/a)[3]")).click();
		
	}
}
