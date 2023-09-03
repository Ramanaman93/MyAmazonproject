package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.Baseclass;

public class Addresspage extends Baseclass {
	
	@FindBy(id="ya-myab-plus-address-icon")
	WebElement Addressicon;
	
	@FindBy(css="#address-ui-widgets-countryCode > span:nth-child(1) > span:nth-child(1)")
	WebElement countrydownfield;
	
	@FindBy(css="#address-ui-widgets-enterAddressFullName")
	WebElement Fullname;
	
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber")
	WebElement phonenumber;
	
	@FindBy(css="#address-ui-widgets-enterAddressLine1")
	WebElement AddressField;
	
	@FindBy(css="#address-ui-widgets-enterAddressCity")
	WebElement cityField;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	WebElement provinceField; 
	
	@FindBy(css="#address-ui-widgets-enterAddressPostalCode")
	WebElement postalcode;
	
	@FindBy(css="#address-ui-widgets-use-as-my-default")
	WebElement defaulticon;
	
	@FindBy(css="div.a-expander-container:nth-child(5) > a:nth-child(1) > span:nth-child(2) > span:nth-child(1)")
	WebElement deliveryoption;
	
	@FindBy(xpath="//span[@class='a-size-base a-text-bold']")
	WebElement packageinfo;
	
	@FindBy(xpath="//span[@class='a-label a-radio-label']")
	WebElement frontdoor;
	
	@FindBy(xpath="//button[@class='a-button-text a-text-center']")
	WebElement housebtn;
	
	
	
	@FindBy(css="#address-ui-widgets-form-submit-button > span:nth-child(1) > input:nth-child(1)")
	WebElement clickbtn;
	
	public Addresspage() {
		PageFactory.initElements(driver, this);
	}
	public void Addressiconmethod() {
		Addressicon.click();
		
	}
	public void fullnamefield(String name) {
		Fullname.sendKeys(name);
	}
	public void phonenofield(String phnno) {
		phonenumber.sendKeys(phnno);
	}
	public void Addressfieldmethod(String address) {
		AddressField.sendKeys(address);
	}
	public void citymethod(String city) {
		cityField.sendKeys(city);
		
	}
	public void provinceField() {
		Select select = new Select(provinceField);
		select.selectByIndex(8);
	}
	public void postalcodemethod(String postal) {
		postalcode.sendKeys(postal);
		
	}
	public void defaulticonmethod() {
		defaulticon.click();
	}
	public void deliverymethod() {
		deliveryoption.click();
		
	}
	public void packagemethod() {
		packageinfo.click();
		housebtn.click();
		
		frontdoor.click();
	}
	public void addaddress() {
		clickbtn.click();
	}
	
}
