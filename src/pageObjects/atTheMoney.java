package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstractComponents.Components;

public class atTheMoney extends Components{

	public WebDriver driver;
	String atTheMoney;
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
	@FindBy(xpath="//div[@class='sc-PfnZo hvZTFK']/following-sibling::div[1]/div/div[2]/button[1]/span")
	List<WebElement> Buy_Button;
	@FindBy(xpath="//div[@class='sc-PfnZo frkgVM']/following-sibling::div/div/div/following-sibling::div/button[2]/span")
	List<WebElement> sell_Button;
	//(//input[@class='MuiInputBase-input MuiInput-input'])[3]
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiInput-input'])[3]")
	WebElement putLot;
	//(//input[@class='MuiInputBase-input MuiInput-input'])[2]
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input']")
	WebElement call_lot;
	@FindBy(xpath="//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']/input")
	WebElement ReliChrocallLot;
	@FindBy(xpath="//div[@class='sc-PfnZo hvZTFK']/following-sibling::div[1]/div/div[2]/button[2]/span")
	List<WebElement> firstSell;
	@FindBy(xpath="//div[@class='sc-PfnZo frkgVM']/following-sibling::div/div/div/following-sibling::div/button[1]/span")
	List<WebElement> secondBuy;
	@FindBy(xpath="//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSelect MuiOutlinedInput-inputSelect']")
	WebElement dropdownbutton;
//	@FindBy(xpath = "//div[@class='MuiPaper-root MuiMenu-paper jss1688 MuiPaper-elevation8 MuiPopover-paper MuiPaper-rounded']/ul/li['"+i+"']")
//	WebElement DropDownValues;
	@FindBy(xpath="//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']")
	WebElement newInput;
//	//div[@class='sc-kLjnrX kySuT']/div/div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']
	
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
	
 
	
	public void scrollTooement() {
		
		Actions act = new Actions(driver);
		act.scrollToElement(centralAmount).perform();
		
	}
	
	public double stockValue() {
	double stockval =  Math.round(Double.parseDouble(stock.getText().split(" ")[1]));
	return stockval;
	}
	
	
	public void newMethod(String atTheMoney , String callLot , String putLotSelction) throws InterruptedException {
		for(int i = 0 ; i < allStrike.size() ; i++) {
//	long stock = stockValue();
			
//			@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span[contains(text(),'"+Money+"']")
//			WebElement Recentralamount;
			WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
			Actions act = new Actions(driver);
			act.scrollToElement(recen).perform();
			if( allStrike.get(i).getText().matches(atTheMoney)){
				Thread.sleep(2000);
				allStrike.get(i).click();
				act.sendKeys(Keys.DOWN).build().perform();
				Thread.sleep(2000);
				Buy_Button.get(i).click();
			//	comp.webWait(ReliChrocallLot);
				Thread.sleep(2000);
			 // scroolingDown();
			  // call_lot.sendKeys(callLot);
				ReliChrocallLot.sendKeys(callLot);
				Thread.sleep(2000);
				sell_Button.get(i).click();
				Thread.sleep(2000);
				 putLot.sendKeys(putLotSelction);
				//Thread.sleep(3000);
				break;
			}
			}
	}
	
	public void methodAdd(String atTheMoney, String callLot , String putLotSelction) {
		for(int i = 0 ; i < allStrike.size() ; i++) {
		WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
		Actions act = new Actions(driver);
		act.scrollToElement(recen).perform();
		if(allStrike.get(i).getText().equals(atTheMoney)) {
			allStrike.get(i).click();
			Buy_Button.get(i).click();
			
			ReliChrocallLot.sendKeys(callLot);
			sell_Button.get(i).click();
			 putLot.sendKeys(putLotSelction);
			 break;
			
		}
			
		}	
	}
	public void meth(String atTheMoney , String CallLot ,String putLotSelction ) {
		for(int i = 0 ; i < allStrike.size() ; i++) {
			WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
			Actions act = new Actions(driver);
			act.scrollToElement(recen).perform();
			if(allStrike.get(i).getText().equals(atTheMoney)) {
				allStrike.get(i).click();
				Buy_Button.get(i).click();
				ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
				driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
			//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
				sell_Button.get(i).click();
				putLot.sendKeys(Keys.BACK_SPACE);
				driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(putLotSelction);
				
			}
			}
				
	}
	
	public void clickStrike(String atTheMoney , String CallBuy ,String CallSell , String PutBuy , String PutSell) throws InterruptedException {
		
		for(int i = 0 ; i < allStrike.size() ; i++) {
			WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
			Actions act = new Actions(driver);
			act.scrollToElement(recen).perform();
			if(allStrike.get(i).getText().equals(atTheMoney)) {
				allStrike.get(i).click();
			
				if(CallSell != null) {
					firstSell.get(i).click();
					//act.sendKeys(Keys.DOWN).build().perform();
					act.scrollToElement(ReliChrocallLot).perform();
					ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
				}
//					if( PutBuy != null) {
//					secondBuy.get(i).click();
//					Thread.sleep(2000);
//					//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//					 putLot.sendKeys(Keys.BACK_SPACE);
//					 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
//					}
				 if(CallBuy != null  ) {
					Buy_Button.get(i).click();
				//	act.sendKeys(Keys.DOWN).build().perform();
					act.scrollToElement(ReliChrocallLot).perform();
					ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallBuy);
				 }
				 if( PutBuy != null) {
						secondBuy.get(i).click();
						Thread.sleep(2000);
						//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
						 putLot.sendKeys(Keys.BACK_SPACE);
						 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
						}
					if(PutSell!= null) {
				//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
					
					sell_Button.get(i).click();
					putLot.sendKeys(Keys.BACK_SPACE);
					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
					
					}}
				}
			}
			
		
		
	
	
