package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	@FindBy(xpath="//span[contains(text(),'FUT')]")
	WebElement FutButton;
	@FindBy(xpath="//div[@class='action-buy']/button[@class='MuiButtonBase-root MuiButton-root jss614 MuiButton-outlined']/span")
	List<WebElement> FutBuyButton;
	@FindBy(xpath="//div[@class='data']")
	List<WebElement> rowText;
	@FindBy(xpath="//div[@class='action-sell']/button[@class='MuiButtonBase-root MuiButton-root jss614 MuiButton-outlined']/span")
	List<WebElement> FutSellButton;
	@FindBy(xpath="//div[@class='sc-iyHKyE kAGHCb']/div")
	List<WebElement> allElements;
	
	
	



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

public void rowText() {
	FutButton.click();
	for(int i = 0 ; i <= allElements.size() ; i++) {
		String value =	allElements.get(i).getText().split("24")[0].trim().split(" ")[1].trim();
		System.out.println(value);
		
	}
	
}
//public void FutClick() {
//ArrayList<String> Listofmonth = 	monthList();
//FutButton.click();
//
//	for(int i = 0 ; i <= expiry.size() ; i++) {
//	String value =	rowText.getText().split("24")[0].trim().split(" ")[1].trim();
//	System.out.println(value);
//	
//	List formattedValue = Arrays.asList(value);
//	if(formattedValue.contains(Listofmonth)) {
//	
//		FutBuyButton.get(i).click();
//	
//	}
//	
//			
//			
//		
//	}
//}


}


