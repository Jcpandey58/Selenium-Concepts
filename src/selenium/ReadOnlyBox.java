package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadOnlyBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		String r=driver.findElement(By.xpath("//input[@id='noEdit']")).getAttribute("disabled");
		System.out.println(r);
	}
}
