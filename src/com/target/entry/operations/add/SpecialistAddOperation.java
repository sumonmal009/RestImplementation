package com.target.entry.operations.add;

import java.util.LinkedList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.SpecialistRecord;
import com.target.entry.persistance.baseFeature.Message;

@Path("/add/specialist")
public class SpecialistAddOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response AddSpecialist(String speciality, String doctorId) {
		LinkedList<String> doctorIds = SpecialistRecord.doctorSpecialistTable.get(speciality);
		if (doctorIds == null) {
			doctorIds = new LinkedList<String>();
		}
		doctorIds.add(doctorId);

		SpecialistRecord.doctorSpecialistTable.put(speciality, doctorIds);
		return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL + speciality + " for " + doctorId);
	}
}
