package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test(priority = -1,invocationCount = 5,enabled = false)
	public void settings() {
		Reporter.log("Settings",true);
	}
	
	@Test()
	public void calls() {
		Reporter.log("Calls",true);
	}
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("Chats",true);
	}

}
