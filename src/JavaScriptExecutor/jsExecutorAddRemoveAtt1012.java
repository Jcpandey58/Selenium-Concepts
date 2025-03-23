package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutorAddRemoveAtt1012 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement disEle=driver.findElement(By.xpath("//input[@class='form-control']"));
		boolean status1=disEle.isEnabled();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript("arguments[0].removeAttribute('disabled')",disEle);
		//		boolean status2=disEle.isEnabled();
		//		
		//		if (status2) {
		//			System.out.println("Element is Enabled");
		//		}
		//		else {
		//			System.out.println("Element is NotEnabled");

		js.executeScript("document.getElementsByClassName('form-control')[1].value='Selenium'");
		//same for hidden content

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/r.php");
		js.executeScript("document.getElementById('custom_gender').value=");
	}
}
