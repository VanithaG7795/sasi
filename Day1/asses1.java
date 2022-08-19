package Day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class asses1 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chromedriver","chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("http://www.google.com");
	 driver.manage().window().maximize();
	 
	// driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
	//JavascriptExecutor J=(JavascriptExecutor) driver;
	//J.executeScript("window.scrollBy(0, 500)");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[2]/div[2]/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"astra-mobile-cart-drawer\"]/div[2]/div/div/p[2]/a[1]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit command
		//driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click();
		//Thread.sleep(10000);
		//explicit command
		//snapshot
		//File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(scrFile,new File("screenshot sele\\screenshot1.png"));
		   Actions acc = new Actions(driver);
	        WebElement txtUsername = driver.findElement(By.name("q"));
	        org.openqa.selenium.interactions.Action seriesOfActions = acc
	            .moveToElement(txtUsername)
	            .click()
	            .keyDown(txtUsername, Keys.SHIFT)
	            .sendKeys(txtUsername, "hello")
	            .keyUp(txtUsername, Keys.SHIFT)
	            .doubleClick(txtUsername)
	            .contextClick()
	            .build();
	            
	        seriesOfActions.perform() ;
		
	     
		
		
		
		
		
		                          
	    
	   
}
}
