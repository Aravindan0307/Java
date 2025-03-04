package excel;

import java.io.File;
import java.io.FileOutputStream;

public class Class {
	public static void main(String[] args) throws Exception {
		File f= new File("C:\\Users\\aravi\\eclipse-workspace\\Class\\target\\Book1.xlsx");
		FileOutputStream f1= new FileOutputStream(f);
		HSSFWorkbook book= new HSSFWorkbook();
		HSSFSheet sheet= book.createSheet();
		HSSFRow row= sheet.createRow(0);
		HSSFCell cell= row.createCell();
		cell.setCellValue("Vikram");
		book.write(f1);
		
	
		
	}

}
