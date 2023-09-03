package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;

import pompackage.Homepage;
import pompackage.Loginpage;
import pompackage.Orderpage;

public class OrderTest extends Baseclass {
	Loginpage Log;
	Homepage page;
	Orderpage orderpage;
	
	
	
	public OrderTest() {
		super();
}
	@BeforeMethod
	public void initialsetup() throws InterruptedException  {
		initiation();
		Log=new Loginpage();
		 page=new Homepage();
		 orderpage= new Orderpage();
		 
		 
		 Log.enteremail(prop.getProperty("username"));
	    page = Log.typepassword(prop.getProperty("pass"));
	    page.movetoaccountlink();
	    Thread.sleep(3000);
	  orderpage=page.yourOrders();
	
	  
	}
	@Test
	public void orderbtnTest() {
		orderpage.orderbttnclick();
		}
	@Test
	public void buyagainbtnTest() {
		orderpage.buyagainbttn();
	}
	
	@Test
	public void orderdisplayTest() {
	boolean result=orderpage.orderdisplay();
	Assert.assertTrue(result);
	

	}
	@Test
	public void notyetshipped() {
		orderpage.notyeyshippedbttn();
	}
	@Test
	public void cancelorderTest() {
		orderpage.cancelorderbttn();
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
	


}
