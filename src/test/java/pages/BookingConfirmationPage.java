package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class BookingConfirmationPage  extends ProjectSpecificationMethods{

	@FindBy(id ="my_itinerary")
	WebElement Myitinerary;

	public BookingConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	public BookediteneraryPage itinerarybutton() {
		System.out.println("You are in Booking Confirmation Page!!");
		Myitinerary.click();
		return new BookediteneraryPage(driver);
	}

}
