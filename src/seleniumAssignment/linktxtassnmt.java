package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktxtassnmt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
//		WebElement reglink=driver.findElement(By.linkText("Register"));
//		reglink.click();
//		String regTitle=driver.getTitle();
//		System.out.println(regTitle);
//		Thread.sleep(1500);
//		driver.navigate().back();
//		WebElement login=driver.findElement(By.linkText("Log in"));
//		login.click();
//		driver.navigate().back();
//		WebElement apperels=driver.findElement(By.partialLinkText("Shop"));
//		apperels.click();
		driver.findElement(By.className("search-box-text")).sendKeys("computer");
		driver.findElement(By.className("button-1")).click();
	}
}
