package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.loginpage;
import Util.browser;

public class logintest {
	
	WebDriver driver;
	@Test
	public void validUser() throws InterruptedException {
		
		driver = browser.launchdriver();
		loginpage login = PageFactory.initElements(driver,loginpage.class );
		
		login.getpageTitle("jppan2020");
		
		login.Nextone();
		login.password("Prem123!");
		
		login.Nextwo();
		
	}	
		
		
		
	}
	
	
	
	
	


