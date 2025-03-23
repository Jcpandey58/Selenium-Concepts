package Action;

import java.time.Duration;

import javax.naming.directory.SearchControls;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
		WebElement Comp = driver.findElement(By.xpath("//a[contains(.,'Computers')]"));
		Point loc=Comp.getLocation();
		int x =loc.getX();
		int y=loc.getY();
		
		Actions a=new Actions(driver);
		a.moveByOffset(x, y).perform();
		
	}
}
