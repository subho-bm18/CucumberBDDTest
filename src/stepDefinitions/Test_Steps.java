package stepDefinitions;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testClass.DataFilling;
import test.JsonDataReader;
import testClass.CustomerAccDetails;
import testClass.Address;
import testClass.CustDetailsUI;

public class Test_Steps {
	//WebDriver webdriver = null;
	private static JsonDataReader jsonDataReader=new JsonDataReader();
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" I am Opening Chrome...");
		//WebDriver webdriver = null;
		//System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		//webdriver=new ChromeDriver();
		//webdriver.manage().window().maximize();
	    //throw new PendingException();
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" I am Lnding to Homepage...");
		//webdriver.get("https://www.google.com");

	    //throw new PendingException();
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(" I am Displaying SearchBox...");
	    //throw new PendingException();
	}

	@Given("^I navigates to XYZ application$")
	public void i_navigates_to_XYZ_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Opened XYZ Application...");

	   
	}

	@When("^I enters the following credentials$")
	public void i_enters_the_following_credentials(DataTable dt1) throws Throwable {
      System.out.println(" Entering Login Credentials");
	  List<String> cred=  dt1.asList(String.class);
	  String credArray[][] = { {"abc","xyz"},{"dez","xy123"},{"vcd","zzz"}};
	  int k=0;
	  for(int i=0; (i<credArray.length && k<cred.size());i++)
	  {
		  for(int j=0 ; j<credArray[i].length;j++,k++)
		  {
			  //System.out.println(credArray[i][j]);
			  //System.out.println(cred.get(k));

			  Assert.assertEquals(credArray[i][j], cred.get(k));
			  System.out.println("Test Data Set: "+i+"Matched");
		  }
		 
	  }
	  
	}

	@Given("^I opens XYZ application$")
	public void i_opens_XYZ_application() throws Throwable {
		System.out.println(" Opened XYZ Application...");
	   
	}

	@When("^I fill up the new account opening form with the below data$")
	public void i_fill_up_the_new_account_opening_form_with_the_below_data(DataTable dt2) throws Throwable {
	    List<Map<String,String>> dataF = dt2.asMaps(String.class, String.class);
	    //Map<String,DataFilling> dataF = dt2.asMap(String.class, DataFilling.class);

	    for(int i=0;i<dataF.size();i++)
	    {
	    	System.out.println(dataF.get(i).get("FirstName"));
	    	System.out.println(dataF.get(i).get("LastName"));
	    	System.out.println(dataF.get(i).get("PhoneNum"));
	    	System.out.println(dataF.get(i).get("Email"));
	    	System.out.println(dataF.get(i).get("Gender"));
	    	System.out.println(dataF.get(i).get("Address"));

	    }
	}

	@When("^I fetch the details from JSON input file$")
	public void i_fetch_the_details_from_JSON_input_file() throws Throwable {
		
		String customerName ="Subhodeep";
		//CustomerAccDetails cust =  jsonDataReader.getCustomerByName(customerName);
		List<CustomerAccDetails> cust = jsonDataReader.getCustomerData();
		System.out.println("Total Set : "+ cust.size());
		for(int i=0;i<cust.size();i++)
	    {
			System.out.println("Record "+(i+1));
	    	System.out.println(cust.get(i).getFirstName());
	    	System.out.println(cust.get(i).getLastName());
	    	System.out.println(cust.get(i).getPhoneNum());
	    	System.out.println(cust.get(i).getEmail());
	    	System.out.println(cust.get(i).getGender());
	    	System.out.println(cust.get(i).getAddress().getCity());
	    	System.out.println(cust.get(i).getAddress().getPin());

	    }
	    
	}
	@When("^I click on Save Button$")
	public void i_click_on_Save_Button() throws Throwable {
	    
	}

	@Then("^the details should be saved$")
	public void the_details_should_be_saved() throws Throwable {
	  
	}
	
	@Then("^I should be able to verify the details in UI with input file$")
	public void i_should_be_able_to_verify_the_details_in_UI_with_input_file() throws Throwable {
		
		System.out.println("verifying the details from UI with respect to Input File....");
		String firstName[]={"Subhodeep","Arpita","Vombol"};
		String lastName[]={"Ganguly","Ganguly","Bhatta"};
		String phoneNum[]={"9748084401","9988667788","8971652225"};
		String email[]={"abc@gmail.com","gef@gmail.com","xyz@gmail.com"};
		String gender[]={"Male","Female","Kid"};
		String address[][]={{"Delhi","110088"},{"Kolkata","743133"},{"Punjab","700159"}};
		Address ab = null;
		List<CustDetailsUI> custU= new ArrayList<CustDetailsUI>();
	for (int i=0; i<3 ; i++)
	{
		String FirstName=firstName[i];
	    String LastName=lastName[i];
	    String PhoneNum = phoneNum[i];
	    String Email=email[i];
	    String Gender=gender[i];
	    for (int j=0; j<=2 ; j++)
	    {
	    //List<Address> ab= new ArrayList<Address>();
	    //ab.add((Address) Arrays.asList(address[i][j]));
	    	int k=0;
	    	ab = new Address();
	    	ab.setCity(address[i][k]);
	    	k++;
	    	ab.setPin(address[i][k]);
	    }
	    
	    
	    CustDetailsUI cc= new CustDetailsUI(FirstName,LastName,PhoneNum,Email,Gender,ab);
		System.out.println("Saving the details in ArrayList<Object> for Row "+i);

	    custU.add(cc);
	    
	}
	
	for(CustDetailsUI ccu : custU)
	{
		System.out.println(ccu.getFirstName());
		System.out.println(ccu.getLastName());
		System.out.println(ccu.getPhoneNum());
		System.out.println(ccu.getEmail());
		System.out.println(ccu.getGender());
		System.out.println(ccu.getAddress().getCity());
		System.out.println(ccu.getAddress().getPin());
	}
	
	
		
				
	    
	}



}
