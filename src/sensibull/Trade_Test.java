package sensibull;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
  public void automate_atTheMoney() throws IOException, InterruptedException {
	
	  LoginPage lp = launchapp();
		Thread.sleep(2000);
		lp.clickLogin();
		sp = lp.userLogin("XH5750", "Tatsat@2303");
		Thread.sleep(15000);
		//sp.section_Button();
		Thread.sleep(3000);
		driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol=NATIONALUM");
		//lp.goTo();
		sp.section_Button();
		atTheMoney = new atTheMoney(driver);
	//	System.out.println(atTheMoney.stockValue());


    
	atTheMoney.clickStrike("250", "50", null, null , "120");
	atTheMoney.clickStrike("240", "60", null , "30" , null);
	atTheMoney.clickStrike("230", null, "55" , "35" , null);
	atTheMoney.clickStrike("220", "65", null , "45" , null);
	
	
//	atTheMoney.clickStrike("245", null, "80" , "90" , null);
	


//	FutPage fut = new FutPage(driver);
//	fut.rowText();
	
	

	
		 
		 
		 

		 } 
	 
 }


//







