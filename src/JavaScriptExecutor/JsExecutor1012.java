package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecutor1012 {
	@Test
	public  void main() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");
		WebElement element=driver.findElement(By.xpath("//input[@value='Add to cart']"));
		WebElement element1=driver.findElement(By.xpath("//input[@value='Subscribe']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,500)");
//		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//extreme down
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollTop)");//extreme top
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		js.executeScript("arguments[1].scrollIntoView(false)",element,element1);
		
		
	}
}
