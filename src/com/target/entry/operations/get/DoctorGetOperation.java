package com.target.entry.operations.get;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.entity.Doctor;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.DoctorRecord;
import com.target.entry.persistance.baseFeature.Message;

@Path("/get/doctor")
public class DoctorGetOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDoctor(String doctorId) {
		Doctor doctor = DoctorRecord.doctorRecordTable.get(doctorId);
		
		return	ResponseBuilder.getResponse((doctor!=null)?doctor:Message.NOT_FOUND);
	}
	
	
}
