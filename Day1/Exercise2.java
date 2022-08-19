package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class Login {


	WebDriver driver = null;
	Login login;
	private Object logout;

	@Given("browser is open")
	public void browser_is_open() {
		
	System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
	
	System.out.println("Inside Step - browser is open");
		
	String projectPath = System.getProperty("user.dir");
	System.out.println("Project path is : "+"\"C:\\Users\\sasitharanb\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
    System.setProperty("webdriver.chrome.driver", projectPath+"\"C:\\Users\\sasitharanb\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
	    driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();
	}
		


	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		login.checkLogOutIsDisplayed();
		 //driver.findElement(By.id("logout")).isDisplayed();
		@When("^user enters (.*) and (.*)$")
		public void user_enters_country__address_Email_Phone(String username, String address,String Email,int phone) throws InterruptedException  {
			
			 Registration = new Registration(driver);
			 Registration.country("india");
			 Registration.address("chennai");
			 Registration.email("sasitharanb@maveric-systems.com");
			 Registration.phone("9095978785);
		@And("user clicks on save")
		public void user_clicks_on_save() {
			
			save.clicksave();
				}
