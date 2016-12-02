package com.ozlem.manytomany;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="meeting")
public class Meeting {

	@Id
	@Column(name="meeting_id")
	@GeneratedValue
	private Long meetingId;

	@Column(name="subject")
	private String subject;
	
	@Column(name="meeting_date")
	private Date meetingDate;
	
	@ManyToMany(mappedBy="meetings")
	private Set<Employee2> employees = new HashSet<Employee2>();
	
	public Meeting(String subject) {
		this.subject = subject;
		this.meetingDate = new Date();
	}
}
