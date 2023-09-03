package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Guestpage;
import utility.Timeutils;

public class GuestTest extends Baseclass{
	Guestpage guest;
	
	
	
	Timeutils utils;
	
	
	public GuestTest() {
		super();
		

}
	@BeforeMethod
	public void initialsetup() throws InterruptedException   {
		initiation();
		
		
		 guest=new Guestpage();
		 utils= new Timeutils();
		 
		 //driver.navigate().to(prop.getProperty("url1"));
		 
		 utils.navigation(prop.getProperty("url1"));
		
		//utils.explicitywait();
		 //driver.get(prop.getProperty("url1"));
		 
	}
	@Test
	public void addingproductTest() throws InterruptedException {
		guest.addingproduct(prop.getProperty("product"));
		
		 }
	@AfterMethod
	public void close() {
		driver.close();
	}


}
