package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Homepage;
import pompackage.Loginpage;
import pompackage.Searchpage;
import pompackage.Shoppingcart;

public class ShoppingcartTest extends Baseclass {
	Loginpage Log;
	Homepage page;
	Searchpage searchpage;
	Shoppingcart shopping;
	
	
	
	public ShoppingcartTest() {
		super();
		

}
	@BeforeMethod
	public void initialsetup() throws InterruptedException   {
		initiation();
		Log=new Loginpage();
		 page=new Homepage();
		  searchpage= new Searchpage();
		  shopping= new Shoppingcart();
		 
		 Log.enteremail(prop.getProperty("username"));
	    page = Log.typepassword(prop.getProperty("pass"));
	   
	    
	   
	}
	@Test
	public void productinfo() throws InterruptedException {
		searchpage.descriptionmethod(prop.getProperty("description"));
		shopping.clickingondescription();
		Thread.sleep(3000);
		shopping.Addbutton();
	}
	@Test
	
	public void clickingoncart() {
		shopping.cart();
		shopping.quantitydisplay();
	Assert.assertTrue(shopping.verifyingprice());	
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
