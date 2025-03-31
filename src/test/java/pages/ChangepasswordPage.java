package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ChangepasswordPage extends ProjectSpecificationMethods{
	
	@FindBy(id = "current_pass")
	WebElement currentpassw;
	
	@FindBy(id = "new_password")
	WebElement newpassw;
	
	@FindBy(id = "re_password")
	WebElement confrmnewpassw;
	
	@FindBy(id = "Submit")
	WebElement submitpass;
	
	@FindBy(xpath = "//span[text()='Your Password is successfully updated!!!']")
	WebElement passchangeSuccess;

	public ChangepasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	public ChangepasswordPage currentpassword() {
		currentpassw.sendKeys("Dhanvik24");
		return this;
	}
	
	public ChangepasswordPage  newpassword(String Chanepass1) {
		newpassw.sendKeys("Dhanya28");
		return this;
	}
	
	public ChangepasswordPage confrmnewpassword(String Chanepass1) {
		confrmnewpassw.sendKeys("Dhanya28");
		return this;
		
	}
	
	public ChangepasswordPage passchangeVerify() {
		Assert.assertTrue(passchangeSuccess.isDisplayed(),"The Password change is failed");
		return this;
	}
	
	public ChangepasswordPage SubmitPasswordM() {
		submitpass.click();
		return this;
	}
}
