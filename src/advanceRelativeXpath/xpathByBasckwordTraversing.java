package advanceRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByBasckwordTraversing {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Dimension a =driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a/../..")).getSize();
		System.out.println(a.getHeight());
	}
}
