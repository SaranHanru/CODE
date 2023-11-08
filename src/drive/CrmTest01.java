package drive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CrmTest01 {
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
    driver.findElement(By.id("submitButton")).click();
    
    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TYSS");
    
    WebElement dropdown = driver.findElement(By.xpath("//select[@name='industry']"));
    
    Select s=new Select(dropdown);
    s.selectByVisibleText("Healthcare");
    
    driver.findElement(By.xpath("//input[@name='button']")).click();	
}
}
