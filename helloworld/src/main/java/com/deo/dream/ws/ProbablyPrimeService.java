package com.deo.dream.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/prime")
public class ProbablyPrimeService {

	@GET
	@Path("/{number}")
	@Produces("text/plain")
	public boolean isPrime(@PathParam("number")int number){
		System.out.println("Number : "+number);
		if(number%2==0)
		return false;
		else
			return true;
	}
}
