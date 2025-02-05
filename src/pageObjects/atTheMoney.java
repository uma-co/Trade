package pageObjects;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	@FindBy(css="[class='sc-cKZHah bzgDkd']")
	WebElement settingsButton;
	@FindBy(id="Lots")
	WebElement Lots;;
	@FindBy(xpath="(//div[@id='new-ticker-text'])[2]/span[2]")
	WebElement stock;
//	@FindBy(xpath="//div[@class='sc-bolZY blPTRB instrument-ticker-wrapper']//span[@class='instrument-ltp']")
//	WebElement stock;
	@FindBy(xpath="//div[@class='sc-gYhigD LAAsy']/p")
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
	@FindBy(xpath="//div[@type='CALL']//button[@action='BUY']/p")
	List<WebElement> Buy_Button;
	@FindBy(xpath="//div[@class='sc-PfnZo frkgVM']/following-sibling::div/div/div/following-sibling::div/button[2]/span")
	List<WebElement> sell_Button;
	//(//input[@class='MuiInputBase-input MuiInput-input'])[3]
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiInput-input'])[3]")
	WebElement putLot;
	//(//input[@class='MuiInputBase-input MuiInput-input'])[2]
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input']")
	WebElement call_lot;
	@FindBy(xpath="//div//input[@class='sc-caVybk krkDcN lot-qty-input']")
	WebElement ReliChrocallLot;
	@FindBy(xpath="//button[@action='SELL']//p[@class='sc-kMOkjD fLfNCO']")
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
	
	public void settingScreen() {
		settingsButton.click();
		Lots.click();
	}
	
	
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
		
	public double stockValue() throws InterruptedException {
		
	Thread.sleep(2000);	
	double stockval =    Double.parseDouble(stock.getText());
	
	Thread.sleep(2000);
	System.out.println(stockval);
	return stockval;
	
	
		//String[] vals = String.valueOf(stockval).split(".");
	//	return stockval;
		
	///	return stockval;
		
		
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		for(int i = 1 ; i < allStrike.size() ; i++) {
			WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
			Actions act = new Actions(driver);
act.scrollToElement(recen).perform();

//		
System.out.println(recen);
		if(allStrike.get(i).getText().contains(atTheMoney))
					 {
			
	wait.until(ExpectedConditions.elementToBeClickable(recen));
			
			js.executeScript("arguments[0].scrollIntoView(true);", recen);
			
	allStrike.get(i).click();


			
			//	act.scrollToElement((WebElement) allStrike).perform();
			
				if(CallSell != null) {
					firstSell.get(i).click();
				
					act.moveToElement(ReliChrocallLot).perform();
				//ct.scrollToElement(ReliChrocallLot).perform();
					ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
				}

				 if(CallBuy != null  ) {
					Buy_Button.get(i).click();
					act.moveToElement(ReliChrocallLot).perform();
				//	act.sendKeys(Keys.DOWN).build().perform();
					act.scrollToElement(ReliChrocallLot).perform();
					Thread.sleep(2000);
					ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallBuy);
				 }
				 if( PutBuy != null) {
					 Thread.sleep(1000);
						secondBuy.get(i).click();
						
						Thread.sleep(2000);
						//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
						 putLot.sendKeys(Keys.BACK_SPACE);
						 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
						}
					if(PutSell!= null) {
				//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
					
					sell_Button.get(i).click();
					Thread.sleep(2000);
					putLot.sendKeys(Keys.BACK_SPACE);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
					
					}}
		}
		}
	
	//----
	
	
	
	public WebElement scrollUpUntilElementIsFound(By locator, int maxScrolls) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = null;
        int scrollCount = 0;
        Actions act = new Actions(driver);

        // Initialize WebDriverWait to check for element visibility
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        while (scrollCount < maxScrolls) {
            try {
                // Check if the element is visible
              //  element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                act.moveToElement((WebElement) locator).perform();
                if (element.isDisplayed()) {
                    return element; // Return element if found
                }
            } catch (NoSuchElementException e) {
                // If not found or not visible, scroll up and retry
                js.executeScript("window.scrollBy(0,-2000)"); // Scroll up by 500px
                scrollCount++;
            }

            // Add a small wait to allow for the page rendering after scroll
            try {
                Thread.sleep(500);  // adjust the sleep time based on page load time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }}
		return element;
        }
	
	public void newLocators(String atTheMoney) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		
		for(int i = 0 ; i < allStrike.size(); i++) {
			WebElement recen =driver.findElement(By.xpath("//div[@class='sc-hScDUP kZRMSv']/p[text()="+atTheMoney+"]"));
		
		//	 act.scrollToElement(recen).perform();
		
			 if(allStrike.get(i).getText().contains(atTheMoney)) {
				 wait.until(ExpectedConditions.elementToBeClickable(recen));
				// js.executeScript("arguments[0].scrollIntoView(true);", recen);
			//	 Thread.sleep(3000);
				 allStrike.get(i).click();
				 Thread.sleep(3000);
				WebElement buy =  driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]/p[1]"));
//			act.moveToElement(buy).click();
			//	WebElement sell = 	driver.findElement(By.xpath("//tbody/tr["+i+-1+"]/td[2]/div[1]/div[3]/div[1]/div[1]/button[2]/p[1]"));
			//	wait.until(ExpectedConditions.elementToBeClickable(buy)).click();
			//	WebElement putBuy =		driver.findElement(By.xpath("//tbody/tr["+i+-1+"]/td[5]/div[1]/div[3]/div[1]/div[1]/button[1]"));
				 //	 WebElement element = driver.findElement(By.xpath("//div[@type='CALL']/following-sibling::div[1]//button[@action='BUY']"));
				WebElement putSell =     driver.findElement(By.xpath("//tbody/tr["+i+"]/td[5]/div[1]/div[3]/div[1]/div[1]/button[2]/p[1]"));
			        // Use JavaScript to click the element directly
			//	Thread.sleep(3000);
				 js.executeScript("arguments[0].scrollIntoView(true);", buy );
				 Thread.sleep(3000);
				 buy.click();
				 putSell.click();
			      js.executeScript("arguments[0].click();", buy);
			      js.executeScript("arguments[0].click();", putSell);
		//	 Buy_Button.get(i).getAttribute("fdprocessedid")act.click();
			
			
				 
			} 
		}
			 
		}
