package com.jacktest.maven.springiocdemo.serviceimpl;

import java.util.Random;

import com.jacktest.maven.springiocdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService{

	public String offerService(String companyName) {
		Random random = new Random();
		
		String service = "\nAs an organizaton, " + companyName +
				" offers world class cloud computing infrastructure." +
				"\n the annual exceeds " + random.nextInt(revenue) + "dollars.";				
		return service;
	}

}
