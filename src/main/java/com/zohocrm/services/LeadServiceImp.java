package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repositories.LeadRepository;

@Service
public class LeadServiceImp implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLeadData(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> findAllLeads() {
		
		List<Lead> leads = leadRepo.findAll();
		
		return leads;
	}

	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteData(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead getLeadDetails(long id) {
		
		Lead byId = leadRepo.getById(id);
		
		return byId;
	}

	

	
	
	
}
