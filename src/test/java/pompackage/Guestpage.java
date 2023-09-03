package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Guestpage extends Baseclass {
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbar;
	
	
	@FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']")
	WebElement product;
	
	
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbttn;
	
	
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
	WebElement desproduct;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addbttn;
	
	@FindBy(id="nav-cart-count")
	WebElement cartclick;
	
	
	
	
	public Guestpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addingproduct(String prod) throws InterruptedException  {
		searchbar.clear();
		searchbar.sendKeys(prod);
		searchbttn.click();
		
		desproduct.click();
		Thread.sleep(3000);
		addbttn.click();
		cartclick.click();
	}

}
