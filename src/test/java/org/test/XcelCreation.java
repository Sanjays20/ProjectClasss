package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelCreation {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\SANJAY\\eclipse-workspace\\TestNG12.30\\XcelSheets\\Sample_datas.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Myinput");
		
		Row r = s.getRow(3);
		
		Cell c = r.createCell(1);
		
		c.setCellValue("saravanan");
		
		FileOutputStream fout=new FileOutputStream(f);
		
		w.write(fout);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
