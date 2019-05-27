package com.example.springdemos;

public class Address {
	
	private String stNo;
	private String city;
	private String zipCode;
	public String getStNo() {
		return stNo;
	}
	public void setStNo(String stNo) {
		this.stNo = stNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [stNo=" + stNo + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	

}
