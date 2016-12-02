package com.ozlem.onetoone;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
@Table(name="employeedetail")
public class EmployeeDetail
{
	@Id
	@Column(name="employee_id", unique=true, nullable=false)
	@GeneratedValue(generator="gen")
	/*idlerin employee tablosundan,foreign stratejisi kullan�larak �retilmesini a�a��daki kod sat�r� ile sa�l�yoruz.*/ 
	@GenericGenerator(name="gen",strategy="foreign", parameters=@Parameter(name="property",value="employee"))
    private Long employeeId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Employee employee;
	
	/*default constructor bulunmak zorunda*/
	public EmployeeDetail()
	{
		
	}
	
	public EmployeeDetail(String street, String city, String state, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
