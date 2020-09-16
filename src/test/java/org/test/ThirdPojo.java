package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ThirdPojo extends LibGlobal {

public ThirdPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBys({
		
		@FindBy(xpath="//input[@id='radiobutton_0']"),
		@FindBy(xpath="//input[@type='radio']")
	})
	
	private List<WebElement> txtRadio;
	
	
	@FindAll({
		
		@FindBy(xpath="//input[@id='continue']"),
		@FindBy(xpath="//input[@type='submit']")
	})
	
	private List<WebElement> txtContinue;


	public List<WebElement> getTxtRadio() {
		return txtRadio;
	}


	public List<WebElement> getTxtContinue() {
		return txtContinue;
	}

}
