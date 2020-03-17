package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import PageClasses.Customer;

public class UtilityPage
{

	public static Object[][] excelReader()
	{

		String filePath = "D:\\pranav\\study\\javaEclipse\\DemoFrame\\DemoPOMFramework";
		String fileName = "TestData.xlsx";
		File file = new File(filePath + "\\" + fileName);
		ArrayList<String> dataArray = new ArrayList<String>();
		Object data[][] = null;
		try
		{
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sht = wb.getSheet("Sheet1");
			int rowCount = (sht.getLastRowNum() - sht.getFirstRowNum()) + 1;
			Row rw;
			data = new Object[rowCount][sht.getRow(0).getLastCellNum()];
			for (int i = 0; i < rowCount; i++)
			{
				rw = sht.getRow(i);
				for (int j = 0; j < sht.getRow(i).getLastCellNum(); j++)
				{
					data[i][j] = rw.getCell(j).getStringCellValue();
				}
			}
			for (int i = 0; i < rowCount; i++)
			{
				for (int j = 0; j < sht.getRow(i).getLastCellNum(); j++)
				{
					System.out.println(data[i][j]);
				}
			}

		}

		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}

	public static Object[][] TestcaseReader()
	{

		String filePath = "D:\\pranav\\study\\javaEclipse\\DemoFrame";
		String fileName = "TestData.xlsx";
		// String fileName = "TestcaseName.xlsx";
		File file = new File(filePath + "\\" + fileName);
		// ArrayList<String> dataArray = new ArrayList<String>();
		Map<String, Customer> custdata = new HashMap<String, Customer>();
		Map<Object, Object> testMap = new HashMap<Object, Object>();
		Object data[][] = null;
		try
		{
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sht = wb.getSheet("Sheet1");
			int rowCount = (sht.getLastRowNum() - sht.getFirstRowNum()) + 1;
			Row rw;
			data = new Object[rowCount][sht.getRow(0).getLastCellNum()];
			System.out.println(data);
			for (int i = 1; i < rowCount; i++)
			{
				rw = sht.getRow(i);
				for (int j = 0; j < sht.getRow(i).getLastCellNum(); j++)
				{
					// if (rw.getCell(j).getCellType()== 1)
					if (rw.getCell(j).getCellType() != null)
					{
						testMap.put(sht.getRow(0).getCell(j).getStringCellValue(), sht.getRow(i).getCell(j).getStringCellValue());
						// data[i][j] = rw.getCell(j).getStringCellValue();
					}
					else
						if (rw.getCell(j).getCellType() != null)
						{
							testMap.put(sht.getRow(0).getCell(j).getStringCellValue(),
									sht.getRow(i).getCell(j).getNumericCellValue());
							// data[i][j] = (int)(rw.getCell(j).getNumericCellValue());
						}
					data[i][j] = testMap;
					// System.out.println(data[i][j]);
				}

			}
			for (int i = 0; i < rowCount; i++)
			{
				for (int j = 0; j < sht.getRow(i).getLastCellNum(); j++)
				{
					System.out.println(data[i][j] + "i value" + i);
				}
			}
			for (Map.Entry<Object, Object> e1 : testMap.entrySet())
			{
				System.out.println(e1.getKey() + " values are:" + e1.getValue());
			}
		}

		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}
}
