package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Accountpage extends Baseclass{
	
	
	@FindBy(xpath="//h2[contains(text(),'Your Addresses')]")
	WebElement youraddress;
	
	@FindBy(xpath="//h2[contains(text(),'Your Payments')]")
	WebElement yourpayments;
	
	@FindBy(xpath="//h2[contains(text(),'Login & security')]")
	WebElement loginAndSecurity;
	
	public Accountpage() {
		PageFactory.initElements(driver, this);
	
	}
	public Addresspage clickingonAddresspage() {
		youraddress.click();
		return new Addresspage();
		
		}
	public void paymentmethod() {
		yourpayments.click();
		
	}
	public void LoginAndSecurity() {
		 loginAndSecurity.click();
	}
	
	
}
