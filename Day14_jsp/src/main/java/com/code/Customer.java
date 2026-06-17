package com.code;
public class Customer {
private String name;
private String city;
private String email,pwd;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Customer() {
	super();
	System.out.println("Default Customer");
	this.name = "ram";
	this.city = "pune";
	this.email = "ram@gmail.com";
	this.pwd = "ram@123";
}
public Customer(String name, String city, String email, String pwd) {
	super();
	this.name = name;
	this.city = city;
	this.email = email;
	this.pwd = pwd;
	System.out.println("---Parameter Customer---");
}
@Override
public String toString() {
	return "Customer [name=" + name + ", city=" + city + ", email=" + email + ", pwd=" + pwd + "]";
}

public String getDetails()
{
	return "This is Return by Customer";
}


}
