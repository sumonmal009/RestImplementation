package com.target.entry.operations.get;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.entry.entity.Report;
import com.target.entry.operations.util.ResponseBuilder;
import com.target.entry.persistance.ReportsRecord;
import com.target.entry.persistance.baseFeature.Message;

@Path("/get/report")
public class ReportGetOperation {
	@POST
	@Produces(MediaType.APPLICATION_JSON)

	public Response getReport(String reportId) {
		Report report = ReportsRecord.reportsRecordTable.get(reportId);

		return ResponseBuilder.getResponse((report != null) ? report : Message.NOT_FOUND);
	}
}
