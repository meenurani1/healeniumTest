package testCases;

//import org.junit.jupiter.api.Test;

import org.testng.annotations.Test;

import pages.loginPage;
import webFactory.BaseClass;

public class TC_01 extends BaseClass{
	
	loginPage lp;
	
	@Test
	public void loginTest() {
		
		lp=new loginPage(driver);
		lp.enterUserName("meenu.rani@sourcefuse.com");
		lp.enterPassword("Test@12345");
		lp.clickLoginButton();
	}
	
}
