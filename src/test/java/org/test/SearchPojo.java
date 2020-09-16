package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends LibGlobal {

	public SearchPojo() {
		 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({
		
		@FindBy(xpath="//select[@id='location']"),
		@FindBy(xpath="//select[@name='locatio']")
	})
	
	private List<WebElement> txtLoc;
	
	@FindBys({
		
		@FindBy(xpath="//select[@id='hotels']"),
		@FindBy(xpath="//select[@name='hotels']")
	})
	
	private List<WebElement> txtHotel;
	
	@FindAll({
		
		@FindBy(xpath="//select[@id='room_type']"),
		@FindBy(xpath="//select[@name='room_typ']")
	})
	
	private List<WebElement> txtType;
	
	@FindBys({
		
		@FindBy(xpath="//select[@id='room_nos']"),
		@FindBy(xpath="//select[@name='room_nos']")
	})
	
	private List<WebElement> txtRoom;
	
	
	@FindBy(id="datepick_in")
	private List<WebElement> txtIn;
	
	@FindBy(id="datepick_out")
	private List<WebElement> txtOut;
	
	@FindAll({
		
		@FindBy(xpath="//select[@id='adult_room']"),
		@FindBy(xpath="//select[@name='adult_roo']")
	})
	
	private List<WebElement> txtAdult;
	
	@FindBys({
		
		@FindBy(xpath="//select[@id='child_room']"),
		@FindBy(xpath="//select[@name='child_room']")
	})
	
	private List<WebElement> txtChild;

	@FindBy(id="Submit")
	private List<WebElement> txtSub;

	public List<WebElement> getTxtLoc() {
		return txtLoc;
	}

	public List<WebElement> getTxtHotel() {
		return txtHotel;
	}

	public List<WebElement> getTxtType() {
		return txtType;
	}

	public List<WebElement> getTxtRoom() {
		return txtRoom;
	}

	public List<WebElement> getTxtIn() {
		return txtIn;
	}

	public List<WebElement> getTxtOut() {
		return txtOut;
	}

	public List<WebElement> getTxtAdult() {
		return txtAdult;
	}

	public List<WebElement> getTxtChild() {
		return txtChild;
	}

	public List<WebElement> getTxtSub() {
		return txtSub;
	}

	

	
	
}
