package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Loginpage extends Baseclass {
	@FindBy(css = "#ap_email")
	WebElement emailaddress;
	
	@FindBy(css = "#continue")
	WebElement continuebutton;
	
	@FindBy(css="#ap_password") 
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbttn;
	
	
	@FindBy(id="ap_email")
	WebElement wrongemail;
	
	
	
	@FindBy(id="ap_password")
	WebElement wrongpass;
	
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement emptyusername;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement emptypass;
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	public void enteremail(String username) {
		emailaddress.sendKeys(username);
		continuebutton.click();
		
	}
    
    public Homepage typepassword(String pass) {
		password.sendKeys(pass);
		signinbttn.click();
		return new Homepage();
		
		
	}
    public String invalidemail() {
    	
    	return wrongemail.getText();
    	
    	
    }
    
    public String invalidpassword( ) {
    	return wrongpass.getText();
    	
    }
    public String emptyfieldusername() {
    	return emptyusername.getText();
    }
    public String emptyfiledpass() {
    	return emptypass.getText();
    }
   
    public String verify() {
    	return driver.getTitle();
    	
    }

}
