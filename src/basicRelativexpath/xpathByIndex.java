package basicRelativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement Digi= driver.findElement(By.xpath(("(//a[contains(text(),'Digital')])[3]")));
		Digi.click();
		
		//Adding the 3rd product in to cart
		
		WebElement Mus2=driver.findElement(By.xpath(("(//input[contains(@value,'Add')])[3]")));
		Mus2.click();
		Thread.sleep(3500);
		WebElement cart=driver.findElement(By.xpath(("(//span[contains(text(),'cart')])[1]")));
		cart.click();
		
	}
}
