package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethods;

public class BookHotelPage extends ProjectSpecificationMethods{
    

    // Locators
    @FindBy(id = "first_name")
    WebElement firstNameField;

    @FindBy(id = "last_name")
    WebElement lastNameField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "cc_num")
    WebElement creditCardField;

    @FindBy(id = "cc_type")
    WebElement ccTypeDropdown;

    @FindBy(id = "cc_exp_month")
    WebElement expMonthDropdown;

    @FindBy(id = "cc_exp_year")
    WebElement expYearDropdown;

    @FindBy(id = "cc_cvv")
    WebElement cvvField;

    @FindBy(id = "book_now")
    WebElement bookNowButton;

    // Constructor
    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public BookHotelPage enterFirstName() {
        firstNameField.sendKeys("Ambika");
        return this;
    }

    public BookHotelPage enterLastName() {
        lastNameField.sendKeys("Saminathan");
        return this;
    }

    public BookHotelPage enterAddress() {
        addressField.sendKeys("Chennai");
        return this;
    }

    public BookHotelPage enterCreditCard() {
        creditCardField.sendKeys("1234567891234567");
        return this;
    }

    public BookHotelPage cardType() {
    	 new Select(ccTypeDropdown).selectByVisibleText("American Express");
         return this;
    }
    
    public BookHotelPage enterMonth() {
    	 new Select(expMonthDropdown).selectByVisibleText("February");
         return this;
    }
    
    public BookHotelPage enterYear() {
   	 new Select(expYearDropdown).selectByVisibleText("2026");
        return this;
   }
    public BookHotelPage enterCVV() {
        cvvField.sendKeys("123");
        return this;
    }
    

    public BookingConfirmationPage clickBookNow() throws Exception {
    	Thread.sleep(2000);
        bookNowButton.click();
        return new BookingConfirmationPage(driver);
    }

    /*public void bookHotel(String firstName, String lastName, String address, String creditCard, String cardtype,String Month,String Year,String cvv) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress(address);
        enterCreditCard(creditCard);
        cardType(cardtype);
        enterMonth(Month);
        enterYear(Year);
        enterCVV(cvv);
        clickBookNow();
    }*/
}