//		for(int i = 0 ; i < allStrike.size() ; i++) {
//			WebElement recen =driver.findElement(By.xpath("//div[@class='sc-hScDUP kZRMSv']/p[text()='"+atTheMoney+"']"));
//			 act.scrollToElement(recen).perform();
//			 if(allStrike.get(i).getText().contains(atTheMoney)) {
//				 wait.until(ExpectedConditions.elementToBeClickable(recen));
//					
//					js.executeScript("arguments[0].scrollIntoView(true);", recen);
//					allStrike.get(i).click();
//		int i = 0;
//		driver.findElement(By.xpath("//div[@class='sc-hScDUP kZRMSv']/p[text()='1270']")).click();
//		//div[@class='sc-hScDUP kZRMSv']/p[text()='1270']
//		driver.findElement(By.xpath("//tbody/tr[22]/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]/p[1]")).click();
//		while(i<3) {
//			Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[22]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
//		if(i==2) {
//			break;
//		}
//		}
//		driver.findElement(By.xpath("//tbody/tr[22]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("1000");
					//Buy_Button.get(i).click();
//					WebElement bb = driver.findElement(By.xpath("//tbody/tr[22]/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]"));
//					js.executeScript("arguments[0].click();", bb);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]"))).click();
			    //    driver.findElement(By.xpath("//tbody/tr[22]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
			       // driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("1000");
			 

		
		
		
		

	
	
	
