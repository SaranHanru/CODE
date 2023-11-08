package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		//driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Selenium Training'])[2]")).click();

	}

}
