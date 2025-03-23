package basicRelativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByPartialTextFunction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement Apparellnk = driver.findElement(By.xpath("//a[contains(text(),'Apparel')]"));
		Apparellnk.click();
	}
}
