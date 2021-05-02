package Entities;

import java.util.Date;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityIdentityNumber;
	private double userMoney;
	private Date dateofBirth;
	
	public User() {
		
	}


	public User(int id, String firstName, String lastName, String nationalityIdentityNumber, double userMoney,Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentityNumber = nationalityIdentityNumber;
		this.userMoney = userMoney;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityIdentityNumber() {
		return nationalityIdentityNumber;
	}


	public void setNationalityIdentityNumber(String nationalityIdentityNumber) {
		this.nationalityIdentityNumber = nationalityIdentityNumber;
	}


	public double getUserMoney() {
		return userMoney;
	}


	public void setUserMoney(double userMoney) {
		this.userMoney = userMoney;
	}


	public Date getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	

	

	
	
}
