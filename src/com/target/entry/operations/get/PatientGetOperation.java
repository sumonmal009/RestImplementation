package com.target.entry.operations.get;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.entity.Doctor;
import com.target.entry.entity.Patient;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.DoctorRecord;
import com.target.entry.persistance.PatientRecord;
import com.target.entry.persistance.baseFeature.Message;
@Path("/get/patient/")
public class PatientGetOperation {

		@POST
		@Produces(MediaType.APPLICATION_JSON)
		
		public Response getPatient(String patientId) {
			Patient patient = PatientRecord.patientRecordTable.get(patientId);
			
			return	ResponseBuilder.getResponse((patient!=null)?patient:Message.NOT_FOUND);
		}
}
