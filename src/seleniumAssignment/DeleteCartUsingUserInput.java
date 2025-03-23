package seleniumAssignment;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCartUsingUserInput {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Digital")).click();
		List<WebElement> addcart=driver.findElements(By.xpath("//input[contains(@value,'Add')]"));
		for(WebElement e: addcart) {
			e.click();
			Thread.sleep(500);
		}
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.manage().window().minimize();
		Scanner scn=new Scanner(System.in);
		String Pname=scn.nextLine();
		int position=scn.nextInt();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='product-name' and contains(.,'"+Pname+"')])["+position+"]/../preceding-sibling::td/input[@name='removefromcart']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	}

}
