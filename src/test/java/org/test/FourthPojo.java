package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FourthPojo extends LibGlobal {

public FourthPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
	
		@FindBy(xpath="//input[@id='first_name']"),
		@FindBy(xpath="//input[@name='first_name']")
	})
	
	private List<WebElement> fName;
	
	@FindAll({
		
		@FindBy(xpath="//input[@id='last_name']"),
		@FindBy(xpath="//input[@name='last_nam']")
	})
	
	private List<WebElement> lName;
	
	@FindBy(id="address")
	private List<WebElement> txtAdd;
	
	@FindBys({
		
		@FindBy(xpath="//input[@id='cc_num']"),
		@FindBy(xpath="//input[@name='cc_num']")
	})
	
	private List<WebElement> txtCc;
	
	@FindAll({
		
		@FindBy(xpath="//select[@id='cc_type']"),
		@FindBy(xpath="//select[@name='cc_typ']")
	})
	
	private List<WebElement> TxtCtype;
	
	@FindBys({
		
		@FindBy(xpath="//select[@id='cc_exp_month']"),
		@FindBy(xpath="//select[@name='cc_exp_month']")
	})
	
	private List<WebElement> txtMonnn;
	
	@FindAll({
		
		@FindBy(xpath="//select[@id='cc_exp_year']"),
		@FindBy(xpath="//select[@id='cc_exp_yea']")
	})
	
	private List<WebElement> txtExp;
	
	@FindBy(id="cc_cvv")
	private List<WebElement> txtCcv;
	
	@FindBy(id="book_now")
	private List<WebElement> txtBook;

	public List<WebElement> getfName() {
		return fName;
	}

	public List<WebElement> getlName() {
		return lName;
	}

	public List<WebElement> getTxtAdd() {
		return txtAdd;
	}

	public List<WebElement> getTxtCc() {
		return txtCc;
	}

	public List<WebElement> getTxtCtype() {
		return TxtCtype;
	}

	public List<WebElement> getTxtMonnn() {
		return txtMonnn;
	}

	public List<WebElement> getTxtExp() {
		return txtExp;
	}

	public List<WebElement> getTxtCcv() {
		return txtCcv;
	}

	public List<WebElement> getTxtBook() {
		return txtBook;
	}

	
	
}
