package com.target.entry.operations.add;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.target.entry.entity.Report;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.ReportsRecord;
import com.target.entry.persistance.baseFeature.Message;
@Path("/add/report")
public class ReportAddOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response AddReport(Report report) {
		if(ReportsRecord.reportsRecordTable.containsKey(report.getReportID())) {
			return ResponseBuilder.getResponse(Message.ALREADY_EXISTS, Status.NOT_ACCEPTABLE);
		}else {
			ReportsRecord.reportsRecordTable.put(report.getReportID(), report);
		}
		return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL+ report);
	}
}