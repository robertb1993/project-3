package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravels {
	public final WebDriver driver;

	public PhpTravels(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//span[contains(text(),'Search by Hotel or City Name')]")
	WebElement LandMark;

	@FindBy(xpath = "//div[@id='c3qbi-dateRangeInput-display-start-inner'] ")
	WebElement CheckInDate;

	@FindBy(xpath = " //div[@id='c3qbi-dateRangeInput-display-end-inner']")
	WebElement CheckOutDate;
	
	@FindBy(xpath = " //*[@class='_qC _e _qM']")
	WebElement SearchButton;
	
	@FindBy(xpath = "")
	WebElement PressClick;
	
	@FindBy(xpath = "")
	WebElement LowestCost;

	

	public WebElement LandMark() {
		return LandMark;
	}

	public WebElement CheckInDate() {
		return CheckInDate;

	}

	public WebElement CheckoutDate() {
		return CheckOutDate;
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
