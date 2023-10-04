package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void login() throws InterruptedException {

		
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();//Chaining of methods
		Thread.sleep(1000);
	
		
		driver.findElement(By.name("username")).sendKeys("Admin"); //
		 // driver.wait(1000); 
		  WebElement elePwd = driver.findElement(By.name("password"));// elePwd.click();
		  elePwd.sendKeys("admin123");
		  
		  //Submit login button
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		  Thread.sleep(1000);
		  System.out.println("Login successful");
		  
		  
			/*
			 * Select dropDown = new Select(ele); dropDown.selectByVisibleText("Logout");
			 */
		 

		
	}
	@Test
	public void logout() {
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Logout\")]")).click();
		System.out.println("Logout successful");
	}
}
