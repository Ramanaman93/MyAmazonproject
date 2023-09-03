package testlayer;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;


import pompackage.Homepage;
import pompackage.Loginpage;
import pompackage.Searchpage;


public class SearchTest extends Baseclass {
	Loginpage Log;
	Homepage page;
	Searchpage searchpage;


	
	
	public SearchTest() {
		super();
		

}
	@BeforeMethod
	public void initialsetup() throws InterruptedException   {
		initiation();
		Log=new Loginpage();
		 page=new Homepage();
		  searchpage= new Searchpage();
		 
		 
		 Log.enteremail(prop.getProperty("username"));
	    page = Log.typepassword(prop.getProperty("pass"));
	   
	    
	   
	}
@Test
public void fulltextTest()  {
	searchpage.fulltextmethod(prop.getProperty("product"));
	
}
@Test
public void descriptionTest() {
String result=	searchpage.descriptionmethod(prop.getProperty("description"));
Assert.assertEquals(result, true);
	
}

@Test
public void partialtextTest() {
	searchpage.patialtextmethod(prop.getProperty("partialprd"));
}

@Test
public void nextpageTest() throws InterruptedException {
	searchpage.nextpage(prop.getProperty("product"));
	
	
}

/*@Test
public void catgoryTest() {
	String cat = prop.getProperty("catagory");
	String title=searchpage.seachbycatgory(cat);
	Assert.assertTrue(title.contains(cat));
}*/
@AfterMethod
public void close() {
	driver.close();
}

}
