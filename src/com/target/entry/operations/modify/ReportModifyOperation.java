package com.target.entry.operations.modify;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.entity.Report;
import com.target.entry.operations.util.ResponseBuilder;
@Path("/modify/report")
public class ReportModifyOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response modifyReport(Report report) {
		return ResponseBuilder.getResponse("modifyReport");
	}
}
