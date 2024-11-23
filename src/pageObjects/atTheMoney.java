package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	WebElement allStrike;
	
	public void stockValue() {
		System.out.println(stock.getText());
	}
	
	
}
