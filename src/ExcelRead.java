import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	XSSFWorkbook wb;
	XSSFSheet ws;
	XSSFRow row;
	XSSFCell cell;

	public String readData(String file, String sheet) {

		try {
			wb = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ws = wb.getSheet(sheet);

		// row = ws.getRow(0);
		// cell = row.getCell(0);

		int rowlast = ws.getLastRowNum();
		System.out.println(rowlast + " " + "rowcount");
		// int celllast = row.getLastCellNum();
		// System.out.println(celllast+" "+"cellcount");
		String data = null;

		for (int i = 0; i <= rowlast; i++) {

			int n = ws.getRow(i).getLastCellNum();

			for (int j = 0; j < n; j++) {

				data = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);

			}

		}

		return data;

	}

	public static void main(String[] args) {

		ExcelRead ex = new ExcelRead();

		String value = ex.readData("D:\\data.xlsx", "Data");

	}

}
