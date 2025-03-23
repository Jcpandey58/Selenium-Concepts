package advanceRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 			NOT WORKING       		NOT WORKING					NOT WORKING						NOT WORKING
 */

public class xpathByEndsWith {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[Ends-with(@class,'r')]"));
	}
}
