package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import TestNG.Precondition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC002 {

	WebDriver w;
	
    @Given ("^Logins$")
    	
    	public void Launch_Openweather_Login_Page() throws Exception {
    	    
    		Precondition.geckodrivercode();
    		w=new FirefoxDriver();
    		w.get("https://openweathermap.org");
    	}
    
    @When ("^Enter valid username and password$")
    
public void enter_valid_username_and_password() throws Exception {
		
		w.findElement(By.id("user_email")).sendKeys("admin");
		w.findElement(By.id("user_password")).sendKeys("admin");
		w.findElement(By.name("commit")).click();
    }
    @And ("^Enter invalid city name$")
    
public void enter_valid_invalid_city_name_search() throws Exception {
		
		w.findElement(By.id("search_str")).sendKeys("nanita");
		w.findElement(By.xpath("/html/body/main/div[2]/div/div/div/form/button")).click();
    }
    
    @And ("^Search for weather$")
public void Search_for_weather() throws Exception {
		
    	w.findElement(By.xpath("/html/body/main/div[2]/div/div/div/form/button")).click();
    	
    }
    @Then ("^Website suggestion$")
public void website_suggestion() throws Exception {
    	
    WebElement uid=w.findElement(By.xpath("/html/body/main/div[2]/div/div/div/form/button"));
   	 uid.sendKeys("nanita");
   	 String value=uid.getAttribute("Not found");
    }
    @And ("^Logout$")
    
    public void logout() throws Exception {
 	   
		w.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/a[2]")).click();
	
    }
}
