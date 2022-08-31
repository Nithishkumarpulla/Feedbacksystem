package com.capg.FMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;
import com.capg.FMS.repository.IParticipantRepository;

@Service
public class ParticipantServiceImpl implements IParticipantService{
	
	@Autowired
	IParticipantRepository participantrepo;

	@Override
	public Employee enrollParticipant(int empid, int cid) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> viewParticipantList(int cid) {
		// TODO Auto-generated method stub
		participantrepo.findAll();
		return new ArrayList<Employee>();
			
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return participantrepo.save(emp);
	}

	@Override
	public List<Employee> viewEmployeeList() {
		// TODO Auto-generated method stub
		return (List<Employee>)participantrepo.findAll();
		

	}

	@Override
	public Optional<Employee> findEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return participantrepo.findById(empid);
	}

	
}
