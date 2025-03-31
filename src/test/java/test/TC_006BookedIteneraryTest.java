package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecificationMethods;
import pages.BookHotelPage;
import pages.BookediteneraryPage;
import pages.BookingConfirmationPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
public class TC_006BookedIteneraryTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup() throws IOException {
		
		testName="SearchFunctionality Test";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	@Test // Mandatory for the test to execute 
	public void BookediteneraryTest() throws Exception {
		
		LoginPage obj = new LoginPage(driver);
		obj.login("DhanyaDhanvik","Dhanvik24");
		SearchHotelPage objsearch=new SearchHotelPage(driver);
		//objsearch.searchHotel("Syndey", "Hotel Sunshine", "Double","2 - Two","06/04/2025","10/04/2025","2 - Two","2 - Two");
		objsearch.selectLocation()
		.selectHotel()
		.selectRoomType()
		.selectRoomNo()
		.Checkin()
		.Checkout()
		.AdultPerRoom()
		.ChildPerRoom()
		.clickSearch();
		SelectHotelPage Objsel=new SelectHotelPage(driver);
		Objsel.selectHotel()
		.clickContinue();
		BookHotelPage objbook=new BookHotelPage(driver);
		System.out.println("Booking Hotel Page");
		objbook.enterFirstName()
        .enterLastName()
        .enterAddress()
        .enterCreditCard()
        .cardType()
        .enterMonth()
        .enterYear()
        .enterCVV()
        .clickBookNow();
		BookingConfirmationPage objbookconfrm=new BookingConfirmationPage(driver);
		objbookconfrm.itinerarybutton();
		BookediteneraryPage objbookite=new BookediteneraryPage(driver);
		objbookite.searchorder()
		.VerifySearchOrder()
		.ClicksearchHotel();
		
	}

}
