import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	static XSSFWorkbook wb = null;
	static XSSFSheet ws = null;
	static String v = null;

	public static int rowCounts() {

		try {
			wb = new XSSFWorkbook("D:\\data.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ws = wb.getSheet("Data");

		int rownum = ws.getLastRowNum();
		
		System.out.println(rownum);

		return rownum;

	}

	public static int cellCount(int n) {

		try {
			wb = new XSSFWorkbook("D:\\data.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ws = wb.getSheet("Data");

		XSSFRow row = ws.getRow(n);
		int cellnum = row.getLastCellNum();
		
		System.out.println(cellnum);
		return cellnum;

	}

	public static String getData(int rown, int celln) {

		try {
			wb = new XSSFWorkbook("D:\\data.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ws = wb.getSheet("Data");

		XSSFRow row = ws.getRow(rown);

		XSSFCell cell = row.getCell(celln);

		String value = cell.getStringCellValue();

		return value;

	}

	public static void getvalues() {

		for (int i = 1; i <= rowCounts(); i++) {
			
			for (int j = 0; j <=cellCount(i); j++) {
				
				
				
				v=getData(i, j);
				
				System.out.println(v);
				
			}
			
			
			
		}
		
		
			

		

	}

	public static void main(String[] args) {

		getvalues();
	}

}
