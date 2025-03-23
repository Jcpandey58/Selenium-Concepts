package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_prac {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().minimize();

		driver.get("https://www.instagram.com/");

		driver.get("https://www.facebook.com/");

		driver.get("https://www.flipkart.com/");

	}
}
