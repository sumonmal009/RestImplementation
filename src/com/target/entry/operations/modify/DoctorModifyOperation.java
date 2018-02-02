package com.target.entry.operations.modify;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.target.entry.entity.Doctor;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.DoctorRecord;
@Path("/modify/doctor")
public class DoctorModifyOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response modifyDoctor(Doctor doctor) {
		
		return	ResponseBuilder.getResponse("modifyDoctor");
	}
	
	
}
