package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Accountpage;
import pompackage.Addresspage;
import pompackage.Homepage;
import pompackage.Loginpage;
import testdata.ExcelSheet;

public class AddressTest extends Baseclass {
	Loginpage Log;
	Homepage page;
	Accountpage accountpage;
	Addresspage addresspage;
	
	public AddressTest() {
		super();
		

}
	@BeforeMethod
	public void initialsetup() throws InterruptedException  {
		initiation();
		Log=new Loginpage();
		 page=new Homepage();
		 accountpage=new Accountpage();
		 addresspage= new Addresspage();
		 
		 Log.enteremail(prop.getProperty("username"));
	    page = Log.typepassword(prop.getProperty("pass"));
	    page.movetoaccountlink();
	    Thread.sleep(3000);
	   accountpage= page.yourAccount();
	   Thread.sleep(3000);
	  addresspage= accountpage.clickingonAddresspage();;
	}
	
	@Test(priority=1)
	public void AddressfieldTest()  {
		addresspage.Addressiconmethod();
		addresspage.fullnamefield(prop.getProperty("Fullname"));
    	addresspage.phonenofield(prop.getProperty("phnno"));
    	addresspage.Addressfieldmethod(prop.getProperty("Address"));
    	addresspage.citymethod(prop.getProperty("city"));
    	//addresspage.provinceField();
    	addresspage.postalcodemethod(prop.getProperty("postalcode"));
    	addresspage.defaulticonmethod();
    	addresspage.deliverymethod();
    	addresspage.packagemethod();
    	addresspage.addaddress();
    	
    	
    	
	}
	
	@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
		
	}
	
	@Test(priority=1, dataProvider="Details")
	public void excelsheetaddressdata(String Fullname, String Phonenumber, String Address, String City, String Postalcode) throws InterruptedException {
		addresspage.Addressiconmethod();
		addresspage.fullnamefield(Fullname);
		
    	addresspage.phonenofield(Phonenumber);
    	addresspage.Addressfieldmethod(Address);
    	addresspage.citymethod(City);
    	addresspage.postalcodemethod(Postalcode);
    	addresspage.addaddress();
    	Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

	
}
