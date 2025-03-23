package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
//		WebElement sortys=driver.findElement(By.xpath("//select[@id='products-orderby']"));
//		
//		Select s1=new Select(sortys);
//		s1.selectByIndex(3);
//		
//		WebElement Prod=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
//		Select sel2=new Select(Prod);
//		sel2.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=10&pagesize=4");
//	
		
		WebElement view=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select sel3=new Select(view);
		sel3.selectByVisibleText("List");
//		
	}
}
