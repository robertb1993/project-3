package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel {
	private WebDriver driver = null;

	public Hotel(WebDriver passWebDriver) {
		this.driver = passWebDriver;

	}

	@FindBy(xpath = "//input[@id='qf-0q-destination']")
	WebElement LandMark;

	@FindBy(xpath = "//input[@id='qf-0q-localised-check-in']")
	WebElement CheckInDate;

	@FindBy(xpath = " //input[@id='qf-0q-localised-check-out']")
	WebElement CheckOutDate;
	
	@FindBy (xpath = "//select[@id='q-rooms']")
	WebElement Rooms;

	@FindBy(xpath = "//input[@id='travellersInput']")
	WebElement FamilyMember;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchButton;

	@FindBy(xpath = "")
	WebElement PressClick;

	@FindBy(xpath = "")
	WebElement LowestCost;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement LandMark() {
		return LandMark;
	}

	public WebElement CheckInDate() {
		return CheckInDate;

	}

	public WebElement CheckoutDate() {
		return CheckOutDate;
	}
	public WebElement Rooms() {
		return Rooms;
	}

	public WebElement FamilyMember() {
		return FamilyMember;
	}

	public WebElement SearchButton() {
		return SearchButton;

	}

	public WebElement PRessClick() {
		return PressClick;
	}

	public WebElement LowestCost() {
		return LowestCost;
	}
}
