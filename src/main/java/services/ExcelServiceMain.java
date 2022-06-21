package services;

import org.apache.poi.xssf.usermodel.*;

public class ExcelServiceMain {

    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Members");
        XSSFRow row = spreadsheet.createRow(0);

        ExcelService excelService = new ExcelService();
        excelService.createExcel(spreadsheet);

    }
}
