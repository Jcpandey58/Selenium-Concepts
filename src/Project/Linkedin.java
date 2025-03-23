package Project;

import org.openqa.selenium.By;
import Project.JobApplicaton;
public class Linkedin {
	public void name() {
		
		driver.get("https://www.linkedin.com");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jayavelchellapandi@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Chellam@18");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).submit();
		driver.findElement(By.xpath("//a[@id='ember4056']")).click();
		
	}
}
