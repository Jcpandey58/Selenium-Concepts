package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchModification {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("Computer");
		WebElement search=driver.findElement(By.xpath("//input[contains(@class,'button')]"));
		search.click();
		Thread.sleep(2000);
		WebElement searchmodbox =driver.findElement(By.xpath("//input[@id='Q']"));
		searchmodbox.clear();
		searchmodbox.sendKeys("laptop");
		WebElement modsearch=driver.findElement(By.xpath("(//input[contains(@class,'button')])[3]"));
		modsearch.submit();
		
	}
}
