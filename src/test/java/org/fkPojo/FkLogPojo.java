package org.fkPojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FkLogPojo extends BaseClass {
		
	  public FkLogPojo() {
		PageFactory.initElements(driver, this);
	 }
		@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
		private WebElement clk;
		
	  @FindBy(xpath = "//a[@class='_1_3w1N']")
	  private WebElement cl;
	  
	  @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	  private WebElement phno;

	public WebElement getClk() {
		return clk;
	}

	public WebElement getCl() {
		return cl;
	}

	public WebElement getPhno() {
		return phno;
	}
		
		

}

