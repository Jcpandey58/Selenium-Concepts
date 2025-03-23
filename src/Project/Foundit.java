package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Foundit {
	public static void name() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.foundit.in/");
		WebElement LoginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		LoginButton.click();
		driver.findElement(By.xpath("//div[contains(text(),'Login via Password')]")).click();
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("6305206071");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jcpandey@58");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement login=driver.findElement(By.xpath("//input[@id='signInbtn']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='signInbtn']")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		login.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'profile_avatar')])[1]")));
		driver.findElement(By.xpath("(//div[contains(@class,'profile_avatar')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'profile_avatar')])[2]")).click();
		driver.findElement(By.xpath("//input[@id='inline-resume']")).sendKeys("C:/Users/jcpan/Downloads/Jayavel Chellapandi (10).pdf");

	}
}
