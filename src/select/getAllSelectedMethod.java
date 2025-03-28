package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedMethod {
	public static void main(String[] args) {
			WebDriver  driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapp.skillrary.com");
			WebElement multi=driver.findElement(By.xpath("//select[@id='cars']"));
			Select s=new Select(multi);
			
			s.selectByIndex(2);
			s.selectByIndex(4);
			s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
			List<WebElement>allSelected=s.getAllSelectedOptions();
			for(WebElement e: allSelected) {
				System.out.println(e.getText());
			}
	}
}
