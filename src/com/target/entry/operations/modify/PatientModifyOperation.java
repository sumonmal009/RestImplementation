package com.target.entry.operations.modify;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.target.entry.entity.Patient;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.PatientRecord;
import com.target.entry.persistance.baseFeature.Message;
@Path("/modify/patient")
public class PatientModifyOperation {

		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		
		public Response ModifyPatient(Patient patient) {
			if(!PatientRecord.patientRecordTable.containsKey(patient.getPatientID())) {
				return ResponseBuilder.getResponse(Message.NOT_FOUND, Status.NOT_ACCEPTABLE);
			}
			else {
				PatientRecord.patientRecordTable.put(patient.getPatientID(), patient);
			}
			return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL + patient);
		}
}
