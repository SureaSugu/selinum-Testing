package org.fkPojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailPojo extends BaseClass{
	
	  public gmailPojo() {
	  PageFactory.initElements(driver, this);
		 }
			@FindBy(id = "identifierId")
			private WebElement eml;
			
			public WebElement getEml() {
				return eml;
			}

			public WebElement getClk() {
				return clk;
			}

			public WebElement getPass() {
				return pass;
			}

			public WebElement getCl() {
				return cl;
			}
			@FindBy(xpath = "//span[text()='Next']")
			private WebElement clk;
			
		  @FindBy(name = "Passwd")
		  private WebElement pass;
		  
		  @FindBy(xpath = "//span[text()='Next']")
		  private WebElement cl;
}