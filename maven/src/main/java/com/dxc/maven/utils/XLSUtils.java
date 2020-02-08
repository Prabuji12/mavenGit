package com.dxc.maven.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLSUtils {

	public HashMap<String, String[]> XLSDataHashArray;
	public HashMap<String, String> XLSColumnIndexHash;
	public Object[][] XLSDataArray;
	private List<HashMap<String, String>> XLSDataHash;
	private HSSFWorkbook book;
	private HSSFSheet sheet;
	private HSSFRow row;
	private HSSFRow rowheader;
	private HSSFCell cell;	
	
	
	public void readXLSXFile(String filepath){
		try{
			FileInputStream inputStream = new FileInputStream(new File(filepath));
			book = new HSSFWorkbook(inputStream);
			sheet = book.getSheetAt(0);
			rowheader = sheet.getRow(0);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public List<HashMap<String,String>> getXLSDataHash(String filepath){
		try{
			readXLSXFile(filepath);
			XLSDataHash = new ArrayList<HashMap<String,String>>();
			XLSDataHashArray = new HashMap<String,String[]>();
			XLSColumnIndexHash = new HashMap<String,String>();
			for(int i=1;i<sheet.getLastRowNum()-1;i++){
				row = sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum()-1;j++){
					XLSColumnIndexHash.put(rowheader.getCell(j).toString(), row.getCell(j).toString());
				}
				XLSDataHash.add(XLSColumnIndexHash);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}		
		return XLSDataHash;		
	}
		
}
