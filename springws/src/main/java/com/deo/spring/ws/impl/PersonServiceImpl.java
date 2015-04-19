package com.deo.spring.ws.impl;

import javax.jws.WebService;

import com.deo.spring.ws.service.PersonService;

@WebService(endpointInterface = "com.deo.spring.ws.service.PersonService")
public class PersonServiceImpl implements PersonService{

	public boolean findPrime(int number) {
		
		if(number%2==0)
		return false;
		else
			return true;
	}

}
