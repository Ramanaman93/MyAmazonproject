package testlayer;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Loginpage;

public class LoginTest extends Baseclass{
	Loginpage Log;
	public LoginTest() {
		super();
		
	}
	@BeforeMethod
	public void initialsetup() throws InterruptedException  {
		initiation();
		 Log=new Loginpage();
	}
	
	@Test
	public void validemail() throws InterruptedException   {
		Log.enteremail(prop.getProperty("username"));
		Thread.sleep(3000);
		Log.typepassword(prop.getProperty("pass"));
		
		
		}
	@Test
	public void invalidusername()  {
		Log.enteremail(prop.getProperty("wrongusername"));
		String msg=Log.invalidemail();
		System.out.println(msg);
		
	}
	@Test
	
	public void validemailAndwrongpassword() {
		Log.enteremail(prop.getProperty("username"));
		Log.typepassword(prop.getProperty("wrongpasswrd"));
		String actual=Log.invalidpassword();
		System.out.println(actual);
		Assert.assertEquals(actual, "please enter correct password");
	}
	
	@Test
	public void emptyusername() {
		Log.enteremail("");
		String name=Log.emptyfieldusername();
		System.out.println(name);
		Assert.assertEquals(name, "Enter your email address");
	}
	
	@Test
	public void emptypassword() {
		Log.enteremail(prop.getProperty("username"));
		Log.typepassword("");
		String pass=Log.emptyfiledpass();
		System.out.println(pass);
		Assert.assertEquals(pass, "Enter your password");
		
		
	}
	@Test
	public void Titel() {
		String result= Log.verify();
		System.out.println (result);
		Assert.assertEquals(result, "Amazon Sign In");
		
	}
	
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	


}
