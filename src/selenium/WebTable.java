package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumAssignment.linktxtassnmt;

public class WebTable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table =driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement h : headers) {
			String headtext=h.getText();
			System.out.println(headtext);
		}
		List<WebElement> allRows = driver.findElements(By.cssSelector("tbody tr"));
		int size=allRows.size();
		System.out.println(size);
		
		for (WebElement row : allRows) {
			List<WebElement> col=row.findElements(By.tagName("td"));
			WebElement first= col.get(0);
			System.out.println(first.getText());
			}
		
	}
}
