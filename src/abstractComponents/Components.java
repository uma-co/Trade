package abstractComponents;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Components {

	WebDriver driver;
	public Components(WebDriver driver){
		     
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public void jsScript() {
	 js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void scrollTable() {
		 js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.sc-iOvDvc.fmGssh').scrollBy(0 , 700)");
	}
	public void webWait(WebElement finby) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(finby)).click();;
		
		
		
	}
	
	// document.querySelector(".sc-iOvDvc.fmGssh").scrollDown = 2000
}
