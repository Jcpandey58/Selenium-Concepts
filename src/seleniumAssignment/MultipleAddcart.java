package seleniumAssignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAddcart {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Digital")).click();
		List<WebElement> AddCart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement e: AddCart) {
			e.click();
			Thread.sleep(1000);
		}
		driver.findElement(By.partialLinkText("Shopping")).click();
		List<WebElement> allprice=driver.findElements(By.xpath("//span[@class='product-subtotal']"));
		
//		ArrayList<String> a=new ArrayList<String>();
		double temp=0;
		for(WebElement a:allprice) {
			String price=a.getText();
			double convprice= Double.parseDouble(price);
			if (convprice>temp) {
				temp=convprice;
			}
		}
		System.out.println(temp);
		driver.findElement(By.xpath(("//span[contains(text(),'"+temp+"')])[3]/parent::td/preceding-sibling::td"))).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).submit();
	}
	

}
