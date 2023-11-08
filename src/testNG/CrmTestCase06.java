package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrmTestCase06 {
	public WebDriver driver;
	
	@BeforeMethod()
	public void openApp() {
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test()
	public void signIn() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
 	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
 	    driver.findElement(By.id("submitButton")).click();
 	    
 	    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[text()='TYSS']")).click();
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    
	}
	
	@AfterMethod()
	public void closeApp() {
		driver.quit();
	}

}
