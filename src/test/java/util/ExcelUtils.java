package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFSheet sheet;
	static XSSFWorkbook wb;
	
	public ExcelUtils(String excelPath,String sheetName) {
		
		try {
			wb = new XSSFWorkbook(excelPath); //"./data/testData.xlsx"
			sheet=wb.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getRowCount() {
				
		try {
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows :"+rowCount);
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	
	public static String getCellStringData(int rowNum,int colNum) {
		
		
			String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			return cellData;
		
		
	}
	
public static double getCellNumsData(int rowNum,int colNum) {
		
		

			double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
			return cellData;
	
}

}
