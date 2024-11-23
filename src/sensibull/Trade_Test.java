package sensibull;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import pageObjects.StrategyPage;
import pageObjects.atTheMoney;
import utility.baseClass;

public class Trade_Test extends baseClass {

	StrategyPage sp = new StrategyPage(driver);
	atTheMoney amount = new atTheMoney(driver);
	@Test
	public void strategyBuilder() throws IOException, InterruptedException {
		
		LoginPage lp = launchapp();
	Thread.sleep(2000);
	lp.clickLogin();
	sp = lp.userLogin("XH5750", "Denise@94");
	Thread.sleep(15000);
	driver.get("https://web.sensibull.com/option-strategy-builder?instrument_symbol=RELIANCE");
	amount.stockValue();
	sp.section_Button();
	
	System.out.println("Total Size"+sp.buysize());
	Thread.sleep(2000);
	sp.addTrade("2", "3"); 
	}
	
//@Test
  public void automate_atTheMoney() throws IOException, InterruptedException {
	  try {
	  strategyBuilder();
	  }
	  finally {
	  amount.stockValue();
	  }
	  
	  
  }









}
