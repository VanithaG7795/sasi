package Day1;

public class Exercise1 {
	package org.data;

	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class SeleniumTask1 {
	          public static void main(String[] args) throws InterruptedException, IOException {
	                     
	System.setProperty("webdriver.chromedriver","chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to(https://askomdch.com/);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //Thread.sleep(3000);
	   // driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("shoes");
	   // driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
	    //EXPLICIT
	   // WebDriverWait wait = new WebDriverWait(driver, 10);
	    //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(>someid>)));
	    //IMPLICIT
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	    WebElement drop =driver.findElement(By.xpath("//*[@id=\"product_cat\"]"));
	    //Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    drop.click();
	          Select s = new Select(drop);
	          s.selectByIndex(6);
	          
	          
	   JavascriptExecutor js = (JavascriptExecutor)driver;

	    //Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   js.executeScript("window.scrollBy(0,250)", "");
	  
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/div[2]/a[2]")).click();
	    //Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/div[2]/a[3]")).click();
	    //Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //js.executeScript("window.scrollBy(0,250", "");

	    driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("234,xyz");
	    TakesScreenshot tk = (TakesScreenshot) driver;
	    File s1 = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(s1, new File("SeleniumScreenshot\\scr1.png"));
	    //Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement findElement = driver.findElement(By.xpath("//*[@id=\"payment_method_cod\"]"));
	    findElement.click();
	    //*[@id=\"payment_method_cod\"]
	   //Thread.sleep(3000);
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //js.executeScript("window.scrollBy(0,250", "");
	   driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();    
	   
	    
	    
	}
	}


}
