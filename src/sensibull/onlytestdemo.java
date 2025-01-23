package sensibull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlytestdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.sensibull.com/option-strategy-builder?instrument_symbol=NIFTY");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root jss148 MuiButton-contained']/span)[1]")).click();
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		driver.findElement(By.id("userid")).sendKeys("XH5750");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Tatsat@2303");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol=RELIANCE");
		driver.findElement(By.xpath("//button[text()='Build a new custom strategy']")).click();
		
		
	}

}
