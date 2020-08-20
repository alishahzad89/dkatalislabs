package test.java.dkatalis;

import main.java.com.dkatalis.api.DataReader;
import main.java.com.dkatalis.api.ResponseValidator;
import org.testng.annotations.Test;

import java.util.Map;

public class dkatalistest {
	private Map<String, String> testData;

	@Test(description = "Compare response of api listed on two files")
	public void compareResponse() throws Exception {
		//Read Test data from "testdata.json"
		testData = DataReader.readData("testdata.json", "CompareResponse");
		new ResponseValidator().validateResponse(testData.get("FileOneName"), testData.get("FileTwoName"));
	}
}
