package org.tool.student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;





@Entity
@Table(name = "student_details")
public class StudentEntity {
	
	//unique_id(auto-generated-java),name,phone,email,password,registrationStatus	
	
	@Id
	@Column(name = "student_id")
	private long student_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private long phone;
	
	@Column(name = "password")
	private String password;
	
	
	
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name= "student_subject",
			joinColumns = {@JoinColumn(name ="student_id")},
			inverseJoinColumns = {@JoinColumn(name="subject_id")})
	
	
	private List< SubjectEntity > subjectList = new ArrayList<>();
	
	
	
	
	public StudentEntity() {
		
	}
	

	
	

	public StudentEntity( long student_id, String name, String email, long phone, String password, 
			List<SubjectEntity> subjectList) {
		this.student_id = student_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.subjectList = subjectList;
	}




	
	public long getStudent_id() {
		return student_id;
	}





	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public List<SubjectEntity> getSubjectList() {
		return subjectList;
	}


	public void setSubjects(List<SubjectEntity> subjectList) {
		this.subjectList = subjectList;
	}
	
	public void addSubject(SubjectEntity subject) {
		this.subjectList.add(subject);
	}
	
	public void removeSubject(SubjectEntity subject) {
		this.subjectList.remove(subject);
	}





	@Override
	public String toString() {
		
		return "StudentEntity [student_id=" + student_id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", subjectList=" + subjectList + "]";
	}
	
	
	
	
	
	
	

}
