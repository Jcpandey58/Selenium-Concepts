package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class targeting {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com");
//		WebElement searchbox=driver.findElement(By.id("small-searchterms"));
//		searchbox.sendKeys("computer");
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://facebook.com");
//		WebElement un=driver.findElement(By.name("email"));
//		WebElement pwd=driver.findElement(By.name("pass"));
//		un.sendKeys("jcpandey");
//		pwd.sendKeys("1234");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://demowebshop.tricentis.com");
//		driver.findElement(By.linkText("Register")).click();
		
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com");
		
	}

}
