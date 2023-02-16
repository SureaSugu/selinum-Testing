package org.stepdefinition;

import org.bas.BaseClass;
import org.fkPojo.FkLogPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipKartLog extends BaseClass{
	
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchBrowser();
		
	}

	@When("To launch the url of the facebook application")
		public void toLaunchTheUrlOfTheFlipkartApplication() {
		   launchUrl("https/www.amazon.in");
		}
		
//		 FkLogPojo f = new FkLogPojo();
//		   clickBtn(f.getClk());
//	   

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
	FkLogPojo f = new FkLogPojo();
	clickBtn(f.getCl());
	
	  passText("987654321", f.getPhno());
	}

	@When("To pass invalid passwor in password field")
	public void to_pass_invalid_passwor_in_password_field(){
		System.out.println("password crt");
	}
	   
	@When("To click the login buton")
	public void to_click_the_login_buton() {
	  System.out.println("login sucess");
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
	   System.out.println("To check the current login credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
       closeBrowser();
	}



}
