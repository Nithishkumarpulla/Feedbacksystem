package com.capg.FMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.FMS.entities.Course;
import com.capg.FMS.repository.ICourseRepository;


@Service
public class CourseServiceImpl implements ICourseService{

	@Autowired
 ICourseRepository courserepo;
		@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courserepo.save(course);
	}

	@Override
	public Course findByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return courserepo.findByCourseName(courseName);
		
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return course;
	}

	@Override
	public void deleteCourseById(Integer courseId) {
		// TODO Auto-generated method stub
		courserepo.deleteById(courseId);
		 
	}

}
