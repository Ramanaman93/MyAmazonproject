package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Accountpage;
import pompackage.Homepage;
import pompackage.Loginpage;

public class AccountTest {
	
	
	public class HomeTest extends Baseclass {
		Loginpage Log;
		Homepage page;
		Accountpage accountpage;
		public HomeTest() {
			super();
			

	}
		@BeforeMethod
		public void initialsetup() throws InterruptedException  {
			initiation();
			Log=new Loginpage();
			 page=new Homepage();
			 accountpage=new Accountpage();
			 
			 Log.enteremail(prop.getProperty("username"));
		    page = Log.typepassword(prop.getProperty("pass"));
		    page.movetoaccountlink();
		    Thread.sleep(3000);
		   accountpage= page.yourAccount();
		}
		@Test
		public void AddresspageclickingTest() {
			accountpage.clickingonAddresspage();
			
		}
		@Test
		public void paymentTest() {
			accountpage.paymentmethod();
		}
		@Test
		public void loginAndSecurityTest() {
			accountpage.LoginAndSecurity();
		}
		
		@AfterMethod
		public void close() {
			driver.close();
		}
		
	}
}


