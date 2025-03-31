package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class BookediteneraryPage extends ProjectSpecificationMethods {
	
	@FindBy(id = "logout")
	WebElement logout2;
	
	@FindBy(id = "order_id_text")
	WebElement searchorder;
	
	@FindBy(id ="search_hotel_id")
	WebElement Gobutton;
	
	@FindBy(xpath = "//input[@class='reg_button']")
	WebElement cancelselected;
	
	@FindBy(id = "search_hotel")
	WebElement SearchHotelbutton;
	
	@FindBy(xpath = "//input[@value='1322499']")
	WebElement ID1;
	
	@FindBy(id = "btn_id_1322339")
	WebElement ID2;
	
	@FindBy(id = "order_id_1322499")
	WebElement textorderid1;
	
	@FindBy(id = "search_result_error")
	WebElement verifyorder;
	
	public BookediteneraryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	public LogoutPage logout02() {
		logout2.click();
		return new LogoutPage(driver);
	}
	
	public BookediteneraryPage searchorder() {
		searchorder.sendKeys("6Y9R024IGE");
		Gobutton.click();
		return this;
	}
	 public BookediteneraryPage Deleteorder() {
		 ID2.click();
		 cancelselected.click();
		 driver.switchTo().alert().accept();
		 return this;
	}
	public BookediteneraryPage VerifySearchOrder() {
		Assert.assertTrue(verifyorder.isDisplayed(), "the search result is not displayed");
		return this;
	}
	
	public SearchHotelPage ClicksearchHotel() {
		SearchHotelbutton.click();
		return new SearchHotelPage(driver);
	}
}
