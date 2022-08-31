
package com.capg.FMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;

@Service
public interface IParticipantService {

	public Employee addEmployee(Employee emp);
	public List<Employee> viewEmployeeList();
	public Employee enrollParticipant(int empid,int cid);
	public List<Employee> viewParticipantList(int cid);
	public Optional<Employee> findEmployeeById(int empid); 
}
