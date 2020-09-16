package org.test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ThirdPage extends LibGlobal {

	
	@Test(groups="Smoke")
	private void tc5() {
		
		WebDriver driver=LoginPojo.driver;
		
		ThirdPojo tp=new ThirdPojo();
		
		btnClick(tp.getTxtRadio().get(0));
		
		btnClick(tp.getTxtContinue().get(0));

	}

	
	
	
	@Test(groups="Sanity")
	private void tc6() {
		
		WebDriver driver=LoginPojo.driver;
		
		ThirdPojo tp=new ThirdPojo();
		
		btnClick(tp.getTxtRadio().get(0));
		
		btnClick(tp.getTxtContinue().get(0));

	}

	
}
