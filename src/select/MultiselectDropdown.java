package select;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com");
		WebElement multi=driver.findElement(By.xpath("//select[@id='cars']"));
	
		Select s=new Select(multi);
		List<WebElement> op=s.getOptions();
		for(WebElement e:op) {
			System.out.println(e.getText());
		}
		int size=op.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++){
			s.selectByIndex(i);
		}
		for(int i=size-1;i>=0;i--) {
			s.deselectByIndex(i);
		}
		for(int i=0;i<size;i++){
			s.selectByIndex(i);
		}
		s.deselectAll();
	}
}
