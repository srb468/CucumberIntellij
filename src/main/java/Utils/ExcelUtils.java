package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static FileInputStream fis;
    public static Sheet sheet;
    public static Workbook wb;
    public static Row row;

    static List<String> rowData = null;
    static List<List<String>> finalList = null;

    public static HashMap<String, List> objRepo;

    public static Sheet loadexcel(String filePath, String sheetName) throws IOException {
        //System.out.println("Loading excel data.....");
        File src = new File("C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\objRepo.xlsx");
        fis = new FileInputStream(src);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet(sheetName);
        wb.close();
        return sheet;
    }

    public static HashMap<String, List> readExcel(String sheetName) throws IOException {
        objRepo = new HashMap<String, List>();
        sheet = loadexcel("C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\objRepo.xlsx",sheetName);
        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            row = sheet.getRow(i);
            String col1 = row.getCell(0).getStringCellValue();
            List rowData = new ArrayList<String>();
            for (int j = 1; j < row.getLastCellNum(); j++) {
                String value = row.getCell(j).getStringCellValue();
                rowData.add(value);
            }
            objRepo.put(col1, rowData);
        }
        return objRepo;
    }

    public static List<List<String>> excelAsListOfList(String sheetName) throws IOException {

        // String fileName = "C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\TestData.xlsx";
        sheet = loadexcel("C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\TestData.xlsx",sheetName);
        for (int i = 0; i < sheet.getLastRowNum() + 1; i++) {
            row = sheet.getRow(i);
            List eachRow = new ArrayList<String>();
            for (int j = 0; j < row.getLastCellNum(); j++) {
                String value = row.getCell(j).getStringCellValue();
                eachRow.add(value);
            }
            finalList.add(eachRow);
        }
        return finalList;
    }
}