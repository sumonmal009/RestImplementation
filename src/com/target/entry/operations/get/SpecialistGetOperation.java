package com.target.entry.operations.get;

import java.util.LinkedList;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.SpecialistRecord;
import com.target.entry.persistance.baseFeature.Message;

@Path("/get/specialist")
public class SpecialistGetOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSpecialist(String speciality) {
LinkedList<String> doctorIds = SpecialistRecord.doctorSpecialistTable.get(speciality);
		
		return	ResponseBuilder.getResponse((doctorIds!=null && !doctorIds.isEmpty())?doctorIds:Message.NOT_FOUND);
	}
}
