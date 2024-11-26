package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.Components;

public class atTheMoney extends Components{

	public WebDriver driver;
	public atTheMoney(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='sc-kOtWFZ fiufgV'])[2]")
	WebElement stock;
	@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span")
	List<WebElement> allStrike;
	@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span[text()='24300']")
	WebElement centralAmount;
	@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span[text()='24250']")
	WebElement upperStrike;
	@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span[text()='24200']")
	WebElement lowerStrike;
	@FindBy(xpath="//tbody/tr[55]/td[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
	WebElement chroBuy;
	@FindBy(xpath="//tbody/tr[54]/td[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
	WebElement chroupperBuy;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[54]/td[5]/div[1]/div[2]/div[1]/div[2]/button[2]/span[1]")
	WebElement chroupperSell;
	@FindBy(xpath="//tbody/tr[53]/td[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]")
	WebElement ChroLowerBuy;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[53]/td[5]/div[1]/div[2]/div[1]/div[2]/button[2]/span[1]")
	WebElement chroLowerSell;
	////body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[53]/td[5]/div[1]/div[2]/div[1]/div[2]/button[2]/span[1]
	////tbody/tr/td[5]/div[1]/div[2]/div[1]/div[2]/button[2]/span[1]
	
	public void lowersell() {
		chroLowerSell.click();
	}
	
	public void lowerBuy() {
		//tbody/tr[53]/td[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]
		ChroLowerBuy.click();
	}
	public void upperSell() {
		chroupperSell.click();
	}
	public void upperBuy() {
		chroupperBuy.click();
	}
	public void goToCentral() {
		
		centralAmount.click();
		
	}
	
	public void lower_strike() {
		lowerStrike.click();
	}
	public void upper_strike() {
		upperStrike.click();
	}
	
	public void centralAmountText() {
	System.out.println(centralAmount.getText());
	}
	public void chroBuyClick() {
		chroBuy.click();
	}
	
	 
	public void waitstoclickcentral() {
		webWait(centralAmount);
	}
	public void strikes() throws InterruptedException {
		for(int i = 0 ; i < allStrike.size() ; i++) {
			if( allStrike.get(i).getText().equals("24300")){
				Thread.sleep(2000);
				allStrike.get(i).click();
				centralAmount.click();
				Thread.sleep(3000);
				StrategyPage StrategyPage = new StrategyPage(driver);
				StrategyPage.addTrade("2", "3");
			}
		}
	}
	
	public void scrollToElement() {
		Actions act = new Actions(driver);
		act.scrollToElement(centralAmount).perform();
	}
	
	public String stockValue() {
		return stock.getText().split(" ")[1];
	}
	
	
}
