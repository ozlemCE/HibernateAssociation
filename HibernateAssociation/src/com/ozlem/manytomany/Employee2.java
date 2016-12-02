package com.ozlem.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="employee2")
public class Employee2 
{
	@Id
	@Column(name="employee_id")
	@GeneratedValue
	private Long employeeId;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
    
    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="employee_meeting",
               joinColumns={@JoinColumn(name="employee_id")},
                inverseJoinColumns={@JoinColumn(name="meeting_id")} )
    private Set<Meeting> meetings=new HashSet<Meeting>();
    
    public Employee2() {}
    
    public Employee2(String firstname,String lastname)
    {
    	this.firstname=firstname;
    	this.lastname=lastname;
    }

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
	}
    

}
