package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveToMultipleElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");
		WebElement book=driver.findElement(By.xpath("//a[contains(.,'Book')]"));
		WebElement comp=driver.findElement(By.xpath("//a[contains(.,'Computers')]"));
		WebElement elec=driver.findElement(By.xpath("//a[contains(.,'Electroni')]"));
		WebElement Apparel=driver.findElement(By.xpath("//a[contains(.,'Apparel')]"));
		WebElement digi=driver.findElement(By.xpath("//a[contains(.,'Digital ')]"));
		WebElement jewel=driver.findElement(By.xpath("//a[contains(.,'Jewel')]"));
		WebElement gift=driver.findElement(By.xpath("//a[contains(.,'Gift Car')]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(book).pause(Duration.ofSeconds(1)).moveToElement(comp).pause(Duration.ofSeconds(1)).moveToElement(elec).pause(Duration.ofSeconds(1)).moveToElement(Apparel).pause(Duration.ofSeconds(1)).moveToElement(digi).pause(Duration.ofSeconds(1)).moveToElement(jewel).pause(Duration.ofSeconds(1)).moveToElement(gift).perform();
	}
}
