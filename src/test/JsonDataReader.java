package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import testClass.CustomerAccDetails;
import testClass.Address;



public class JsonDataReader {
private final String customerFilePath = "D:\\Data Table\\CustomerAccDetails.json";
private List<CustomerAccDetails> customerList;

public JsonDataReader(){
	customerList = getCustomerData();
	System.out.println("LOADED..");
}

public List<CustomerAccDetails> getCustomerData() {
	Gson gson = new Gson();
	BufferedReader bufferReader = null;
	try {
		bufferReader = new BufferedReader(new FileReader(customerFilePath));
		CustomerAccDetails[] customers = gson.fromJson(bufferReader, CustomerAccDetails[].class);
		return Arrays.asList(customers);
	}catch(FileNotFoundException e) {
		throw new RuntimeException("Json file not found at path : " + customerFilePath);
	}finally {
		try { if(bufferReader != null) bufferReader.close();}
		catch (IOException ignore) {}
	}
}
	
public final CustomerAccDetails getCustomerByName(String customerName){
	System.out.println("FETCHING...");
	for(CustomerAccDetails customer : customerList) {
		 if(customer.getFirstName().equalsIgnoreCase(customerName)) return customer;
		 }
		 return null;}


}