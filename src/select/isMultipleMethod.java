package select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Digital")).click();
		WebElement drop1=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(drop1);
		boolean state=s.isMultiple();
		System.out.println(state);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapp.skillrary.com");
		WebElement drp=driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1=new Select(drp);
		boolean state1=s1.isMultiple();
		System.out.println(state1);
	}
}
