package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
//		driver.switchTo().frame(1);
//		driver.switchTo().frame(driver.findElement(By.xpath("//button[text()='Try it']")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(500);
		
		Alert W3frm=driver.switchTo().alert();
		W3frm.sendKeys("Selenium Master");
		W3frm.accept();
		String Op=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(Op);			//Hello Selenium Master! How are you today?
	}
}
