package pompackage;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.Baseclass;

public class Searchpage extends Baseclass{
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbar;
	
	@FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']")
	WebElement product;
	
	@FindBy(xpath="//div[@class='s-suggestion s-suggestion-ellipsis-direction']" )
	WebElement catgorySelect;
	
	
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbttn;
	
	@FindBy(css ="a.s-pagination-item:nth-child(4)")
	WebElement nextpage;
	
	
	
	public Searchpage() {
	
	PageFactory.initElements(driver, this);
}
	
	public void fulltextmethod(String prdname)  {
		searchbar.clear();	
		searchbar.sendKeys(prdname);
		
		searchbttn.click();
	}
		public void addtocart() {
			product.click();

	
		
		
	}
	public String descriptionmethod(String productdes) {
		searchbar.clear();
		searchbar.sendKeys(productdes);
		searchbttn.click();
		return product.getText();
		
	}
	public void patialtextmethod(String partial) {
		searchbar.clear();
		searchbar.sendKeys(partial);
		
	    searchbttn.click();
	}
   public String seachbycatgory(String catText) {
	   searchbar.clear();
	   Select select= new Select(catgorySelect);
	   
	select.selectByVisibleText(catText);
	   searchbttn.click();
	return catText;
	   
   }
   public void nextpage(String product) throws InterruptedException {
	   searchbar.clear();
	   searchbar.sendKeys(product);
	   searchbttn.click();
	   Thread.sleep(3000);
	   nextpage.click();
	
	
   }
   
}
