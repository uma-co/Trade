package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.Components;

public class LoginPage extends Components{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement LoginButton;
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root jss148 MuiButton-contained']/span)[1]")
	WebElement s_button;
	@FindBy(id="userid")
	WebElement username;
	@FindBy(id="password")
	WebElement passWord;
	@FindBy(css="[type='submit']")
	WebElement loginSubmit;
	
	public void goTo() {
		driver.get("https://web.sensibull.com/option-strategy-builder?instrument_symbol= RELIANCE");
	}
    public void clickLogin() throws InterruptedException {
    	LoginButton.click();
    	Thread.sleep(2000);
    	s_button.click();
    }
    public StrategyPage userLogin(String user , String pass) throws InterruptedException {
    	username.sendKeys(user);
    	passWord.sendKeys(pass);
    	loginSubmit.click();
    	Thread.sleep(2000);
        	StrategyPage StrategyPage = new StrategyPage(driver);
    	 return new StrategyPage(driver);
    	
      }
    
    
    
    

}
