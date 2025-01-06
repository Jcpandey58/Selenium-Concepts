package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement Comp = driver.findElement(By.xpath("//a[contains(.,'Computers')]"));
		WebElement elec=driver.findElement(By.xpath("//a[contains(.,'Electronics')]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(Comp).pause(Duration.ofSeconds(2)).moveToElement(elec).perform();
	}
}
