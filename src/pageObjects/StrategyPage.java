package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.Components;

public class StrategyPage extends Components {

	 WebDriver driver;
		public StrategyPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this );
			}
@FindBy(xpath="//div[@class='buttonsSection']")
WebElement sec_Button;
@FindBy(css=".sc-gizGLm.iPAxqi.rowHighlight")
List<WebElement> lineItems;
@FindBy(xpath="//div[@class='sc-PfnZo hvZTFK']/following-sibling::div[1]/div/div[2]/button[1]/span")
List<WebElement> Buy_Button;
@FindBy(xpath="(//input[@class='MuiInputBase-input MuiInput-input'])[2]")
WebElement call_lot;
@FindBy(xpath="//span[@class='put']")
WebElement putSection;
@FindBy(css=".sc-PfnZo.frkgVM")
List<WebElement> putlineItems;
@FindBy(xpath="//div[@class='sc-PfnZo frkgVM']/following-sibling::div/div/div/following-sibling::div/button[2]/span")
List<WebElement> sell_Button;
@FindBy(xpath="(//input[@class='MuiInputBase-input MuiInput-input'])[3]")
WebElement putLot;



public void section_Button() {
	sec_Button.click();
}
public int buysize() {
	return Buy_Button.size();
}
public void addTrade(String buy_selection , String sell_selection) throws InterruptedException {
	 for(int k =0 ; k <lineItems .size() ; k++ ) {
		 
		 lineItems.get(k).click();
		  Thread.sleep(2000);
		  Buy_Button .get(k).click();
			 Thread.sleep(3000);
			 //dropdown
			 System.out.println(driver.findElements(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root jss1059']/div[1]")).size());
			 Thread.sleep(3000);
			 call_lot.sendKeys(buy_selection);
			 Thread.sleep(3000);
			 putSection.click();
			 Thread.sleep(3000);
			 putlineItems.get(k).click();
			 Thread.sleep(3000);
			 sell_Button.get(k).click();
		    Thread.sleep(3000);
		   // dropdown
		 //   driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[3]")).clear();
		    putLot.sendKeys(sell_selection);
		  
		  
		  
		  
	  }
}

	}


