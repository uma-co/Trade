package abstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Components {

	WebDriver driver;
	public Components(WebDriver driver){
		     
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
}
