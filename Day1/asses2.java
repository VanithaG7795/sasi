package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class asses2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://example.testproject.io/web/");
	Thread.sleep(2000);
	//Inserting the values to login the page
	driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Vanitha G");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	
	//Scroll Down
	org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	//Inserting values to complete the test form
	Select dropdown = new Select(driver.findElement(By.id("country")));  
    dropdown.selectByVisibleText("India");
    driver.findElement(By.id("address")).sendKeys("Kotturpuram");
    driver.findElement(By.id("email")).sendKeys("vanithag@maveric-systems.com");
    driver.findElement(By.id("phone")).sendKeys("9791020258");
    Thread.sleep(3000);
    driver.findElement(By.id("save")).click();
   
  
   //Logout from the page
     driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
    
	
	
	
	
}
}

