package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test6 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.croma.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Runtime.getRuntime().exec("C:\\Users\\admin\\OneDrive\\Desktop\\calculator.exe");

	}

}
