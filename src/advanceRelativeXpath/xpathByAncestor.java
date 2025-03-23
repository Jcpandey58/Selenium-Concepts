package advanceRelativeXpath;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAncestor {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		Point page= driver.findElement(By.xpath("//a[@class='ico-register']/ancestor::div")).getLocation();
		System.out.println(page.getX());
		System.out.println(page.getY());
	}
}
