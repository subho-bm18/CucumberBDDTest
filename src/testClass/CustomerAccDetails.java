package testClass;

public class CustomerAccDetails {

private String FirstName;
private String LastName;
private String PhoneNum;
private String Email;
private String Gender;
private Address Address;

public CustomerAccDetails() {
}

/**
* 
* @param lastName
* @param phoneNum
* @param address
* @param email
* @param gender
* @param firstName
*/
public CustomerAccDetails(String firstName, String lastName, String phoneNum, String email, String gender, Address address) {
super();
this.FirstName = firstName;
this.LastName = lastName;
this.PhoneNum = phoneNum;
this.Email = email;
this.Gender = gender;
this.Address = address;
}
public String getFirstName() {
return FirstName;
}

public void setFirstName(String firstName) {
this.FirstName = firstName;
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
this.PhoneNum = phoneNum;
}

public String getEmail() {
return Email;
}

public void setEmail(String email) {
this.Email = email;
}

public String getGender() {
return Gender;
}

public void setGender(String gender) {
this.Gender = gender;
}

public Address getAddress() {
return Address;
}

public void setAddress(Address address) {
this.Address = address;
}

}