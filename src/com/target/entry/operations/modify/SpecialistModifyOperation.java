package com.target.entry.operations.modify;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.operations.util.ResponseBuilder;
@Path("/modify/specialist")
public class SpecialistModifyOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response modifySpecialist(String speciality, String doctorId) {
		return ResponseBuilder.getResponse("modifySpecialist");
	}
}
