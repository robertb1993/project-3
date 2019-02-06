package TestCases;


import java.util.List;
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
	public void CheapestHotel () throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hotels.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Hotel a = PageFactory.initElements(driver, Hotel.class);
		Actions action = new Actions(driver);
		a.LandMark().clear();
		action.sendKeys(a.LandMark(), "Dhaka, Bangladesh").perform();
		action.sendKeys(a.LandMark(), Keys.ARROW_UP).perform();
		action.sendKeys(a.LandMark(), Keys.ARROW_UP).perform();
		action.sendKeys(a.LandMark(), Keys.ARROW_UP).perform();
		action.sendKeys(a.LandMark(), Keys.ENTER).perform();
		action.click(a.CheckInDate()).perform();
		a.CheckInDate().clear();
		action.sendKeys(a.CheckInDate(), "02/11/2019").perform();
		action.click(a.CheckoutDate()).perform();
		a.CheckoutDate().clear();
		action.sendKeys(a.CheckoutDate(), "02/28/2019").perform();

		Select k = new Select(a.roomoptions());
		k.selectByVisibleText("More options…");
		Select s = new Select(a.Rooms());
		s.selectByValue("2");
		Select r = new Select(a.FamilyMember());
		r.selectByValue("3");
		action.click(a.SearchButton()).perform();
		WebElement element = a.price();
		Actions tt = new Actions(driver);
		tt.moveToElement(element).build().perform();
		a.lowestprice().click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//ol[@class='listings infinite-scroll-enabled']"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());

	}

}
