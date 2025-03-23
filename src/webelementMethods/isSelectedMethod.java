package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		boolean R= driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
		System.out.println(R);
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		boolean R1= driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
		System.out.println(R1);
		
	}
}
