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

	@FindBy(xpath = "//input[@name='q-localised-check-in']")
	WebElement CheckInDate;

	@FindBy(xpath = " //input[@id='qf-0q-localised-check-out']")
	WebElement CheckOutDate;

	@FindBy(name = "q-rooms")
	WebElement Rooms;

	@FindBy(name = "q-room-0-adults")
	WebElement FamilyMember;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@id=\"sort-submenu-price\"]/li[2]/a")
	WebElement LowestCost;

	@FindBy(id = "qf-0q-compact-occupancy")
	WebElement roomoptions;

	@FindBy(xpath = "//a[@class='menu-trigger'][contains(text(),'Price')]")
	WebElement price;

	@FindBy(partialLinkText = "Price (low to high)")

	WebElement lowestprice;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement roomoptions() {
		return roomoptions;
	}

	public WebElement price() {
		return price;
	}

	public WebElement lowestprice() {
		return lowestprice;
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

	public WebElement LowestCost() {
		return LowestCost;
	}
}
