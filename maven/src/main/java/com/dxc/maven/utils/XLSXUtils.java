package com.dxc.maven.utils;

import java.io.FileReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXUtils {

	public HashMap<String, String[]> XLSXDataHashArray;
	public HashMap<String, String> XLSXColumnIndexHash;
	public Object[][] XLSXDataArray;
	private List<HashMap<String, String>> XLSXDataHash;
	private XSSFWorkbook book;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFRow rowheader;
	private XSSFCell cell;	
	
	
	public void readXLSXFile(String filepath){
		try{
			book = new XSSFWorkbook(filepath);
			sheet = book.getSheetAt(0);
			rowheader = sheet.getRow(0);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public List<HashMap<String,String>> getXLSDataHash(String filepath){
		try{
			readXLSXFile(filepath);
			XLSXDataHash = new ArrayList<HashMap<String,String>>();
			XLSXDataHashArray = new HashMap<String,String[]>();
			XLSXColumnIndexHash = new HashMap<String,String>();
			for(int i=1;i<sheet.getLastRowNum()-1;i++){
				row = sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum()-1;j++){
					XLSXColumnIndexHash.put(rowheader.getCell(j).toString(), row.getCell(j).toString());
				}
				XLSXDataHash.add(XLSXColumnIndexHash);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}		
		return XLSXDataHash;		
	}
		
}
