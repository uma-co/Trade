package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.Components;

public class FutPage extends Components{

	public WebDriver driver;
	String atTheMoney;
	public FutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button//div[text()='Futures']")
	WebElement FutButton;
	@FindBy(xpath="//div[@class='sc-DJfgX hJjmnO']/button[@action='BUY']")
	List<WebElement> FutBuyButton;
	@FindBy(xpath="//div[@class='data']")
	List<WebElement> rowText;
	@FindBy(xpath="//div[@class='sc-DJfgX hJjmnO']/button[@action='SELL']")
	List<WebElement> FutSellButton;
	@FindBy(xpath="//td//p[@class='sc-tkKAw jQrUME']")
	List<WebElement> allElements;
	@FindBy(xpath="//div//input[@class='sc-caVybk krkDcN lot-qty-input']")
	List<WebElement> BuyFuturistic;
	@FindBy(xpath="//div//button[@action='SELL'][@class='sc-knLdlU kgPpkB']")
	WebElement SellFuturistic;
	@FindBy(xpath="//div//button[text()='Done']")
	WebElement DoneButton;


public void done() {
	DoneButton.click();
}
	
public ArrayList<String> monthList() {
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("January");
	list.add("February");
	list.add("March");
	list.add("January");
	list.add("April");
	list.add("March");
	list.add("June");
	list.add("July");
	list.add("August");
	list.add("September");
	list.add("October");
	list.add("November");
	list.add("December");
	return list;
	
}
String value;
public String rowText() {
	FutButton.click();
	for(int i = 0 ; i < allElements.size() ; i++) {
		value =	allElements.get(i).getText().split("16")[0].trim().split(" ")[1].trim();
		System.out.println(value);
		return value;
		
	}
	return value;
	
}
public void FutClick(String currentMonth  , String FutBbButton , String FutSsButton ) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
//	String values = rowText();
	FutButton.click();
	for(int i = 0 ; i < allElements.size(); i++) {
		value =	allElements.get(i).getText().split("16")[0].trim().split(" ")[1].trim();
		if(FutBbButton != null) {
			if(value.equalsIgnoreCase(currentMonth)) {
				FutBuyButton.get(i).click();
				//driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]/div[1]/div[2]/button[1]/p[1]")).click();
				i++;
				
				WebElement buyinput =		driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]/div[1]/div[1]/div[1]/input[1]"));
//				buyinput.sendKeys(Keys.BACK_SPACE);
				
				buyinput.sendKeys(Keys.BACK_SPACE);
				buyinput.sendKeys(FutBbButton);
//				BuyFuturistic.get(i).sendKeys(Keys.BACK_SPACE);
//				BuyFuturistic.get(i).sendKeys(FutBbButton);
//				
//		buyinput.sendKeys(FutBbButton);
		break;
			
			}
			
			
			
		}
		if(FutSsButton != null) {
			
			if(value.equalsIgnoreCase(currentMonth)) {
			FutSellButton.get(i).click();
			i++;
			WebElement sellinput =		driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]/div[1]/div[1]/div[1]/input[1]"));
//			buyinput.sendKeys(Keys.BACK_SPACE);
			
			sellinput.sendKeys(Keys.BACK_SPACE);
			sellinput.sendKeys(FutSsButton);
//			BuyFuturistic.get(i).sendKeys(Keys.BACK_SPACE);
//			BuyFuturistic.get(i).sendKeys(FutBbButton);
//			
//	buyinput.sendKeys(FutBbButton);
	break;
			
		}
			
	}
	
	
	}}}


//}





