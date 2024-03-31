package amazon_source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Ama_LoginDDT {
	public static String username;
	public static String password;
	
	public static void getdata() throws EncryptedDocumentException, IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Mahi\\eclipse-workspace\\PageObjectModelProject\\TestData\\Amazon.xlsx");
		Workbook wp = WorkbookFactory.create(fs);
        username = NumberToTextConverter.toText(wp.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
        password = wp.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		
	}

}
