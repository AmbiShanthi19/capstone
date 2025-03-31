package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;
import util.Utility;

public class LoginPage extends ProjectSpecificationMethods {
    

    // Locators
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login")
    WebElement loginButton;

	@FindBy(xpath = "//a[text()='New User Register Here']")
	WebElement newuser;
	
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public LoginPage enterUsername(String UserName) {
        username.sendKeys(UserName);
        return this;
    }

    public LoginPage enterPassword(String pass) {
        password.sendKeys(pass);
        return this;
    }

    public void clickLogin() {
        loginButton.click();
    }

    public SearchHotelPage login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        return new SearchHotelPage(driver);
    }
    
    public SignupPage clickNewuser() {
    	newuser.click();
    	return new SignupPage(driver);
    }
    
    }

