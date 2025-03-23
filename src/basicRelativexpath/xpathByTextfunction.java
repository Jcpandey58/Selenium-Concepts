package basicRelativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByTextfunction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		//xpath by textfunction {textmethod}
		WebElement reglink=driver.findElement(By.xpath("//a[text()='Register']"));
		reglink.click();
		
	}
}
