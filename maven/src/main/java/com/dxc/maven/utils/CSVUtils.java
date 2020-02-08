package com.dxc.maven.utils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVUtils {
	public HashMap<String, String[]> csvDataHashArray;
	public HashMap<String, String> csvColumnIndexHash;
	public Object[][] csvDataArray;
	private List<HashMap<String, String>> csvDataHash;
	public List<HashMap<String,String>> getCSVDataHash(String filepath){
		try{
			csvDataHash = new ArrayList<HashMap<String,String>>();
			CSVReader reader = new CSVReader(new FileReader(filepath));
			List<String[]> rowEntries = reader.readAll();
			String[] rowHeader = rowEntries.get(0);
			rowEntries.remove(0);
			for(String[] row : rowEntries){
				HashMap<String,String> map = new HashMap<String,String>();
				for(int i=0;i<row.length;i++){
					map.put(rowHeader[i], row[i]);
				}
				csvDataHash.add(map);
			}
			reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return  csvDataHash;
	}
	
	/*public static void setExcelFile(String path, String sheetName)throws Exception{
		try{
			FileInputStream fileIn = new FileInputStream(path);
			excelWBook = new XSSFWorkbook(fileIn);
		    excelWSheet = excelWBook.getSheet(sheetName);
		}catch(Exception e){
			throw(e);
		}
	}
	
	public static String getCellData(int rowNum,int colNum)throws Exception{
		try{
			cell = excelWSheet.getRow(rowNum).getCell(colNum);
			String cellData = cell.getStringCellValue();
			return cellData;
		}catch(Exception e){
			return "";
		}
	}
	
	public static void setCellData(String result,int rowNum,int colNum)throws Exception{
		try{
			row = excelWSheet.getRow(rowNum);
			cell = row.getCell(colNum);
			if(cell==null){
				cell = row.createCell(colNum);
				cell.setCellValue(result);
			}else
				cell.setCellValue(result);
			FileOutputStream fileOut = new FileOutputStream("location");
			excelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e){
			throw(e);
		}		
		
	}*/
	
	
}
