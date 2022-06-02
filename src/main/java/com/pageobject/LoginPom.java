package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']") 
	private  WebElement pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private  WebElement login;

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}



}
