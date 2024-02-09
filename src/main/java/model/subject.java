package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@NamedQuery(name="subject.findAll", query="select r from subject r")

public class subject {
	@Id
	@Column(name="idsubject")
	private int idsubject;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "credits")
	private int credits;
	
	public subject() {}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	
}
