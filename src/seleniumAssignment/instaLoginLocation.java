package seleniumAssignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaLoginLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		WebElement Username= driver.findElement(By.xpath("(//input[contains(@class,'_aa4b')])[1]"));
		Point Uaxis= Username.getLocation();
		int Ux=Uaxis.getX();
		int Uy=Uaxis.getY();
		System.out.println(Ux);
		System.out.println(Uy);

		WebElement password= driver.findElement(By.xpath("(//input[contains(@class,'_aa4b')])[2]"));
		Point Paxis=password.getLocation();
		int Px=Paxis.getX();
		int Py=Paxis.getY();
		System.out.println(Px);
		System.out.println(Py);
		
		if(Px==Ux) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	}
}
