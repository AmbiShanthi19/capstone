package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LogoutPage extends ProjectSpecificationMethods{
	
	@FindBy(xpath = "//a[text()='Click here to login again']")
	WebElement logout;

	 public LogoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	
	public LoginPage logoutsuccess() {
		logout.click();
		return new LoginPage(driver);
	}
}
