//package com.languagex;
//
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.*;
//
//public class ExcelReader {
//    public static <T> T readExcelFile(String filePath, Class<T> clazz) throws IOException, IllegalAccessException, InstantiationException {
//        FileInputStream inputStream = new FileInputStream(new File(filePath));
//        Workbook workbook = new XSSFWorkbook(inputStream);
//
//        Sheet sheet = workbook.getSheetAt(0);
//        DataFormatter dataFormatter = new DataFormatter();
//
//        T result = clazz.newInstance();
//        int rowNum = 0;
//        for (Row row : sheet) {
//            if (rowNum == 0) { // skip the header row
//                rowNum++;
//                continue;
//            }
//            int cellNum = 0;
//            for (Cell cell : row) {
//                String cellValue = dataFormatter.formatCellValue(cell);
//                // populate the object based on the cell values
//                // ...
//                cellNum++;
//            }
//            rowNum++;
//        }
//
//        workbook.close();
//        return result;
//    }
//}
