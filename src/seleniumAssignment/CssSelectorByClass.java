package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorByClass {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com");
		
//		without attribute
		d.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("computer");
	}
}
