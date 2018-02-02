package com.target.entry.operations;


import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.RequestBody;

import org.codehaus.jackson.map.ObjectMapper;

import com.target.entry.entity.Doctor;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.DoctorRecord;

//http://localhost:8080//EntryManagement/entrymgmt/doctorOperation
@Path("/doctorOperation")
public class DoctorOperator {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getDoctorList")
	public Response getDoctorList(){
		load();
		
		return	ResponseBuilder.getResponse(DoctorRecord.doctorRecordTable);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteDoctor")
	public Response deleteDoctor(Doctor doctor) {
		String msg=null;
		if(DoctorRecord.doctorRecordTable.containsKey(doctor.getDoctorId())){
			msg="Doctor with ID is already present, can not delete the same, if you want to update please use update api.";
			return	ResponseBuilder.getResponse(msg,Status.NOT_ACCEPTABLE);
		}else {
			DoctorRecord.doctorRecordTable.put(doctor.getDoctorId(), doctor);
		}
		return	ResponseBuilder.getResponse(DoctorRecord.doctorRecordTable);
	}
	
	
	void load(){
		Doctor d= new Doctor();
		d.setDoctorId("31");
		d.setDoctorName("gdhj");
		d.setSpecialization("X");
		DoctorRecord.doctorRecordTable.put(d.getDoctorId(), d);
	}
	
	
}
