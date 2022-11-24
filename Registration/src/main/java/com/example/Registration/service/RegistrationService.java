package com.example.Registration.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registration.domain.Registration;
import com.example.Registration.repository.RegistrationRepository;

@Service
public class RegistrationService {
 
	@Autowired
	private RegistrationRepository repo;
	
	public List<Registration> listAll(){
		return repo.findAll();
	}
	
	public void save(Registration std) {
		repo.save(std);
		
	}
	
	public Registration get(long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	
}
