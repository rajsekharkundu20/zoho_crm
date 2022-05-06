package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {

	public void saveLeadData(Lead lead);

	public List<Lead> findAllLeads();

	public Lead getLead(long id);
	
	public Lead getLeadDetails(long id);

	public void deleteData(long id);

	
}
