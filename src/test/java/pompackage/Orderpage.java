package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Orderpage extends Baseclass {
	
	@FindBy(xpath="//a[@class='a-link-normal']")
	WebElement orderbutton;
	
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	 WebElement last3monthsorder;
	
	
	@FindBy(css="li.page-tabs__tab:nth-child(2) > a:nth-child(1)")
	WebElement BuyAgain;
	
	@FindBy(xpath="//a[@class='a-link-normal']")
     WebElement notyetshipped;
	
	@FindBy(css="li.page-tabs__tab:nth-child(4) > a:nth-child(1)")
	WebElement cancelorder;
	
	public Orderpage() {
	
	PageFactory.initElements(driver, this);
	
}
	
	public void orderbttnclick() {
		orderbutton.click();
	}
	public boolean orderdisplay() {
		return last3monthsorder.isDisplayed();
	}
	public void buyagainbttn() {
		BuyAgain.click();
	}
	public void notyeyshippedbttn() {
		notyetshipped.click();
	}
	public void cancelorderbttn() {
		cancelorder.click();
		
	}
}
