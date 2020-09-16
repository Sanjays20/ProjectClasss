package org.test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchPage extends LibGlobal {

	
	@Test(groups="Smoke")
	private void tc3() throws InterruptedException {
		
		WebDriver driver=LoginPojo.driver;
		
		SearchPojo se=new SearchPojo();
		
		SoftAssert s=new SoftAssert();
		
		SelectIndex(se.getTxtLoc().get(0), 3);
		
		SelectValue(se.getTxtHotel().get(0), "Hotel Cornice");
		
		String text = se.getTxtHotel().get(0).getText();
		
		s.assertTrue(text.contains("Hotel Cornice"), "Check the hotel name");
		
		SelectText(se.getTxtType().get(0), "Deluxe");
		
		SelectIndex(se.getTxtRoom().get(0), 2);
		
		type(se.getTxtIn().get(0), "11/09/2020");
		
		type(se.getTxtOut().get(0), "12/09/2020");

		SelectValue(se.getTxtAdult().get(0), "2");
		
		SelectText(se.getTxtChild().get(0), "3 - Three");
		
		btnClick(se.getTxtSub().get(0));
		
		s.assertAll();
	}

	
	@Test(groups="Sanity")
	private void tc4() throws InterruptedException {
		
		WebDriver driver=LoginPojo.driver;
		
		SearchPojo se=new SearchPojo();
		
		SoftAssert s=new SoftAssert();
		
		SelectIndex(se.getTxtLoc().get(0), 3);
		
		SelectValue(se.getTxtHotel().get(0), "Hotel Cornice");
		
		String text = se.getTxtHotel().get(0).getText();
		
		s.assertTrue(text.contains("Hotel Cornice"), "Check the hotel name");
		
		SelectText(se.getTxtType().get(0), "Deluxe");
		
		SelectIndex(se.getTxtRoom().get(0), 2);
		
		type(se.getTxtIn().get(0), "11/09/2020");
		
		type(se.getTxtOut().get(0), "12/09/2020");

		SelectValue(se.getTxtAdult().get(0), "2");
		
		SelectText(se.getTxtChild().get(0), "3 - Three");
		
		btnClick(se.getTxtSub().get(0));
		
		s.assertAll();
	}

}
