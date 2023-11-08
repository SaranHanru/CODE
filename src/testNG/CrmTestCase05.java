package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrmTestCase05 {
	public WebDriver driver;
	
	@BeforeMethod()
	public void openApp() {
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test()
	public void signIn() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
 	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
 	    driver.findElement(By.id("submitButton")).click();
 	    
 	    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TYSS");
	    
	    WebElement dropdown = driver.findElement(By.xpath("//select[@name='accounttype']"));
	    Select s=new Select(dropdown);
        s.selectByVisibleText("Investor");
	    driver.findElement(By.xpath("//input[@name='button']")).click();	
	    WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    Thread.sleep(3000);
	}
	
	@AfterMethod()
	public void closeApp() {
		driver.quit();
	}
}
