package com.dxc.maven.dataprovider;

import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import com.dxc.maven.utils.CSVUtils;
import com.dxc.maven.utils.XLSUtils;
import com.dxc.maven.utils.XLSXUtils;

public class MyDataProvider {

	@DataProvider(name = "inputData")
	public Object[] inputData() {
		System.out.println("data1");
		return new Object[] { new String[] { "9843346042", "abcd" }, new String[] { "7708944182", "efgh" } };
	}

	@DataProvider(name = "readCSVUtils")
	public Object[] readCSVUtils() {
		CSVUtils utils = new CSVUtils();
		List<HashMap<String, String>> data = utils
				.getCSVDataHash("./resources/data/flipkart.csv");
		Object[] obj = new Object[data.size()];
		for (int i = 0; i < data.size(); i++) {
			obj[i] = new String[] { data.get(i).get("Username"), data.get(i).get("Password") };
		}
		return obj;
	}
	
	@DataProvider(name = "readXLSXUtils")
	public Object[] readXLSXUtils() {
		XLSXUtils utils = new XLSXUtils();
		List<HashMap<String, String>> data = utils
				.getXLSDataHash("./resources/data/flipkart.csv");
		Object[] obj = new Object[data.size()];
		for (int i = 0; i < data.size(); i++) {
			obj[i] = new String[] { data.get(i).get("Username"), data.get(i).get("Password") };
		}
		return obj;
	}
	
	@DataProvider(name = "readXLSUtils")
	public Object[] readXLSUtils() {
		XLSUtils utils = new XLSUtils();
		List<HashMap<String, String>> data = utils
				.getXLSDataHash("./resources/data/flipkart.csv");
		Object[] obj = new Object[data.size()];
		for (int i = 0; i < data.size(); i++) {
			obj[i] = new String[] { data.get(i).get("Username"), data.get(i).get("Password") };
		}
		return obj;
	}

	/*
	 * @DataProvider(name="inputDataSimple1") public Object[] inputDataSimple1()
	 * { ExcelUtils utils = new ExcelUtils(); List<HashMap<String,String>> data
	 * = utils.getCSVDataHash(
	 * "C:\\Users\\pp62\\Downloads\\Study\\Practical_Examples\\flipkart1.csv");
	 * Object[] obj = new Object[data.size()]; for(int i=0;i<data.size();i++){
	 * obj[i] = new
	 * String[]{data.get(i).get("Username"),data.get(i).get("Password")}; }
	 * /*System.out.println("data1"); Object[] obj = new Object[1]; Object[] obj
	 * = new Object[2]; String[] a={"9843346042", "abcd"}; String[]
	 * b={"7708944182","efgh"}; obj[0]=a; obj[1]=b; return obj; }
	 */

	@DataProvider(name = "inputDataSimple2D")
	public Object[][] inputDataSimple2D() {
		return new Object[][] { { "9843346042", "abcd" }, { "7708944182", "efgh" } };
	}

}