public void clickStrike_s(String strike1 , String CallBuy ,String CallSell , String PutBuy , String PutSell) throws InterruptedException, TimeoutException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	ScrollUpUntilElementFound scroller = new ScrollUpUntilElementFound(driver);
	//	WebElement element = scroller.scrollUpUntilElementIsFound(By.id("targetElementId"), 10);
		Actions act = new Actions(driver);
		for(int i = 1 ; i < allStrike.size() ; i++) {
		//	scrollUp scroller = new scrollUp(driver);
		  try {
			 recen =driver.findElement(By.xpath("//div[@class='sc-gYhigD LAAsy']/p[text()='"+strike1+"']"));
		//	Actions act = new Actions(driver);
		  }
		  catch(Exception e) {
			  System.out.println("Strike Value Not Found");
			  FetchDataFromExcel FetchDataFromExcel = new FetchDataFromExcel();
			  FetchDataFromExcel.settflag = false;
			  
			  
			 break; 
		  }
		// 	WebElement recen =driver.findElement(By.xpath("//div[@class='sc-gYhigD LAAsy']/p[text()='"+strike1+"']"));
		// //	Actions act = new Actions(driver);

    
		try {
			
			//js.executeScript("arguments[0].scrollIntoView(true);", recen);
          act.scrollToElement(recen).perform();

		}	
			
			
//atTheMoney atTheMoney1 = new atTheMoney(driver);
//scroller.scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
//scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
catch(Exception e){
	
			System.out.println(recen);
}
	FetchDataFromExcel.settflag = true;
		if(allStrike.get(i).getText().contains(strike1))
					 {
	//	act.moveToElement(recen).sendKeys(Keys.PAGE_UP).perform();
//		act.sendKeys(recen).click(recen);
 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", recen);
			wait.until(ExpectedConditions.elementToBeClickable(recen));
			
		//	js.executeScript("arguments[0].scrollIntoView(true);", recen);
			//Thread.sleep(2000);
		//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recen);
			allStrike.get(i).click();
		
//			if(!recen.isSelected()) {
//				if(allStrike.get(i) != recen) {
//					((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[1];", recen, -400);
//					allStrike.get(i).click();
//				}
//				}
		
//			
		//	act.scrollToElement(recen).click().sendKeys(Keys.UP).perform();
			
		
		//allStrike.get(i).click();
			
			
		//	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", pixel);

		//	act.moveToElement(recen).sendKeys(Keys.PAGE_UP);
			
	//	act.clickAndHold(recen).perform();
			
			//wait.until(ExpectedConditions.elementToBeClickable(recen)).click();
			
		//	act.scrollToElement(recen).sendKeys(Keys.UP).perform();
			//act.sendKeys(Keys.UP).build().perform();
	//	scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
		//act.scrollToElement(recen).perform();
		//atTheMoney atTheMoney1 = new atThe
		//scroller.scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
	//act.moveToElement(allStrike.get(i)).click();
		//	allStrike.get(i).click();

					 
			
			//	act.scrollToElement((WebElement) allStrike).perform();
			
				if(Integer.parseInt(CallSell) > 0) {
					
					WebElement sell = 	driver.findElement(By.xpath("//tbody/tr["+ (i + 1) + "]/td[2]/div[1]/div[3]/div[1]/div[1]/button[2]/p[1]"));
					
					//	wait.until(ExpectedConditions.elementToBeClickable(buy)).click();
					  js.executeScript("arguments[0].click();", sell);
				//	act.moveToElement(ReliChrocallLot).perform();
				//ct.scrollToElement(ReliChrocallLot).perform();
					  
					  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
						//	ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
							driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(CallSell);
//					ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
							System.out.println("  callsell has executed");
							
				}

				else if(Integer.parseInt(CallBuy) > 0){
					 Thread.sleep(2000);
					
					 WebElement buy =  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) + "]/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]/p[1]")); 
					// Buy_Button.get(i).click();
					  js.executeScript("arguments[0].click();", buy);
					// driver.findElements(By.xpath("//div[@type='CALL']//div//button//p[text()='B']")).get(i).click();
					//driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
					Thread.sleep(2000);
					
				//	act.moveToElement(ReliChrocallLot).perform();
				//	act.sendKeys(Keys.DOWN).build().perform();
					//act.scrollToElement(ReliChrocallLot).perform();
					driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
				//	ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
					driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(CallBuy);
					System.out.println("  callbuy has executed");
					
				 }
				 if(Integer.parseInt(PutBuy) > 0) {
					 Thread.sleep(1000);
					
					 WebElement putBuy =driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[1]/div[1]/button[1]"));
						
						Thread.sleep(1000);
						  js.executeScript("arguments[0].click();", putBuy);
						//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
						  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
						  
						 
						//  putLot.sendKeys(Keys.BACK_SPACE);
						  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(PutBuy);
						  // driver.findElement(By.xpath("//tbody/tr["+i+"]/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
						  System.out.println("  putbuy has executed");
						  
						}
				 else if(Integer.parseInt(PutSell) > 0){
						
				//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
						WebElement putSell =    driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[1]/div[1]/button[2]/p[1]"));
				//	sell_Button.get(i).click();
					Thread.sleep(2000);
			putSell.click();
				//	js.executeScript("arguments[0].click();", PutSell);
					 
					 driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
//					putLot.sendKeys(Keys.BACK_SPACE);
//					driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
					 driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(PutSell);
					 System.out.println("  putsell has executed");
					 
					}
					
					 }
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


