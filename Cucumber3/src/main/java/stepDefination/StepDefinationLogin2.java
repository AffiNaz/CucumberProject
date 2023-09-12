package stepDefination;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinationLogin2 {
	WebDriver driver;
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup(); 
		driver	= new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	}
	@When("^user enters \"(.*)\" and \"(.*)\"$")	
	public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.linkText("Sign In")).click();
	 driver.findElement(By.id("email")).sendKeys(username);		
	 driver.findElement(By.id("pass")).sendKeys(password);		
	 				
	}
	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.name("send")).click();
					
			
	}

	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_home_page() {
	
		String title = driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals(title,"Home Page");
	}
	@Then("^user search men tops$")
	public void user_search_men_tops() {	
		driver.findElement(By.id("search")).sendKeys("men tops");
		List <WebElement> elements = driver.findElements(By.xpath("//ul[@role= 'listbox']/li/descendant::"
				+ "span[contains(text(), ' Men top')]"));
		elements.size();
		 
		
		
		
	}
	
	@Then("^user navigates to men tops page$")
	public void user_navigates_to_men_tops_page() {
		
		
		
		
	}
	

}
	
	
	
	
	


