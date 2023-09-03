package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Homepage;
import pompackage.Loginpage;


public class HomeTest extends Baseclass {
	Loginpage Log;
	Homepage page;
	public HomeTest() {
		super();
		

}
	@BeforeMethod
	public void initialsetup() throws InterruptedException  {
		initiation();
		Log=new Loginpage();
		 page=new Homepage();
		 
		 Log.enteremail(prop.getProperty("username"));
	    page = Log.typepassword(prop.getProperty("pass"));
	}
	@Test
	public void usernamecheckTest() {
		boolean b=page.usernamecheck();
		Assert.assertTrue(b);
	
	}
	
	@Test
	public void yourAccountTest() throws InterruptedException {
		page.movetoaccountlink();
		Thread.sleep(3000);
		page.yourAccount();
		
	}
	
	
	@Test
	public void yourOrdersTest() throws InterruptedException {
		page.movetoaccountlink();
		Thread.sleep(3000);
		page.yourOrders();
		
	}
	@Test
	public  void yourRecommendationsTest() throws InterruptedException {
		page.movetoaccountlink();
		Thread.sleep(3000);
		page.yourRecommendations();
	}
	@Test
	public void signoutTest() throws InterruptedException {
		page.movetoaccountlink();
		Thread.sleep(3000);
		page.signout();
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

	
	
	
}
	
