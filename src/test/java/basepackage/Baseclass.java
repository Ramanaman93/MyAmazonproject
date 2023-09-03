package basepackage;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.Timeutils;



public class Baseclass {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	public Baseclass() {
		try {
		FileInputStream file= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Amazonproject\\src\\test\\java\\environmentvariables\\config.properties");
	prop.load(file);	
	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
		public static void initiation() throws InterruptedException{
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
				driver= new ChromeDriver();
			}
				else if(browsername.equals("Firefox")) {
					System.setProperty("WebDriver.Firefox.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
					driver= new FirefoxDriver();
				}
				
			
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Timeutils.timepage));
		Thread.sleep(3000);
		
		
		
		
		
		}
		
		public static void screenshots(String Filename) {
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			FileUtils.copyFile(file, new File("C:\\Users\\User\\eclipse-workspace\\Amazonproject\\src\\test\\java\\screenshots\\Screenshots" +Filename+".jpg"));
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		
	
		
	}
}
	
	
	



