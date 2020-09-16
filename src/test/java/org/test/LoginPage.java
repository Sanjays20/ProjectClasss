package org.test;

import java.io.IOException;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPage extends org.test.LibGlobal {

	
	@BeforeClass
	private void launch() {
		
		LibGlobal l=new LibGlobal();
		
		l.getDriver();	
	}
	
	/*@AfterClass
	private void quit() {
		
		LibGlobal l=new LibGlobal();
		
		l.quitBrowser();

	}*/
	
	
	@BeforeMethod
	private void startTime() {
		
		Date d=new Date();
		System.out.println(d);

	}
	
	@AfterClass
	private void endTime() {
		
		Date d=new Date();
		System.out.println(d);

	}
	
	@Test(groups="Smoke")
	private void tc1() throws IOException {
		
		LoginPojo lp=new LoginPojo();
		
		loadUrl("http://adactinhotelapp.com/index.php");
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Adactin"), "check the title");
		
		driver.manage().window().maximize();
		
		type(lp.getTxtUser().get(0), excelread(0, 0));
		
		String value = lp.getTxtUser().get(0).getAttribute("value");
		
		Assert.assertEquals(value,"Sanjaysaravanan","check the user id");
		
		type(lp.getTxtPass().get(0), excelread(0, 1));
		
		btnClick(lp.getBtnLog().get(0));

	}

	
	@Test(groups="Sanity")
	private void tc2() throws IOException {
		
			
		LoginPojo lp=new LoginPojo();
			
		loadUrl("http://adactinhotelapp.com/index.php");
		
		SoftAssert s=new SoftAssert();
		
		String url = driver.getCurrentUrl();
		
		s.assertTrue(url.contains("adacti"), "check the url");
		
		driver.manage().window().maximize();
			
		type(lp.getTxtUser().get(0), excelread(1, 0));
		
		String value = lp.getTxtUser().get(0).getAttribute("value");
		
		s.assertEquals(value, "Sanjaysaravanan","Check the user id");
		
		type(lp.getTxtPass().get(0), excelread(1, 1));
		
		String text = lp.getTxtPass().get(0).getAttribute("value");
			
		s.assertEquals(text, "1KU25Q","Check the password");
		
		btnClick(lp.getBtnLog().get(0));
		
		s.assertAll();

		}
}

	
