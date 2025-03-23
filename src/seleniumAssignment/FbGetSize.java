package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbGetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTB= driver.findElement(By.xpath("//input[@id='email']"));
		Dimension esize =emailTB.getSize();
		System.out.println(esize);
		int eheight=esize.getHeight();
		int ewidth=esize.getWidth();
		
		WebElement pwdTB= driver.findElement(By.xpath("//div[@id='passContainer']"));
		Dimension psize= pwdTB.getSize();
		System.out.println(psize);
		int pheight=esize.getHeight();
		int pwidth=esize.getWidth();
		
		if (eheight==pheight && ewidth==pwidth){
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.quit();
	}
}
