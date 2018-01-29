package com.target.entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 // http://localhost:8080//EntryManagement/entrymgmt/base
@Path("/base")
public class BaseEntry {
	@GET
	@Produces("application/json")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
		
		return fahrenheit.toString();
	}
 
	@Path("{c}")
	@GET
	@Produces("application/json")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		return fahrenheit.toString();
	}
}