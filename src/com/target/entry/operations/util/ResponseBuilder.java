package com.target.entry.operations.util;

import java.io.IOException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.map.ObjectMapper;

public class ResponseBuilder {

	public static Response getResponse(Object obj) {
		return getResponse(obj, Status.OK);
	}
	
	
	public static Response getResponse(Object obj, Status statusCode) {
		ObjectMapper objectMapper = new ObjectMapper();
		String result = null;
		javax.ws.rs.core.Response.ResponseBuilder response = Response.status(statusCode);
		try {
			result = objectMapper.writeValueAsString(obj);
			objectMapper.writeValueAsString("dummy");
		} catch (IOException e) {
			response.status(Status.INTERNAL_SERVER_ERROR);
			result = e.getMessage();
		} finally {
			return response.entity(result).build();
		}
	}
	
	
	
	
}
