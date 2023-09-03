package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Shoppingcart extends Baseclass{
	
	@FindBy(xpath="//span[@class='a-truncate-cut']")
	WebElement productname;
	
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
	WebElement descriptionclick;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addbttn;
	
	@FindBy(id="nav-cart-count")
	WebElement cartclick;
	
	@FindBy(id="a-autoid-1-announce")
	WebElement quantity;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
	WebElement priceproduct;
	
	@FindBy(id="sc-subtotal-label-activecart")
	WebElement totalprice;
	
	
	
	
	public Shoppingcart() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickingondescription() {
		descriptionclick.click();
	}
	public void Addbutton() {
		addbttn.click();
	}
	public void cart() {
		cartclick.click();
	}
	public boolean quantitydisplay() {
		return quantity.isDisplayed();
	}
	public boolean verifyingprice() {
	String price= priceproduct.getText();
	System.out.println(price);
	return totalprice.isDisplayed();
		
	}

}
