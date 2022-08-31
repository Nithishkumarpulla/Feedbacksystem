package com.capg.FMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.capg.FMS.entities.Course;

//@EnableJpaRepositories
@Repository
public interface ICourseRepository extends JpaRepository<Course,Integer>{
	
	//public Course addCourse(Course course);
	//public Course viewCourse(Course course);
	//public Course updateCourse(Course course);
	//public Course deleteCourse(Course course);
	public Course findByCourseName(String courseName);
	

}
