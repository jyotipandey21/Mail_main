package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
static WebDriver driver;

	
public static WebDriver launchdriver() {
	
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/gmail/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	return driver;
	
}
	
	
}