//	public void clickStrike_s1(CharSequence strike1, String callBuy, String callSell, String putBuy, String putSell) {
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		//	ScrollUpUntilElementFound scroller = new ScrollUpUntilElementFound(driver);
//		//	WebElement element = scroller.scrollUpUntilElementIsFound(By.id("targetElementId"), 10);
//			Actions act = new Actions(driver);
//			for(int i = 1 ; i < allStrike.size() ; i++) {
//			//	scrollUp scroller = new scrollUp(driver);
//			
//				WebElement recen =driver.findElement(By.xpath("//div[@class='sc-DJfgX jNTNvx']/p[text()='"+strike1+"']"));
//			//	Actions act = new Actions(driver);
//
//
//			try {
//				
//				//js.executeScript("arguments[0].scrollIntoView(true);", recen);
//	          act.scrollToElement(recen).perform();
//
//			}	
//				
//				
//	//atTheMoney atTheMoney1 = new atTheMoney(driver);
//	//scroller.scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
//	//scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
//	catch(Exception e){
//		
//				System.out.println(recen);
//	}
//				
//			if(allStrike.get(i).getText().contains(strike1))
//						 {
//		//	act.moveToElement(recen).sendKeys(Keys.PAGE_UP).perform();
////			act.sendKeys(recen).click(recen);
//	 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", recen);
//				wait.until(ExpectedConditions.elementToBeClickable(recen));
//				
//			//	js.executeScript("arguments[0].scrollIntoView(true);", recen);
//				//Thread.sleep(2000);
//				allStrike.get(i).click();
//			
////				if(!recen.isSelected()) {
////					if(allStrike.get(i) != recen) {
////						((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[1];", recen, -400);
////						allStrike.get(i).click();
////					}
////					}
//			
////				
//			//	act.scrollToElement(recen).click().sendKeys(Keys.UP).perform();
//				
//			
//			//allStrike.get(i).click();
//				
//				
//			//	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", pixel);
//
//			//	act.moveToElement(recen).sendKeys(Keys.PAGE_UP);
//				
//		//	act.clickAndHold(recen).perform();
//				
//				//wait.until(ExpectedConditions.elementToBeClickable(recen)).click();
//				
//			//	act.scrollToElement(recen).sendKeys(Keys.UP).perform();
//				//act.sendKeys(Keys.UP).build().perform();
//		//	scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
//			//act.scrollToElement(recen).perform();
//			//atTheMoney atTheMoney1 = new atThe
//			//scroller.scrollUpUntilElementIsFound(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"), 5);
//		//act.moveToElement(allStrike.get(i)).click();
//			//	allStrike.get(i).click();
//
//						 
//				
//				//	act.scrollToElement((WebElement) allStrike).perform();
//				
//					if(callSell != null) {
//						
//						WebElement sell = 	driver.findElement(By.xpath("//tbody/tr["+ (i + 1) + "]/td[2]/div[1]/div[3]/div[1]/div[1]/button[2]/p[1]"));
//						
//						//	wait.until(ExpectedConditions.elementToBeClickable(buy)).click();
//						  js.executeScript("arguments[0].click();", sell);
//					//	act.moveToElement(ReliChrocallLot).perform();
//					//ct.scrollToElement(ReliChrocallLot).perform();
//						  
//						  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
//							//	ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//								driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(callSell);
////						ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
////						driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
//					}
//
//					 if(callBuy != null  ) {
//						 Thread.sleep(2000);
//						
//						 WebElement buy =  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) + "]/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]/p[1]")); 
//						// Buy_Button.get(i).click();
//						  js.executeScript("arguments[0].click();", buy);
//						// driver.findElements(By.xpath("//div[@type='CALL']//div//button//p[text()='B']")).get(i).click();
//						//driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
//						Thread.sleep(2000);
//						
//					//	act.moveToElement(ReliChrocallLot).perform();
//					//	act.sendKeys(Keys.DOWN).build().perform();
//						//act.scrollToElement(ReliChrocallLot).perform();
//						driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
//					//	ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//						driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[2]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(callBuy);
//					 }
//					 if( putBuy != null) {
//						 Thread.sleep(1000);
//						
//						 WebElement putBuyz =driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[1]/div[1]/button[1]"));
//							
//							Thread.sleep(1000);
//							  js.executeScript("arguments[0].click();", putBuy1);
//							//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//							  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
//							  
//							 
//							//  putLot.sendKeys(Keys.BACK_SPACE);
//							  driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(putBuyz);
//							  // driver.findElement(By.xpath("//tbody/tr["+i+"]/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
//							}
//						if(putSell!= null) {
//							
//					//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
//							WebElement putSell =    driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[1]/div[1]/button[2]/p[1]"));
//					//	sell_Button.get(i).click();
//						Thread.sleep(2000);
//				putSell.click();
//					//	js.executeScript("arguments[0].click();", PutSell);
//						 
//						 driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(Keys.BACK_SPACE);
////						putLot.sendKeys(Keys.BACK_SPACE);
////						driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
//						 driver.findElement(By.xpath("//tbody/tr["+ (i + 1) +"]/td[5]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys(putSell);
//						}
//						
//						 }
//			}
//			
//	}
//			
//			
//
//					
//
//				
//			
//			
//		
//		
////		if(CallSell != null && PutBuy != null) {
////			firstSell.get(i).click();
////			//act.sendKeys(Keys.DOWN).build().perform();
////			act.scrollToElement(ReliChrocallLot).perform();
////			ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
////			driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
////			secondBuy.get(i).click();
////			 putLot.sendKeys(Keys.BACK_SPACE);
////			 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
////			}
////		else if(CallBuy != null && PutSell!= null ) {
////			Buy_Button.get(i).click();
////		//	act.sendKeys(Keys.DOWN).build().perform();
////			act.scrollToElement(ReliChrocallLot).perform();
////			ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
////			driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallBuy);
////		//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
////			
////			sell_Button.get(i).click();
////			putLot.sendKeys(Keys.BACK_SPACE);
////			driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
////			
////			
////		}
		
	}	
		
	
	
	

