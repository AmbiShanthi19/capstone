package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;
import util.Utility;

public class SignupPage extends ProjectSpecificationMethods {
	
	@FindBy(id = "username")
	WebElement username2;
	
	@FindBy(id = "password")
	WebElement password2;
	
	@FindBy(id = "re_password")
	WebElement confrmpass2;
	
	@FindBy(id = "full_name")
	WebElement fullname;
	
	@FindBy(id = "email_add")
	WebElement email1;
	
	@FindBy(id = "tnc_box")
	WebElement checkbox;
	
	@FindBy(id = "Submit")
	WebElement register;
	
	public SignupPage(WebDriver driver) {
        Utility.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public SignupPage username01() {
		username2.sendKeys("ambika");
		return this;
	}
	
	public SignupPage password01() {
		password2.sendKeys("123456");
		return this;
	}
	
	public SignupPage confrmpass01() {
		confrmpass2.sendKeys("123456");
		return this;
	}
	
	public SignupPage fullname01() {
		fullname.sendKeys("AmbikaSaminathan");
		return this;
	}
	
	public SignupPage email01() {
		email1.sendKeys("venkiambika83@gmail.com");
		return this;
	}
	
	public SignupPage checkbox01() {
		checkbox.click();
		return this;
	}
	
	 public void ClickRegister() {
		 register.click();
	    }
}
