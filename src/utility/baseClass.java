package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class baseClass {

	
		// TODO Auto-generated method stub
				public  static WebDriver driver;	 
				
				
			    public static WebDriver initializeBrowser() throws IOException  {
				Properties prop = new Properties();
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//utility//Browser.properties");
				prop.load(fis);
				String browser = prop.getProperty("browser");
				if(browser.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					
					 driver = new ChromeDriver();
				}
     			 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				return driver;
			    }
			    
			    public String getScreenshot(String testcasename, WebDriver driver) throws IOException {
			    	TakesScreenshot ts =	(TakesScreenshot)driver;
			    	File src = ts.getScreenshotAs(OutputType.FILE);
			    	File path = new File(System.getProperty("user.dir")+"//reports"+testcasename+".png");
			    	FileUtils.copyFile(src, path);
			    	return System.getProperty("user.dir")+"//reports"+testcasename+".png";
			    	
			    	
			    	
			    }
			    @BeforeTest
			    public static LoginPage launchapp() throws IOException  {
			    	driver = initializeBrowser();
			    	LoginPage lp = new LoginPage(driver);
			    	lp.goTo();
			    	return lp;
			   
			    	
			    }
			    @AfterTest
			    public void teardownTest() {
			    	if(driver != null) {
			    		driver.close();
			    	}
				
			    }
	}


