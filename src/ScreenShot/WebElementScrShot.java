package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScrShot{
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		WebElement element=driver.findElement(By.xpath("//a[.='Log in']"));
		File source=element.getScreenshotAs(OutputType.FILE);
		File linkImg=new File("F:\\jcpandey\\ecli\\JavaPractice\\ScrShot\\ele.png");
		Files.copy(source, linkImg);
		driver.quit();
	}
}
