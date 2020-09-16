package org.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FifthPage extends LibGlobal {

	
	@Test(groups="Smoke")
	private void tc9() throws IOException, InterruptedException {
		
		WebDriver driver=LoginPojo.driver;
	
		Thread.sleep(5000);
		
		FifthPojo ft=new FifthPojo();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", ft.getTxtse().get(0));
		
		String attribute = ft.getTxtOrd().get(0).getAttribute("value");
		System.out.println(attribute);
		excelwrite(1, 2, attribute);

	}

	
	@Test(groups="Sanity")
	private void tc10() throws IOException, InterruptedException {
		
		WebDriver driver=LoginPojo.driver;
	
		Thread.sleep(5000);
		
		FifthPojo ft=new FifthPojo();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", ft.getTxtse().get(0));
		
		String attribute = ft.getTxtOrd().get(0).getAttribute("value");
		System.out.println(attribute);
		excelwrite(1, 2, attribute);

	}

}
