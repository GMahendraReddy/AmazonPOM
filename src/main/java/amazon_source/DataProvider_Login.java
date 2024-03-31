package amazon_source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.*;

public class DataProvider_Login {
	
	@DataProvider(name="LoginCredentials")
	public static Object[][] getdata() throws EncryptedDocumentException, IOException{
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Mahi\\my workspace\\PageObjectModelProject\\TestData\\Amazon.xlsx");
	    Workbook wb = WorkbookFactory.create(fs);
		int noofrows = wb.getSheet("Login").getPhysicalNumberOfRows();
		int noofcolumn= wb.getSheet("Login").getRow(0).getLastCellNum();
		Object[][] LoginData = new Object[noofrows-1][noofcolumn];
		System.out.println(noofrows + " " + noofcolumn);
		
		for(int i =0;i<noofrows-1;i++) {
			for(int j=0;j<noofcolumn;j++) {
				
				DataFormatter df = new DataFormatter();
				LoginData[i][j]= df.formatCellValue(wb.getSheet("Login").getRow(i+1).getCell(j));
			}
		}
		
		wb.close();
		fs.close();
		return LoginData;
	}
	
//	@Test(dataProvider = "LoginCredentials")
//	public void login(String username, String password) {
//		
//		System.out.println(username);
//		System.out.println(password);
//	}

}
