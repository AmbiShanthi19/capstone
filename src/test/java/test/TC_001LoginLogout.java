package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecificationMethods;
import pages.LoginPage;
import pages.SearchHotelPage;
	

	public class TC_001LoginLogout extends ProjectSpecificationMethods{
	  
		@BeforeTest
		public void setup() throws IOException {
			
			testName="Login Test";
			testDescription="Testing the login functionality with positive and negative cases";
			testAuthor="Ambika S";
			testCategory="Smoke Testing";
		}
		@Test // Mandatory for the test to execute 
		public void loginandlogoutTest() throws Exception {
			
			LoginPage obj = new LoginPage(driver);
			obj.login("DhanyaDhanvik","Dhanvik24");
			SearchHotelPage objsearch=new SearchHotelPage(driver);
			objsearch.Logout();
		}
		

	
}
