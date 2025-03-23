package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com");
		WebElement sneha = driver.findElement(By.xpath("//div[@class='box-body']/ul/li/a"));
		sneha.click();
		WebElement plus= driver.findElement(By.xpath("//button[@id='add']"));
		WebElement minus= driver.findElement(By.xpath("//button[@id='minus']"));
		Actions a=new Actions(driver);
		a.moveToElement(plus).doubleClick().pause(Duration.ofSeconds(1)).doubleClick(minus);
	}
}
