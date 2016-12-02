package com.ozlem.onetomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="department1")
public class Department
{
	@Id
	@GeneratedValue
	@Column(name="department_id")
	private Long departmentId;
	
	@Column(name="dept_name")
	private String departmentname;
	
	/* Kurdu�umuz ili�ki bidirectional(�ift y�nl�) oldu�undan burda da OneToMany notasyonunu ekl�yoruz.*/
	/*OneToMany ili�kilerinde mappedBy, foreign key i bulunduran entity i�in kullan�l�r.*/
	@OneToMany(mappedBy="department")
	private Set<Employee1> employees;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Set<Employee1> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee1> employees) {
		this.employees = employees;
	}

}
