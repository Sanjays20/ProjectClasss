package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobal {

public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
	
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@name='username']")
	})

	private List<WebElement> txtUser;


	@FindAll({
	
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@name='pass']")
	})

	private List<WebElement> txtPass;


	@FindBys({
	
		@FindBy(xpath="//input[@id='login']"),
		@FindBy(xpath="//input[@name='login']")
	})

	private List<WebElement> btnLog;


	public List<WebElement> getTxtUser() {
		return txtUser;
	}


	public List<WebElement> getTxtPass() {
		return txtPass;
	}


	public List<WebElement> getBtnLog() {
		return btnLog;
	}

	
}
