package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class SelectHotelPage extends ProjectSpecificationMethods {
    

    // Locators
    @FindBy(id = "radiobutton_0")
    WebElement selectRadioButton;

    @FindBy(id = "continue")
    WebElement continueButton;

    // Constructor
    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public SelectHotelPage selectHotel() {
    	Assert.assertTrue(selectRadioButton.isEnabled(), "The radiobutton is not clickable");
        selectRadioButton.click();
        return this; 
    }

    public BookHotelPage clickContinue() {
        continueButton.click();
        return new  BookHotelPage(driver);
    }
}