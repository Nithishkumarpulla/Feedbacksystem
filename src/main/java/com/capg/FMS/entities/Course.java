package com.capg.FMS.entities;

import javax.persistence.*;

//import lombok.Getter;

@Entity
@Table(name = "Course")
public class Course {

	//@Getter
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	@Column(name = "Course_Name",nullable=false)
	private String courseName;
	@Column(name = "Course_Description",nullable=false)
	private String courseDescription;
	@Column(name = "Number_of_Days",nullable=false)
	private int noOfDays;
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
}



//server.port=9185
//spring.jpa.hibernate.ddl-auto=update
