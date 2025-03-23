package advanceRelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentClickAddCart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//div[@class='header-menu']/descendant::a[23]")).click();
		driver.findElement(By.xpath("(//div[@class='product-item'])[1]/child::div[@class='details']/parent::div/descendant::input")).click();
	}
}
