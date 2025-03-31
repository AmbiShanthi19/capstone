package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethods;

public class SearchHotelPage extends ProjectSpecificationMethods{
    
    // Locators
    @FindBy(id = "location")
    WebElement locationDropdown;

    @FindBy(id = "hotels")
    WebElement hotelsDropdown;

    @FindBy(id = "room_type")
    WebElement roomTypeDropdown;
    
    @FindBy(id = "room_nos")
	WebElement roomNoDropdown;
	
	@FindBy(id = "datepick_in")
	WebElement Checkin;
	
	@FindBy(id = "datepick_out")
	WebElement Checkout;
	
	@FindBy(id = "adult_room")
	WebElement AdultRoom;
		
	@FindBy(id = "child_room")
	WebElement ChildRoom;

    @FindBy(id = "Submit")
    WebElement searchButton;
    
    @FindBy(xpath = "//td[@class='welcome_menu']")
	WebElement userID;
    
    
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	WebElement bookeditinerary;
	
	@FindBy(xpath ="//a[text()='Change Password']")
	WebElement changepassword;

    // Constructor
    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public SearchHotelPage selectLocation() {
    	locationDropdown.click();
        new Select(locationDropdown).selectByIndex(2);
        return this;
    }
   

    public SearchHotelPage selectHotel() {
        new Select(hotelsDropdown).selectByVisibleText("Hotel Sunshine");
        return this;
    }

 
    public SearchHotelPage selectRoomType() {
        new Select(roomTypeDropdown).selectByVisibleText("Double");
        return this;
    }
    
    public SearchHotelPage selectRoomNo() {
        new Select(roomNoDropdown).selectByVisibleText("2 - Two");
        return this;
    }
    
    public SearchHotelPage Checkin() {
    	Checkin.clear();
        Checkin.sendKeys("06/04/2025");
        return this;
    }
    public SearchHotelPage Checkout() {
    	Checkout.clear();
    	Checkout.sendKeys("10/04/2025");
        return this;
    }
    
    public SearchHotelPage AdultPerRoom() {
        new Select(AdultRoom).selectByVisibleText("2 - Two");
        return this;
    }
    
    public SearchHotelPage ChildPerRoom() {
        new Select(ChildRoom).selectByVisibleText("2 - Two");
        return this;
    }
    
    public BookHotelPage clickSearch() throws Exception {
    	Thread.sleep(2000);
        searchButton.click();
        return new BookHotelPage(driver);
    }
    
    public BookediteneraryPage bookiti() {
		bookeditinerary.click();
		return new BookediteneraryPage(driver);
	}
    
    public ChangepasswordPage changepasswordM() {
		 changepassword.click();
		 return new ChangepasswordPage(driver);
	 }
	 
    public LogoutPage  Logout() {
		logout.click();
		return new LogoutPage(driver);
	}
   /* public void searchHotel(String location, String hotel, String roomType, String NosRoom,String Chekindate,String Checkoutdate,String AdultPR,String ChildPR) {
        selectLocation(location);
        selectHotel(hotel);
        selectRoomType(roomType);
        selectRoomNo(NosRoom);
        Checkin(Chekindate) ;
        Checkout(Checkoutdate);
        AdultPerRoom(AdultPR);
        ChildPerRoom(ChildPR);
        clickSearch();
    }*/
}
