package pageObjects;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.Components;

public class scrollUp extends Components{

	

	     private static final String atTheMoney = null;
		WebDriver driver;

	    public scrollUp(WebDriver driver) {
	    	super(driver);
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    By locator= By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']");
	    
	    public WebElement scrollUpUntilElementIsFound(By locator, int maxScrolls) throws TimeoutException {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement element = null;
	        int scrollCount = 0;

	        while (scrollCount < maxScrolls) {
	            try {
	                // Try to find the element in the current viewport
	                element = driver.findElement(locator);
	                // If found, return the element
	                if (element.isDisplayed()) {
	                    return element;
	                }
	            } catch (NoSuchElementException e) {
	                // If the element is not found, scroll up and try again
	                js.executeScript("window.scrollBy(0,-300)");
	                scrollCount++;
	            }

	            // Add a small wait to allow the page to render after scroll
	            try {
	                Thread.sleep(500); // adjust as necessary
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	        throw new TimeoutException("Element not found after scrolling up " + maxScrolls + " times");
	    }
}
