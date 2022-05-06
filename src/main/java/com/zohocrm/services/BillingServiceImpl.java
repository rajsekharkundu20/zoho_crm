package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.zohocrm.entity.Billing;
import com.zohocrm.repositories.BillingRepository;

public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateBill(Billing bil) {
		billingRepo.save(bil);

	}

}
