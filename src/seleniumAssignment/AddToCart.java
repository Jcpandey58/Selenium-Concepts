package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Adding a product to cart
		//Used xPath by partial text function and partial attribute value
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement Apparellnk = driver.findElement(By.xpath("//a[contains(text(),'Apparel')]"));
		Apparellnk.click();
		WebElement BluSneaker = driver.findElement(By.xpath("//a[contains(text(),'Sneaker')]"));
		BluSneaker.click();
		WebElement Add = driver.findElement(By.xpath("//input[contains(@value,'cart')]"));
		Add.click();
		WebElement Cart = driver.findElement(By.xpath("//span[contains(text(),'cart')]"));
		Cart.click();	
	}
}
