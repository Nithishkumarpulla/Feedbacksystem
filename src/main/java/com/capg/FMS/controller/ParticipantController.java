package com.capg.FMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;
import com.capg.FMS.service.ParticipantServiceImpl;

//import antlr.collections.List;

@RestController
public class ParticipantController {
	
	@Autowired
	ParticipantServiceImpl participantservice;
	
	@PostMapping("/AddEmployee")
	
	public Employee addEmployee(@RequestBody Employee emp) {
		// TODO Auto-generated method stub
		return participantservice.addEmployee(emp);
	} 
	
	@GetMapping("/ViewEmployeeList")
	public List<Employee> viewEmployeeList() {
		// TODO Auto-generated method stub
		return participantservice.viewEmployeeList();
	}
	
	@GetMapping("/viewEmployeeById/{eid}")
	public Optional<Employee> findEmployeeById(@PathVariable int eid){
		return participantservice.findEmployeeById(eid);
	}

}
