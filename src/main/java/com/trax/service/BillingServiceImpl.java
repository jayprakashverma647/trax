package com.trax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Billing;
import com.trax.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingrepo;
	
	@Override
	public void saveBill(Billing bill) {
		billingrepo.save(bill);
	}

}
