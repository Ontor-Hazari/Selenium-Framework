package utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadXLdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  ReadXLdata readXLdata = new ReadXLdata();
		  readXLdata.getData("login");
             
	}
	
	
	public String[][] getData(String excelSheetName) throws EncryptedDocumentException, IOException
	{
	
		
		   File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
		   FileInputStream fis = new FileInputStream(f);
		   Workbook wb = WorkbookFactory.create(fis);
		   
		   Sheet sheet = wb.getSheet(excelSheetName);
		   int totalRows = sheet.getLastRowNum();
		   System.out.println(totalRows);
		   Row rowCell = sheet.getRow(0);
		   
		   int totalCols = rowCell.getLastCellNum();
		   System.out.println(totalCols);
		   
		  DataFormatter dataFormatter = new DataFormatter();
		  
		  String testData[][] = new String[totalRows][totalCols];
				  
			           for(int i=1;i<=totalRows;i++)   
			           {
			        	   for(int j=0;j<totalCols;j++)
			        	   {
			        		   testData[i-1][j]=dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
			        		   System.out.println(testData[i-1][j]);
			        	   }
			           }
			           
			           
			        
				  
			        
		   
		
		
		
	     return testData;
	
		    
	   
		
	}
	

}
