package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTABS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/"); // opens amazon
		String amz = driver.getWindowHandle(); // fetches tab's address
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/"); // opens demowebshop in a new tab
		String tri = driver.getWindowHandle();// fetches tab's address
		System.out.println(tri);
		driver.switchTo().window(amz); // goes to amazon tab

		System.out.println(driver.getCurrentUrl());
		driver.close();

	}
}
