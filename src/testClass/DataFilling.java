package testClass;

public class DataFilling {
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public DataFilling(String firstName, String lastName, String phoneNum, String email, String gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		PhoneNum = phoneNum;
		Email = email;
		Gender = gender;
	}
	private String FirstName = null;
    private String LastName = null;
    private String PhoneNum = null;
    private String Email = null;
    private String Gender = null;

    

}
