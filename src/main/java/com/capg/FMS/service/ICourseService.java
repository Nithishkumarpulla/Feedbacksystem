package com.capg.FMS.service;

import org.springframework.stereotype.Service;

import com.capg.FMS.entities.Course;

@Service
public interface ICourseService {

	public Course addCourse(Course course);
	//public Course viewCourse(String courseName);
	public Course updateCourse(Course course);
	public void deleteCourseById(Integer courseId); 
	public Course findByCourseName(String courseName);
}
