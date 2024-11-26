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
		sp.section_Button();
		Thread.sleep(3000);
		//driver.get("https://web.sensibull.com/option-strategy-builder?instrument_symbol=RELIANCE");
		atTheMoney = new atTheMoney(driver);
		 centralAmount = atTheMoney.stockValue();
		 System.out.println(centralAmount);
		 try{
			 atTheMoney.waitstoclickcentral();
		 }
		 catch(Exception e) {
			 System.out.println("unableToClick");
		 }
		 finally {
		 Thread.sleep(3000);
		// Components.scrollTable();
		 atTheMoney.scrollToElement();
		 Thread.sleep(3000);
		 atTheMoney.goToCentral();
		 Thread.sleep(2000);
		 atTheMoney.chroBuyClick();
		 sp.call_lot("3");
		 Thread.sleep(2000);
		 sp.chroSell();
		 Thread.sleep(2000);
		// sp.chroselllot("4");
		 atTheMoney.upper_strike();
		 Thread.sleep(3000);
		 atTheMoney.upperBuy();
		 Thread.sleep(2000);
		 sp.call_lot("3");
		 atTheMoney.upperSell();
		 
		
		// sp.chroselllot("4");
		// sp.chroselllot("4");
		 
		 atTheMoney.lower_strike();
		 Thread.sleep(2000);
		 atTheMoney.lowerBuy();
		 
		 sp.call_lot("3");
		 Thread.sleep(2000);
		 atTheMoney.lowersell();
		 Thread.sleep(2000);
		// sp.chroselllot("4");
		 
		 }

		 }
		 
	  //document.querySelector(".sc-czOxJk.jkPetf").scrollDown = 3000

  

 public void automateAtTheMoneyStrike() {
	
	
	}
	 
	 
	 
	 
 }










