package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		boolean displ= driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		System.out.println(displ);
		//negative scenario
		boolean displ2= driver.findElement(By.xpath("//div[@id='dialog-notifications-success']")).isDisplayed();
		System.out.println(displ);
		
		if(displ2) {
			System.out.println("ElementDisplayed");
		}
		else {
			System.out.println("ElementNotDisplayed");
			
		}
		driver.quit();
	}
}
