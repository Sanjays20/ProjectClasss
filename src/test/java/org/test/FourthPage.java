package org.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FourthPage extends LibGlobal {

	@Test(groups="Smoke")
	private void tc7() throws IOException, InterruptedException {
		
		WebDriver driver=LoginPojo.driver;
		
		FourthPojo fp=new FourthPojo();
		
		SoftAssert s=new SoftAssert();
		
		type(fp.getfName().get(0), excelread(3, 0));
		
		String attribute = fp.getfName().get(0).getAttribute("value");
		
		s.assertTrue(attribute.contains("Sanjay"), "CHeck the firstname");
		
		type(fp.getlName().get(0), excelread(3, 1));
		
		String attribute2 = fp.getlName().get(0).getAttribute("value");
		
		s.assertEquals(attribute2, "saravanan","check the lastname");
		
		type(fp.getTxtAdd().get(0), excelread(3, 2));
		
		type(fp.getTxtCc().get(0), excelread(3, 3));
		
		SelectIndex(fp.getTxtCtype().get(0), 2);
		
		SelectValue(fp.getTxtMonnn().get(0), "3");
		
		SelectText(fp.getTxtExp().get(0), "2021");
		
		type(fp.getTxtCcv().get(0), excelread(3, 4));
		
		btnClick(fp.getTxtBook().get(0));
		
		s.assertAll();
		
		Thread.sleep(5000);

	}

	
	@Test(groups="Sanity")
	private void tc8() throws IOException, InterruptedException {
		
		WebDriver driver=LoginPojo.driver;
		
		FourthPojo fp=new FourthPojo();
		
		SoftAssert s=new SoftAssert();
		
		type(fp.getfName().get(0), excelread(3, 0));
		
		String attribute = fp.getfName().get(0).getAttribute("value");
		
		s.assertTrue(attribute.contains("Sanjay"), "CHeck the firstname");
		
		type(fp.getlName().get(0), excelread(3, 1));
		
		String attribute2 = fp.getlName().get(0).getAttribute("value");
		
		s.assertEquals(attribute2, "saravanan","check the lastname");
		
		type(fp.getTxtAdd().get(0), excelread(3, 2));
		
		type(fp.getTxtCc().get(0), excelread(3, 3));
		
		SelectIndex(fp.getTxtCtype().get(0), 2);
		
		SelectValue(fp.getTxtMonnn().get(0), "3");
		
		SelectText(fp.getTxtExp().get(0), "2021");
		
		type(fp.getTxtCcv().get(0), excelread(3, 4));
		
		btnClick(fp.getTxtBook().get(0));
		
		s.assertAll();
		
		Thread.sleep(5000);

	}

}
