package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickSendkeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
		WebElement srch = driver.findElement(By.xpath("//input[contains(@id,'small')]"));
		WebElement srchbut= driver.findElement(By.xpath("//input[contains(@class,'search-box')]"));
		Actions a=new Actions(driver);
		a.moveToElement(srch).click().sendKeys("Computer").click(srchbut).perform();
	}
}
