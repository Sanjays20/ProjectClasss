package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPojo extends LibGlobal {

	public List<WebElement> getTxtOrd() {
		return txtOrd;
	}

	public FifthPojo () {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private List<WebElement> txtOrd;

	@FindBy(id="search_hotel")
	private List<WebElement> txtse;

	public List<WebElement> getTxtse() {
		return txtse;
	}

	
}
