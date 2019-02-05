package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.Hotel;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hotelsearch {
	
private WebDriver driver= null;
  
	@Test
	public void CheapestHotel () {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver ();
		 driver.get("https://www.hotels.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	    Hotel a = PageFactory.initElements(driver, Hotel.class);
	    Actions action = new Actions (driver);
	    action.sendKeys(a.LandMark(),"Dhaka Bangladesh").perform();
	    action.sendKeys(a.LandMark(),Keys.ENTER).perform();
	    action.sendKeys(a.CheckInDate(),Keys.CLEAR).perform();
	     action.sendKeys(a.CheckInDate(),"02/10").perform();
	     action.sendKeys(a.CheckInDate(),Keys.ENTER).perform();
	     action.sendKeys(a.CheckoutDate(),Keys.CLEAR).perform();
	    action.sendKeys(a.CheckoutDate(),"02/28").perform();
	    action.sendKeys(a.CheckoutDate(),Keys.ENTER).perform();
	    Select s = new Select (driver.findElement(By.xpath("//select[@id='q-rooms']")));
	    s.selectByValue("2");
	    Select r = new Select (driver.findElement(By.name("q-room-0-adults")));
	    r.selectByValue("3");
	    action.click(a.SearchButton()).perform();
		 
			 }
			   
   }

