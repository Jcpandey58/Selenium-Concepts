package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isnabledSkillaryDisable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com");
		WebElement disblBox=driver.findElement(By.xpath("//input[@class='form-control']"));
		boolean status=disblBox.isEnabled();
		System.out.println(status);
	}
}
