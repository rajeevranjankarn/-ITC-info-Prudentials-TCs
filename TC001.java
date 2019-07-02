package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestNG.Precondition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC001 {

	WebDriver w;
	
	@Given ("^Logins$")
	
	public void Launch_Openweather_Login_Page() throws Exception {
	    
		Precondition.geckodrivercode();
		w=new FirefoxDriver();
		w.get("https://openweathermap.org");
	}

	@When ("^Enter valid jusername and password$")
	
	public void enter_valid_username_and_password() throws Exception {
		
		w.findElement(By.id("user_email")).sendKeys("admin");
		w.findElement(By.id("user_password")).sendKeys("admin");
		w.findElement(By.name("commit")).click();
		
	}
	
	
	@Then ("^Home get display$")
	
	public void home_get_display() throws Exception {
	    
		System.out.println("Page title is:" +w.getTitle());
	}
	
	@Then ("^logout$")
	
	public void logout() throws Exception {
	   
		w.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/a[2]")).click();
	

	}}
