package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com");
		WebElement multi= driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(multi);
		s.selectByIndex(3);
		s.selectByIndex(5);
		s.selectByIndex(2);
		WebElement selected=s.getFirstSelectedOption();
		System.out.println(selected.getText());
	}
}
