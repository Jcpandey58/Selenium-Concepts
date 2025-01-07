package Demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathByParentAndChild {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.xpath("//input[@id='pollanswers-2']/parent::li")).click();
		
		driver.findElement(By.xpath("//ul[@class='poll-options']/child::li[2]")).click();
	}
}