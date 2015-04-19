package com.deo.spring.ws.service;

import javax.jws.WebService;

@WebService
public interface PersonService {

	public boolean findPrime(int number);
}
