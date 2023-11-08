package basics;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
			//to launch empty chrome
			//ChromeDriver C=new ChromeDriver();
			//Thread.sleep(1000);
			//System.out.println(C.getCurrentUrl());
			
			//To launch empty firefox
			FirefoxDriver fd=new FirefoxDriver();
			Thread.sleep(1000);
			System.out.println(fd.getCurrentUrl());
			

	}

}
