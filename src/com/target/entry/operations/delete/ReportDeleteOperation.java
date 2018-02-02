package com.target.entry.operations.delete;

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
@Path("/delete/report")
public class ReportDeleteOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteReport(Report report) {
		if(!ReportsRecord.reportsRecordTable.containsKey(report.getReportID())) {
			return ResponseBuilder.getResponse(Message.NOT_FOUND_FOR_DELETE, Status.NOT_ACCEPTABLE);
		}else {
			ReportsRecord.reportsRecordTable.remove(report.getReportID());
		}
		return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL+ report);
	}
}