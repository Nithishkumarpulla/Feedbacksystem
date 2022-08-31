
package com.capg.FMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;
//import com.capg.FMS.entities.Program;


@Repository
public interface IParticipantRepository extends JpaRepository<Employee,Integer>{
	
	//public Employee enrollParticipant(Employee emp, Course course);
	//public List<Employee> viewParticipantList (Course course); 

}
