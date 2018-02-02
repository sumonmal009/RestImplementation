package com.target.entry.operations.modify;

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
@Path("/modify/report")
public class ReportModifyOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ModifyReport(Report report) {
		if(!ReportsRecord.reportsRecordTable.containsKey(report.getReportID())) {
			return ResponseBuilder.getResponse(Message.NOT_FOUND, Status.NOT_ACCEPTABLE);
		}else {
			ReportsRecord.reportsRecordTable.put(report.getReportID(), report);
		}
		return ResponseBuilder.getResponse(Message.ENTRY_SUCCESSFULL+ report);
	}
}