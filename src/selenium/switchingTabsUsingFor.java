package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingTabsUsingFor {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("amazon.in");
		dr.switchTo().newWindow(WindowType.TAB);
		dr.get("https:demowebshop.tricentis.com/");
		dr.switchTo().newWindow(WindowType.TAB);
		dr.get("https://instagram.com/");
		Set<String> address = dr.getWindowHandles(); // store all the addresses of tabs in "address"

		for (String s : address) {
			dr.switchTo().window(s);
			if (dr.getCurrentUrl().contains("amazon.in"));
			{
				dr.close();
			}
		}
	}
}