//	if(CallSell != null && PutBuy != null) {
//		firstSell.get(i).click();
//		//act.sendKeys(Keys.DOWN).build().perform();
//		act.scrollToElement(ReliChrocallLot).perform();
//		ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
//		secondBuy.get(i).click();
//		 putLot.sendKeys(Keys.BACK_SPACE);
//		 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
//		}
//	else if(CallBuy != null && PutSell!= null ) {
//		Buy_Button.get(i).click();
//	//	act.sendKeys(Keys.DOWN).build().perform();
//		act.scrollToElement(ReliChrocallLot).perform();
//		ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallBuy);
//	//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
//		
//		sell_Button.get(i).click();
//		putLot.sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
//		
//		
//	}
	
	public void altMethod(String atTheMoney , String callLot ,String putLotSelction  ) throws InterruptedException {
			for(int i = 0 ; i < allStrike.size() ; i++) {
////				long stock = stockValue();
//						
////						@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span[contains(text(),'"+Money+"']")
////						WebElement Recentralamount;
						WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
						Actions act = new Actions(driver);
						act.scrollToElement(recen).perform();
						if( allStrike.get(i).getText().equals(atTheMoney)){
							allStrike.get(i).click();
							
							firstSell.get(i).click();
						//	act.sendKeys(Keys.DOWN).build().perform();
							//comp.webWait(ReliChrocallLot);
							
				//	act.scrollToElement(ReliChrocallLot).perform();
							
							
							
							//driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiMenu-paper jss1688 MuiPaper-elevation8 MuiPopover-paper MuiPaper-rounded']/ul/li['"+n+"']")).click();
						//	Thread.sleep(2000);
							//act.scrollToElement(newInput).perform();
						ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
							//newInput.get(i).sendKeys(Keys.BACK_SPACE);
							//newInput.sendKeys(Keys.BACK_SPACE);
							Thread.sleep(2000);
							//ReliChrocallLot.sendKeys(callLot);
							//System.out.println(	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).getText());
						//	newInput.sendKeys(callLot);
							//driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])['"+i+"']")).sendKeys(callLot);
						//	call_lot.sendKeys(callLot);
							driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(callLot);
						//ReliChrocallLot.sendKeys(callLot);
//							ReliChrocallLot.sendKeys(Keys.CLEAR);
//							ReliChrocallLot.sendKeys(callLot);
							
							Thread.sleep(2000);
						//	sell_Button.get(i).click();
							
							secondBuy.get(i).click();
							
						//  scroolingDown();
//						  dropdownbutton.click();
//							driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiMenu-paper jss1688 MuiPaper-elevation8 MuiPopover-paper MuiPaper-rounded']/ul/li['"+no+"']")).click();
						 
						  putLot.sendKeys(Keys.BACK_SPACE);
						  driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(putLotSelction);
						//  putLot.sendKeys(putLotSelction);
						 // driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(putLotSelction);
						//  putLot.sendKeys(putLotSelction);
						  // call_lot.sendKeys(callLot);
							
							//Thread.sleep(2000);
							
							break;
						}
						}
			
		
		}
	public void lastStrike(String atTheMoney ,String callLot , String putLotSelction ) throws InterruptedException {
			
			for(int i = 0 ; i < allStrike.size() ; i++) {
////				long stock = stockValue();
						
////						@FindBy(xpath="//td[@class='sc-fYsVRl hWspoI strike']/span[contains(text(),'"+Money+"']")
////						WebElement Recentralamount;
			int n =	allStrike.size();
			System.out.println(n);
						WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
						Actions act = new Actions(driver);
						act.scrollToElement(recen).perform();
						if( allStrike.get(0).getText().equals(atTheMoney)){
							allStrike.get(0).click();
							
							//firstSell.get(n-1).click();
							//FIRST
							driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
							
							//driver.findElement(By.xpath("//tbody/tr[46]/td[2]/div[1]/div[2]/div[1]/div[2]/button[2]")).click();
							//comp.webWait(ReliChrocallLot);
							Thread.sleep(2000);
							driver.findElement(By.xpath(" //tbody/tr[46]/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(callLot);
						//	ReliChrocallLot.sendKeys(callLot);
							
							Thread.sleep(2000);
							////tbody/tr[46]/td[5]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]
							webWait(driver.findElement(By.xpath("//tbody/tr[46]/td[5]/div[1]/div[2]/div[1]/div[2]/button[1]")));
						//	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[46]/td[5]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
							//secondBuy.get(n-1).click();
							Thread.sleep(2000);
							//Thread.sleep(2000);
						//  scroolingDown();
							driver.findElement(By.xpath("//tbody/tr['"+n+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(putLotSelction);
						//  putLot.sendKeys(putLotSelction);
						  // call_lot.sendKeys(callLot);
							
							//Thread.sleep(2000);
							
							break;
						}
						}
			
			
		}	
		
	}
	
	

