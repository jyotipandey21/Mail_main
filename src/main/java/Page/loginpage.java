package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	@FindBy(how= How.ID, using = "identifierId")
	WebElement Username;
	@FindBy(how= How.CLASS_NAME, using = "RveJvd snByac")
	public WebElement Next;
	@FindBy(how= How.CLASS_NAME, using = "password")
	WebElement Pass;
	@FindBy(how= How.CLASS_NAME, using = "VfPpkd-RLmnJb")
	public WebElement next;
	

	public void getpageTitle(String username) {
		Username.sendKeys(username);
	}
	public void Nextone() {
		Next.click();
	}
	public void password(String Password) {
		Pass.sendKeys(Password);
	}
	public void Nextwo() {
		
		next.click();
	}
	
	
	}


