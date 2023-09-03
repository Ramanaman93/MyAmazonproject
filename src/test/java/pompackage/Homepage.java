package pompackage;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Homepage extends Baseclass {
	
	@FindBy(css = "#nav-link-accountList-nav-line-1")
	WebElement usernamelabel;
	
	@FindBy(css="#a.nav-action-signin-button:nth-child(2)")
	WebElement dropmenu;
	
	@FindBy(xpath = "//span[text()='Your Account']")
	WebElement yourAccountLink;
	
	@FindBy(css = ("#nav_prefetch_yourorders > span:nth-child(1)"))
	WebElement yourorderslink;
	
	@FindBy(xpath = "//span[text()='Your Recommendations']" )
	WebElement yourRecommendationslink;
	
	@FindBy(xpath = "//span[text()='Sign Out']" )
	WebElement Signoutlink;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public boolean usernamecheck() {
		return usernamelabel.isDisplayed();
		
	}
	public void dropmenulabel() {
	 dropmenu.click();
	}
	public void movetoaccountlink() {
		Actions action = new Actions(driver);
		action.moveToElement(usernamelabel).build().perform();
	}
	public Accountpage yourAccount() {
		yourAccountLink.click();
		return new Accountpage();
		
		
	}
	
	public Orderpage yourOrders() {
		yourorderslink.click();
		
		return new Orderpage();
	}
	public void yourRecommendations() {
		yourRecommendationslink.click();
	}
	public void signout() {
		Signoutlink.click();
	}
	
	
	
	
	

}
