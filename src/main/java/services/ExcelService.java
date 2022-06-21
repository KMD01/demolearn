package services;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelService {

    public void createExcel(XSSFSheet spreadsheet) throws Exception {
        buildHeader(spreadsheet);
        buildBody(spreadsheet);
        saveFile(spreadsheet.getWorkbook());
    }

    private void buildHeader(XSSFSheet sheet) {
        XSSFRow row = sheet.getRow(0);
        buildCells(row,1,blackCellStyle(sheet.getWorkbook()),"LP" );
        buildCells(row,2,blackCellStyle(sheet.getWorkbook()),"NAME" );
        buildCells(row,3,blackCellStyle(sheet.getWorkbook()),"DATE OF BIRTH" );
    }

    private void buildCells(XSSFRow row, int columnIndex,  XSSFCellStyle cellStyle, String columnValue ) {
        XSSFCell cell = row.createCell(columnIndex);
        cell.setCellStyle(cellStyle);
        cell.setCellValue(columnValue);
    }

    private XSSFCellStyle blackCellStyle(XSSFWorkbook workbook) {
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setColor(IndexedColors.WHITE.getIndex());
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setFillForegroundColor(IndexedColors.BLACK.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        return cellStyle;
    }

    private void buildBody(XSSFSheet sheet){
        // This data needs to be written (Object[])
        Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
        //studentData.put("1", new Object[]{"LP", "NAME", "YEAR"});
        studentData.put("2", new Object[]{"1", "Christopher", "1984"});
        studentData.put("3", new Object[]{"2", "Anna", "1988"});
        studentData.put("4", new Object[]{"3", "Alicia", "2015"});
        studentData.put("5", new Object[]{"4", "Julia", "2016"});
        Set<String> keyId = studentData.keySet();
        int rowid = 1;

        // writing the data into the sheets...
        for (String key : keyId) {
            XSSFRow row = sheet.createRow(rowid++);
            Object[] objectArr = studentData.get(key);
            int cellid = 1;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }
    }

    private void saveFile(XSSFWorkbook workbook){
        try{
            FileOutputStream out = new FileOutputStream( new File("E:/Family.xlsx"));
            workbook.write(out);
            out.close();}
        catch (Exception e){
            System.out.println("Jest error!");
        }
    }
}
