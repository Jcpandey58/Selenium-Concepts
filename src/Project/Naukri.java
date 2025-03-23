package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void resumeUpload() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("jayavelchellapandi@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Jcpandey@58");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='View']")).click();
		driver.findElement(By.xpath("//ul[@class='collection']/li/following-sibling::li/span[text()='Resume']")).click();
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:/Users/jcpan/Downloads/Jayavel Chellapandi (10).pdf");
		
	}
}
