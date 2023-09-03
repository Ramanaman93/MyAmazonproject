package utility;



import java.time.Duration;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.Baseclass;

public class Timeutils extends Baseclass{
	
  //  URL url1;
	
	public static int timepage=20;
	


public void navigation(String url) {
	driver.navigate().to("url");
	
	

}
public void explicitywait() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.urlContains(prop.getProperty("url1")));
}
}
