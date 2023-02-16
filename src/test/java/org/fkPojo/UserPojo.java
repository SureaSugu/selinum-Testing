package org.fkPojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPojo extends BaseClass {
	public UserPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='fa fa fa-user']")
	private WebElement acc;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement no;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement key;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement logi;

	public WebElement getAcc() {
		return acc;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getKey() {
		return key;
	}

	public WebElement getLogi1() {
		return logi;
	}

	
	}
