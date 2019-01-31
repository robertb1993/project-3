package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.PhpTravels;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hotelsearch {
	
public WebDriver driver = null;
  
	@Test
	public void CheapestHotel () {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver ();
		 driver.get("https://www.phptravels.net/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	    PhpTravels a = new PhpTravels (driver);
	    a.LandMark().sendKeys("Dhaka Bangladesh");
		 
			 
		 
		
		 
			 
	}
			   
   }

