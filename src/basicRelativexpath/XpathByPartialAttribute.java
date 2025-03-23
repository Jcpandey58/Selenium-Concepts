package basicRelativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByPartialAttribute {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com");
		d.findElement(By.xpath("//input[contains(@class,'search-box')]")).sendKeys("computer");
		d.findElement(By.xpath("//input[contains(@class,'button-1')]")).click();
	}
}

