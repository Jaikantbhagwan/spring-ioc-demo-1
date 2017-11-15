package com.jacktest.maven.springiocdemo.serviceimpl;

import java.util.Random;

import com.jacktest.maven.springiocdemo.service.BusinessService;

public class EcommerceImpl implements BusinessService {

	public String offerService(String companyName) {
        Random random = new Random();
		
		String service = "\nAs an organizaton, " + companyName +
				" provides an outstanding ecommerce platform." +
				"\n the annual exceeds " + random.nextInt(revenue) + "dollars.";				
		return service;		
	}

}
