package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Locate & open file
		XSSFWorkbook book = new XSSFWorkbook ("./test-data/Testleaf.xlsx");
		//Particular Sheet
		XSSFSheet sheet = book.getSheetAt(0);
		//Total no of rows
		int rowNum = sheet.getLastRowNum();
		System.out.println("row Number");		
	}

}
