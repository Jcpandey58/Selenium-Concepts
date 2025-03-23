package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		String RegTxt=	driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
		System.out.println(RegTxt);
		driver.quit();
	}
}
