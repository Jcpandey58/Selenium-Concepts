package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTAB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://linkedin.com/in/jayavelchellapandi/");
		String lnkd=driver.getWindowHandle();
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.in/");
		String amz=driver.getWindowHandle();
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://meesho.com");
		String msho=driver.getWindowHandle();
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com");
		String DWS=driver.getWindowHandle();
		driver.switchTo().window(lnkd);
		Thread.sleep(1000);
		driver.switchTo().window(msho);
		Thread.sleep(1000);
		driver.switchTo().window(amz);
		Thread.sleep(1000);
		driver.switchTo().window(DWS);
	driver.quit();
	
	}

}