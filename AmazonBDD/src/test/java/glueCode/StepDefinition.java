package glueCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class StepDefinition {
	WebDriver driver;
	  @Given("^login page of Amazon$")
	    public void login_page_of_amazon()  {
			System.out.println("This steps opens Browser and Navigate to the Login Page");
			ChromeOptions capability = new ChromeOptions();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

			driver = new ChromeDriver(capability);
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com");
	    }

	    @When("^user is logged in$")
	    public void user_is_logged_in()  {
	    	WebElement signElement= driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span"));
			signElement.click();
			
			
			WebElement emailElement=driver.findElement(By.id("ap_email"));
			emailElement.sendKeys("shameemshaik82@gmail.com");
			
			WebElement continueElement=driver.findElement(By.id("continue"));
			continueElement.click();
			
			WebElement passElement=driver.findElement(By.id("ap_password"));
			passElement.sendKeys("Sultana82#");
		
			
			
			WebElement signInElement=driver.findElement(By.id("signInSubmit"));
			signInElement.click();
	    }

	    @Then("^search for iphone$")
	    public void search_for_iphone() {
	    	WebElement searchElement=driver.findElement(By.id("twotabsearchtextbox"));
	    	searchElement.sendKeys("i phone13 pro");
			
	    	
	    	WebElement searchphoneElement=driver.findElement(By.id("nav-search-submit-button"));
			searchphoneElement.click();
			// searchphoneElement.click();
	    }

	    @And("^select an iphone$")
	    public void select_an_iphone()  {
	    	WebElement iphoneElement=driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(4) > div > div > div > div > div > div > div > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.s-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style > h2 > a > span"));
	    	
			iphoneElement.click();

	    }

	    @And("^add to cart$")
	    public void add_to_cart() throws InterruptedException {
	    	WebElement addTocartElement=driver.findElement(By.cssSelector("#a-autoid-29 > span > input"));
	    	addTocartElement.click();
	    	Thread.sleep(2000);

	    	WebElement subcriptionbuttonElement=driver.findElement(By.cssSelector("#a-autoid-28-announce > div > div > div.a-fixed-left-grid-col.a-col-left > div > label > input[type=radio]"));
		//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//	wait.until(ExpectedConditions.elementToBeClickable(subcriptionbuttonElement));
	    	subcriptionbuttonElement.click();
	    			
	    	Thread.sleep(2000);

	    	 WebElement addTocart2Element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div[3]/div[1]/div/div[3]/div/form/div/span[1]/span/input"));
//				WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
//
//	    	 wait1.until(ExpectedConditions.elementToBeClickable(addTocart2Element));

	    	 addTocart2Element.click();
	    	 
		    	Thread.sleep(2000);			
		    	 WebElement noThaksElement=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/div/span/span[2]/span/button"));
//		    WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
//	    	 wait2.until(ExpectedConditions.elementToBeClickable(noThaksElement));
	    	 noThaksElement.click();
	    	
	    }
}
