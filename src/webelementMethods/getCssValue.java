package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement reglink=driver.findElement(By.xpath("//a[text()='Register']"));
		String col= reglink.getCssValue("color");
		System.out.println(col);
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://rgbacolorpicker.com/rgba-to-hex");
//		WebElement rgba= driver.findElement(By.xpath("//input[@id='color-rgba']"));  
//		rgba.clear();  
//		rgba.sendKeys(col);
//		String Hexa= driver.findElement(By.xpath("//div[contains(@class,'cursor-pointer')]")).getText();
//		System.out.println(Hexa);
	}
}
