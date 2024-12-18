package sensibull;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import abstractComponents.Components;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.FutPage;
import pageObjects.LoginPage;
import pageObjects.StrategyPage;
import pageObjects.atTheMoney;
import utility.baseClass;

public class Trade_Test extends baseClass {

	StrategyPage sp = new StrategyPage(driver);
	Components Components = new Components(driver);
	atTheMoney atTheMoney ;
	String centralAmount;
//	@Test
	public void strategyBuilder() throws IOException, InterruptedException {
		
		LoginPage lp = launchapp();
	Thread.sleep(2000);
	lp.clickLogin();
	sp = lp.userLogin("XH5750", "Denise@94");
	Thread.sleep(15000);
	sp.section_Button();
	
	System.out.println("Total Size"+sp.buysize());
	Thread.sleep(2000);
	sp.addTrade("2", "3"); 
	}
	
@Test
  public void automate_atTheMoney() throws IOException, InterruptedException, TimeoutException {
	
	  LoginPage lp = launchapp();
		Thread.sleep(2000);
		lp.clickLogin();
		sp = lp.userLogin("XH5750", "Tatsat@2303");
		Thread.sleep(15000);
		//sp.section_Button();
		Thread.sleep(3000);
		driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol=RELIANCE");
		//lp.goTo();
		sp.section_Button();
		Actions act = new Actions(driver);
		atTheMoney = new atTheMoney(driver);
	//	System.out.println(atTheMoney.stockValue());

		atTheMoney.clickStrike_s("1500", "50", null, "100" , null);
		atTheMoney.clickStrike_s("1480", "50", null, "130" , null);
		atTheMoney.clickStrike_s("1460", "50", null, null , "120");
		
//		
		atTheMoney.clickStrike_s("1450", "60", null , "30" , null);
		atTheMoney.clickStrike_s("1440", null, "55" , "35" , null);
		atTheMoney.clickStrike_s("1420", "60", null , "30" , null);
		atTheMoney.clickStrike_s("1410", "60", null , "30" , null);

   atTheMoney.clickStrike_s("1360", "50", null, null , "120");
   atTheMoney.clickStrike_s("1330", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1320", null, "55" , "35" , null);
	
	atTheMoney.clickStrike_s("1280", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1260", null, "55" , "35" , null);
	
	atTheMoney.clickStrike_s("1240", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1230", "89", null , "35" , null);
	atTheMoney.clickStrike_s("1220", null, "80" , null , "55");
	atTheMoney.clickStrike_s("1210", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1190", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1180", null, "55" , "35" , null);
//	atTheMoney.clickStrike_s("1120", "55", null , "35" , null);
//	atTheMoney.clickStrike_s("1080", null, "55" , "35" , null);



//	FutPage fut = new FutPage(driver);
//	fut.rowText();
	
	

	
		 
		 
		 

		 } 
	 
 }


//







