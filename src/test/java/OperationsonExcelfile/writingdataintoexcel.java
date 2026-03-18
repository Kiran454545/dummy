package OperationsonExcelfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdataintoexcel {

	public static void main(String[] args) throws IOException 
	{
        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\kirantestcreated.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheetstart");
		
		XSSFRow row1=sheet.createRow(0);
		    row1.createCell(0).setCellValue("Kiran");
		    row1.createCell(1).setCellValue("Prasann");
		    row1.createCell(2).setCellValue("Aniket");
		    
		    XSSFRow row2=sheet.createRow(1);
		    row2.createCell(0).setCellValue("Smart");
		    row2.createCell(1).setCellValue("Brave");
		    row2.createCell(2).setCellValue("Black");

		    XSSFRow row3=sheet.createRow(2);
		    row3.createCell(0).setCellValue("500");
		    row3.createCell(1).setCellValue("400");
		    row3.createCell(2).setCellValue("200");
		    
		    workbook.write(file);
		    workbook.close();
		    file.close();
		    System.out.println("File created");
	}

}
