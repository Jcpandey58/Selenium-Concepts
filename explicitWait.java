package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement a = driver.findElement(By.xpath("//input[@id='small-searcherms']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='small-searcherms']")));//negative scenario	
		driver.quit();
//		wait.until(ExpectedConditions.);


	}
}

