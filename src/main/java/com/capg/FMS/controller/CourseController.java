package com.capg.FMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.FMS.entities.Course;
import com.capg.FMS.service.CourseServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j  // log.info("");
@RestController
public class CourseController {
	
	@Autowired
	private CourseServiceImpl courseservice;
	
	@PostMapping("/AddCourse")
	public Course addCourse(@RequestBody Course course) {
		// TODO Auto-generated method stub
		return courseservice.addCourse(course);
	} 
	
	@GetMapping("/ViewCourse/{cName}")
	public Course findByCourseName(@PathVariable String cName){
		// TODO Auto-generated method stub
		return courseservice.findByCourseName(cName);
	}

	@DeleteMapping("/DeleteCourse/{cid}")
	public String deleteCourse(@PathVariable Integer cid) {
		// TODO Auto-generated method stub
		 courseservice.deleteCourseById(cid);
		 return "Entry Deleted";
	}
	
	
	//(cName) String courseName) {
}
