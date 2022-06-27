package com.trax.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Lead;
import com.trax.repositories.LeadRepository;
@Service
public class LeadServiceImp implements LeadService {
	
	@Autowired
	public LeadRepository repo;

	@Override
	public void saveLeadInfo(Lead lead) {
		repo.save(lead);

	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = repo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = repo.findAll();
		return leads;
	}

	

}
