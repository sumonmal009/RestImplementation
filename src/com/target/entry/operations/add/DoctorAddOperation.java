package com.target.entry.operations.add;

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
import com.target.entry.persistance.baseFeature.Message;

@Path("/add/doctor")
public class DoctorAddOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response AddDoctor(Doctor doctor) {
		if (DoctorRecord.doctorRecordTable.containsKey(doctor.getDoctorId())) {
			return ResponseBuilder.getResponse(Message.ALREADY_EXISTS, Status.NOT_ACCEPTABLE);
		} else {
			DoctorRecord.doctorRecordTable.put(doctor.getDoctorId(), doctor);
		}
		return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL+ doctor);
	}

}
