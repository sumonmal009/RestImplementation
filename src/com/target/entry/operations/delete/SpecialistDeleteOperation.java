package com.target.entry.operations.delete;

import java.util.LinkedList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.SpecialistRecord;
import com.target.entry.persistance.baseFeature.Message;
@Path("/delete/specialist")
public class SpecialistDeleteOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response deleteSpecialist(String speciality, String doctorId) {
		LinkedList<String> doctorIds = SpecialistRecord.doctorSpecialistTable.get(speciality);
		if (doctorIds==null || doctorIds.isEmpty()|| !doctorIds.contains(doctorId)) {
			return ResponseBuilder.getResponse(Message.NOT_FOUND_FOR_DELETE, Status.NOT_ACCEPTABLE);
		}else {
			doctorIds.remove(doctorId);
			SpecialistRecord.doctorSpecialistTable.put(speciality,doctorIds);
		}
		return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL+ speciality +" for "+doctorId);
	}
}
