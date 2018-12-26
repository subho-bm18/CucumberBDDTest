package testClass;

public class Address {

private String City;
private String Pin;

public Address() {
	
}
public Address(String city, String pin) {
	super();
	City = city;
	Pin = pin;
}

public String getCity() {
return City;
}

public void setCity(String city) {
this.City = city;
}

public String getPin() {
return Pin;
}

public void setPin(String pin) {
this.Pin = pin;
}

}
